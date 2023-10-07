import java.util.Objects;
import java.util.Optional;

public class Pair<T, D> {
    private final T first;
    private final D second;

    private Pair(T first, D second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public D getSecond() {
        return second;
    }

    public static <X, Y> Pair<X, Y> of(X first, Y second) {
        return new Pair<>(first, second);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (!(obj instanceof Pair<?, ?>)) {
            return false;
        }
        return (Objects.equals(this.getFirst(), ((Pair<?, ?>) obj).getFirst()) && Objects.equals(this.getSecond(), ((Pair<?, ?>) obj).getSecond()) );
    }

    @Override
    public int hashCode() {
        return Integer.valueOf(String.valueOf(this.getFirst().hashCode()) + String.valueOf(this.getSecond().hashCode()));
    }

}

