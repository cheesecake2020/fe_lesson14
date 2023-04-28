package com.company;

public class Main {
    static Words words = new Words();

    public static void main(String[] args) {
        System.out.println(prob('n','f'));
    }

    private static double prob(char c1,char c2){
        String s1 = String.valueOf(c1);
        String s2 = String.valueOf(c2);

        if(words.freq(s1 + s2) > 0){
            //2/（8-3）＝0.4
            return (double) words.freq(s1+s2) / (words.freq(s1) - words.freqE(s1));
        }else{
            return 0;
        }
    }
}
