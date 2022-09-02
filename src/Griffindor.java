public class Griffindor extends Hogwarts {
    private int nobility;
    private int honour;
    private int courage;

    public Griffindor(String name, String surname, int powerOfMagic, int distanceOfTransgression, int nobility, int honour, int courage) {
        super(name, surname, powerOfMagic, distanceOfTransgression);
        this.nobility = nobility;
        this.honour = honour;
        this.courage = courage;
    }

    @Override
    public String toString() {
        return "Студент: " + getName() + " " +
                getSurname() + "\nКачества Гриффиндор: " +
                "Благородство=" + nobility +
                ", Честь=" + honour +
                ", Храбрость=" + courage +
                ", Сила магии=" + getPowerOfMagic() +
                ", Дальность трансгрессии=" + getDistanceOfTransgression();
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonour() {
        return honour;
    }

    public int getCourage() {
        return courage;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonour(int honour) {
        this.honour = honour;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }
}
