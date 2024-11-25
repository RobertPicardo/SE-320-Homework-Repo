
public class Day{
    private int year;
    private int month;
    private int date;
    private final int[] monthLengths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Day(int year, int month, int date) {
        if (month < 1 || month > 12 || date < 1 || date > monthLength(year, month)) {
        	throw new IllegalArgumentException();
        }
        this.year = year;
        this.month = month;
        this.date = date;
    }
    
    private int monthLength(int year, int month) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }else return monthLengths[month - 1];
    }
    
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    
    public int daysFrom(Day other){
	    int n = 0;
	    Day d = this;
	    
	    while (d.compareTo(other) > 0){
		    d = d.previousDay();
		    n++;
	    }
	    while (d.compareTo(other) < 0){
		    d = d.nextDay();
		    n--;
	    }
	    return n;
    }
    
    public int compareTo(Day other) {
        if (this.year != other.year) {
            return Integer.compare(this.year, other.year);
            
        }else if (this.month != other.month) {
            return Integer.compare(this.month, other.month);
            
        }else return Integer.compare(this.date, other.date);
    }
    
    public Day nextDay() {
        int newYear = year;
        int newMonth = month;
        int newDate = date + 1;

        if (newDate > monthLength(year, month)) {
            newDate = 1;
            newMonth++;
            if (newMonth > 12) {
                newMonth = 1;
                newYear++;
            }
        }

        return new Day(newYear, newMonth, newDate);
    }

    public Day previousDay() {
        int newYear = year;
        int newMonth = month;
        int newDate = date - 1;

        if (newDate < 1) {
            newMonth--;
            if (newMonth < 1) {
                newMonth = 12;
                newYear--;
            }
            newDate = monthLength(newYear, newMonth);
        }

        return new Day(newYear, newMonth, newDate);
    }
}