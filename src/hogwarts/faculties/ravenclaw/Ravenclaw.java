package hogwarts.faculties.ravenclaw;

import hogwarts.general.Hogwarts;

public class Ravenclaw extends Hogwarts {
    private int wisdom;
    private int witty;
    private int creation;

    public Ravenclaw(String firstName, String lastName,
                     int wisdom, int witty, int creation, int powerOfMagic, int transgressionDistance) {
        super(firstName, lastName, powerOfMagic, transgressionDistance);
        this.wisdom = wisdom;
        this.witty = witty;
        this.creation = creation;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    @Override
    public String toString() {
        return "Имя: " + getFirstName() + "; Фамилия: " + getLustName() + "; Баллы мудрости = " + this.wisdom +
                "; Баллы остроумия = " + this.witty + "; Баллы творчества = " + this.creation + "; Сила магии = " +
                getPowerOfMagic() + "; Дистанция трансгрессии = " + getTransgressionDistance();
    }
}