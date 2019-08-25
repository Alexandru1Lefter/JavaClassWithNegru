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

        int[][] duplicateNrAndNrOfOccurence = numereUniceTema.findOcurrences(duplicateNumbers);

        numereUniceTema.printArray2D(duplicateNrAndNrOfOccurence);
    }

    private void printArray2D(int[][] duplicateNrAndNrOfOccurence) {

        for(int i = 0; i < duplicateNrAndNrOfOccurence.length; i++){
            System.out.println("--");
            for (int j = 0; j < duplicateNrAndNrOfOccurence[i].length; j++){
                System.out.print(duplicateNrAndNrOfOccurence[i][j] + " ");
            }
            System.out.println("");
        }
    }

    private int[][] findOcurrences(List<Integer> duplicateNumbers) {

        int[][] duplicateNrAndNrOfOccurence = new int [duplicateNumbers.size()][2];

       loop1: for (int eachDuplicateNumber : duplicateNumbers){
            for(int i = 0; i < duplicateNrAndNrOfOccurence.length; i++){

                int duplicateNumberValue =  duplicateNrAndNrOfOccurence[i][0];

                if (duplicateNumberValue == 0){
                    duplicateNrAndNrOfOccurence[i][0] = eachDuplicateNumber;
                    duplicateNrAndNrOfOccurence[i][1] =  duplicateNrAndNrOfOccurence[i][1] + 1;
                    continue loop1;
                }else if (duplicateNumberValue == eachDuplicateNumber){
                    duplicateNrAndNrOfOccurence[i][1] = duplicateNrAndNrOfOccurence[i][1] + 1;
                }
            }
        }


        return duplicateNrAndNrOfOccurence;
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