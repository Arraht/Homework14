package hogwarts.students.create.hufflepuff.comparison;

import hogwarts.students.create.hufflepuff.object.HufflepuffStudents;

public class ComparisonScoreHufflepuff {
    public static void comparisonScoreHufflepuff(HufflepuffStudents[] hufflepuffStudents) {
        int maxSum = hufflepuffStudents[0].getHardWork() + hufflepuffStudents[0].getLoyalty() +
                hufflepuffStudents[0].getHonesty();
        for (int i = 0; i < hufflepuffStudents.length; i++) {
            int score = hufflepuffStudents[i].getHardWork() + hufflepuffStudents[i].getLoyalty() +
                    hufflepuffStudents[i].getHonesty();
            if (score > maxSum && (i - 1) >= 0) {
                System.out.println("У " + hufflepuffStudents[i].getFirstName() + " " +
                        hufflepuffStudents[i].getLustName() + " сумма балов = " + score + ", больше балов чем у " +
                        hufflepuffStudents[i - 1].getFirstName() + " " + hufflepuffStudents[i - 1].getLustName() +
                        " сумма балов = " + maxSum + ", " + hufflepuffStudents[i].getFirstName() + " " +
                        hufflepuffStudents[i].getLustName() + " лучший пуфендуец");
                maxSum = score;
            } else if (maxSum > score && (i - 1) >= 0) {
                System.out.println("У " + hufflepuffStudents[i - 1].getFirstName() + " " +
                        hufflepuffStudents[i - 1].getLustName() + " сумма балов = " + maxSum + ", больше балов чем у " +
                        hufflepuffStudents[i].getFirstName() + " " + hufflepuffStudents[i].getLustName() +
                        " сумма балов = " + score + ", " + hufflepuffStudents[i - 1].getFirstName() + " " +
                        hufflepuffStudents[i - 1].getLustName() + " лучший пуфендуец");
            }
        }
    }
}