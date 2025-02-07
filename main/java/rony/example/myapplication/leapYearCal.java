package rony.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class leapYearCal extends AppCompatActivity {

    EditText edText;
    Button ResultYear, nextacti2;
    TextView Tvdespla2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leap_year_cal);
        edText = findViewById(R.id.edtest);
        ResultYear = findViewById(R.id.ResultYear);
        nextacti2 = findViewById(R.id.nextacti2);
        Tvdespla2 = findViewById(R.id.Tvdespla2);

        ResultYear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mySt = edText.getText().toString();

                if (mySt.length() > 0) {
                    int year = Integer.parseInt(mySt);

                    if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                        Tvdespla2.setText(year + " is a Leap Year");
                    } else {
                        Tvdespla2.setText(year + " is not a Leap Year");
                    }
                } else {
                    Toast.makeText(leapYearCal.this, "Please enter a year", Toast.LENGTH_SHORT).show();
                }
            }
        });

        nextacti2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(leapYearCal.this, week_count.class);
                startActivity(myIntent);
            }
        });
    }
}
