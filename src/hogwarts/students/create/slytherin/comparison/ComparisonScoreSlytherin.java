package hogwarts.students.create.slytherin.comparison;

import hogwarts.students.create.slytherin.object.SlytherinStudents;

public class ComparisonScoreSlytherin {
    public static void comparisonScoreSlytherin(SlytherinStudents[] slytherinStudents) {
        int maxSum = slytherinStudents[0].getCunning() + slytherinStudents[0].getDetermination() +
                slytherinStudents[0].getResourcefulness() + slytherinStudents[0].getThirstForPower();
        for (int i = 0; i < slytherinStudents.length; i++) {
            int score = slytherinStudents[i].getCunning() + slytherinStudents[i].getDetermination() +
                    slytherinStudents[i].getResourcefulness() + slytherinStudents[i].getThirstForPower();
            if ((score > maxSum && (i - 1) >= 0)) {
                System.out.println("У " + slytherinStudents[i].getFirstName() + " " +
                        slytherinStudents[i].getLustName() + " сумма балов = " + score + ", больше балов чем у " +
                        slytherinStudents[i - 1].getFirstName() + " " + slytherinStudents[i - 1].getLustName() +
                        " сумма балов = " + maxSum + ", " + slytherinStudents[i].getFirstName() + " " +
                        slytherinStudents[i].getLustName() + " лучший слизеринец");
                maxSum = score;
            } else if (maxSum > score && (i - 1) >= 0) {
                System.out.println("У " + slytherinStudents[i - 1].getFirstName() + " " +
                        slytherinStudents[i - 1].getLustName() + " сумма балов = " + maxSum + ", больше балов чем у " +
                        slytherinStudents[i].getFirstName() + " " + slytherinStudents[i].getLustName() +
                        " сумма балов = " + score + ", " + slytherinStudents[i - 1].getFirstName() + " " +
                        slytherinStudents[i - 1].getLustName() + " лучший слизеринец");
            }
        }
    }
}
