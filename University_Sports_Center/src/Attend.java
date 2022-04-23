import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class Attend {
    public void attend(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Are you going to attend the lesson!!! type \'yes\' or \'no\'");
        String rep=scan.next();
        String repp=rep.toLowerCase();
        if(rep.equals("yes")){
            System.out.println("Write a review here!");
            String rev=scan.next();
            System.out.println("Give Star rating: \n1.Very Dissatisfied\n2.Dissatisfied\n3.Ok\n4.Satisfied\n5.Very Satisfied");
            int rat=scan.nextInt();
            System.out.println("Thankyou for giving Rating "+rat+"and Review \n "+rev);
        }
        else{
            System.out.println("Take time and Attend the lesson and be healthy." +
                    "");
        }

    }
}
