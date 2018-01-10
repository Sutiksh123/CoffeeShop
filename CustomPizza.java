package com.apps.kshitij.coffeeshop;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by KSHITIJ on 09-01-2018.
 */

public class CustomPizza extends ArrayAdapter {

    public CustomPizza(@NonNull Context context, String[] Pizzas) {
        super(context, R.layout.custom_pizza, Pizzas);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater pizzaInflater = LayoutInflater.from(getContext());
        View CustomView = pizzaInflater.inflate(R.layout.custom_pizza, parent, false);
        String singlepizzaitem = (String) getItem(position);
        TextView burpizText = (TextView) CustomView.findViewById(R.id.burpizText);
        ImageView burpizView = (ImageView) CustomView.findViewById(R.id.burpizView);

        burpizText.setText(singlepizzaitem);
        if (singlepizzaitem.equals("Burger-Pizza")){
            burpizView.setImageResource(R.drawable.burger_pizza);
        }
        else if (singlepizzaitem.equals("Garlic-Bread")){
            burpizView.setImageResource(R.drawable.garlic_bread);
        }
        else if (singlepizzaitem.equals("Margherita")){
            burpizView.setImageResource(R.drawable.margherita);
        }

        return CustomView;
    }
}
