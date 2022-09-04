import java.util.*;

import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

public class SteamingService {
    private String nameService;
    private Set<Show> showList = new HashSet<>();
    private Map<String, Integer> viewByShowNames = new HashMap<>();

    public HashSet<Show> addShow(Show show) {
        showList.add(show);
        System.out.println("Set" + new HashSet<>(showList));

        viewByShowNames.put(show.getNameShow(), show.getView());
        System.out.println("MAP " + viewByShowNames);

        return new HashSet<>(showList);
    }


    public List<Show> getMostViewedShowsOgYear(int year) throws ExceptionInInitializerError {
        if (showList.isEmpty()) {
            throw new NullPointerException("Список фільмів пустий");
        } else {
            return showList.stream()
                    .filter(show -> show.getRealiseDate().getYear() == year)
                    .sorted(comparing(Show::getView).reversed())
                    .limit(10)
                    .collect(toList());
        }
    }

    public List<Show> getMostViewedShowsOfGenre(Genres genre) {
        if (showList.isEmpty()) {
            throw new NullPointerException("Список фільмів пустий");
        } else {
            return showList.stream()
                    .filter(show -> show.getGenres().equals(genre))
                    .sorted(comparing(Show::getView).reversed())
                    .limit(10)
                    .collect(toList());
        }
    }

    public SteamingService() {
    }

    public SteamingService(String nameService, Set<Show> showList) {
        this.nameService = nameService;
        this.showList = showList;
    }

    public SteamingService(String nameService, Set<Show> showList, Map<String, Integer> viewByShowNames) {
        this.nameService = nameService;
        this.showList = showList;
        this.viewByShowNames = viewByShowNames;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public Set<Show> getShowList() {
        return showList;
    }

    public void setShowList(Set<Show> showList) {
        this.showList = showList;
    }

    public Map<String, Integer> getViewByShowNames() {
        return viewByShowNames;
    }

    public void setViewByShowNames(Map<String, Integer> viewByShowNames) {
        this.viewByShowNames = viewByShowNames;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SteamingService that = (SteamingService) o;
        return Objects.equals(nameService, that.nameService) && Objects.equals(showList, that.showList) && Objects.equals(viewByShowNames, that.viewByShowNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameService, showList, viewByShowNames);
    }

    @Override
    public String toString() {
        return "SteamingService{" +
                "nameService='" + nameService + '\'' +
                ", showList=" + showList +
                ", viewByShowNames=" + viewByShowNames +
                '}';
    }
}

