package com.jiac.progressbar;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private VerticalProgressBar mVpb1;
    private VerticalProgressBar mVpb2;
    private VerticalProgressBar mVpb3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mVpb1 = (VerticalProgressBar) findViewById(R.id.vpb1);
        mVpb2 = (VerticalProgressBar) findViewById(R.id.vpb2);
        mVpb3 = (VerticalProgressBar) findViewById(R.id.vpb3);
        mVpb1.setProgress(50);
        mVpb2.setMax(120);
        /**-------------设置属性动画-------------**/
        ObjectAnimator moneyAnimator = ObjectAnimator.ofFloat(mVpb2, "progress", 0, 100);
        moneyAnimator.setDuration(1800);
        moneyAnimator.start();


    }
}
