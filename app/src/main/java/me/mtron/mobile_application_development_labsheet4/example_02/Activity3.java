package me.mtron.mobile_application_development_labsheet4.example_02;

import static me.mtron.mobile_application_development_labsheet4.example_02.Activity2.MY_REQUEST_CODE;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import me.mtron.mobile_application_development_labsheet4.R;

public class Activity3 extends AppCompatActivity {

    EditText e_text1;
    Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        e_text1 = findViewById(R.id.e_text1);
        btn3 = findViewById(R.id.btn3);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = e_text1.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("MESSAGE", message);
                setResult(MY_REQUEST_CODE, intent);
                finish();
            }
        });
    }
}