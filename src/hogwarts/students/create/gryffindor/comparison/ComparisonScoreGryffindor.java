package hogwarts.students.create.gryffindor.comparison;

import hogwarts.students.create.gryffindor.object.GryffindorStudents;

public class ComparisonScoreGryffindor {
    public static void comparisonScoreGryffindor(GryffindorStudents[] gryffindorStudents) {
        int maxSum = gryffindorStudents[0].getNobility() + gryffindorStudents[0].getBravery() +
                gryffindorStudents[0].getHonor();
        for (int i = 0; i < gryffindorStudents.length; i++) {
            int score = gryffindorStudents[i].getNobility() + gryffindorStudents[i].getBravery() +
                    gryffindorStudents[i].getHonor();
            if (score > maxSum && (i - 1) >= 0) {
                System.out.println("У " + gryffindorStudents[i].getFirstName() + " " +
                        gryffindorStudents[i].getLustName() + " сумма балов = " + score + ", больше балов чем у " +
                        gryffindorStudents[i - 1].getFirstName() + " " + gryffindorStudents[i - 1].getLustName() +
                        " сумма балов = " + maxSum + ", " + gryffindorStudents[i].getFirstName() + " " +
                        gryffindorStudents[i].getLustName() + " лучший грифиндорец");
                maxSum = score;
            } else if (maxSum > score && (i - 1) >= 0) {
                System.out.println("У " + gryffindorStudents[i - 1].getFirstName() + " " +
                        gryffindorStudents[i - 1].getLustName() + " сумма балов = " + maxSum + ", больше балов чем у " +
                        gryffindorStudents[i].getFirstName() + " " + gryffindorStudents[i].getLustName() +
                        " сумма балов = " + score + ", " + gryffindorStudents[i - 1].getFirstName() + " " +
                        gryffindorStudents[i - 1].getLustName() + " лучший грифиндорец");
            }
        }
    }
}