package com.test.first2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.os.Handler;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Slider_Main extends AppCompatActivity {

    private static ViewPager mPager;
    private static int currentPage = 0;
    private static int NUM_PAGES = 0;
    private static final Integer[] IMAGES= {R.drawable.buy,R.drawable.bank,R.drawable.mtn3,R.drawable.mtn2};
    private ArrayList<Integer> ImagesArray = new ArrayList<Integer>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init() {
        for(int i=0;i<IMAGES.length;i++)
            ImagesArray.add(IMAGES[i]);

        mPager = (ViewPager) findViewById(R.id.my_pager);


        //mPager.setAdapter(new SlideAdapter(Slider_Main.this,ImagesArray));


        //CirclePageIndicator indicator = (CirclePageIndicator)
               // findViewById(R.id.indicator);

       // indicator.setViewPager(mPager);

        final float density = getResources().getDisplayMetrics().density;

//Set circle indicator radius
       //indicator.setRadius(5 * density);

        NUM_PAGES =IMAGES.length;

        // Auto start of viewpager
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == NUM_PAGES) {
                    currentPage = 0;
                }
                mPager.setCurrentItem(currentPage++, true);
            }
        };
        Timer swipeTimer = new Timer();
        swipeTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, 3000, 3000);

        // Pager listener over indicator
        //indicator.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

           // @Override
            //public void onPageSelected(int position) {
                //currentPage = position;

           // }

            //@Override
           // public void onPageScrolled(int pos, float arg1, int arg2) {

           // }

           // @Override
           // public void onPageScrollStateChanged(int pos) {

           // }
       // });

    }

}