package com.example.colemfirstappaddition;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double num1, num2 = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText num1 = findViewById(R.id.firstNumEditText);
        final EditText num2 = findViewById(R.id.secondNumEditText);
        final TextView resultTextView = findViewById(R.id.resultTextView);

        Button addBtn = (Button) findViewById(R.id.addBtn);
        Button subBtn = (Button) findViewById(R.id.subBtn);
        Button multBtn = (Button) findViewById(R.id.multBtn);
        Button divBtn = (Button) findViewById(R.id.divBtn);
        Button pwrBtn = (Button) findViewById(R.id.pwrBtn);
        Button sqrtBtn = (Button) findViewById(R.id.sqrtBtn);

        addBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                resultTextView.setText((getNumberOne(num1) + getNumberTwo(num2)) + "");
            }
        });
        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTextView.setText((getNumberOne(num1) - getNumberTwo(num2)) + "");
            }
        });
        multBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTextView.setText((getNumberOne(num1) * getNumberTwo(num2)) + "");
            }
        });
        divBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTextView.setText((getNumberOne(num1) / getNumberTwo(num2)) + "");
                if (num2.equals(0)) {
                    resultTextView.setText("Error: Divide by Zero");
                }
            }
        });
        pwrBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTextView.setText(Math.pow(getNumberOne(num1), getNumberTwo(num2)) + "");
            }
        });
        sqrtBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTextView.setText(Math.sqrt(getNumberOne(num1)) + "");
            }
        });
    }

    private double getNumberOne(EditText num1) {
        return Double.parseDouble(num1.getText().toString());
    }
    private double getNumberTwo(EditText num2) {
        return Double.parseDouble(num2.getText().toString());
    }
}
