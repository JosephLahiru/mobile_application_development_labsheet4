package me.mtron.mobile_application_development_labsheet4.exercise_03_returning_results_from_activities;

import static me.mtron.mobile_application_development_labsheet4.exercise_03_returning_results_from_activities.Activity8.MY_REQUEST_CODE3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import me.mtron.mobile_application_development_labsheet4.R;

public class Activity9 extends AppCompatActivity {
    EditText color;
    Button btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_9);

        color = findViewById(R.id.e_text8);

        btn6 = findViewById(R.id.btn6);

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent();
                intent.putExtra("MESSAGE", color.getText().toString());
                setResult(MY_REQUEST_CODE3, intent);
                finish();
            }
        });
    }
}