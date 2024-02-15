package hogwarts.students.create.slytherin.list;

import hogwarts.students.create.slytherin.object.SlytherinStudents;

import java.util.Scanner;

public class ListSlytherinStudents {
    private static final Scanner scanner = new Scanner(System.in);
    public static void createSlytherinStudents(SlytherinStudents[] slytherinStudents, int numberSlytherinStudents) {
        String firstName = " ";
        String lastName = " ";
        int powerOfMagic = 0;
        int transgressionDistance = 0;
        int cunning = 0;
        int determination = 0;
        int resourcefulness = 0;
        int thirstForPower = 0;
        for (int i = 0; i < numberSlytherinStudents; i++) {
            System.out.print("Имя студента: ");
            firstName = scanner.next();
            System.out.print("Фамилия студента: ");
            lastName = scanner.nextLine();
            lastName = scanner.nextLine();
            System.out.print("Баллы хитрости = ");
            cunning = scanner.nextInt();
            System.out.print("Баллы решительности = ");
            determination = scanner.nextInt();
            System.out.print("Баллы находчивости = ");
            resourcefulness = scanner.nextInt();
            System.out.print("Баллы жажды власти = ");
            thirstForPower = scanner.nextInt();
            System.out.print("Сила магии = ");
            powerOfMagic = scanner.nextInt();
            System.out.print("Дистанция трансгрессии = ");
            transgressionDistance = scanner.nextInt();
            slytherinStudents[i] = new SlytherinStudents(firstName, lastName, cunning, determination,
                    resourcefulness, thirstForPower, powerOfMagic, transgressionDistance);
        }
    }
}