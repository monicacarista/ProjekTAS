package com.example.projectuas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.projectuas.Adapter.DaftarKRSAdapter;
import com.example.projectuas.Adapter.TampilMahasiswaAdapter;
import com.example.projectuas.Model.DaftarKRS;
import com.example.projectuas.Model.TampilMahasiswa;

import java.util.ArrayList;
import java.util.List;

public class TampilMahasiswaActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private TampilMahasiswaAdapter TampilMahasiswaAdapter;
    private ArrayList<TampilMahasiswa> tampilMahasiswaArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil_mahasiswa);

        addData();

        recyclerView = findViewById(R.id.rvMhs);
        TampilMahasiswaAdapter = new TampilMahasiswaAdapter(tampilMahasiswaArrayList);

        //mahasiswaAdapter = new MahasiswaAdapter(List);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(TampilMahasiswaActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(TampilMahasiswaAdapter);
    }
    private void addData(){
        tampilMahasiswaArrayList = new ArrayList<>();

        tampilMahasiswaArrayList.add(new TampilMahasiswa("72170133","Monica Carista - ","carisamonica@gmail.com","KlitrenLor GK III",R.drawable.mm));
        //     crudArrayList.add(new CRUDDosen("S.Ko","m@gmail.com","JOGJA",R.drawable.xx));
        //     crudArrayList.add(new CRUDDosen("S.Km","m@gmail.com","JOGJA",R.drawable.xx));
        //     crudArrayList.add(new CRUDDosen("S.Kll","mo@gmail.com","JOGJA",R.drawable.xx));
        //  crudArrayList.add(new CRUDDosen("S.Km","monica@gmail.com","JOGJA",R.drawable.xx));
//
    }
}
