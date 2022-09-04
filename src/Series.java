import java.util.List;
import java.util.Objects;

public class Series {
    private List<Episode> episodes;

    public Series() {
    }

    public Series(List<Episode> episodes) {
        this.episodes = episodes;
    }

    public List<Episode> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(List<Episode> episodes) {
        this.episodes = episodes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Series series = (Series) o;
        return Objects.equals(episodes, series.episodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(episodes);
    }

    @Override
    public String toString() {
        return "Series{" +
                "episodes=" + episodes +
                '}';
    }
}
