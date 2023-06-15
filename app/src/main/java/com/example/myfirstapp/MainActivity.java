package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    private int calcular(String numeros) {
        if (numeros.isEmpty()) {
            return 0;
        }

        String[] nums = numeros.split(",");
        int sum  = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += Integer.valueOf(nums[i]);
        }

        return sum;
    }
}