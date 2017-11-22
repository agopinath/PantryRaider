package com.example.stevetran.pantryraider.Setting;

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
 * Created by Abel on 11/17/2017.
 */

public class SettingFragment extends Fragment implements View.OnClickListener{
    //this view
    View view;

    //buttons
    Button changePasswordButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_setting, container, false);

        //set up buttons
        changePasswordButton = (Button) view.findViewById(R.id.changePasswordButton);
        changePasswordButton.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.changePasswordButton:
                Intent intent = new Intent(getActivity(), ChangePasswordActivity.class);
                startActivity(intent);
                break;
        }
    }
}