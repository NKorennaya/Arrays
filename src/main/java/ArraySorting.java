import java.util.ArrayList;
import java.util.Collections;

public class ArraySorting {  public static void main(String[] args) {
    ArraySorting arrayList = new ArraySorting();
    arrayList.ArrayList();
}

    public void ArrayList() {
        ArrayList<String> inputArray = new ArrayList<String>();
        inputArray.add("Steve");
        inputArray.add("Tim");
        inputArray.add("Lucy");
        inputArray.add("Steve");
        inputArray.add("Pat");
        inputArray.add("Angela");
        inputArray.add("Tom");
        inputArray.add("Tim");
        inputArray.add("Anna");
        inputArray.add("Lucy");

        System.out.println("Input array is: " +inputArray);
        Collections.sort(inputArray);
        System.out.println("Sorted array is: " + inputArray);

        ArrayList<String> resultArray = inputArray;

        for (int i = 0; i < inputArray.size() - 1; i++) {
            if (inputArray.get(i).equals(inputArray.get(i + 1))) {
                resultArray.remove(inputArray.get(i));
            }
        }
        System.out.println("Final array non-doubles is: " + resultArray);

    }
}

