package com.example.stevetran.pantryraider.Pantry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.stevetran.pantryraider.R;

public class IngredientAdd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingredient_add);
    }

    public void buttonOnClick(View v) {
        //save the ingredients and navigate back to MyIngredientsActivity
    }
}
