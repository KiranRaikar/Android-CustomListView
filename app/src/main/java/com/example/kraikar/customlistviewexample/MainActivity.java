package com.example.kraikar.customlistviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] fruits = {"Apple", "Apricot", "Avocado", "Banana", "Mango", "Orage", "Pineapple", "Papaya"};
        ListAdapter listAdapter = new CustomListViewAdaptor(this, fruits);
        ListView listViewFruits = (ListView) findViewById(R.id.listViewFruits);
        listViewFruits.setAdapter(listAdapter);

    }
}
