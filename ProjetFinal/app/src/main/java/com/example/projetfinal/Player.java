package com.example.projetfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ToggleButton;

public class Player extends AppCompatActivity {

    ToggleButton tb1;
    ToggleButton tb2;
    ToggleButton tb3;
    ToggleButton tb4;
    EditText player_name1;
    EditText player_name2;
    EditText player_name3;
    EditText player_name4;
    Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstaceState) {
        super.onCreate(savedInstaceState);
        setContentView(R.layout.player_fragment);
        DataBase db = new DataBase(this);

        tb1 = findViewById(R.id.toggleButton1);
        tb2 = findViewById(R.id.toggleButton2);
        tb3 = findViewById(R.id.toggleButton3);
        tb4 = findViewById(R.id.toggleButton4);

        tb1.setOnClickListener(v -> { //lambda
            player_name1 = findViewById(R.id.player1);

            player_name1.setEnabled(tb1.isChecked());
        });
        tb2.setOnClickListener(v -> {
            player_name2 = findViewById(R.id.player2);

            player_name2.setEnabled(tb1.isChecked());
        });
        tb3.setOnClickListener(v -> {
            player_name3 = findViewById(R.id.player3);

            player_name3.setEnabled(tb1.isChecked());
        });
        tb4.setOnClickListener(v -> {
            player_name4 = findViewById(R.id.player4);

            player_name4.setEnabled(tb1.isChecked());
        });

        nextButton = findViewById(R.id.start_game);
        nextButton.setOnClickListener(view -> {
            if (tb1.isChecked()) {
                db.insertPlayer(player_name1.getText().toString(), 1, 0);
            }
            if (tb2.isChecked()) {
                db.insertPlayer(player_name2.getText().toString(), 2, 0);
            }
            if (tb3.isChecked()) {
                db.insertPlayer(player_name3.getText().toString(), 3, 0);
            }
            if (tb4.isChecked()) {
                db.insertPlayer(player_name4.getText().toString(), 4, 0);
            }

            Intent androidsolved_intent = new Intent(getApplicationContext(), GameActivity.class);
            startActivity(androidsolved_intent);
        });
    }
}
