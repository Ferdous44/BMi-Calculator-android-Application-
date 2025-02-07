package rony.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class week_count extends AppCompatActivity {
    EditText edText;
    Button edResult3, nextacti3;
    TextView Tvdespla3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week_count);
        edText= findViewById(R.id.edText3);
        edResult3=findViewById(R.id.edResult3);
        nextacti3=findViewById(R.id.nextacti3);
        Tvdespla3=findViewById(R.id.Tvdespla3);
        


        edResult3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myst=edText.getText().toString();
                int input=Integer.parseInt(myst);
                if(input>0 && input<8){
                    if (input==1){
                        Tvdespla3.setText("Sunday");
                    } else if (input==2) {
                        Tvdespla3.setText("Monday");
                    } else if (input==3) {
                        Tvdespla3.setText("Tuesday");
                    }else if (input==4) {
                        Tvdespla3.setText("Wednesday");
                    }else if (input==5) {
                        Tvdespla3.setText("Thursday");
                    }else if (input==6) {
                        Tvdespla3.setText("Friday");
                    }else if(input==7){
                        Tvdespla3.setText("Saturday");
                    }
                }else{
                    Toast.makeText(week_count.this , "Please Enter 1 to 7 degit",Toast.LENGTH_LONG).show();
                }
            }
        });
        nextacti3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent=new Intent(week_count.this, greading_system.class);
                startActivity(myIntent);
            }
        });

    }
}