package com.example.android_list_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listVw);

        final String[] colors = {"Blue", "Red", "Green", "Black", "Yellow"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, R.layout.list_item, R.id.txtVw_color, colors);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d("CLICK", "click");
                Log.d("CLICK PARENT", parent.toString());
                Log.d("CLICK VIEW", view.toString());
                Log.d("CLICK POS", position+"");
                Log.d("CLICK ID", id+"");

                TextView txtVw_color = view.findViewById(R.id.txtVw_color);

                Log.d("CLICK", colors[position]);
                Log.d("CLICK", txtVw_color.getText().toString());
            }
        });


    }
}
