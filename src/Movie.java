public class Movie extends Show {

    @Override
    public void getDurations() {
        System.out.println(getNameShow() + " Duration " + getDuration());
    }

    public Movie() {
    }

    public Movie(String nameShow, Genres genres, Date realiseDate, int view, double duration) {
        super(nameShow, genres, realiseDate, view, duration);
    }

}
