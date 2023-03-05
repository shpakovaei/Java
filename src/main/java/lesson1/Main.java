package lesson1;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Date;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        int[] nums = { 3, 2, 2, 3 };
        Min();
        Max();
        Val(nums);
        System.out.println(Arrays.toString(nums));
        inputName();
    }



    private static void arrMax() {
        int[] arr = new int[]{1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1};
        int count = 0;
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                temp++;
            }
            if (arr[i] == 0 && count < temp) {
                count = temp;
                temp = 0;
            }
            if (count > temp && arr[i] == 0) temp = 0;
        }
        System.out.println(count);
    }


//1.

    private static void Min() {
        int[] array = {2, 7, 3, 4, 9};
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[min]) min = array [i];
        }
        System.out.println(min);
    }

    private static void Max() {
        int[] array = {10, 7, 1, 4, 7, 4, 11};
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        System.out.println(max);
    }

//  2.

    public static void Val(int [] nums)
    {
        int k = 0;

        for (int i: nums)
        {
            if (i != 3) {
                nums[k++] = i;
            }
        }
        for (int i = k; i < nums.length; i++) {
            nums[i] = 3;
        }
    }



//3.

    private static void inputName() {
        Scanner in = new Scanner(System.in);
        System.out.println("name: ");
        String name = in.nextLine();

//        LocalTime time = LocalTime.now();
////        System.out.println(time);
        var hour = (new Date()).getHours();
        if (hour > 0 && hour < 5)  {
            System.out.println("Доброй ночи " + name);
        }
        if (hour >= 5 && hour < 12) {
            System.out.println("Доброе утро " + name);
        }
        if (hour >= 12 && hour < 18) {
            System.out.println("Добрый день " + name);
        }
        if (hour >= 18 && hour < 23) {
            System.out.println("Добрый вечер " + name);
        }
        else {
            System.out.println("Доброй ночи " + name);
        }

        in.close();
    }

}

