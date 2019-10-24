package com.example.projectuas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.projectuas.Adapter.CRUDDOSENAdapter;
import com.example.projectuas.Model.CRUDDosen;

import java.util.ArrayList;
import java.util.List;

public class CRUDDosenActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private CRUDDOSENAdapter CRUDDOSENAdapter;
    private ArrayList<CRUDDosen> crudArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cruddosen);


        addData();

        recyclerView = findViewById(R.id.rvCruddos);
        CRUDDOSENAdapter = new CRUDDOSENAdapter(crudArrayList);
        List<CRUDDosen> crudDosenList;
        //mahasiswaAdapter = new MahasiswaAdapter(List);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(CRUDDosenActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(CRUDDOSENAdapter);
    }
    private void addData(){
        crudArrayList = new ArrayList<>();
        crudArrayList.add(new CRUDDosen("S.Kom","m@gmail.com","JOGJA",R.drawable.xx));
   //     crudArrayList.add(new CRUDDosen("S.Ko","m@gmail.com","JOGJA",R.drawable.xx));
   //     crudArrayList.add(new CRUDDosen("S.Km","m@gmail.com","JOGJA",R.drawable.xx));
   //     crudArrayList.add(new CRUDDosen("S.Kll","mo@gmail.com","JOGJA",R.drawable.xx));
      //  crudArrayList.add(new CRUDDosen("S.Km","monica@gmail.com","JOGJA",R.drawable.xx));
//
    }
    }

