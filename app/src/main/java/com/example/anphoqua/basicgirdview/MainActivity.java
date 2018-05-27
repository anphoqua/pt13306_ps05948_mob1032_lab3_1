package com.example.anphoqua.basicgirdview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    String[] number = {"0","1","2","3","4","5","6","7","8","9"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, number);
        gridView.setAdapter(adapter);
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.activity_main);
//        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, number[position], Toast.LENGTH_SHORT).show();
            }
        });

    }
}
