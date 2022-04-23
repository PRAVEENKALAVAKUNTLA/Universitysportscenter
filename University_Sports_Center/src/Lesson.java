import java.util.Scanner;

public class Lesson {

    public void lesson(int[][] arr,int j ,String ename){
        Scanner s=new Scanner(System.in);
        for(int i=0;i<3;i++){
            if(i==0){
            if (arr[j][i]==0) {
                System.out.println((i+1)+" "+"Morning lesson is available");
            }
            else{
                System.out.println((i+1)+" "+"Morning lesson is already booked");
            }
            }
            else if(i==1){
                if (arr[j][i]==0) {
                    System.out.println((i+1)+" "+"Afternoon lesson is available");
                }
                else{
                    System.out.println((i+1)+" "+"Afternoon lesson is already booked");
                }
            }
            else {
                if (arr[j][i]==0) {
                    System.out.println((i+1)+" "+"Evening lesson is available");
                }
                else{
                    System.out.println((i+1)+" "+" Evening lesson is already booked");
                }
            }
        }
        Booking bo=new Booking();
        System.out.println("Enter the number of lesson you want");
        int l=s.nextInt();
        bo.booking(arr,l,j,ename);
    }


}
