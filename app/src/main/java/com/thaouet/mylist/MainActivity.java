package com.thaouet.mylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    AdapterView.OnItemClickListener listener1 = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

selected.setText(items.get(i));

            Toast.makeText(MainActivity.this, String.valueOf(i), Toast.LENGTH_LONG).show();
        }
    };

    ArrayList<String> items;
    ListView liste;
    ArrayAdapter aa;
    TextView selected;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        selected = findViewById(R.id.selectedItem);
        items = new ArrayList<>();
        items.add("YAMAHA");
        items.add("HONDA");
        items.add("DUCATI");
        liste = findViewById(R.id.list);
        aa = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1,
                items);
        liste.setAdapter(aa);
        liste.setOnItemClickListener(listener1);
        items.add("BMW");
    }

    public void buttonClick(View view) {
        items.add("KAWAZAKI");
        aa.notifyDataSetChanged();

    }
}