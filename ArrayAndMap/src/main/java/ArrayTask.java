import java.util.*;

//duża litera w klasie
public class ArrayTask {

    //metoda zamieniająca listę na set i zwracająca set
    private static void duplicatesReturner(ArrayList<String> givenList) {
        Set<String> memorySet = new HashSet<String>(givenList);
        for (String temp : memorySet){
            System.out.println(temp);
        }
    }

    //metoda zamieniająca listę na map i zliczająca próby dodania
    static void duplicatesCounter(ArrayList givenList) {

        //tworzę mapę aby zapisać wynik funkcji
        Map<String, Integer> memoryMap = new HashMap<String, Integer>();

        //tworzę pomocniczego Seta, od którego będzie zależało czy zwiększyć wartość klucza w mapie.
        Set<String> helperSet = new HashSet<String>();

        //to do: przerobić na foreacha.
        for(int x = 0; x < givenList.size(); x++) {
            String comparedElement = (String)givenList.get(x);
            if(helperSet.add(comparedElement)) {
                memoryMap.put(comparedElement, 1);
            }
            else {
                int valueOfNeedingChangeElement = memoryMap.get(comparedElement);
                memoryMap.replace(comparedElement, valueOfNeedingChangeElement + 1);
            }
        }

        System.out.println(memoryMap);
/*        for (Object map : memoryMap.entrySet()) {
            System.out.println(memoryMap);
        }*/

        /*            memoryMap.forEach((key, value) -> System.out.println(key + " => " + value));*/

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<String> memoryList = new ArrayList<String>();

        //zamiana w pętli tablicy na listę stringów
        for(int x = 0; x < args.length; x++) {
            memoryList.add(args[x]);
        }
/*        System.out.println("Dane wejściowe:");
        System.out.println(args);*/

        System.out.println("Zadanie pierwsze:");
        duplicatesReturner(memoryList);

        System.out.println("\nZadanie drugie:");
        duplicatesCounter(memoryList);
    }
}