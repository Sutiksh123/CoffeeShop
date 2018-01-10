package com.apps.kshitij.coffeeshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class CoffeeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee);

        String[] coffee = {"Latte","Espresso","Cappuccino"};

        ListAdapter listAdapter = new CustomCoffee(this, coffee);
        ListView myCoffeeList = (ListView) findViewById(R.id.myCoffeeList);
        myCoffeeList.setAdapter(listAdapter);

        myCoffeeList.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String coffee = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(CoffeeActivity.this, coffee, Toast.LENGTH_SHORT).show();
                    }
                });
    }
}

