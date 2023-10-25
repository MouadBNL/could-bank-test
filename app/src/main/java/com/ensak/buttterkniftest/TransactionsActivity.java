package com.ensak.buttterkniftest;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.ButterKnife;

public class TransactionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transaction_activity);
        ButterKnife.bind(this);
    }

}
