package com.example.nikita.algorithmtrainer;

public class AlgTools {

    String[] ALG_POW = {"", "2", "'"};

    public AlgTools(){

    }

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
