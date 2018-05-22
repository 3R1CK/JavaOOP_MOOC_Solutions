
import java.util.Calendar;

public class Person {

    private String name;
    private MyDate birthday;

    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }

    public Person(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public Person(String name) {
        int presentDay = Calendar.getInstance().get(Calendar.DATE);
        int presentMonth = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int presentYear = Calendar.getInstance().get(Calendar.YEAR);
        
        this.name = name;
        this.birthday = new MyDate(presentDay, presentMonth, presentYear);
    }

    public int age() {
// calculate the age based on the birthday and the current day
        // you get the current day as follows: 
        // Calendar.getInstance().get(Calendar.DATE);
        // Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        // Calendar.getInstance().get(Calendar.YEAR);
        int age;
        int presentDay = Calendar.getInstance().get(Calendar.DATE);
        int presentMonth = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int presentYear = Calendar.getInstance().get(Calendar.YEAR);

        MyDate presentDate = new MyDate(presentDay, presentMonth, presentYear);

        age = this.birthday.differneceInYears(presentDate);

        return age;
    }

    public boolean olderThan(Person compared) {
        // compare the ages based on birthdays
        if (this.birthday.earlier(compared.birthday)) {
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
