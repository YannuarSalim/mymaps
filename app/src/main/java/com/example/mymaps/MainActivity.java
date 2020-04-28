package com.example.mymaps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void spbu(View view){
        String value="spbu";
        Intent intent = new Intent(MainActivity.this, MapsActivity.class);

        intent.putExtra("key",value);
        startActivity(intent);
    }

    public void universitas(View view){
        String value="universitas";
        Intent intent = new Intent(MainActivity.this, MapsActivity.class);
        intent.putExtra("key",value);
        startActivity(intent);
    }

}
