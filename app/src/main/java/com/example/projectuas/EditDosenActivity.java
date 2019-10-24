package com.example.projectuas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EditDosenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_dosen);

        Button btnSimpanDosen =(Button)findViewById(R.id.btnSimpanDosen);

        btnSimpanDosen.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(EditDosenActivity.this,CRUDDosenActivity.class);
                startActivity(i);
            }
        });
    }
}
