package com.example.wandikaapp;

//Tanggal Pengerjaan: 09-05-2022
//NIM: 10119220
//Nama: Moch. Wandika Yusgiar
//Kelas: IF - 6

import android.content.Intent;
import android.os.Bundle;


import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class fragment3_viewPager extends Fragment {

    private Button btn_lanjut;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View view = inflater.inflate(R.layout.fragment3_view_pager, container, false);

        btn_lanjut = view.findViewById(R.id.btn_lanjut);
        btn_lanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), bottom_navbar.class));

            }
        });
        return view;
    }
}