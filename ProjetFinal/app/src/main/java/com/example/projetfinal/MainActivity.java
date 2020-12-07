package com.example.projetfinal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent androidsolved_intent = new Intent(getApplicationContext(),GameActivity.class);
                startActivity(androidsolved_intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);

        // return true so that the menu pop up is opened
        return true;
    }


    public boolean onOptionItemSelected(@NonNull MenuItem item){
        int id = item.getItemId();

       switch(item.getItemId()){
           case R.id.rules:
               startActivity(new Intent(this,Rules.class));
               return true;
       }


        return super.onOptionsItemSelected(item);
    }
}