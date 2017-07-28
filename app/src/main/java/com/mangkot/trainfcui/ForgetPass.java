package com.mangkot.trainfcui;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class ForgetPass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_pass);
    }

    /*public void forget(android.view.View view){
        Intent Intent = new Intent(this, sendEmail());
        startActivity(Intent);
    }*/

    public void forget(android.view.View view) {
        Log.i("Send email", "");

        String[] TO = {"fatih.avila@gmail.com"};
        String[] CC = {"hilmi.syam@gmail.com"};
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");


        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
        emailIntent.putExtra(Intent.EXTRA_CC, CC);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Please Reset Your Password");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Test bosque");

        try {
            startActivity(Intent.createChooser(emailIntent, "Send mail..."));
            finish();
            Log.i("Finished sending email.", "");
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(ForgetPass.this,
                    "There is no email client installed.", Toast.LENGTH_SHORT).show();
        }
    }
}