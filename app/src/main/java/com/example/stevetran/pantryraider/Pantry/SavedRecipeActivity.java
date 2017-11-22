package com.example.stevetran.pantryraider.Pantry;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.stevetran.pantryraider.R;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by William Ma on 11/17/2017.
 */

public class SavedRecipeActivity extends AppCompatActivity {
    private ListView SavedRecipeList;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved_recipe);
        inflateListView();
    }

    private void inflateListView(){
        //inflate the list view
        SavedRecipeList = findViewById(R.id.SavedRecipeList);
        ArrayList<String> arrayRecipes = new ArrayList<>();
        arrayRecipes.addAll(Arrays.asList(getResources().getStringArray(R.array.saved_recipes)));
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrayRecipes);
        SavedRecipeList.setAdapter(adapter);
    }
}