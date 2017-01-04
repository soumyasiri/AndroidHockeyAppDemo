package com.example.hockeytest.androidhockeyappdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import net.hockeyapp.android.CrashManager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by soumyasiricilla on 1/3/17.
 */

public class FragmentOne extends Fragment {

    Button mButtonOne;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);

        mButtonOne = (Button)view.findViewById(R.id.button_one);

        mButtonOne.setText("Crash the app");

        mButtonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             crashIt();
            }
        });


        return view;
    }


    private void crashIt(){

        List<Integer> list = new ArrayList<Integer>();
        System.out.println(list.get(0));

    }

    @Override
    public void onResume() {
        super.onResume();
        checkForCrashes();
    }

    private void checkForCrashes() {
        CrashManager.register(getActivity());
    }
}
