package com.example.hockeytest.androidhockeyappdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by soumyasiricilla on 1/3/17.
 */

public class FragmentThree extends Fragment {

    Button mButtonOne;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_three, container, false);

        mButtonOne = (Button)view.findViewById(R.id.button_one);

        mButtonOne.setText("");

        mButtonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //crashIt();
            }
        });
        return view;
    }

}
