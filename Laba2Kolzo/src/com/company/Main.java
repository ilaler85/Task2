package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner Scan = new Scanner(System.in);
        System.out.print("введите размер кольцевого буфера ");
        String tmp = Scan.nextLine();
        Ring Ring_ = new Ring(Integer.parseInt(tmp));
        System.out.println("Введите число, если хотите закончить ввод введите СТОП");
        tmp = Scan.nextLine();
        int count = 0;
        while (Integer.parseInt(tmp) !=  -100)
        {
            Ring_.Add(count, Integer.parseInt(tmp));
            System.out.println("Введите число, если хотите закончить ввод введите СТОП");
            tmp = Scan.nextLine();
            count++;
        }
        System.out.print("печать буфера обмена "+Ring_.toString());

    }
}
