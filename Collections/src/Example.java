import java.util.ArrayList;

import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<?> List = new ArrayList<>(); // == List<? extends Object>
        Object object = new Object();
        Example2 exp = new Example2();
        //System.out.println(object);
        //System.out.println(List.add(exp));
    }
}
