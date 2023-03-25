package lesson3;
//3. Создать список типа ArrayList<String>.
// Поместить в него как строки, так и целые числа. Пройти по списку, найти и удалить целые числа.
import java.util.ArrayList;
import java.util.Iterator;
public class Task3 {
    public static void main(String[] args) {

    ArrayList<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add(String.valueOf(7));
        myList.add("Banana");
        myList.add(String.valueOf(2));
        myList.add("Pineapple");
        myList.add(String.valueOf(3));

        System.out.println(myList);
        Iterator<String> iterator = myList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().matches("-?\\d+(\\.\\d+)?$")) {
                iterator.remove();
            }
        }
        System.out.println(myList);
    }

}


