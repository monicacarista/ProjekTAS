package com.example.projectuas.CRUDDosen;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.projectuas.AdminActivity;
import com.example.projectuas.R;

public class EditDosenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_dosen);

        Button btnSimpanDosen =(Button)findViewById(R.id.btnSimpanDosen);

//        btnSimpanDosen.setOnClickListener(new View.OnClickListener(){
////            @Override
////            public void onClick(View view){
////                Intent i = new Intent(EditDosenActivity.this,CRUDDosenActivity.class);
////                startActivity(i);
////            }
////        });

        btnSimpanDosen.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                AlertDialog.Builder builder = new AlertDialog.Builder(EditDosenActivity.this);
                builder.setMessage("Apakah anda ingin menyimpan?")
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(EditDosenActivity.this, AdminActivity.class);
                                startActivity(i);
                                Toast.makeText(EditDosenActivity.this, "Tidak jadi Save",
                                        Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(EditDosenActivity.this, CRUDDosenActivity.class);
                                startActivity(i);

                                Toast.makeText(EditDosenActivity.this, "Save Berhasil !!",
                                        Toast.LENGTH_SHORT).show();
                            }
                        });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
    }
}
