package com.example.makeitrain;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private Button showMoney;
    private Button showTag;
    private int moneyCounter;
    private TextView moneyText;
    private ConstraintLayout mainWindow;



    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Connecting Java variable that will be use to
        //control our button widget
        //Using findViewById with the R.Java class

        showMoney = findViewById(R.id.button_make_it_rain);
        showTag = findViewById(R.id.button_show_tag);
        moneyText = findViewById(R.id.moneyText);
        mainWindow = findViewById(R.id.mainWindow);


        //OnClickListener
        showMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Converting the number we wish into currency
                NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

                moneyCounter+=1000;

                if (moneyCounter > 10000) {
                    mainWindow.setBackgroundColor(2);
                }
//                 if (moneyCounter > 20000) {
                //
                //
                // moneyText.setTextColor(getResources().getColor(R.color.myColor));
//                }

                 switch (moneyCounter) {

                     case 30000 :
                         moneyText.setTextColor(Color.BLACK);
                         break;
                     case 40000 :
                         moneyText.setTextColor(Color.BLUE);
                         break;
                     case 50000 :
                         moneyText.setTextColor(Color.YELLOW);
                         break;
                     default:
                         break;


                 }

                //Setting the text inside our text view connected to moneyText
                //Using String.valueOf to read the integer as a string
                moneyText.setText(String.valueOf(numberFormat.format(moneyCounter)));
                Log.d("MYMo", "ShowMoney: onClick " + moneyCounter);
            }
        });
    }

    //Function referring to addition of an onClick Event in the XML
    public void showTag (View v) {
        //Review Toast
        Toast.makeText(getApplicationContext(), R.string.app_name, Toast.LENGTH_LONG).show();
        Log.d("MYTAG", "ShowTag: onClick");
    }
}
