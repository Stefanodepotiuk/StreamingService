import java.time.LocalDate;
import java.util.List;
import java.util.Objects;


public class Subscription {
    private SteamingService steamingService;

    public void watch(Show show) {
        if (show == null) {
            System.out.println("This show is not exist");
        } else {
            int view = show.getView();
            view++;
            show.setView(view);
            System.out.println(" Watching Show " + show.getNameShow() + " - views: " + view);
        }
    }

    public Show getRecommendationTrending() {
        LocalDate nowYear = LocalDate.now();
        List<Show> mostViewedShowsOgYear = steamingService.getMostViewedShowsOgYear(nowYear.getYear());
        return mostViewedShowsOgYear.get((int) (Math.random() * mostViewedShowsOgYear.size() - 1));
    }

    public Show getRecommendationByGenre(Genres genres) {
        List<Show> mostViewedShowsOfGenre = steamingService.getMostViewedShowsOfGenre(genres);
        return mostViewedShowsOfGenre.get((int) (Math.random() * mostViewedShowsOfGenre.size() - 1));
    }

    public Subscription() {
    }

    public Subscription(SteamingService steamingService) {
        this.steamingService = steamingService;
    }

    public SteamingService getSteamingService() {
        return steamingService;
    }

    public void setSteamingService(SteamingService steamingService) {
        this.steamingService = steamingService;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subscription that = (Subscription) o;
        return Objects.equals(steamingService, that.steamingService);
    }

    @Override
    public int hashCode() {
        return Objects.hash(steamingService);
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "steamingService=" + steamingService +
                '}';
    }
}
