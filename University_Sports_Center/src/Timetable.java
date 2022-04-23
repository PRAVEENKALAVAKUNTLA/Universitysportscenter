import java.util.Scanner;

public class Timetable {
    int[][] zarr = {{1, 0, 0}, {1, 1, 0}};
    int[][] yarr = {{0, 1, 0}, {0, 0, 1}};
    int[][] aarr = {{1, 0, 1}, {1, 1, 1}};
    int[][] barr = {{1, 0, 1}, {0, 1, 0}};
Lesson t=new Lesson();
    public void timetable(String ename) {
        String exname = ename.toLowerCase();
        Scanner scc = new Scanner(System.in);

        System.out.println("Available days are \"Saturday\" or \"Sunday\" ");
        System.out.println("Enter the day");
        String day = scc.next();
        String dday = day.toLowerCase();

        switch (exname) {
            case "zumba":
                System.out.println(dday);
                if(dday.equals("saturday")) {
                    int j = 0;
                    t.lesson(zarr, j,ename);
                } else {
                    int j = 1;
                    t.lesson(zarr, j,ename);
                }
                break;
            case "yoga":
                if (dday.equals("saturday")) {
                    int j = 0;
                    t.lesson(yarr, j,ename);
                } else {
                    int j = 1;
                    t.lesson(yarr, j,ename);
                }
                break;
            case "aquacise":
                if (dday.equals("saturday")) {
                    int j = 0;
                    t.lesson(aarr, j,ename);
                } else {
                    int j = 1;
                    t.lesson(aarr, j,ename);
                }
                break;
            case "boxfit":
                if (dday.equals("saturday")) {
                    int j = 0;
                    t.lesson(barr, j,ename);
                } else {
                    int j = 1;
                    t.lesson(barr, j,ename);
                }
                break;
            default:
                System.out.println("Please enter valid input");
                break;
        }
    }

}


