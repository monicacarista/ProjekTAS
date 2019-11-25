package com.example.projectuas.CRUDDosen;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.projectuas.Model.DefaultResult;
import com.example.projectuas.AdminActivity;
import com.example.projectuas.Model.DefaultResult;
import com.example.projectuas.Network.GetDataService;
import com.example.projectuas.Network.RetrofitClientInstance;
import com.example.projectuas.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EditDosenActivity extends AppCompatActivity {
ProgressDialog pd;
EditText nidn, nama, gelar, alamat, email;
    GetDataService service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_dosen);

       // EditText txtNidn = (EditText) findViewById(R.id.txtNIDN);
        this.setTitle("SI KRS - Hai Dosen");

        pd = new ProgressDialog(this);


        Button btnSimpanDosen =(Button)findViewById(R.id.btnSimpanDosen);

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

                                pd.setMessage("send data");
                                pd.setCancelable(false);
                                pd.show();

                                nama = (EditText)findViewById(R.id.etxtNamaDosen);
                                nidn = (EditText)findViewById(R.id.etxtNidnDosen);
                                alamat = (EditText)findViewById(R.id.etxtAlamatDosen);
                                email = (EditText)findViewById(R.id.etxtEmailDosen);
                                gelar = (EditText)findViewById(R.id.etxtGelarDosen);




//                                String snidn = nidn.getText().toString();
//                                String snama = nama.getText().toString();
//                                String salamat = alamat.getText().toString();
//                                String semail = email.getText().toString();
//                                String sgelar = gelar.getText().toString();


                                service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
                                Call<DefaultResult> call = service.insert_dosen(nama.getText().toString(), nidn.getText().toString(), alamat.getText().toString(),
                                        email.getText().toString(), gelar.getText().toString(), "https://source.unsplash.com/random", "72170133");
                                call.enqueue(new Callback<com.example.projectuas.Model.DefaultResult>() {
                                    @Override
                                    public void onResponse(Call<DefaultResult> call, Response<DefaultResult> response) {
                                        pd.dismiss();
                                        Toast.makeText(EditDosenActivity.this, "Data tersimpan",
                                                Toast.LENGTH_SHORT).show();
                                        Intent intent = new Intent(EditDosenActivity.this,CRUDDosenActivity.class);
                                        startActivity(intent);
                                    }

                                    @Override
                                    public void onFailure(Call<DefaultResult> call, Throwable t) {
                                        Toast.makeText(EditDosenActivity.this, "GAGALLLLL",
                                                Toast.LENGTH_SHORT).show();
                                    }
                                });

//                                Intent i = new Intent(EditDosenActivity.this, CRUDDosenActivity.class);
//                                startActivity(i);
//
//                                Toast.makeText(EditDosenActivity.this, "Save Berhasil !!",
//                                        Toast.LENGTH_SHORT).show();
                            }
                        });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
    }
}
