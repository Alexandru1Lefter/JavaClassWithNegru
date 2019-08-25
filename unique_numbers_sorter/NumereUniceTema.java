package unique_numbers_sorter;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumereUniceTema {

    // TODO ane read about array vs list and when is better to use one and when to use another
    // TODO ane read about set and hashset and set vs list


    public static void main(String[] args) {

        NumereUniceTema numereUniceTema = new NumereUniceTema();

        int[] notSortedValues = numereUniceTema.fillArray(100);

//        Set<Integer> set = IntStream.of(notSortedValues).boxed().collect(Collectors.toSet());
//        System.out.println(set);

        List<Integer> duplicateNumbers = numereUniceTema.fillDupesArray(notSortedValues);
        numereUniceTema.printArray(notSortedValues);
        System.out.println("\n\r separator");
        System.out.println(duplicateNumbers);

    }

    private List<Integer> fillDupesArray(int[] notSortedValues) {
        List<Integer> duplicateNumbers = new ArrayList<>();
        List<Integer> uniqueValues = new ArrayList<>();

        for (int i = 0; i < notSortedValues.length; i++) {
            int currentNumber = notSortedValues[i];
            if (!uniqueValues.contains(currentNumber)) {
                uniqueValues.add(currentNumber);
            } else {
                duplicateNumbers.add(currentNumber);
            }
        }
        return duplicateNumbers;
    }

    private void printArray(int[] notSortedValues) {
        for (int i = 0; i < notSortedValues.length; i++) {
            System.out.print(notSortedValues[i] + " ");
        }
    }

    private int[] fillArray(int arraySize) {
        int[] notSortedValues = new int[arraySize];
        for (int i = 0; i < notSortedValues.length; i++) {
            notSortedValues[i] = (int) (Math.random() * 100);
        }

        return notSortedValues;
    }


}