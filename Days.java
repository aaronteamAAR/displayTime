public class Days{

    enum WeekDays{
        MONDAY("read"), TUESDAY("24hrs"), WEDNESDAY("aptLearn"), THURSDAY("frontend"), FRIDAY("gitbub"), SATURDAY("make commits"), SUNDAY("read");

        String plans;

        WeekDays(String p){
            plans = p;
        }
    }
    public static void main(String [] args) {
       WeekDays wk1 = WeekDays.MONDAY;
        WeekDays allDays[] = WeekDays.values();

       if(wk1 == WeekDays.MONDAY){
        System.out.println("Day 1");
       }
    // looping through an enum 
     for(WeekDays d: allDays){
        System.out.println(d);
        System.out.println();
     }

     System.out.println();

    }
}