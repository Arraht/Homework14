package hogwarts.students.create.ravenclaw.list;

import hogwarts.students.create.ravenclaw.object.RavenclawStudents;

import java.util.Scanner;

public class ListRavenclawStudents {
    private static final Scanner scanner = new Scanner(System.in);

    public static void createRavenclawStudents(RavenclawStudents[] ravenclawStudents, int numberRavenclawStudents) {
        String firstName = " ";
        String lastName = " ";
        int powerOfMagic = 0;
        int transgressionDistance = 0;
        int wisdom = 0;
        int witty = 0;
        int creation = 0;
        for (int i = 0; i < numberRavenclawStudents; i++) {
            System.out.print("Имя студента: ");
            firstName = scanner.next();
            System.out.print("Фамилия студента: ");
            lastName = scanner.nextLine();
            lastName = scanner.nextLine();
            System.out.print("Баллы мудрости = ");
            wisdom = scanner.nextInt();
            System.out.print("Баллы остроумия = ");
            witty = scanner.nextInt();
            System.out.print("Баллы творчества = ");
            creation = scanner.nextInt();
            System.out.print("Сила магии = ");
            powerOfMagic = scanner.nextInt();
            System.out.print("Дистанция трансгрессии = ");
            transgressionDistance = scanner.nextInt();
            ravenclawStudents[i] = new RavenclawStudents(firstName, lastName, wisdom, witty, creation, powerOfMagic,
                    transgressionDistance);
        }
    }
}