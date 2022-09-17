import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java");
        System.out.println("Hello Java 2 ");

        System.out.println("*********************");

        int numberOfStudents = 12;
        String message = "Number of Students : ";
        System.out.println(message + numberOfStudents);

        System.out.println("*********************");

        double number = 12.5;
        char character = 'A';
        boolean isTrue = false;
        System.out.println("Number: " + number + "\nChar: " + character + "\nis True? " + isTrue);

        System.out.println("*********************");

        int anotherNumber = 24;
        if (anotherNumber < 24) {
            System.out.println("Number smaller than 24!");
        } else if (anotherNumber == 24) {
            System.out.println("Number equals to 24!");
        } else {
            System.out.println("Number greatest than 24!");
        }

        System.out.println("*********************");

        int number1 = 15;
        int number2 = 20;
        int number3 = 25;
        int biggest = number1;

        if (biggest < number2) {
            biggest = number2;
        }
        if (biggest < number3) {
            biggest = number3;
        }
        System.out.println("Biggest Number : " + biggest);

        System.out.println("*********************");

        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("Your Grade : " + grade + " Perfect Passed!");
                break;
            case 'B':
                System.out.println("Failed!");
                break;
            default:
                System.out.println("Invalid Grade!");
        }
        System.out.println("*********************");

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("For Loop ended!");

        System.out.println("*********************");

        int i = 1;
        while (i < 10) {
            System.out.print(i + " ");
            i += 2;
        }
        System.out.print("While Loop Ended!");
        System.out.println();
        System.out.println("*********************");

        String student1 = "Arif";
        String student2 = "Ahmet";
        String student3 = "İbrahim";
        String student4 = "Yıldız";

        String[] students = new String[4];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        students[3] = student4;

        for (int j = 0; j < students.length; j++) {
            System.out.print(students[j] + ", ");
        }
        System.out.println();

        for (String stu : students) {
            System.out.print(stu + " ");
        }
        System.out.println();
        System.out.println("*********************");

        double[] myList = {1.2, 6.3, 4.3, 5.6};
        double total = 0;
        double max = myList[0];
        for (double num : myList) {
            if (max < num) {
                max = num;
            }
            total += num;
            System.out.print(num + " ");

        }
        System.out.println();
        System.out.println("Sum : " + total);
        System.out.println("Greatest : " + max);

        System.out.println("*********************");

        String[][] cities = new String[3][3];
        cities[0][0] = "Istanbul";
        cities[0][1] = "İzmir";
        cities[0][2] = "Amasya";
        cities[1][0] = "Ankara";
        cities[1][1] = "Bursa";
        cities[1][2] = "Balıkesir";
        cities[2][0] = "Edirne";
        cities[2][1] = "Tekirdağ";
        cities[2][2] = "Çanakkale";

        for (int k = 0; k <= 2; k++) {
            System.out.println("--------");
            for (int l = 0; l <= 2; l++) {
                System.out.println(cities[k][l]);
            }
        }
        System.out.println("*********************");

        String sentence = "Bugün hava çok güzel.";
        System.out.println(sentence);
        System.out.println("Eleman sayısı : " + sentence.length());
        System.out.println("5.Eleman : " + sentence.charAt(4));
        System.out.println(sentence.concat(" Yaşasın!"));
        System.out.println(sentence.startsWith("A"));
        System.out.println(sentence.endsWith("B"));

        char[] chars = new char[5];
        sentence.getChars(0, 5, chars, 0);
        System.out.println(chars);
        System.out.println(sentence.indexOf("av"));
        System.out.println(sentence.lastIndexOf("e"));
        System.out.println(sentence.trim());
        System.out.println(sentence.substring(2));

        System.out.println("*********************");

        int chosenNumber = 1;
        int reminder = chosenNumber % 2;
        boolean isPrime = true;

        if (chosenNumber == 1) {
            System.out.println(chosenNumber + " Asal Sayı degildir!");
            //return;
        }
        if (number < 1) {
            System.out.println("Geçersiz Sayı!");
        }

        for (int m = 2; m < chosenNumber; m++) {
            if (chosenNumber % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println(chosenNumber + " Sayı asaldır.");
        } else {
            System.out.println(chosenNumber + " Sayı Asal Değildir!");
        }

        System.out.println("*********************");

        char letter = 'I';
        switch (letter) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli harf!");
                break;
            default:
                System.out.println("İnce sesli harf!");
        }
        System.out.println("*********************");

        int num1 = 5;
        int total2 = 0;

        for (int n = 0; n < num1; n++) {
            total2 += total2;
        }
        if (total2 == number2) {
            System.out.println("Mükemmel Sayı!");
        } else {
            System.out.println("Mükemmel Sayı Değil!");
        }
        System.out.println("*********************");

        int[] numbers = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 5;
        boolean varMı = false;

        for (int numb : numbers) {
            if (numb == aranacak) {
                varMı = true;
                break;
            }
        }
        if (varMı) {
            System.out.println("Sayı mevcut!");
        } else {
            System.out.println("Sayı mevcut değil!");
        }
        System.out.println("*********************");
    }

}