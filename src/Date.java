import java.util.Objects;

public class Date {
    private int year;
    private int day;
    private int month;

    public Date() {
    }

    public Date(int year, int day, int month) {
        this.year = year;
        this.day = day;
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Date date = (Date) o;
        return year == date.year && day == date.day && month == date.month;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, day, month);
    }

    @Override
    public String toString() {
        return "Date{" +
                "year=" + year +
                ", day=" + day +
                ", month=" + month +
                '}';
    }
}
