package org.example.basics;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ListJavaFiles implements GetMax {
    private static File directory = new File("./src/main/java/io/smartir/binarySearchTree");

    public static void main(String[] args) {
//        normalWayToListFiles();
        System.out.println();
        lambdaFunctionToListFiles();
        Stream.generate(Math::random)
                .limit(10)
                .map(x->(int)(x*10))
                .forEach(System.out::println);

        List<String> strings = List.of("this", "is", "a", "list", "of", "strings");
        List<String> sorted = strings.stream().sorted(String::compareTo).toList();
        System.out.println(sorted);
        Stream.of("this", "is", "a", "list", "of", "strings")
                .map(String::length)
                .forEach(System.out::println);
    }

    public static void normalWayToListFiles() {
        String[] names = directory.list(new FilenameFilter() {
            @Override
            public boolean accept(File file, String name) {

                return name.endsWith(".java");
            }
        });
        System.out.println(Arrays.asList(names));
    }

    public static void lambdaFunctionToListFiles() {
        String[] names = directory.list((file, name) -> name.endsWith(".java"));
        System.out.println(Arrays.asList(names));
    }

    @Override
    public int max(int x, int y) {
        return 0;
    }
}
