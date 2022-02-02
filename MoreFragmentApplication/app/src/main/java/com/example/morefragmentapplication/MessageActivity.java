package com.example.morefragmentapplication;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView;

import androidx.fragment.app.FragmentActivity;

public class MessageActivity extends FragmentActivity {
    String message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        Bundle extras = getIntent().getExtras();
        message = extras.getString("value");

        TextView textView = (TextView) findViewById(R.id.message);
        textView.setText(message);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Intent intent = new Intent(this, FragmentActivity.class);
            intent.putExtra("value", message);
            startActivity(intent);
        }
    }
}