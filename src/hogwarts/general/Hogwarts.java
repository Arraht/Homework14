package hogwarts.general;

public class Hogwarts {
    private int powerOfMagic;
    private int transgressionDistance;
    private String firstName;
    private String lustName;

    public Hogwarts(String firstName, String lastName, int powerOfMagic, int transgressionDistance) {
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
        this.firstName = firstName;
        this.lustName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLustName() {
        return lustName;
    }

    public void setLustName(String lustName) {
        this.lustName = lustName;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }
}