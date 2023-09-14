package me.mtron.mobile_application_development_labsheet4.exercise_02_returning_results_from_activities;

import static me.mtron.mobile_application_development_labsheet4.exercise_02_returning_results_from_activities.Activity6.MY_REQUEST_CODE2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import me.mtron.mobile_application_development_labsheet4.R;

public class Activity7 extends AppCompatActivity {

    EditText e_text3;
    EditText e_text4;
    EditText e_text5;
    EditText e_text6;
    Button btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7);

        e_text3 = findViewById(R.id.e_text3);
        e_text4 = findViewById(R.id.e_text4);
        e_text5 = findViewById(R.id.e_text5);
        e_text6 = findViewById(R.id.e_text6);

        btn5 = findViewById(R.id.btn5);

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int val1 = Integer.parseInt(e_text3.getText().toString());
                int val2 = Integer.parseInt(e_text4.getText().toString());
                int val3 = Integer.parseInt(e_text5.getText().toString());
                int val4 = Integer.parseInt(e_text6.getText().toString());

                Intent intent = new Intent();
                intent.putExtra("MESSAGE", Integer.toString(val1+val2+val3+val4));
                setResult(MY_REQUEST_CODE2, intent);
                finish();
            }
        });
    }
}