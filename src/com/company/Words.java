package com.company;

public class Words {
    String[] word = new String[]{
            "importance",
            "inflation",
            "information",
            "innovation"
    };

    int freq(String str){
        int num = 0;
        for(String w: word){
            //n+fの時
            //importance →　9　-　9　/2=0
            //inflation →　9　-　7　/2=1
            //information →　11 -9 / 2 = 1+1=2
            //innovation →　10-10/2＝2

            num += (w.length() - w.replace(str,"").length()) / str.length();

            //nの時
            //importance →　9　-　8　/1＝1
            //inflation →　9　-　7　/1=1+2＝3
            //information →　11 -9 / 1 = 3+2＝5
            //innovation →　10-7/1＝5+3＝8
        }
        return num;
    }
//最後の文字かどうか
    int freqE(String str){
        int num = 0;
        for(String w:word){
            if(w.endsWith(str)){
                num++;
            }
        }
        return num;//3
    }
}
