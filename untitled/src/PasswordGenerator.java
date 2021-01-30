//Unit 5 Question 2

import java.lang.Math;
import java.util.Random;


public class PasswordGenerator{
    //attributes
    private int randomNum;
    private String prefix;
    private static count;

    //constructor 1
    public PasswordGenerator(int n, String s){
        randomNum = n;
        prefix = s;
    }

    //constructor 2
    public PasswordGenerator(int n){
        randomNum = n;
        prefix = "A";
    }

    //accessor
    public static int pwCount(){
        return count;
    }

    //accessor
    public static String pwGen(){
        int multiplier = Math.pow(10, randomNum - 1);
        int num = Math.random() * 9*multiplier) + multiplier;
        String pass = prefix + "." + num;
        count++;
        return pass;
    }


}
