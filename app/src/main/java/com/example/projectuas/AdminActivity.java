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
        Button logOutButton = (Button)findViewById(R.id.btnLogout2);
        //resetButton.setOnClickListener(resetButtonListener);


        logOutButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                AlertDialog.Builder builder = new AlertDialog.Builder(AdminActivity.this);
                builder.setMessage("Apakah anda yakin untuk Logout?")
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(AdminActivity.this,AdminActivity.class);
                                startActivity(i);
                                Toast.makeText(AdminActivity.this, "Tidak jadi Logout",
                                        Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(AdminActivity.this,Home3Activity.class);
                                startActivity(i);

                                Toast.makeText(AdminActivity.this, "Logout berhasil !!",
                                        Toast.LENGTH_SHORT).show();
                            }
                        });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

    }
}
