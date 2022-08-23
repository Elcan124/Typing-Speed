package util;

import com.github.dhiraj072.randomwordgenerator.RandomWordGenerator;

import java.util.Scanner;

public class Utility {
    public static  String requireText(String text){

        Scanner sc = new Scanner(System.in);
        System.out.println(text+":");
        String s =  sc.nextLine();
        return s;




    }



    public static String randomWord(){
        return RandomWordGenerator.getRandomWord();
    }
}
