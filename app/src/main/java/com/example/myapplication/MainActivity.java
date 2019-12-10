package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button openActivityBtn, openBigContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        openActivityBtn = (Button) findViewById(R.id.btnNotificationActivity);
        openBigContent = (Button) findViewById(R.id.bigContent);


        openActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NotificationGenerator.openActivityNotification(getApplicationContext());
            }
        });

        openBigContent.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                NotificationGenerator.customBigNotification(getApplicationContext());
            }
        });
    }


}
