package com.example.kasrakas;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private EditText nameEditText, phoneEditText, emailEditText, passwordEditText;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText = findViewById(R.id.name);
        phoneEditText = findViewById(R.id.phone);
        emailEditText = findViewById(R.id.email);
        passwordEditText = findViewById(R.id.password);

        ImageButton daftarButton = findViewById(R.id.daftar);

        // fungsi onClickListener pada tombol "daftar"
        daftarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  nilai dari EditText
                String name = nameEditText.getText().toString();
                String phone = phoneEditText.getText().toString();
                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();

               // aku gatau caraya buat bikin kirim ke server lupa
            }
        });
    }
}
