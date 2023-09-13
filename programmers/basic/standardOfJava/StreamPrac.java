package programmers.basic.standardOfJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamPrac {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> integerStream = list.stream();

        integerStream.forEach(System.out::print);
//        integerStream.forEach(System.out::print); 에러

        // Stream은 일회용. stream에 대해 최종연산을 수행하면 stream이 닫힌다.
        integerStream = list.stream();
        integerStream.forEach(System.out::print);
    }
}
