package com.example.quicklauncher;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button secondActivity = (Button)findViewById(R.id.SecondActivityBtn);
        secondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = getPackageManager().getLaunchIntentForPackage("com.example.colemmyfirstfourfunction");
                if (startIntent != null) {
                    startActivity(startIntent);
                }
            }
        });
        Button AddCalcBtn = (Button)findViewById(R.id.AddCalcBtn);
        AddCalcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = getPackageManager().getLaunchIntentForPackage("com.example.colemfirstappaddition");
                if (startIntent != null) {
                    startActivity(startIntent);
                }
            }
        });
        Button PeachBtn = (Button)findViewById(R.id.PeachBtn);
        PeachBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = getPackageManager().getLaunchIntentForPackage("com.example.listapp");
                if (startIntent != null) {
                    startActivity(startIntent);
                }
            }
        });
        Button CreativeBtn = (Button)findViewById(R.id.CreativeBtn);
        CreativeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = getPackageManager().getLaunchIntentForPackage("com.example.mycreative");
                if (startIntent != null) {
                    startActivity(startIntent);
                }
            }
        });
        Button ParabolaBtn = (Button)findViewById(R.id.ParabolaBtn);
        ParabolaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = getPackageManager().getLaunchIntentForPackage("com.example.coleparabolacalc");
                if (startIntent != null) {
                    startActivity(startIntent);
                }
            }
        });

    }
}
