import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class ArraysAndHashesHW {
    public static void main(String[] args) {
        // Homework5_arraysAndHashes getDay = new Homework5_arraysAndHashes();
        //System.out.println(getDay.getDay(2));

        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter the Toy ID: ");
        //int id = Integer.parseInt(scanner.next());

        // Homework5_arraysAndHashes getToyById = new Homework5_arraysAndHashes();
        // System.out.println(getToyById.getToyById(id));
// для решения этой задачи стандартным методом вместо "id" подставляем число id и маскируем  3 строчки Scanner

        ArraysAndHashesHW arraysList = new ArraysAndHashesHW();
        // arraysList.arrayListOfStrings();
        arraysList.arrayListOfStringsSecond();

    }

    public String getDay(int day) {
        String[] weekday = new String[7];
        weekday[0] = "Sunday";
        weekday[1] = "Monday";
        weekday[2] = "Tuesday";
        weekday[3] = "Wednesday";
        weekday[4] = "Thursday";
        weekday[5] = "Friday";
        weekday[6] = "Saturday";

        return weekday[day];

    }

    public String getToyById(int id) {
//String result = "";


        HashMap<Integer, String> getToy = new HashMap();

        getToy.put(12, "Batmobile");
        getToy.put(45, "Light Saber");
        getToy.put(6, "Wonder Woman");
        getToy.put(201, "HelloKitty Bag");
        getToy.put(56, "Junior QA Analyst Doll");

        if (getToy.get(id) != null) {

            return getToy.get(id);
        } else {
            return "No such Toy";
        }


    }

    public void arrayListOfStrings() {
        HashSet<String> names = new HashSet<String>();
        names.add("Steve");
        names.add("Tim");
        names.add("Lucy");
        names.add("Steve");
        names.add("Pat");
        names.add("Angela");
        names.add("Tom");
        names.add("Tim");
        names.add("Anna");
        names.add("Lucy");

        new ArrayList<String>(names);
        // можно еще по алфавиту отсортировать:
        // List<String> List = new ArrayList<String>(names);
        //    Collections.sort(List);
        //    System.out.println(List);print: (arrayListOfStrings)
        System.out.println(names);
    }

    public void arrayListOfStringsSecond() {
        ArrayList<String> resultArray = new ArrayList<String>();
        resultArray.add("Steve");
        resultArray.add("Tim");
        resultArray.add("Lucy");
        resultArray.add("Steve");
        resultArray.add("Pat");
        resultArray.add("Angela");
        resultArray.add("Tom");
        resultArray.add("Tim");
        resultArray.add("Anna");
        resultArray.add("Lucy");

        System.out.println(resultArray);
        Collections.sort(resultArray);
        System.out.println(resultArray);

        //==========================================================================================
        //   int duplicates = 0;
        //  for (int i = 0; i < resultArray.size(); i++ ) {
        //    for (int j = 0; j < resultArray.size(); j++){
        //      if (i ==j)
        //    {}
        //  else if (resultArray.get(j).equals(resultArray.get(i))) {
        //    resultArray.remove(j);
        //  duplicates++;
        //  }
        // }
        // }
        // resultArray.remove(duplicates);
        //  System.out.println(resultArray);
        //  }
//=======================================================================================================
        ArrayList<String> newresultArray = new ArrayList<String>();
        for (int i = 0; i < resultArray.size() - 1; i++) {
            int j = (i+1); {
                if (j != i) {
                    resultArray.add(j,"");}

                //  if (resultArray.get(j).equals(resultArray.get(i)))
                // {
                //    resultArray.remove(j);

            }

        }
        System.out.println(resultArray);
    }


}


