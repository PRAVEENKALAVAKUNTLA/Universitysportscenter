import java.util.Arrays;

public class Booking {
    public void booking(int[][] arr,int l,int j,String ename){
        if(arr[j][(l-1)]<4){
            arr[j][(l-1)]+=1;
        }
        else{
            System.out.println("Vacancies nill");
            return;
        }
    if(l==1) {
        if (j == 0) {
            System.out.println("Morning lesson for " + ename + " booked on saturday.");
            System.out.println(Arrays.deepToString(arr));
        } else {
            System.out.println("Morning lesson for " + ename + " booked on sunday.");
            System.out.println(Arrays.deepToString(arr));
        }
    }
    else if(l==2){
        if (j == 0) {
            System.out.println("Afternoon lesson for " + ename + " booked on saturday.");
            System.out.println(Arrays.deepToString(arr));
        } else {
            System.out.println("Afternoon lesson for " + ename + " booked on sunday.");
            System.out.println(Arrays.deepToString(arr));
        }
    }
    else
    {
        if (j == 0) {
            System.out.println("Evening lesson for " + ename + " booked on saturday.");
            System.out.println(Arrays.deepToString(arr));
        } else {
            System.out.println("Evening lesson for " + ename + " booked on sunday.");
            System.out.println(Arrays.deepToString(arr));
        }
    }
    }
}
