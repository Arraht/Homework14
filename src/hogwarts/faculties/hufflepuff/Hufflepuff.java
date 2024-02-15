package hogwarts.faculties.hufflepuff;

import hogwarts.general.Hogwarts;

public class Hufflepuff extends Hogwarts {
    private int hardWork;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String firstName, String lastName,
                      int hardWork, int loyalty, int honesty, int powerOfMagic, int transgressionDistance) {
        super(firstName, lastName, powerOfMagic, transgressionDistance);
        this.hardWork = hardWork;
        this.honesty = honesty;
        this.loyalty = loyalty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Имя: " + getFirstName() + "; Фамилия: " + getLustName() + "; Баллы трудолюбия = " + this.hardWork +
                "; Баллы верности = " + this.loyalty + "; Баллы честности = " + honesty + "; Сила магии = " +
                getPowerOfMagic() + "; Дистанция трансгрессии = " + getTransgressionDistance();
    }
}