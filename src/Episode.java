public class Episode extends Show{



    @Override
    public void getDurations() {
        System.out.println(getNameShow() + " Duration " + getDuration());
    }

    public Episode() {
    }

    public Episode(String nameShow, Genres genres, Date realiseDate, int view, double duration) {
        super(nameShow, genres, realiseDate, view, duration);
    }
}
