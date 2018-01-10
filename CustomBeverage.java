package com.apps.kshitij.coffeeshop;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
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

public class CustomBeverage extends ArrayAdapter {

    public CustomBeverage(@NonNull Context context, String[] Beverages) {
        super(context, R.layout.custom_beverage,Beverages);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater beverageInflater = LayoutInflater.from(getContext());
        View CustomView = beverageInflater.inflate(R.layout.custom_beverage, parent, false);
        String singlebeverageitem = (String) getItem(position);
        TextView milkshakeText = (TextView) CustomView.findViewById(R.id.milkshakeText);
        ImageView milkshakeView = (ImageView) CustomView.findViewById(R.id.milkshakeView);

        milkshakeText.setText(singlebeverageitem);
        if (singlebeverageitem.equals("Milkshakes")){
            milkshakeView.setImageResource(R.drawable.milkshake);
        }
        else if (singlebeverageitem.equals("Coca-Cola")){
            milkshakeView.setImageResource(R.drawable.cocacola);
        }
        else if (singlebeverageitem.equals("Lemonade")){
            milkshakeView.setImageResource(R.drawable.lemonade);
        }

        return CustomView;
    }
}
