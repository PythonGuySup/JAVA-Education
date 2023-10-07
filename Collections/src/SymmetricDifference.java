import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SymmetricDifference {

        public static void main(String[] args) {

            Set<Integer> num1 = new HashSet<>();
            num1.add(1);
            num1.add(2);
            num1.add(3);

            HashSet<Integer> num2 = new HashSet<>();
            num2.add(0);
            num2.add(1);
            num2.add(2);

            Set<Integer> result = symmetricDifference(num1,num2);
            System.out.println(result);

        }

        public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
                Set<T> set3 = new HashSet<>(set1);
                Set<T> set4 = new HashSet<>();
                set3.retainAll(set2);
                for (T var : set1) {
                    if (!(set3.contains(var))) {
                        set4.add(var);
                    }
                }
                for (T var : set2) {
                    if (!(set3.contains(var))) {
                        set4.add(var);
                    }
                }
                return set4;
        }
}
