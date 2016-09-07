package com.example.cubesschool7.supermarket.main;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

/**
 * Created by cubesschool7 on 9/7/16.
 */
public class LoginActivity extends AppCompatActivity {

    private EditText editTextLozinka, editTextKorisnik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        editTextLozinka = (EditText) findViewById(R.id.editLozinka);
        editTextKorisnik = (EditText) findViewById(R.id.editKorisnickoIme);

        editTextLozinka.getBackground().setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_IN);
        editTextKorisnik.getBackground().setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_IN);
    }
}
