package com.example.coleparabolacalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double Aval;
    double Bval;
    double Cval;
    double X1, X2, X3, Y1, Y2, Y3;

    double Pair1[] = {X1, Y1};
    double Pair2[] = {X2, Y2};
    double Pair3[] = {X3, Y3};

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
    private double[] getPairThree(EditText Pairs1, EditText Pairs2) {
        Pair3[0] = Double.parseDouble(Pairs1.getText().toString());
        Pair3[1] = Double.parseDouble(Pairs2.getText().toString());
        return Pair3;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView AvalueTextView = findViewById(R.id.AvalueTextView);
        final TextView BvalueTextView = findViewById(R.id.BvalueTextView);
        final TextView CvalueTextView = findViewById(R.id.CvalueTextView);
        final EditText X1 = findViewById(R.id.X1);
        final EditText Y1 = findViewById(R.id.Y1);
        final EditText X2 = findViewById(R.id.X2);
        final EditText Y2 = findViewById(R.id.Y2);
        final EditText X3 = findViewById(R.id.X3);
        final EditText Y3 = findViewById(R.id.Y3);

        Button CalculateButton = (Button) (findViewById(R.id.CalculateButton));

        CalculateButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Pair1 = getPairOne(X1, Y1);
                Pair2 = getPairTwo(X2, Y2);
                Pair3 = getPairThree(X3, Y3);

                double numerator = (Pair1[0]*(Pair3[1]-Pair2[1])) + (Pair2[0]*(Pair1[1]-Pair3[1])) + (Pair3[0]*(Pair2[1]-Pair1[1]));
                double denominator = (Pair1[0]-Pair2[0]) * (Pair1[0]-Pair3[0]) * (Pair2[0]-Pair3[0]);

                Aval = numerator / denominator;
                Bval = ((Pair2[1]-Pair1[1]) / (Pair2[0]-Pair1[0])) - (Aval*(Pair1[0]+Pair2[0]));
                Cval = Pair1[1] - (Aval*(Math.pow(Pair1[0], 2))) - (Bval*Pair1[0]);

                AvalueTextView.setText("A = " + Aval);
                BvalueTextView.setText("B = " + Bval);
                CvalueTextView.setText("C = " + Cval);

            }
        });
    }
}
// Y = Ax^2 + Bx + C
//x1(y3−y2)+x2(y1−y3)+x3(y2−y1)/(x1−x2)(x1−x3)(x2−x3) = A
// y2−y1/x2−x1-a(x1+x2) = B
// y1−ax1^2−bx1 = C
