package com.example.kasrakas;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;


public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton buttonImage = findViewById(R.id.buttonImage);
        ImageButton buttonImageText = findViewById(R.id.buttonImageText);

        // Menambahkan fungsi onClickListener pada ImageButton
        buttonImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Buka halaman pelaporan
                Intent intent = new Intent(MenuActivity.this, pelaporan.class);
                startActivity(intent);
            }
        });

    }
}
