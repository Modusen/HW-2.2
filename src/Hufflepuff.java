public class Hufflepuff extends Hogwarts{
    private int hardWork;
    private int honesty;
    private int loyalty;

    public Hufflepuff(String name, String surname, int powerOfMagic, int distanceOfTransgression, int hardWork, int honesty, int loyalty) {
        super(name, surname, powerOfMagic, distanceOfTransgression);
        this.hardWork = hardWork;
        this.honesty = honesty;
        this.loyalty = loyalty;
    }

    @Override
    public String toString() {
        return "Студент: " + getName() + " " +
                getSurname() + "\nКачества Хаффлпаф: " +
                "Трудолюбие=" + hardWork +
                ", Честность=" + honesty +
                ", Верность=" + loyalty +
                ", Сила магии=" +getPowerOfMagic() +
                ", Дальность трансгрессии=" + getDistanceOfTransgression();
    }
    public int getHardWork() {
        return hardWork;
    }

    public int getHonesty() {
        return honesty;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }
}
