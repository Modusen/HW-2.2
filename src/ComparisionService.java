public class ComparisionService {
    public static void compareGriffindorStutents(Griffindor firstStudent, Griffindor secondStudent) {
        int average = firstStudent.getCourage() + firstStudent.getHonour() + firstStudent.getNobility();
        if (average < secondStudent.getCourage() + secondStudent.getNobility() + secondStudent.getHonour()) {
            System.out.println(secondStudent.getName() + " " + secondStudent.getSurname() + " имеет больше очков факультета, чем " +
                    firstStudent.getName() + " " + firstStudent.getSurname());
        } else {
            System.out.println(firstStudent.getName() + " " + firstStudent.getSurname() + " имеет больше очков факультета, чем " +
                    secondStudent.getName() + " " + secondStudent.getSurname());
        }
    }

    public static void compareHufflepuffStudents(Hufflepuff firstStudent, Hufflepuff secondStudent) {
        int average = firstStudent.getHardWork() + firstStudent.getHonesty() + firstStudent.getLoyalty();
        if (average < secondStudent.getHardWork() + secondStudent.getHonesty() + secondStudent.getLoyalty()) {
            System.out.println(secondStudent.getName() + " " + secondStudent.getSurname() + " имеет больше очков факультета, чем " +
                    firstStudent.getName() + " " + firstStudent.getSurname());
        } else {
            System.out.println(firstStudent.getName() + " " + firstStudent.getSurname() + " имеет больше очков факультета, чем " +
                    secondStudent.getName() + " " + secondStudent.getSurname());
        }
    }

    public static void compareRavenclawStudents(Ravenclaw firstStudent, Ravenclaw secondStudent) {
        int average = firstStudent.getCreative() + firstStudent.getSmart() + firstStudent.getWise();
        if (average < secondStudent.getCreative() + secondStudent.getSmart() + secondStudent.getWise()) {
            System.out.println(secondStudent.getName() + " " + secondStudent.getSurname() + " имеет больше очков факультета, чем " +
                    firstStudent.getName() + " " + firstStudent.getSurname());
        } else {
            System.out.println(firstStudent.getName() + " " + firstStudent.getSurname() + " имеет больше очков факультета, чем " +
                    secondStudent.getName() + " " + secondStudent.getSurname());
        }
    }

    public static void compareSlytherinStudents(Slytherin firstStudent, Slytherin secondStudent) {
        int average = firstStudent.getAmbition() + firstStudent.getCunning() + firstStudent.getPowerLust() + firstStudent.getResoluteness() + firstStudent.getResourcefulness();
        if (average < secondStudent.getAmbition() + secondStudent.getCunning() + secondStudent.getPowerLust() + secondStudent.getResoluteness() + secondStudent.getResourcefulness()) {
            System.out.println(secondStudent.getName() + " " + secondStudent.getSurname() + " имеет больше очков факультета, чем " +
                    firstStudent.getName() + " " + firstStudent.getSurname());
        } else {
            System.out.println(firstStudent.getName() + " " + firstStudent.getSurname() + " имеет больше очков факультета, чем " +
                    secondStudent.getName() + " " + secondStudent.getSurname());
        }
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

}

