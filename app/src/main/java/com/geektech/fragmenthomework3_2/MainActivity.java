package com.geektech.fragmenthomework3_2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().add(R.id.container /* id нашего ярлыка в activity_main.xml */ , new MainFragment()/* название нашего фрагмента */ ).commit();// Что бы приклеить наш фрагмент на наш активити нужно было ввести эту строку кода

    }
}