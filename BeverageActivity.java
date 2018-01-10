package com.apps.kshitij.coffeeshop;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class BeverageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beverage);

        String [] beverages = {"Milkshakes","Coca-Cola","Lemonade"};

        ListAdapter listAdapter = new CustomBeverage(this, beverages);
        ListView myList = (ListView) findViewById(R.id.myBevList);
        myList.setAdapter(listAdapter);

        myList.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String beverage = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(BeverageActivity.this,beverage,Toast.LENGTH_SHORT ).show();
                    }
                });

    }

    }
