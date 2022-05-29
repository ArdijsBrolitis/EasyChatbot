package com.rudzumaize;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Uzdod man jautajumu!");

            String question1 = scan.nextLine();


            // Jautajums -  Kada ir Latvijas galvaspilseta?
            if (question1.contains("Latvijas galvaspilseta")) {
                System.out.println("Latvijas galvaspilseta ir Riga");
            } else {
                System.out.println("Nemacesu tev atbildet:(");
            }

            String question2 = scan.nextLine();


            // Jautajums - Kadi ir vasaras menesi?


            if (question2.contains("vasaras menesi")) {
                System.out.println("Vasaras menesi ir junijs , julijs un augusts!");
            } else {
                System.out.println("Pajauta kaut ko citu :(");
            }

            String question3 = scan.nextLine();

            // Jautajums - Ka sauc Latvijas prezidentu ?


            if (question3.contains("prezidentu")) {
                System.out.println("Latvijas valsts prezidentu sauc Egils Levits");
            } else {
                System.out.println("Vel neesmu tik gudrs :(");
            }
    }
}