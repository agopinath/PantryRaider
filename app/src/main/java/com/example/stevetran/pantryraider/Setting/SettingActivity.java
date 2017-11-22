package com.example.stevetran.pantryraider.Setting;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.example.stevetran.pantryraider.Pantry.SectionsPagerAdapter;
import com.example.stevetran.pantryraider.R;
import com.example.stevetran.pantryraider.Util.BottomNavigationHelper;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

/**
 * Created by Abel on 11/14/2017.
 */

public class SettingActivity extends AppCompatActivity {
    private static final int ACTIVITY_NUM = 3;
    private Context mContext = SettingActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        setupBottomNavigationView();
        setupViewPager();
    }
    /**
     * start fragments
     */
    private void setupViewPager(){
        SectionsPagerAdapter adapter = new SectionsPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new SettingFragment());
        ViewPager viewPager = (ViewPager) findViewById(R.id.container); //from layout_center_viewpager
        viewPager.setAdapter(adapter);

    }
    /**
     * BottomNavigationView setup
     */
    private void setupBottomNavigationView(){
        BottomNavigationViewEx bottomNavigationViewEx = (BottomNavigationViewEx) findViewById(R.id.bottomNavViewBar);
        BottomNavigationHelper.setupBottomNavigationView(bottomNavigationViewEx);
        BottomNavigationHelper.enableNavigation(mContext, bottomNavigationViewEx, this);
        Menu menu = bottomNavigationViewEx.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);
    }
}
