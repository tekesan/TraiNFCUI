package com.mangkot.trainfcui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void already(android.view.View view){
        Intent Intent = new Intent(this, MainActivity.class);
        startActivity(Intent);
    }


}
