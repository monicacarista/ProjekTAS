package com.example.projectuas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DataDiriMhsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_diri_mhs);

        Button btnSimpanMhs =(Button)findViewById(R.id.btnSimpanMhs);

        btnSimpanMhs.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(DataDiriMhsActivity.this, TampilMahasiswaActivity.class);
                startActivity(i);
            }
        });
    }
}
