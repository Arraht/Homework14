package hogwarts.students.print;

import hogwarts.students.create.gryffindor.object.GryffindorStudents;
import hogwarts.students.create.hufflepuff.object.HufflepuffStudents;
import hogwarts.students.create.ravenclaw.object.RavenclawStudents;
import hogwarts.students.create.slytherin.object.SlytherinStudents;

public class PrintArrays {
    public static void printArrays(GryffindorStudents[] gryffindorStudents, HufflepuffStudents[] hufflepuffStudents,
                                   RavenclawStudents[] ravenclawStudents, SlytherinStudents[] slytherinStudents) {
        System.out.println("Студенты гриффиндора: ");
        for (int i = 0; i < gryffindorStudents.length; i++) {
            System.out.println("\t" + gryffindorStudents[i]);
        }
        System.out.println("Студенты пуффендуя: ");
        for (int i = 0; i < hufflepuffStudents.length; i++) {
            System.out.println("\t" + hufflepuffStudents[i]);
        }
        System.out.println("Студенты когтеврана: ");
        for (int i = 0; i < ravenclawStudents.length; i++) {
            System.out.println("\t" + ravenclawStudents[i]);
        }
        System.out.println("Студенты слизерина: ");
        for (int i = 0; i < slytherinStudents.length; i++) {
            System.out.println("\t" + slytherinStudents[i]);
        }
    }
}