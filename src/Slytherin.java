public class Slytherin extends Hogwarts {
    private int cunning;
    private int resoluteness;
    private int ambition;
    private int resourcefulness;
    private int powerLust;

    public Slytherin(String name, String surname, int powerOfMagic, int distanceOfTransgression, int cunning, int resoluteness, int ambition, int resourcefulness, int powerLust) {
        super(name, surname, powerOfMagic, distanceOfTransgression);
        this.cunning = cunning;
        this.resoluteness = resoluteness;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.powerLust = powerLust;
    }

    @Override
    public String toString() {
        return "Студент: " + getName() + " " +
                getSurname() + "\nКачества Слизерин: " +
                "Хитрость=" + cunning +
                ", Решительность=" + resoluteness +
                ", Амбициозность=" + ambition +
                ", Находчивость=" + resourcefulness +
                ", Жажда власти=" + powerLust +
                ", Сила магии=" + getPowerOfMagic() +
                ", Дальность трансгрессии=" + getDistanceOfTransgression();
    }

    public int getCunning() {
        return cunning;
    }

    public int getResoluteness() {
        return resoluteness;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getPowerLust() {
        return powerLust;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setResoluteness(int resoluteness) {
        this.resoluteness = resoluteness;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public void setPowerLust(int powerLust) {
        this.powerLust = powerLust;
    }
}
