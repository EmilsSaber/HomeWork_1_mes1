package com.geektech.fragmenthomework3_2;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MainFragment extends Fragment {

    int count  = 0;
    private Button btnIncrement,btnDecrement;
    private TextView clickCount;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btnIncrement = view.findViewById(R.id.btn_increment);
        btnDecrement = view.findViewById(R.id.btn_decrement);
        clickCount = view.findViewById(R.id.zero_Tv);

        btnIncrement.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                count++;
                clickCount.setText(count+"Click!");
            }
        });
        btnDecrement.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                count--;
                clickCount.setText(count+"Click!");
            }
        });
    }
}