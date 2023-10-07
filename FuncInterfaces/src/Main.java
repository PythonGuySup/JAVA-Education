import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Object> condition = Objects::isNull;
        Function<Object, Integer> ifTrue = obj -> 0;
        Function<CharSequence, Integer> ifFalse = CharSequence::length;
        Function<String, Integer> safeStringLength = ternaryOperator(condition, ifTrue, ifFalse);

    }

    private static Function<String, Integer> ternaryOperator(Predicate<Object> condition,
                                                             Function<Object, Integer> ifTrue,
                                                             Function<CharSequence, Integer> ifFalse) {

       Function<String, Integer> func = (str) -> condition.test(str) ? ifTrue.apply(str) : ifFalse.apply(str);
       return func;
    }
}
