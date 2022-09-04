import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class User {
    private Set<SteamingService> subscriptions = new HashSet<>();


    public Subscription subscribe(SteamingService steamingService) {
        subscriptions.add(steamingService);
        return new Subscription(steamingService);
    }

    public User() {
    }

    public User(Set<SteamingService> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public Set<SteamingService> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(Set<SteamingService> subscriptions) {
        this.subscriptions = subscriptions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(subscriptions, user.subscriptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subscriptions);
    }

    @Override
    public String toString() {
        return "User{" +
                "subscriptions=" + subscriptions +
                '}';
    }
}
