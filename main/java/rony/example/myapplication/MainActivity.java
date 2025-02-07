package rony.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    EditText  edtext;
    Button button1,nextacti;
    TextView Tvdespla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtext=findViewById(R.id.edtext);
        button1=findViewById(R.id.button1);
        nextacti=findViewById(R.id.nextacti);
        Tvdespla=findViewById(R.id.Tvdespla);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //-----------------------------------------------------------------------------------------------------
                String mystring=edtext.getText().toString();
                if (mystring.length() > 0){
                    int number =Integer.parseInt(mystring);
                    if (number%5==0 && number %11==0){
                        Tvdespla.setText(number+" Devisible By 5 and 11");
                    } else if (number%5==0 && number%11 !=0) {
                        Tvdespla.setText(number+" Devisible By 5, Not 11");
                    } else if (number%11==0 && number%5 !=0) {
                        Tvdespla.setText(number+" Devisible By 11, Not 5");
                    }else {
                        Tvdespla.setText("Not Devisible by 5 And 11");
                    }

                }else {
                    edtext.setError("Enter any Number");
                }
//-----------------------------------------------------------------
            }
        });
        nextacti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent=new Intent(MainActivity.this, leapYearCal.class);
                startActivity(myIntent);
            }
        });


    }
}