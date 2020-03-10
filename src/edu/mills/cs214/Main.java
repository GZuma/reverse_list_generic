package edu.mills.cs214;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {


    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();
        List<Double> dubList = new LinkedList<>();

        String words = "This is the string that I am going to use to reverse for Lab5 in CS215." +
                " Lets see if this works first I will need to " +
                "add all the words to the ArrayList, then I will need to print it and reverse it " +
                "using the generic method that I have created.";

        List<String> strList = Arrays.asList(words.split(" |,|\\."));

        for (int i = 1; i < 30; i++) {
            intList.add(i);
        }

        for (double i = 1.0; i < 30; i++) {
            dubList.add(i);
        }


//        System.out.println(strList);
//        System.out.println(myReverse(strList));
//        System.out.println(strList);
//        System.out.println(intList);
//        System.out.println(myReverse(intList));
//        System.out.println(intList);
//        System.out.println(dubList);
//        System.out.println(myReverse(dubList));
//        System.out.println(dubList);

        perfect(24);
        perfect(1000);
        for (int i = 0; i <= 1000; i++) {
            perfect(i);
        }
    }

    public static <T> List myReverse(List<T> originalList) {

        List<T> listReversed = new ArrayList<>();

        for (int i = originalList.size() - 1; i >= 0; i--) {

            listReversed.add(originalList.get(i));

        }
        return listReversed;

    }

    public static void perfect(int num) {
        int perfectList = IntStream.range(1,num).filter(n -> num % n == 0).sum();


        if(perfectList == num){
            System.out.println("The sum of all the factors of " + num + " minus the number " + num + " MAKES it a perfect number");
        }
    }
}

//limit(num).boxed().collect(Collectors.toList());