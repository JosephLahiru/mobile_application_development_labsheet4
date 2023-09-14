package me.mtron.mobile_application_development_labsheet4.exercise_03_returning_results_from_activities;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import me.mtron.mobile_application_development_labsheet4.R;
import me.mtron.mobile_application_development_labsheet4.exercise_02_returning_results_from_activities.Activity7;

public class Activity8 extends AppCompatActivity {

    Button btn5;
    TextView text3;
    static final int MY_REQUEST_CODE3 = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_8);

        btn5 = findViewById(R.id.btn7);
        text3 = findViewById(R.id.text8);

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
            text3.setText(message);
        }
    }
}