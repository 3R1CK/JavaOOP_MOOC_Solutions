
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
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

    public void advance() {
        if (this.day < 30) {
            this.day++;
        } else if (this.day == 30 && this.month < 12) {
            this.day = 1;
            this.month++;
        } else if (this.month == 12 && this.day == 30) {
            this.day = 1;
            this.month = 1;
            this.year++;
        }
    }

    public int differenceInYears(MyDate comparedDate) {

        int days = 0;
        int difference = 0;
        MyDate cloneDate= new MyDate(day, month, year);
        MyDate cloneCompare = new MyDate(day, month, year);

        if (!earlier(comparedDate)) {
           cloneDate = new MyDate(this.day, this.month, this.year);
           cloneCompare = new MyDate(comparedDate.day, comparedDate.month, comparedDate.year);
        }else{
           cloneDate = new MyDate(comparedDate.day, comparedDate.month, comparedDate.year);
           cloneCompare =  new MyDate(this.day, this.month, this.year);
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
