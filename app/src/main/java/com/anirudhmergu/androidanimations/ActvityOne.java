package com.anirudhmergu.androidanimations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class ActvityOne extends AppCompatActivity {

    private LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actvity_one);

        linearLayout = findViewById(R.id.linearLayout);
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if(hasFocus)
        {
            showAnimation();
        }
    }

    public void showAnimation()
    {
        linearLayout.animate().alpha(1f).setDuration(1500);
    }
}
