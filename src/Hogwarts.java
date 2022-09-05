public class Hogwarts extends Student {
    private int powerOfMagic;
    private int distanceOfTransgression;

    public Hogwarts(String name, String surname, int powerOfMagic, int distanceOfTransgression) {
        super(name, surname);
        this.powerOfMagic = powerOfMagic;
        this.distanceOfTransgression = distanceOfTransgression;
    }
    public static void compareHogwartsStudents(Hogwarts firstStudent, Hogwarts secondStudent) {
        int average = firstStudent.getDistanceOfTransgression() + firstStudent.getPowerOfMagic();
        if (average < secondStudent.getDistanceOfTransgression() + secondStudent.getPowerOfMagic()) {
            System.out.println(firstStudent.getName() + " " + firstStudent.getSurname() + " имеет больше очков Хогвартса, чем "
                    + secondStudent.getName() + " " + secondStudent.getSurname());
        } else if (average > secondStudent.getDistanceOfTransgression() + secondStudent.getPowerOfMagic()) {
            System.out.println(secondStudent.getName() + " " + secondStudent.getSurname() + " имеет больше очков Хогвартса, чем "
                    + firstStudent.getName() + " " + firstStudent.getSurname());
        }
        System.out.println("Ученики " + secondStudent.getName() + " " + secondStudent.getSurname() + " и " + firstStudent.getName() + " " + firstStudent.getSurname() + " равны по очкам Хогвартса");
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
