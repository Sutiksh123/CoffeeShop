package com.apps.kshitij.coffeeshop;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ScrollingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void toBeverage(View view) {
        Intent beverage = new Intent(this, BeverageActivity.class);
        startActivity(beverage);
    }

    public void toBurger(View view) {
        Intent burger = new Intent(this, BurgerActivity.class);
        startActivity(burger);
    }

    public void toPizza(View view) {
        Intent pizza = new Intent(this, PizzaActivity.class);
        startActivity(pizza);
    }

    public void toCoffee(View view) {
        Intent coffee = new Intent(this, CoffeeActivity.class);
        startActivity(coffee);
    }
}
