package hogwarts.students.create.gryffindor.object;

import hogwarts.faculties.gryffindor.Gryffindor;

public class GryffindorStudents extends Gryffindor {
    public GryffindorStudents(String firstName, String lastName,
                              int nobility, int honor, int bravery, int powerOfMagic, int transgressionDistance) {
        super(firstName, lastName, nobility, honor, bravery, powerOfMagic, transgressionDistance);
    }
}