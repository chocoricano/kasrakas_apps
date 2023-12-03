package com.example.kasrakas;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class pelaporan extends AppCompatActivity {

    private EditText komentarEditText;
    private ImageButton sendButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi elemen UI
        komentarEditText = findViewById(R.id.komentar);
        sendButton = findViewById(R.id.send);

        // Menambahkan fungsi onClickListener pada tombol "send"
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Mendapatkan nilai dari EditText
                String komentar = komentarEditText.getText().toString();

                // Lakukan sesuatu dengan nilai ini, misalnya, tampilkan pesan Toast
                if (!komentar.isEmpty()) {
                    Toast.makeText(pelaporan.this, "Komentar: " + komentar, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(pelaporan.this, "Komentar tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

