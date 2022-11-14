package com.example.stash;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class SecondFragment extends Fragment {

    Button bMor, bDob;
    ImageView imgT1, imgT2;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_second, container, false);

        bMor = view.findViewById(R.id.btnMorse);
        bDob = view.findViewById(R.id.btnDobCode);
        imgT1 = view.findViewById(R.id.imageTest);
        imgT2 = view.findViewById(R.id.imageTest2);

        bMor.setOnClickListener(v -> {

            imgT1.setVisibility(View.VISIBLE);
            imgT2.setVisibility(View.GONE);

        });

        bDob.setOnClickListener(v -> {

            imgT2.setVisibility(View.VISIBLE);
            imgT1.setVisibility(View.GONE);
        });

        return view;
    }
}