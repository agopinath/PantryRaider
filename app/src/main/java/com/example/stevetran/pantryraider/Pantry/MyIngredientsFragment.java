package com.example.stevetran.pantryraider.Pantry;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.stevetran.pantryraider.R;

/**
 * Created by Ckawahar on 11/22/2017.
 */

public class MyIngredientsFragment extends Fragment implements View.OnClickListener{
    Button addIngredientsButton;
    View view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_my_ingredients, container, false);

        //set up buttons
        addIngredientsButton = (Button) view.findViewById(R.id.addIngredientsButton);
        addIngredientsButton.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.addIngredientsButton:
                Intent intent = new Intent(getActivity(), IngredientAdd.class);
                startActivity(intent);
                break;
        }
    }
}