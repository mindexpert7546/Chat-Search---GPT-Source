package com.mdp.chatsearch_gptsource;

import static com.mdp.chatsearch_gptsource.R.id.chatnow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Variable declear here
    TextView chatnow;
    TextView welcome;
    TextView setting;
    TextView share;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



            setContentView(R.layout.activity_main);

            chatnow = findViewById(R.id.chatnow);
            welcome= findViewById(R.id.welcome);
            setting = findViewById(R.id.setting);
            share = findViewById(R.id.share);
            chatnow.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                     Intent i=new Intent(MainActivity.this,chatscreen.class);
                     startActivity(i);


                }
            });
            setting.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {



                }
            } );

           share.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {

               }
           }

            );
        }



    }
