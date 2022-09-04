import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Movie Harry_Potter = new Movie("Harry Potter", Genres.FANTASY, new Date(2022, 24, 5), 15, 1.45);
        Harry_Potter.getDurations();
        Movie AVATAR = new Movie("AVATAR", Genres.FANTASY, new Date(2022, 17, 3), 14, 2.15);
        AVATAR.getDurations();
        System.out.println("-------");

        Movie Terminator = new Movie("Terminator", Genres.ACTIONS, new Date(2022, 22, 4), 35, 1.45);
        Movie Frozen = new Movie("Frozen", Genres.FANTASY, new Date(2021, 8, 9), 15, 1.35);
        Movie Star_Wars = new Movie("Star Wars", Genres.FANTASY, new Date(2022, 13, 12), 17, 1.45);
        Movie Venom = new Movie("Venom", Genres.HORROR, new Date(2021, 1, 1), 35, 1.59);
        Episode Pasture = new Episode("Pasture", Genres.HORROR, new Date(2022, 2, 2), 22, 2.22);


        Set<Show> showForStream = new HashSet<>();
        showForStream.add(new Movie("Titanic", Genres.ACTIONS, new Date(2022, 17, 7), 95, 2.55));
        showForStream.add(new Episode("SpiderMan", Genres.ACTIONS, new Date(2020, 20, 9), 49, 2.15));
        showForStream.add(new Episode("Angel", Genres.COMEDY, new Date(2021, 27, 5), 88, 1.13));
        showForStream.add(new Episode("Alice in Wonderland", Genres.FANTASY, new Date(2022, 13, 7), 85, 1.15));

        SteamingService Netflix = new SteamingService("Netflix", showForStream);
        SteamingService steamingService = new SteamingService();

        steamingService.addShow(Terminator);
        System.out.println("-------");
        steamingService.addShow(Star_Wars);
        System.out.println("-------");
        steamingService.addShow(Frozen);
        System.out.println("-------");
        steamingService.addShow(Harry_Potter);
        System.out.println("-------");
        steamingService.addShow(AVATAR);
        System.out.println("-------");
        steamingService.addShow(Pasture);

        Subscription subscriptionFull = new Subscription(Netflix);
        Subscription subscription = new Subscription();
        subscription.watch(Terminator);
        subscription.watch(Venom);
        subscription.watch(Terminator);
        System.out.println("-------");

        System.out.println(steamingService.getMostViewedShowsOgYear(2022));
        System.out.println("-------");

        Genres actions = Genres.FANTASY;
        System.out.println(steamingService.getMostViewedShowsOfGenre(actions));
        System.out.println("-------");


        System.out.println("Recommendation By Genre - " + subscriptionFull.getRecommendationByGenre(actions));
        System.out.println("Recommendation Trending - " + subscriptionFull.getRecommendationTrending());

        User Stepan = new User();
        Stepan.subscribe(Netflix);
    }
}