package com.example.projectuas.CRUDDosen;

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

import com.example.projectuas.AdminActivity;
import com.example.projectuas.CRUDKRS.EditKRSActivity;
import com.example.projectuas.LihatDataKelasActivity;
import com.example.projectuas.MainActivity;
import com.example.projectuas.R;


public class DosenActivity extends AppCompatActivity {
ImageButton imageButton;
    ImageButton imbDaftarKRS;
    ImageButton imbDataDiri;
    ImageButton imbLihatKelas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dosen);

      

        Button logOutButton = (Button)findViewById(R.id.btnLogout3);
        //resetButton.setOnClickListener(resetButtonListener);


        logOutButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                AlertDialog.Builder builder = new AlertDialog.Builder(DosenActivity.this);
                builder.setMessage("Apakah anda yakin untuk Logout?")
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(DosenActivity.this, "Tidak jadi Logout",
                                        Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                SharedPreferences prefs = DosenActivity.this.getSharedPreferences("prefs_file",MODE_PRIVATE);
                                String statusLogin = prefs.getString("isLogin",null);
                                SharedPreferences.Editor edit = prefs.edit();
                                edit.putString("isLogin", null);
                                edit.commit();
                                Intent i = new Intent(DosenActivity.this, MainActivity.class);
                                startActivity(i);

//                                Toast.makeText(DosenActivity.this, "Logout berhasil !!",
//                                        Toast.LENGTH_SHORT).show();
                            }
                        });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        imageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(DosenActivity.this, EditDosenActivity.class);
                startActivity(i);
            }
        });

        imageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(DosenActivity.this, EditKRSActivity.class);
                startActivity(i);
            }
        });

        imageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(DosenActivity.this, LihatDataKelasActivity.class);
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
