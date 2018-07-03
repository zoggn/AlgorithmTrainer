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
        Random newRand = new Random();
        el1 = (TextView)findViewById(R.id.AlgShow);
        el1.setTextSize(TypedValue.COMPLEX_UNIT_SP,40);
        el1.setTextColor(Color.WHITE);

        index = newRand.nextInt(algs.length);
        el1.setText(invert_alg(algs[index]));
    }


    String[] ALG_POW = {"", "2", "'"};

    public int move_id(String move){
				switch(move){
					case "U": return 0;
					case "R": return 1;
					case "F": return 2;
					case "D": return 3;
					case "L": return 4;
					case "B": return 5;
					case "u": return 6;
					case "r": return 7;
					case "f": return 8;
					case "d": return 9;
					case "l": return 10;
					case "b": return 11;
					case "E": return 12;
					case "M": return 13;
					case "S": return 14;
					case "x": return 15;
					case "y": return 16;
					case "z": return 17;
				}
				return -1;
			}

    public int move_pow(String chr){
				switch(chr){
					case "2" : return 1;
					case "'" : return 2;
					case "3" : return 2;
				}
				return 0;
			}

    public String invert_alg(String alg){
				String inverse = "";
				int pow = 0;
				int i = alg.length() - 1;
				while(i >= 0){
					int move = move_id(alg.substring(i, i + 1));
					if(move != -1){
						inverse += alg.substring(i, i + 1) + ALG_POW[2 - pow] + " ";
						pow = 0;
					}
					else pow = move_pow(alg.substring(i, i + 1));
					i--;
				}
				return inverse;
			}
}
