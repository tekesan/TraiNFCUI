    package com.mangkot.trainfcui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;




    public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

        public void pencet(android.view.View view) {
            Intent Intent = new Intent(this, Home.class);
            startActivity(Intent);
        }

        public void register(android.view.View view){
            Intent Intent = new Intent (this, Register.class);
            startActivity(Intent);
        }


    }
