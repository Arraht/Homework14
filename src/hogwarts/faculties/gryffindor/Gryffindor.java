package hogwarts.faculties.gryffindor;

import hogwarts.general.Hogwarts;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;
    public Gryffindor(String firstName, String lastName,
                      int nobility, int honor, int bravery, int powerOfMagic, int transgressionDistance) {
        super(firstName, lastName, powerOfMagic, transgressionDistance);
        this.bravery = bravery;
        this.nobility = nobility;
        this.honor = honor;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Имя: " + getFirstName() + "; Фамилия: " + getLustName() + "; Баллы благородства = " + this.nobility +
                "; Быллы чести = " + this.honor + "; Баллы храбрости = " + this.bravery + "; Сила магии = " +
                getPowerOfMagic() + "; Дистанция трансгрессии = " + getTransgressionDistance();
    }
}