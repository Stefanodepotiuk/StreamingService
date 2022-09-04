import java.util.Objects;

public abstract class Show {
    private String nameShow;
    private Genres genres;
    private Date realiseDate;
    private int view = 0;
    private double duration;

    public abstract void getDurations();

    public Show() {
    }

    public Show(String nameShow, Genres genres, Date realiseDate, int view, double duration) {
        this.nameShow = nameShow;
        this.genres = genres;
        this.realiseDate = realiseDate;
        this.view = view;
        this.duration = duration;
    }

    public String getNameShow() {
        return nameShow;
    }

    public void setNameShow(String nameShow) {
        this.nameShow = nameShow;
    }

    public Genres getGenres() {
        return genres;
    }

    public void setGenres(Genres genres) {
        this.genres = genres;
    }

    public Date getRealiseDate() {
        return realiseDate;
    }

    public void setRealiseDate(Date realiseDate) {
        this.realiseDate = realiseDate;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Show show = (Show) o;
        return view == show.view && Double.compare(show.duration, duration) == 0 && Objects.equals(nameShow, show.nameShow) && genres == show.genres && Objects.equals(realiseDate, show.realiseDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameShow, genres, realiseDate, view, duration);
    }

    @Override
    public String toString() {
        return "Show{" +
                "nameShow='" + nameShow + '\'' +
                ", genres=" + genres +
                ", realiseDate=" + realiseDate +
                ", view=" + view +
                ", duration=" + duration +
                '}';
    }
}
