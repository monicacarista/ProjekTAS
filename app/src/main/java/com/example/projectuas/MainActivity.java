package com.example.projectuas;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Email, Password;
    Button SignIn;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    CheckBox savelogincheckbox;
    Boolean saveLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        SharedPreferences prefs = MainActivity.this.getSharedPreferences("prefs_file",MODE_PRIVATE);
//        String statusLogin = prefs.getString("isLogin",null);
//        Button btnLogin = (Button)findViewById(R.id.btnSignIn);
//        btnLogin.setOnClickListener(myBtnLoginClick);
//        if (statusLogin != null){
//            btnLogin.setText("Logout");
//        }else{
//            btnLogin.setText("Login");
//        }

        Button SignInbtn = (Button) findViewById(R.id.btnSignIn);
        SignInbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, AdminActivity.class);
                startActivity(i);

            }
        });


        Email = (EditText) findViewById(R.id.txtEmail);
        Password = (EditText) findViewById(R.id.txtPass);
        SignIn = (Button) findViewById(R.id.btnSignIn);

        sharedPreferences = getSharedPreferences("loginref", MODE_PRIVATE);
        savelogincheckbox = (CheckBox) findViewById(R.id.chckrem);
        editor = sharedPreferences.edit();


        // sharedPreferences.Editor = sharedPreferences.edit();
        SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SignIn();
            }
        });
        saveLogin = sharedPreferences.getBoolean("savelogin", true);
        if (saveLogin == true) {
            Email.setText(sharedPreferences.getString("Email", null));
            Password.setText(sharedPreferences.getString("Password", null));
            Intent i = new Intent(MainActivity.this, AdminActivity.class);
            startActivity(i);

        }

    }

    public void SignIn() {
        String email = Email.getText().toString();
        String password = Password.getText().toString();
        if (email.contains("@staff.ukdw.ac.id")) {
            Intent i = new Intent(MainActivity.this, AdminActivity.class);
            startActivity(i);


        } else if (email.contains("@ukdw.ac.id")) {
            Intent i = new Intent(MainActivity.this, DosenActivity.class);
            startActivity(i);


        } else {
            Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();

        }
    }

//    private View.OnClickListener myBtnLoginClick = new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            SharedPreferences prefs =
//                    MainActivity.this.getSharedPreferences("prefs_file",MODE_PRIVATE);
//            String statusLogin = prefs.getString("isLogin",null);
//            SharedPreferences.Editor edit = prefs.edit();
//            Button btnLogin = (Button)findViewById(R.id.btnSignIn);
//            if (statusLogin != null){
//                edit.putString("isLogin",null);
//                btnLogin.setText("Login");
//            }else{
//                edit.putString("isLogin","Admin");
//                btnLogin.setText("Logout");
//            }
//            edit.commit();
//        }
//    };
}