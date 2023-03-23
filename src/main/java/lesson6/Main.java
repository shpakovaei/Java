package lesson6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Main {
    public static void main(String[] args) {


        Laptop laptop1 = new Laptop("Honor", 8, 512, "Black", 65900);
        Laptop laptop2 = new Laptop ("HP", 8, 256, "Silver", 76900);
        Laptop laptop3 = new Laptop ("Honor", 16, 256, "Silver", 49900);
        Laptop laptop4 = new Laptop ("Asus", 16, 512, "Black", 59900);
        Laptop laptop5 = new Laptop ("Acer", 8, 512, "White", 89900);
        Laptop laptop6 = new Laptop ("Asus", 16, 512, "Black", 89900);



        ArrayList<Laptop> laptopList = new ArrayList<>();
        laptopList.add(laptop1);
        laptopList.add(laptop2);
        laptopList.add(laptop3);
        laptopList.add(laptop4);
        laptopList.add(laptop5);
        laptopList.add(laptop6);


        Scanner scan = new Scanner(System.in);

        Set<Integer> operat = new HashSet<>();
        for (Laptop item : laptopList) {
            operat.add(item.operational);
        }
        System.out.print("Выберите объем оперативной памяти " + operat + " Гб => ");
        int op = scan.nextInt();

        Set<Integer> storag = new HashSet<>();
        for (Laptop item : laptopList) {
            if (item.operational == op) storag.add(item.storage);
        }
        System.out.print("Выберите объем накопителя " + storag + " Гб => ");
        int hdd = scan.nextInt();

        Set<String> brand = new HashSet<>();
        for (Laptop item : laptopList) {
            if (item.operational == op && item.storage == hdd) brand.add(item.producer);
        }
        System.out.print("Выберите производителя " + brand + " => ");
        String os = scan.next();

        Set<String> col = new HashSet<>();
        for (Laptop item : laptopList) {
            if (item.operational == op && item.storage == hdd && item.producer.equals(os)) col.add(item.color);
        }
        System.out.print("Выберите цвет ноутбука " + col + " => ");
        String c = scan.next();

        System.out.println("Ноутбуки, соответствующие вашим параметрам: ");
        for (Laptop item : laptopList) {
            if (item.operational == op && item.storage == hdd && item.producer.equals(os) && item.color.equals(c)) {
                System.out.println(item);
            }
        }}}

