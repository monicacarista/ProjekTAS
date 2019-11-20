package com.example.projectuas.CRUDKRS;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.projectuas.Adapter.DaftarKRSAdapter;
import com.example.projectuas.Model.DaftarKRS;
import com.example.projectuas.R;

import java.util.ArrayList;

public class TampilKRSActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private DaftarKRSAdapter DaftarKRSAdapter;
    private ArrayList<DaftarKRS> DaftarArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crudkrs);

        addData();

        recyclerView = findViewById(R.id.rvDaftarKRS);
        DaftarKRSAdapter = new DaftarKRSAdapter(DaftarArrayList);

        //mahasiswaAdapter = new MahasiswaAdapter(List);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(TampilKRSActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(DaftarKRSAdapter);
    }
    private void addData(){
        DaftarArrayList = new ArrayList<>();


        DaftarArrayList.add(new DaftarKRS("Senin","2","3","Katon Wijana", "67"));
        //     crudArrayList.add(new CRUDDosen("S.Ko","m@gmail.com","JOGJA",R.drawable.xx));
        //     crudArrayList.add(new CRUDDosen("S.Km","m@gmail.com","JOGJA",R.drawable.xx));
        //     crudArrayList.add(new CRUDDosen("S.Kll","mo@gmail.com","JOGJA",R.drawable.xx));
        //  crudArrayList.add(new CRUDDosen("S.Km","monica@gmail.com","JOGJA",R.drawable.xx));
//
    }
}
