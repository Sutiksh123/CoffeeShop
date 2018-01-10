package com.apps.kshitij.coffeeshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class BurgerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burger);

        String [] burger = {"Burger-Pizza","Aloo-Tikki","Egg-Burger"};

        ListAdapter listAdapter = new CustomBurger(this, burger);
        ListView myBurgerList = (ListView) findViewById(R.id.myBurgerList);
        myBurgerList.setAdapter(listAdapter);

        myBurgerList.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String burger = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(BurgerActivity.this, burger, Toast.LENGTH_SHORT).show();
                    }
                });
    }
}
