package com.apps.kshitij.coffeeshop;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by KSHITIJ on 09-01-2018.
 */

public class CustomBurger
        extends ArrayAdapter {

    public CustomBurger(@NonNull Context context, String[] Burgers) {
        super(context, R.layout.custom_burger, Burgers);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater burgerInflater = LayoutInflater.from(getContext());
        View CustomView = burgerInflater.inflate(R.layout.custom_burger, parent, false);
        String singleburgeritem = (String) getItem(position);
        TextView pizburText = (TextView) CustomView.findViewById(R.id.pizburText);
        ImageView pizburView = (ImageView) CustomView.findViewById(R.id.pizburView);

        pizburText.setText(singleburgeritem);
        if (singleburgeritem.equals("Burger-Pizza")){
            pizburView.setImageResource(R.drawable.burger_pizza);
        }
        else if (singleburgeritem.equals("Aloo-Tikki")){
            pizburView.setImageResource(R.drawable.alootikki);
        }
        else if (singleburgeritem.equals("Egg-Burger")){
            pizburView.setImageResource(R.drawable.egg_burger);
        }

        return CustomView;
    }
}
