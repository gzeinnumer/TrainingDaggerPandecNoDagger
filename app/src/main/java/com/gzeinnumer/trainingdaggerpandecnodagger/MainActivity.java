package com.gzeinnumer.trainingdaggerpandecnodagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //Deklarasi
    SessionManager sessionManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inisialisasi
        sessionManager = new SessionManager(getApplicationContext());

        //function bsa digunakan
        sessionManager.setId(1);
        sessionManager.getId();
    }
}
