package hogwarts.students.create.ravenclaw.comparison;

import hogwarts.students.create.ravenclaw.object.RavenclawStudents;

public class ComparisonScoreRavenclaw {
    public static void comparisonScoreRavenclaw(RavenclawStudents[] ravenclawStudents) {
        int maxSum = ravenclawStudents[0].getWisdom() + ravenclawStudents[0].getCreation() +
                ravenclawStudents[0].getWitty();
        for (int i = 0; i < ravenclawStudents.length; i++) {
            int score = ravenclawStudents[i].getWisdom() + ravenclawStudents[i].getCreation() +
                    ravenclawStudents[i].getWitty();
            if (score > maxSum && (i - 1) >= 0) {
                System.out.println("У " + ravenclawStudents[i].getFirstName() + " " +
                        ravenclawStudents[i].getLustName() + " сумма балов = " + score + ", больше балов чем у " +
                        ravenclawStudents[i - 1].getFirstName() + " " + ravenclawStudents[i - 1].getLustName() +
                        " сумма балов = " + maxSum + ", " + ravenclawStudents[i].getFirstName() + " " +
                        ravenclawStudents[i].getLustName() + " лучший когтевранец");
                maxSum = score;
            } else if (maxSum > score && (i - 1) >= 0) {
                System.out.println("У " + ravenclawStudents[i - 1].getFirstName() + " " +
                        ravenclawStudents[i - 1].getLustName() + " сумма балов = " + maxSum + ", больше балов чем у " +
                        ravenclawStudents[i].getFirstName() + " " + ravenclawStudents[i].getLustName() +
                        " сумма балов = " + score + ", " + ravenclawStudents[i - 1].getFirstName() + " " +
                        ravenclawStudents[i- 1].getLustName() + " лучший когтевранец");
            }
        }
    }
}
