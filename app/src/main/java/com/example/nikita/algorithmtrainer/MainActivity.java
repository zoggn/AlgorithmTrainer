package com.example.nikita.algorithmtrainer;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    TextView el1;
    int index = 0;

    String[] algs = new String[]{
            "R U' R' ",
            "R' U2 R U R' U R U' R U R' ",
            "R U' R' U2 R U R' U2 R U R' U ",
            "F R U R' U' R' F' R U ",
            "R2 D R' U R D' R2 ",
            "R U R' U R U' R' ",
            "R U2 R' U' R U R' U' ",
            "R' U2 R2 U R2 U R2 U' R' ",
            "R2 D R' U2 R D' R2 U' ",
            "U F' (R U2' R' U2') R' F R",
            "R' U2 R2 U R2 U R U' ",
            "R' U2 R U R' U R2 U2 R' U' ",
            "L' R U R' U' L U ",
            "R U2 R' U' ",
            "R U2 R' U' R U' R' U R U R' ",
            "R' U' R U' R' U2 R2 U R' ",
            "R U2 R D R' U' R D' R2",
            "R U R' U R U' R' U R U' R' ",
            "R' U2 R U R' U R2 U R' ",
            "R' U' R U' R' U2 R2 U2 R' U' ",
            "U (R U' R' U) (R U' R' U) R U2' R' ",
            "L' U2 R U' R' U2 L"
    };

     public void Generate(View v){
     	AlgTools newAlg = new AlgTools();
        Random newRand = new Random();

        el1 = (TextView)findViewById(R.id.AlgShow);
        el1.setTextSize(TypedValue.COMPLEX_UNIT_SP,40);
        el1.setTextColor(Color.WHITE);

        index = newRand.nextInt(algs.length);
        el1.setText(newAlg.invert_alg(algs[index]));
    }




}
