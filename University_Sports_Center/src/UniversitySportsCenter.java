import java.util.Scanner;

public class UniversitySportsCenter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ener your id:");
        int id= sc.nextInt();
        System.out.println("1.Booking \n2.Attend \n3.Change Booking \n4.Reports");
        System.out.println("Enter your option by their respective number:");
        int n= sc.nextInt();
        if(n==1) {
            System.out.println("Check the TimeTable for availability!");
            System.out.println("Provided Exercises are \n 1.Zumba \n 2.Yoga \n 3.Aquacise \n 4.Boxfit");
            System.out.println("Enter exercise name:");
            String ename = sc.next();
            Timetable b = new Timetable();
            b.timetable(ename);
        }
        else if(n==2){
            Attend aa=new Attend();
            aa.attend();

        }
        else if(n==3){
            BookingChanged bb=new BookingChanged();
            bb.bookingchanged(id);

        }
        else {
            Reports rr=new Reports();
            System.out.println("something went wrong");
        }
    }
}
