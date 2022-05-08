package com.example.wandikaapp;

//Tanggal Pengerjaan: 09-05-2022
//NIM: 10119220
//Nama: Moch. Wandika Yusgiar
//Kelas: IF - 6

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class page_activityFragment extends Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private List<activityPage> list_atc;

    public page_activityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_activity, container, false);

        myrecyclerview = (RecyclerView) v.findViewById(R.id.activity_recyclerview);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(),list_atc);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerViewAdapter);

        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        list_atc = new ArrayList<>();
        list_atc.add(new activityPage("Beribadah", R.drawable.masjid));
        list_atc.add(new activityPage("Belajar", R.drawable.study));
        list_atc.add(new activityPage("Membaca", R.drawable.read));
        list_atc.add(new activityPage("Bermain Game", R.drawable.play_game));
        list_atc.add(new activityPage("Tidur", R.drawable.tidur));
    }
}