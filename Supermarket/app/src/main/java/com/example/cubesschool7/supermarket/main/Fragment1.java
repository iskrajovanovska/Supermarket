package com.example.cubesschool7.supermarket.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

/**
 * Created by Ana on 08-Sep-16.
 */
public class Fragment1 extends Fragment {

    private ImageView imageKorisnik, imageLozinka;
    private EditText editKorisnik, editLozinka;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        imageKorisnik = (ImageView) getActivity().findViewById(R.id.korisnik1);
        imageLozinka = (ImageView) getActivity().findViewById(R.id.lozinka1);

        editKorisnik = (EditText) getActivity().findViewById(R.id.editKorisnickoIme1);
        editLozinka = (EditText) getActivity().findViewById(R.id.editLozinka1);


        return inflater.inflate(R.layout.frag1, container, false);
    }
}
