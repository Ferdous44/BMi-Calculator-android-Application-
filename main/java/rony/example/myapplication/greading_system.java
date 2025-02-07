package rony.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class greading_system extends AppCompatActivity {
    EditText edText4,edText5,edText6,edText7,edText8;
    Button edResult4, nextacti4;
    TextView Tvdespla4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.greading_system);
        edText4= findViewById(R.id.edText4);
        edText5= findViewById(R.id.edText5);
        edText6= findViewById(R.id.edText6);
        edText7= findViewById(R.id.edText7);
        edText8= findViewById(R.id.edText8);
        edResult4=findViewById(R.id.edResult4);
        nextacti4=findViewById(R.id.nextacti4);
        Tvdespla4=findViewById(R.id.Tvdespla4);

        edResult4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myst=edText4.getText().toString();
                String myst1=edText5.getText().toString();
                String myst2=edText6.getText().toString();
                String myst3=edText7.getText().toString();
                String myst4=edText8.getText().toString();

                float input0=Float.parseFloat(myst);
                float input1=Float.parseFloat(myst1);
                float input2=Float.parseFloat(myst2);
                float input3=Float.parseFloat(myst3);
                float input4=Float.parseFloat(myst4);

                if(input0>0 && input0<100){
                   float parsentage=(input0+input1+input2+input3+input4)/5;
                   if(parsentage<40){
                       Tvdespla4.setText("parsentage "+parsentage+"% Gread: F");
                   }else if (parsentage>=40 && parsentage<59 ){
                        Tvdespla4.setText("parsentage "+parsentage+"% Gread: E");
                    }
                   else if(parsentage>=60 && parsentage<69){
                        Tvdespla4.setText("parsentage "+parsentage+"% Gread: D");
                    }else if(parsentage>=70 && parsentage<79){
                        Tvdespla4.setText("parsentage "+parsentage+"% Gread: C");
                    }else if(parsentage>=80 && parsentage<89){
                        Tvdespla4.setText("parsentage "+parsentage+"% Gread: B");
                    }else if(parsentage>=90){
                        Tvdespla4.setText("parsentage "+parsentage+"% Gread: A");
                    }
                }else{
                    Toast.makeText(greading_system.this , "Please Enter any degit 1 to 99 ",Toast.LENGTH_LONG).show();
                }
            }
        });
//        nextacti4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent myIntent=new Intent(greading_system.this, greading_system.class);
//                startActivity(myIntent);
//            }
//        });

    }
}