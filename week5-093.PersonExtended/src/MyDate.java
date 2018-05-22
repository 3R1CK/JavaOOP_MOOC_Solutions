
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
    public int differneceInYears(MyDate compared) {
        int days = 0;
        int difference = 0;
        MyDate cloneDate = new MyDate(day, month, year);
        MyDate cloneCompare = new MyDate(day, month, year);

        if (!earlier(compared)) {
            cloneDate = new MyDate(this.day, this.month, this.year);
            cloneCompare = new MyDate(compared.day, compared.month, compared.year);
        } else {
            cloneDate = new MyDate(compared.day, compared.month, compared.year);
            cloneCompare = new MyDate(this.day, this.month, this.year);
        }

        while (cloneCompare.earlier(cloneDate)) {

            if (cloneCompare.day < 30) {
                cloneCompare.day++;
                days++;
            } else if (cloneCompare.day == 30 && cloneCompare.month < 12) {
                cloneCompare.day = 1;
                cloneCompare.month++;
                days++;
            } else if (cloneCompare.month == 12 && cloneCompare.day == 30) {
                cloneCompare.day = 1;
                cloneCompare.month = 1;
                cloneCompare.year++;
                days++;
            }

        }

        difference = days / 360;

        return difference;
    }

}
