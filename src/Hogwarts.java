public class Hogwarts extends Student {
    private int powerOfMagic;
    private int distanceOfTransgression;

    public Hogwarts(String name, String surname, int powerOfMagic, int distanceOfTransgression) {
        super(name, surname);
        this.powerOfMagic = powerOfMagic;
        this.distanceOfTransgression = distanceOfTransgression;
    }
    public void compareHogwartsStudents(Hogwarts secondStudent) {
        int average = this.getDistanceOfTransgression() + this.getPowerOfMagic();
        if (average < secondStudent.getDistanceOfTransgression() + secondStudent.getPowerOfMagic()) {
            System.out.println(this.getName() + " " + this.getSurname() + " имеет больше очков Хогвартса, чем "
                    + secondStudent.getName() + " " + secondStudent.getSurname());
        } else if (average > secondStudent.getDistanceOfTransgression() + secondStudent.getPowerOfMagic()) {
            System.out.println(secondStudent.getName() + " " + secondStudent.getSurname() + " имеет больше очков Хогвартса, чем "
                    + this.getName() + " " + this.getSurname());
        }
        System.out.println("Ученики " + secondStudent.getName() + " " + secondStudent.getSurname() + " и " + this.getName() + " " + this.getSurname() + " равны по очкам Хогвартса");
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
