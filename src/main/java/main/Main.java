package main;

import util.Utility;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class Main {
    private static int result;
    private static Instant start =null;
    private static  Instant end = null;
    private static double chars = 0 ;
    private static double charsPerSeconds = 0 ;




    public static void main(String[] args) throws InterruptedException {
        System.out.println("3");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("2");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("1");
        TimeUnit.SECONDS.sleep(1);


        start = Instant.now();


        startWrite();




    }
    public static void startWrite(){


       String givenString = Utility.randomWord();
      chars +=givenString.replaceAll("\\s","").length();
        System.out.println(givenString);

        String yourString   =   Utility.requireText("Enter word");
        if(yourString.equalsIgnoreCase(givenString)){
            System.out.println("Correct");
            result++;
            startWrite();
        }else {System.out.println("Incoorrect ");
            end = Instant.now();
            Duration timeElapsed = Duration.between(start, end);

            System.out.println("Time taken: "+ (timeElapsed.toSeconds())+" seconds");
            System.out.println("Correct words----->"+result);
           chars = chars-givenString.replaceAll("\\s","").length();
            System.out.println("Correct written chars----->"+chars);
charsPerSeconds = chars/ timeElapsed.toSeconds();
            System.out.printf("CPM (CharsPerSeconds)----->"+charsPerSeconds);
            System.exit(0);

        }

    }
}
