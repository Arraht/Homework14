package hogwarts.faculties.slytherin;

import hogwarts.general.Hogwarts;

public class Slytherin extends Hogwarts {
    private int cunning; /*Хитрость*/
    private int determination; /*Решительность*/
    private int resourcefulness; /*Находчивость*/
    private int thirstForPower; /*Жажда власти*/

    public Slytherin(String firstName, String lastName, int cunning, int determination, int resourcefulness,
                     int thirstForPower, int powerOfMagic, int transgressionDistance) {
        super(firstName, lastName, powerOfMagic, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    @Override
    public String toString() {
        return "Имя: " + getFirstName() + "; Фамилия: " + getLustName() + "; Баллы хитрости = " + this.cunning +
                "; Баллы решительности = " + this.determination + "; Баллы находчивости = " + this.resourcefulness +
                "; Баллы жажды власти = " + this.thirstForPower + "; Сила магии = " +
                getPowerOfMagic() + "; Дистанция трансгрессии = " + getTransgressionDistance();
    }
}