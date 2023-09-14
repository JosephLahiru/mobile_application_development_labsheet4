package me.mtron.mobile_application_development_labsheet4.exercise_01_implicit_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import me.mtron.mobile_application_development_labsheet4.R;

public class Activity5 extends AppCompatActivity {

    Button btn4;
    EditText e_text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        btn4 = findViewById(R.id.btn4);
        e_text2 = findViewById(R.id.e_text2);

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = e_text2.getText().toString();
                if (!(url.startsWith("http://") || url.startsWith("https://"))) {
                    url = "http://" + url;
                }
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}