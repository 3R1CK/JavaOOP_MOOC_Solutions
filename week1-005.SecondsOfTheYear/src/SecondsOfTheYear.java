public class SecondsOfTheYear {

    public static void main(String[] args) {   
        // In below an incomplete version of the program. Please complete it!
        
        int daysInYear = 365;
        int hoursInDay = 24;
        int minutesInHour = 60;
        int secondsInMinute = 60;
        
        
        int secondsInHour= (secondsInMinute*minutesInHour);
        int secondsInDay= (secondsInHour*hoursInDay);
        int secondsInYear = daysInYear * secondsInDay;

        System.out.println("There are " + secondsInYear + " seconds in a year");
    }

}
