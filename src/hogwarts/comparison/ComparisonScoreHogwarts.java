package hogwarts.comparison;

import hogwarts.students.create.gryffindor.object.GryffindorStudents;
import hogwarts.students.create.hufflepuff.object.HufflepuffStudents;
import hogwarts.students.create.ravenclaw.object.RavenclawStudents;
import hogwarts.students.create.slytherin.object.SlytherinStudents;

public class ComparisonScoreHogwarts {
    public static void comparisonScoreHogwarts(GryffindorStudents[] gryffindorStudents,
                                               HufflepuffStudents[] hufflepuffStudents) {
        String bestStudentGryffindor = gryffindorStudents[0].getFirstName() + " "
                + gryffindorStudents[0].getLustName();
        String bestStudentHufflepuff = hufflepuffStudents[0].getFirstName() + " "
                + hufflepuffStudents[0].getLustName();
        int maxSumGryffindor = gryffindorStudents[0].getPowerOfMagic() +
                gryffindorStudents[0].getTransgressionDistance();
        int maxSumHufflepuff = hufflepuffStudents[0].getPowerOfMagic() +
                hufflepuffStudents[0].getTransgressionDistance();


        for (int i = 0; i < gryffindorStudents.length; i++) {
            int scoreGryffindor = gryffindorStudents[i].getPowerOfMagic() +
                    gryffindorStudents[i].getTransgressionDistance();
            if (scoreGryffindor > maxSumGryffindor && (i - 1) >= 0) {
                bestStudentGryffindor = gryffindorStudents[i].getFirstName() + " "
                        + gryffindorStudents[i].getLustName();
                maxSumGryffindor = scoreGryffindor;
            } else if (maxSumGryffindor > scoreGryffindor && (i - 1) >= 0) {
                bestStudentGryffindor = gryffindorStudents[i - 1].getFirstName() + " "
                        + gryffindorStudents[i - 1].getLustName();
            }
        }

        for (int i = 0; i < hufflepuffStudents.length; i++) {
            int scoreHufflepuff = hufflepuffStudents[i].getPowerOfMagic() +
                    hufflepuffStudents[i].getTransgressionDistance();
            if (scoreHufflepuff > maxSumHufflepuff && (i - 1) >= 0) {
                bestStudentHufflepuff = hufflepuffStudents[i].getFirstName() + " "
                        + hufflepuffStudents[i].getLustName();
                maxSumHufflepuff = scoreHufflepuff;
            } else if (maxSumHufflepuff > scoreHufflepuff && (i - 1) >= 0) {
                bestStudentHufflepuff = hufflepuffStudents[i - 1].getFirstName() + " "
                        + hufflepuffStudents[i - 1].getLustName();
            }
        }
        if (maxSumGryffindor > maxSumHufflepuff) {
            System.out.println("Лучший ученик " + bestStudentGryffindor + " с грифиндора");
        } else {
            System.out.println("Лучший ученик " + bestStudentHufflepuff + " с пуфендуя");
        }
    }
}