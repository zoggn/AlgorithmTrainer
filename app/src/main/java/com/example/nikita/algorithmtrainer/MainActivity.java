package com.example.nikita.algorithmtrainer;

import android.graphics.Color;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements
                          GestureDetector.OnDoubleTapListener,
                          GestureDetector.OnGestureListener{

    TextView el1;
    GestureDetectorCompat gd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gd = new GestureDetectorCompat(this,this);
        gd.setOnDoubleTapListener(this);
		el1 = (TextView)findViewById(R.id.AlgShow);
		el1.setTextSize(TypedValue.COMPLEX_UNIT_SP,40);
		el1.setTextColor(Color.WHITE);
    }


    int index = 0;

    String[] algs = new String[]{
            "L' U2 (R U R') U2' L",
            "R U' R'",
            "(R U' R') U [R' U' R U' R' U2 R]",
            "U' (R U' R' U2) (R U' R' U2) (R U R') ",
            "U' (R' F R U) (R U' R' F')",
            "R2 D (R' U' R) D' R2'",
            "(R U R' U') (R U' R') ",
            "U (R U' R' U) (R U2' R')",
            "R U R2' U' R2 U' R2' U2' R",
            "U R2 D (R' U2 R) D' R2",
            "U R' U' R2 U' R2' U2' R",
            "U F' (R U2' R' U2') R' F R",
            "U R U2' [R2' U' R U' R' U2 R]",
            "U' L' (U R U' R') L ",
            "U R U2' R'",
            "(R U' R') U' [R U R' U R U2' R']",
            "R U' [R2' U2' R U R' U R] ",
            "U R U2' [R2' U2' R U R' U R]",
            "R U' [R2' U' R U' R' U2 R]",
            "(R U R' U') (R U R' U') R U' R' ",
            "R2 D (R' U R) D' R' U2 R'",
            "U (R U' R' U) (R U' R' U) R U2' R'"
    };

     public void Generate(){
     	AlgTools newAlg = new AlgTools();
        Random newRand = new Random();

        index = newRand.nextInt(algs.length);
        el1.setText(newAlg.invert_alg(algs[index]));
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
         gd.onTouchEvent(event);
         return super.onTouchEvent(event);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
         Generate();
         return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        return false;
    }
}
