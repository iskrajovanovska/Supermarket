package com.example.cubesschool7.supermarket.main;

import android.media.Image;
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
public class Fragment2 extends Fragment {

    private ImageView imageKorisnik, imageEmail, imageDanRodjenja, imageLozinka;
    private EditText editKorisnik, editEmail, editDanRodjenja, editLozinka;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        imageKorisnik = (ImageView) getActivity().findViewById(R.id.imageKOrisnik);
        imageDanRodjenja = (ImageView) getActivity().findViewById(R.id.danRodjenja);
        imageEmail = (ImageView) getActivity().findViewById(R.id.email);
        imageLozinka = (ImageView) getActivity().findViewById(R.id.lozinka);

        editDanRodjenja = (EditText) getActivity().findViewById(R.id.editDanRodjenja);
        editEmail = (EditText) getActivity().findViewById(R.id.editEmail);
        editKorisnik = (EditText) getActivity().findViewById(R.id.editKorisnickoIme);
        editLozinka = (EditText) getActivity().findViewById(R.id.editLozinka);


        return inflater.inflate(R.layout.frag2, container, false);
    }
}
