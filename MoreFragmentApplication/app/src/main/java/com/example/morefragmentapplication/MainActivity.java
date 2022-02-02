package com.example.morefragmentapplication;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;


public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MessageFragment fragment = (MessageFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_detail);
        Bundle extras = getIntent().getExtras();

        if(extras != null){
            String value = extras.getString("value");
            if(value !=null && fragment != null && fragment.isInLayout()){
                fragment.setMessage(value);
            }
        }
    }
}
