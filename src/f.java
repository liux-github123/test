import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class f {
    public static void main(String[] args) {
        List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        String filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining("x"));

        System.out.println("筛选列表: " + filtered);
        String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("合并字符串: " + mergedString);
        System.out.println("test2");
        System.out.println("test3");
        System.out.println("test3");
        System.out.println("test3");
        System.out.println("11111");
        System.out.println("hello");
    }
}
