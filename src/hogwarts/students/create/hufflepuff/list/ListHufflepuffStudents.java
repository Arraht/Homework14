package hogwarts.students.create.hufflepuff.list;

import hogwarts.students.create.hufflepuff.object.HufflepuffStudents;


import java.util.Scanner;

public class ListHufflepuffStudents {
    private static final Scanner scanner = new Scanner(System.in);

    public static void createHufflepuffStudents(HufflepuffStudents[] hufflepuffStudents,
                                                int numberStudentsHufflepuff) {
        int hardWork = 0;
        int loyalty = 0;
        int honesty = 0;
        String firstName = " ";
        String lastName = " ";
        int powerOfMagic = 0;
        int transgressionDistance = 0;
        for (int i = 0; i < numberStudentsHufflepuff; i++) {
            System.out.print("Имя студента: ");
            firstName = scanner.next();
            System.out.print("Фамилия студента: ");
            lastName = scanner.nextLine();
            lastName = scanner.nextLine();
            System.out.print("Баллы трудолюбия = ");
            hardWork = scanner.nextInt();
            System.out.print("Баллы верности = ");
            loyalty = scanner.nextInt();
            System.out.print("Баллы честности = ");
            honesty = scanner.nextInt();
            System.out.print("Сила магии = ");
            powerOfMagic = scanner.nextInt();
            System.out.print("Дистанция трансгрессии = ");
            transgressionDistance = scanner.nextInt();
            hufflepuffStudents[i] = new HufflepuffStudents(firstName, lastName, hardWork,
                    loyalty, honesty, powerOfMagic, transgressionDistance);
        }
    }
}