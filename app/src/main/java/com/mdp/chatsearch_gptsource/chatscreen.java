package com.mdp.chatsearch_gptsource;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class chatscreen extends AppCompatActivity {

    //Variable declear here
    TextView chatview;
    EditText editTextchat;
    ImageView chatsender;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatscreen);

        chatview = findViewById(R.id.chatView);
        editTextchat = findViewById(R.id.editTextchat);
        chatsender = findViewById(R.id.chatsender);

        chatsender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //chatLoader class called
                chatLoader();
            }
        });
    }

    private void chatLoader(){
        // in this class volley will be implemented for get or post request

    }
}