package com.example.projectuas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;


public class DosenActivity extends AppCompatActivity {
ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dosen);

        imageButton = (ImageButton) findViewById(R.id.imbDataDiri);
        imageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(DosenActivity.this,EditDosenActivity.class);
                startActivity(i);
            }
        });

        imageButton = (ImageButton) findViewById(R.id.imbDaftarKRS);
        imageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(DosenActivity.this,EditKRSActivity.class);
                startActivity(i);
            }
        });

        imageButton = (ImageButton) findViewById(R.id.imbLihatKelas);
        imageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(DosenActivity.this,LihatDataKelasActivity.class);
                startActivity(i);
            }
        });
    }
    public void imbDataDiri(View view) {
        Toast.makeText(getApplicationContext(), "Kamu Mengklik Button Gambar", Toast.LENGTH_LONG).show();
    }
    public void imbDataKrs(View view) {
        Toast.makeText(getApplicationContext(), "Kamu Mengklik Button Gambar", Toast.LENGTH_LONG).show();
    }
    public void imbLihatKelas(View view) {
        Toast.makeText(getApplicationContext(), "Kamu Mengklik Button Gambar", Toast.LENGTH_LONG).show();
    }
}
