package com.mdp.chatsearch_gptsource;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONObject;

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

        String url = "curl https://api.openai.com/v1/models \\";

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
                (Request.Method.GET, url, null, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {
                        chatview.setText("Response: " + response.toString());
                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // TODO: Handle error

                    }
                });

// Access the RequestQueue through your singleton class.
        MySingleton.getInstance(this).addToRequestQueue(jsonObjectRequest);



        // in this class volley will be implemented for get or post request

    }
}