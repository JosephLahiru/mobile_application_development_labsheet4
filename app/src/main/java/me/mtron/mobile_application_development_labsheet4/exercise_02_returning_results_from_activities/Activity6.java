package me.mtron.mobile_application_development_labsheet4.exercise_02_returning_results_from_activities;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import me.mtron.mobile_application_development_labsheet4.R;

public class Activity6 extends AppCompatActivity {

    Button btn5;
    TextView text3;
    static final int MY_REQUEST_CODE2 = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);

        btn5 = findViewById(R.id.btn5);
        text3 = findViewById(R.id.text3);

        Intent intent = new Intent(this, Activity7.class);

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(intent, MY_REQUEST_CODE2);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==MY_REQUEST_CODE2){
            String message = data.getStringExtra("MESSAGE");
            text3.setText(message);
        }
    }
}