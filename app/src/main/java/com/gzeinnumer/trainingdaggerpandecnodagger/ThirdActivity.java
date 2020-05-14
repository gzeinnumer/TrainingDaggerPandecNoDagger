package com.gzeinnumer.trainingdaggerpandecnodagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ThirdActivity extends AppCompatActivity {

    //Deklarasi
    SessionManager sessionManager;
    ProsesSession prosesSession;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        //inisialisasi
        sessionManager = new SessionManager(getApplicationContext());
        prosesSession = new ProsesSession(sessionManager);

        //function bisa dipakai
        prosesSession.getIdFromProsesSession();
    }
}
