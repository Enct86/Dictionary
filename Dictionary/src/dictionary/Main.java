/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        Scanner scan1 = new Scanner(System.in);
        int i = 0;
        System.out.println("Добро пожаловать в словарь!");
        do {
            System.out.printf("1 - Добавить слово\n2 - Отобразить слово\n3 - Удалить слово\n4 - Выход\n");
            String input1 = scan1.nextLine();
            i = Integer.parseInt(input1);
            switch (i) {
                case 1:
                    System.out.println("Введите слово - ");
                    input1 = scan1.nextLine();
                    input1 = input1.toLowerCase();
                    if (list1.contains(input1)) {
                    } else {
                        list1.add(input1);
                    }
                    break;
                case 2:
                    Collections.sort(list1);
                    System.out.printf("все слова в алфавитном порядке %s\n", list1);
                    break;
                case 3:
                    System.out.println("Удалить слово - ");
                    input1 = scan1.nextLine();
                    input1 = input1.toLowerCase();
                    if (list1.contains(input1)) {
                        list1.remove(input1);
                    }
                    break;
            }

        } while (i != 4);

        System.out.println("Спасиюо за использования словаря!)");
        System.out.println("Changed for GitHub");
    }

}
