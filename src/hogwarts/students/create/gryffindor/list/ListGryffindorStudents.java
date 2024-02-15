package hogwarts.students.create.gryffindor.list;


import hogwarts.students.create.gryffindor.object.GryffindorStudents;

import java.util.Scanner;

public class ListGryffindorStudents {
    private static final Scanner scanner = new Scanner(System.in);

    public static void createListGryffindorStudents(GryffindorStudents[] GryffindorStudents,
                                                    int numberStudentsGryffindor) {
        int nobility = 0;
        int honor = 0;
        int bravery = 0;
        String firstName = " ";
        String lastName= " ";
        int powerOfMagic = 0;
        int transgressionDistance = 0;
        for (int i = 0; i < numberStudentsGryffindor; i++) {
            System.out.print("Имя студента: ");
            firstName = scanner.next();
            System.out.print("Фамилия студента: ");
            lastName = scanner.nextLine();
            lastName = scanner.nextLine();
            System.out.print("Баллы благородства = ");
            nobility = scanner.nextInt();
            System.out.print("Быллы чести = ");
            honor = scanner.nextInt();
            System.out.print("Баллы храбрости = ");
            bravery = scanner.nextInt();
            System.out.print("Сила магии = ");
            powerOfMagic = scanner.nextInt();
            System.out.print("Дистанция трансгрессии = ");
            transgressionDistance = scanner.nextInt();
            GryffindorStudents[i] = new GryffindorStudents(firstName, lastName, nobility, honor,
                    bravery, powerOfMagic, transgressionDistance);
        }
    }
}