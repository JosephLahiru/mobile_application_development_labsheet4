package me.mtron.mobile_application_development_labsheet4.exercise_03_returning_results_from_activities;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import me.mtron.mobile_application_development_labsheet4.R;

public class Activity8 extends AppCompatActivity {

    Button btn5;
    TextView text8;
    ImageView imageView;
    static final int MY_REQUEST_CODE3 = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_8);

        btn5 = findViewById(R.id.btn7);
        text8 = findViewById(R.id.text8);

        Intent intent = new Intent(this, Activity9.class);

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(intent, MY_REQUEST_CODE3);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==MY_REQUEST_CODE3){
            String message = data.getStringExtra("MESSAGE");
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
            imageView = new ImageView(this);
            switch (message){
                case "white":
                    imageView.setImageResource(R.drawable.oxygen);
                    break;
                case "brown":
                    imageView.setImageResource(R.drawable.hilium);
                    break;
                case "dark green":
                    imageView.setImageResource(R.drawable.argon);
                    break;
                case "red":
                    imageView.setImageResource(R.drawable.hydrogen);
                    break;
                case "maroon":
                    imageView.setImageResource(R.drawable.acetylene);
                    break;
                case "black":
                    imageView.setImageResource(R.drawable.nitrogen);
                    break;
                default:
                    imageView.setImageResource(R.drawable.notfound);
            }
            text8.setBackground(imageView.getDrawable());
        }
    }
}