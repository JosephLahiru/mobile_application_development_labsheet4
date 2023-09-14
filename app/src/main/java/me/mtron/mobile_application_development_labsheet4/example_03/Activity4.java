package me.mtron.mobile_application_development_labsheet4.example_03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;

import me.mtron.mobile_application_development_labsheet4.R;

public class Activity4 extends AppCompatActivity {

    TextView link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        link = findViewById(R.id.text2);
        link.setText("Android.com is the official website for Android!!!");
        Linkify.addLinks(link, Linkify.WEB_URLS);
    }
}