import java.util.ArrayList;
import java.util.Scanner;

public class Reports {
    Scanner ss=new Scanner(System.in);
    public void monthlyLessonReport(ArrayList<int[][]> arr){
        System.out.println("Enter the month of report:");
        String month=ss.next();

        for(int[][] i:arr){
            int count=0;
            for(int[] ii: i){
                for(int iii: ii){
                    count+=iii;
                }

            }
            System.out.println("Total no of Students:"+count);
        }

    }

}
