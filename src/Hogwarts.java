public class Hogwarts extends Student {
    private int powerOfMagic;
    private int distanceOfTransgression;

    public Hogwarts(String name, String surname, int powerOfMagic, int distanceOfTransgression) {
        super(name, surname);
        this.powerOfMagic = powerOfMagic;
        this.distanceOfTransgression = distanceOfTransgression;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getDistanceOfTransgression() {
        return distanceOfTransgression;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public void setDistanceOfTransgression(int distanceOfTransgression) {
        this.distanceOfTransgression = distanceOfTransgression;
    }
}
