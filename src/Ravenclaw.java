public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wise;
    private int creative;

    public Ravenclaw(String name, String surname, int powerOfMagic, int distanceOfTransgression, int smart, int wise, int creative) {
        super(name, surname, powerOfMagic, distanceOfTransgression);
        this.smart = smart;
        this.wise = wise;
        this.creative = creative;
    }

    public static void compareRavenclawStudents(Ravenclaw firstStudent, Ravenclaw secondStudent) {
        int average = firstStudent.creative + firstStudent.smart + firstStudent.wise;
        if (average < secondStudent.creative + secondStudent.smart + secondStudent.wise) {
            System.out.println(secondStudent.getName() + " " + secondStudent.getSurname() + " имеет больше очков факультета, чем " +
                    firstStudent.getName() + " " + firstStudent.getSurname());
        } else {
            System.out.println(firstStudent.getName() + " " + firstStudent.getSurname() + " имеет больше очков факультета, чем " +
                    secondStudent.getName() + " " + secondStudent.getSurname());
        }
    }

    @Override
    public String toString() {
        return "Студент: " + getName() + " " +
                getSurname() + "\nКачества Когтеврана: " +
                "Ум=" + smart +
                ", Мудрость=" + wise +
                ", Творчество=" + creative +
                ", Сила магии=" + getPowerOfMagic() +
                ", Дальность трансгрессии=" + getDistanceOfTransgression();
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getCreative() {
        return creative;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }
}
