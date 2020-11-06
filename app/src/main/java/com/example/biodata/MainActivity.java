package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void telepon (View view) {
        Uri uri = Uri.parse("tel:+6282223565653");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }

    public void maps (View view) {
        Uri uri = Uri.parse("geo:-7.129828, 110.909723");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }

    public void email (View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"inuknc@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "Puntennn lur");

        try {
            startActivity(Intent.createChooser(intent, "Pengen ngirim email e a cuk?"));
        } catch (android.content.ActivityNotFoundException ignored) {
        }
    }
}