package com.example.projectuas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class AdminActivity extends AppCompatActivity {
ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        imageButton = (ImageButton) findViewById(R.id.imbDataDiriAd);
        imageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(AdminActivity.this,DataDiriMhsActivity.class);
                startActivity(i);
            }
        });

        imageButton = (ImageButton) findViewById(R.id.imbDataDosen);
        imageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(AdminActivity.this,CRUDDosenActivity.class);
                startActivity(i);
            }
        });

        imageButton = (ImageButton) findViewById(R.id.imbDaftarMatkulD);
        imageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(AdminActivity.this, TampilMatkulActivity.class);
                startActivity(i);
            }
        });

        imageButton = (ImageButton) findViewById(R.id.imbKelolaKRS);
        imageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(AdminActivity.this, EditKRSActivity.class);
                startActivity(i);
            }
        });

        imageButton = (ImageButton) findViewById(R.id.imbDaftarMhs);
        imageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(AdminActivity.this,TampilMahasiswaActivity.class);
                startActivity(i);
            }
        });

    }
}
