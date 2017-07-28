package com.mangkot.trainfcui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void cus(android.view.View view) {
        Intent Intent = new Intent(this, Tap.class);
        startActivity(Intent);
    }

}
