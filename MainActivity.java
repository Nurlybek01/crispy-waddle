package com.example.switchcolor3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    RelativeLayout relativeLayout;
    Button button;
    int knopka = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        relativeLayout = findViewById(R.id.relativeLayout);
        button = findViewById(R.id.button);

          // синий цвет - 1, красный - 0



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                   //синий цвет = 1

                switch (knopka) {
                    case 1:
                        button.setBackgroundColor(Color.RED);
                        relativeLayout.setBackgroundColor(Color.BLUE);
                        knopka = 0;
                        break;
                        case 0:
                        button.setBackgroundColor(Color.BLUE);
                        relativeLayout.setBackgroundColor(Color.RED);
                        knopka = 1;
                        break;
                        default:


                }



            }
        });







    }
}
