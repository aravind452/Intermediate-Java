package STREAMS;
import java.util.*;
// import java.util.function.*;
import java.util.stream.*;

public class StreamsExample {

  public static void main(String[] args) {

    List<Integer> nums = Arrays.asList(4, 9, 5, 44, 8);

    // int sum = 0;

    // for (int n : nums) {
    // if (n % 2 == 0) {
    // n = n * 2;
    // sum = sum + n;
    // }
    // }

    // nums.forEach(n -> System.out.println(n));

    // For Each using consumer

    // Consumer<Integer> consumer = new Consumer<Integer>() {
    // public void accept(Integer n) {
    // System.out.println(n);
    // }
    // };

    // nums.forEach(consumer);

    // Consumer using lambda expression

    // Consumer<Integer> conLambda = (n) -> System.out.println(n);

    // nums.forEach(conLambda);

    Stream<Integer> s1 = nums.stream();

    Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);

    Stream<Integer> s3 = s2.map(n -> n * 2);

    s3.forEach(n -> System.out.println(n));

    // s2.forEach(n -> System.out.println(n));

    int result = nums.stream()
        .filter(n -> n % 2 == 0)
        .map(n -> n * 2)
        .reduce(0, (c, e) -> c + e);
    System.out.println(result);

  }

}
