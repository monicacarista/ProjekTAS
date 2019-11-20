package com.example.projectuas;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.projectuas.CRUDDosen.CRUDDosenActivity;
import com.example.projectuas.CRUDKRS.EditKRSActivity;
import com.example.projectuas.CRUDKRS.TampilKRSActivity;
import com.example.projectuas.CRUDMahasiswa.DataDiriMhsActivity;
import com.example.projectuas.CRUDMahasiswa.TampilMahasiswaActivity;
import com.example.projectuas.CRUDMatkul.TampilMatkulActivity;
import com.example.projectuas.Model.CRUDDosen;
import com.example.projectuas.Model.TampilMahasiswa;
import com.example.projectuas.Model.TampilMatkul;

public class AdminActivity extends AppCompatActivity {
ImageButton imageButton;
    ImageButton imbDatadiriAd;
    ImageButton imbDataDosen;
    ImageButton imbDaftarMatkul;
    ImageButton imbKelolaKRS;
    ImageButton imbDaftarMhs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
//
//        imageButton = (ImageButton) findViewById(R.id.imbDataDiriAd);
//        imageButton.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view){
//                Intent i = new Intent(AdminActivity.this, DataDiriMhsActivity.class);
//                startActivity(i);
//            }
//        });
//
//        imageButton = (ImageButton) findViewById(R.id.imbDataDosen);
//        imageButton.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view){
//                Intent i = new Intent(AdminActivity.this, CRUDDosenActivity.class);
//                startActivity(i);
//            }
//        });
//
//        imageButton = (ImageButton) findViewById(R.id.imbDaftarMatkulD);
//        imageButton.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view){
//                Intent i = new Intent(AdminActivity.this, TampilMatkulActivity.class);
//                startActivity(i);
//            }
//        });
//
//        imageButton = (ImageButton) findViewById(R.id.imbKelolaKRS);
//        imageButton.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view){
//                Intent i = new Intent(AdminActivity.this, EditKRSActivity.class);
//                startActivity(i);
//            }
//        });
//
//        imageButton = (ImageButton) findViewById(R.id.imbDaftarMhs);
//        imageButton.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view){
//                Intent i = new Intent(AdminActivity.this, TampilMahasiswaActivity.class);
//                startActivity(i);
//            }
//        });
        Button logOutButton = (Button)findViewById(R.id.btnLogout2);
        //resetButton.setOnClickListener(resetButtonListener);


        logOutButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                AlertDialog.Builder builder = new AlertDialog.Builder(AdminActivity.this);
                builder.setMessage("Apakah anda yakin untuk Logout?")
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(AdminActivity.this, "Tidak jadi Logout",
                                        Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                SharedPreferences prefs = AdminActivity.this.getSharedPreferences("prefs_file",MODE_PRIVATE);
                                String statusLogin = prefs.getString("isLogin",null);
                                SharedPreferences.Editor edit = prefs.edit();
                                edit.putString("isLogin", null);
                                edit.commit();
                                Intent i = new Intent(AdminActivity.this,MainActivity.class);
                                startActivity(i);

//                                Toast.makeText(AdminActivity.this, "Logout berhasil !!",
//                                        Toast.LENGTH_SHORT).show();
                            }
                        });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        imbDatadiriAd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AdminActivity.this, TampilMahasiswa.class);
                startActivity(i);
            }
        });

        imbDataDosen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AdminActivity.this, CRUDDosen.class);
                startActivity(i);
            }
        });

        imbDaftarMatkul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AdminActivity.this, TampilMatkulActivity.class);
                startActivity(i);
            }
        });


        imbKelolaKRS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AdminActivity.this, TampilKRSActivity.class);
                startActivity(i);
            }
        });

        imbDaftarMhs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AdminActivity.this, TampilMahasiswaActivity.class);
                startActivity(i);
            }
        });


    }
}
