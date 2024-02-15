package hogwarts.launch;

import hogwarts.students.create.gryffindor.object.GryffindorStudents;
import hogwarts.students.create.hufflepuff.object.HufflepuffStudents;
import hogwarts.students.create.ravenclaw.object.RavenclawStudents;
import hogwarts.students.create.slytherin.object.SlytherinStudents;

import java.util.Scanner;

import static hogwarts.students.create.gryffindor.list.ListGryffindorStudents.createListGryffindorStudents;
import static hogwarts.students.create.hufflepuff.list.ListHufflepuffStudents.createHufflepuffStudents;
import static hogwarts.students.create.ravenclaw.list.ListRavenclawStudents.createRavenclawStudents;
import static hogwarts.students.create.slytherin.list.ListSlytherinStudents.createSlytherinStudents;
import static hogwarts.students.print.PrintArrays.printArrays;
import static hogwarts.students.create.gryffindor.comparison.ComparisonScoreGryffindor.comparisonScoreGryffindor;
import static hogwarts.students.create.hufflepuff.comparison.ComparisonScoreHufflepuff.comparisonScoreHufflepuff;
import static hogwarts.students.create.ravenclaw.comparison.ComparisonScoreRavenclaw.comparisonScoreRavenclaw;
import static hogwarts.students.create.slytherin.comparison.ComparisonScoreSlytherin.comparisonScoreSlytherin;
import static hogwarts.comparison.ComparisonScoreHogwarts.comparisonScoreHogwarts;

public class Launch {
    private static final Scanner scanner = new Scanner(System.in);

    public static void launch() {
        System.out.print("Количество студентов Гриффиндора = ");
        int numberStudentsGryffindor = scanner.nextInt();
        GryffindorStudents[] gryffindorStudents = new GryffindorStudents[numberStudentsGryffindor];
        createListGryffindorStudents(gryffindorStudents, numberStudentsGryffindor);
        System.out.println();
        System.out.print("Количество студентов Пуффендуя = ");
        int numberStudentsHufflepuff = scanner.nextInt();
        HufflepuffStudents[] hufflepuffStudents = new HufflepuffStudents[numberStudentsHufflepuff];
        createHufflepuffStudents(hufflepuffStudents, numberStudentsHufflepuff);
        System.out.println();
        System.out.print("Количество студентов Когтеврана = ");
        int numberRavenclawStudents = scanner.nextInt();
        RavenclawStudents[] ravenclawStudents = new RavenclawStudents[numberRavenclawStudents];
        createRavenclawStudents(ravenclawStudents, numberRavenclawStudents);
        System.out.println();
        System.out.print("Количество студентов Слизерина = ");
        int numberSlytherinStudents = scanner.nextInt();
        SlytherinStudents[] slytherinStudents = new SlytherinStudents[numberSlytherinStudents];
        System.out.println();
        createSlytherinStudents(slytherinStudents, numberSlytherinStudents);
        printArrays(gryffindorStudents, hufflepuffStudents, ravenclawStudents, slytherinStudents);
        comparisonScoreGryffindor(gryffindorStudents);
        comparisonScoreHufflepuff(hufflepuffStudents);
        comparisonScoreRavenclaw(ravenclawStudents);
        comparisonScoreSlytherin(slytherinStudents);
        comparisonScoreHogwarts(gryffindorStudents, hufflepuffStudents);
    }
}