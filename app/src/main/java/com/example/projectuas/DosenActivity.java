package com.example.projectuas;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
        Button logOutButton = (Button)findViewById(R.id.btnLogout3);
        //resetButton.setOnClickListener(resetButtonListener);


        logOutButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                AlertDialog.Builder builder = new AlertDialog.Builder(DosenActivity.this);
                builder.setMessage("Apakah anda yakin untuk Logout?")
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(DosenActivity.this,DosenActivity.class);
                                startActivity(i);
                                Toast.makeText(DosenActivity.this, "Tidak jadi Logout",
                                        Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(DosenActivity.this,Home3Activity.class);
                                startActivity(i);

                                Toast.makeText(DosenActivity.this, "Logout berhasil !!",
                                        Toast.LENGTH_SHORT).show();
                            }
                        });
                AlertDialog dialog = builder.create();
                dialog.show();
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
