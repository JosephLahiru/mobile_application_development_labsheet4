package me.mtron.mobile_application_development_labsheet4.example_02;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import me.mtron.mobile_application_development_labsheet4.R;

public class Activity2 extends AppCompatActivity {

    Button btn2;
    TextView text1;
    static final int MY_REQUEST_CODE = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        btn2 = findViewById(R.id.btn2);
        text1 = findViewById(R.id.text1);

        Intent intent = new Intent(this, Activity3.class);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(intent, MY_REQUEST_CODE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==MY_REQUEST_CODE){
            String message = data.getStringExtra("MESSAGE");
            text1.setText(message);
        }
    }
}