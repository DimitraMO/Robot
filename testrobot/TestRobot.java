package testrobot;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class TestRobot {

    public static void main(String[] args) {
        String way = null;
        System.out.println("Enter the desire genter: ");
        Scanner keyboard = new Scanner(System.in);
        String genter = keyboard.next();

        System.out.println("Enter the desire name: ");
        String name = keyboard.next();

        System.out.println("Enter the desire speaking language: ");
        String nativeLanguage = keyboard.next();

        //....recap....
        Robot r1 = new Robot(name, genter, nativeLanguage);

        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date dateobj = new Date();
        System.out.println(df.format(dateobj));

        r1.speak();
        r1.listen();
        r1.turnLeft();
        r1.walk();
        r1.turnRight();
      
    }

}
