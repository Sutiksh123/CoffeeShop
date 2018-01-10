package com.apps.kshitij.coffeeshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class PizzaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);

        String [] pizza = {"Burger-Pizza","Garlic-Bread","Margherita"};
        ListAdapter listAdapter = new CustomPizza(this, pizza);
        ListView myPizzaList = (ListView) findViewById(R.id.myPizzaList);
        myPizzaList.setAdapter(listAdapter);

        myPizzaList.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String pizza = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(PizzaActivity.this,pizza,Toast.LENGTH_SHORT ).show();
                    }
                });
    }
}
