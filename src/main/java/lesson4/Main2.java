package lesson4;

import java.util.LinkedList;
public class Main2 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            ll.add(randomNumber());
        }
        System.out.println(ll);

        for (int i = 0; i < 5; i++) {
            System.out.print(ll.getLast() + ", ");
            ll.removeLast();

        }
    }

    public static int randomNumber() {
        double x = (Math.random() * 10);
        int num = (int) x;
        return num;
    }
}

