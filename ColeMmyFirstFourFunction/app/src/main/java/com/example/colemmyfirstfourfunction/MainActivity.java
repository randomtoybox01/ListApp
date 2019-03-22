package com.example.colemmyfirstfourfunction;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    double Mval = 0.0;
    double Bval = 0.0;
    double X1, X2, Y1, Y2;

    double Pair1[] = {X1, Y1};
    double Pair2[] = {X2, Y2};

    private double[] getPairOne(EditText Pairs1, EditText Pairs2) {
        Pair1[0] = Double.parseDouble(Pairs1.getText().toString());
        Pair1[1] = Double.parseDouble(Pairs2.getText().toString());
        return Pair1;
    }
    private double[] getPairTwo(EditText Pairs1, EditText Pairs2) {
        Pair2[0] = Double.parseDouble(Pairs1.getText().toString());
        Pair2[1] = Double.parseDouble(Pairs2.getText().toString());
        return Pair2;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView MvalueTextView = findViewById(R.id.MvalueTextView);
        final TextView BvalueTextView = findViewById(R.id.BvalueTextView);
        final EditText X1 = findViewById(R.id.X1);
        final EditText Y1 = findViewById(R.id.Y1);
        final EditText X2 = findViewById(R.id.X2);
        final EditText Y2 = findViewById(R.id.Y2);

        Button CalculateButton = (Button) (findViewById(R.id.CalculateButton));

        CalculateButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Pair1 = getPairOne(X1, Y1);
                Pair2 = getPairTwo(X2, Y2);

                Mval = ((Pair1[1] - Pair2[1])/(Pair1[0]-Pair2[0]));
                Bval = (Pair1[1] - Mval*Pair1[0]);

                MvalueTextView.setText("M = " + Mval);
                BvalueTextView.setText("B = " + Bval);
            }
        });
    }
}
