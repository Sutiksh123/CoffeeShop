package com.apps.kshitij.coffeeshop;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by KSHITIJ on 09-01-2018.
 */

public class CustomCoffee extends ArrayAdapter {

    public CustomCoffee(@NonNull Context context, String[] Coffees) {
        super(context, R.layout.custom_coffee, Coffees);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater coffeeInflater = LayoutInflater.from(getContext());
        View CustomView = coffeeInflater.inflate(R.layout.custom_coffee, parent, false);

        String singlecoffeeitem = (String) getItem(position);
        TextView latteText = (TextView) CustomView.findViewById(R.id.latteText);
        ImageView latteView = (ImageView) CustomView.findViewById(R.id.latteView);

        latteText.setText(singlecoffeeitem);
        if (singlecoffeeitem.equals("Latte")){
            latteView.setImageResource(R.drawable.latte);
        }
        else if (singlecoffeeitem.equals("Espresso")){
            latteView.setImageResource(R.drawable.espresso);
        }
        else if (singlecoffeeitem.equals("Cappuccino")){
            latteView.setImageResource(R.drawable.cappuccino);
        }

        return CustomView;
    }
}
