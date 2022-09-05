public class PrintService {
    public static void print(Griffindor[] griffindors) {
        System.out.println("Количество учащихся " + griffindors.length);
        for (int i = 0; i < griffindors.length; i++) {
            System.out.println(griffindors[i]);
        }
    }

    public static void print(Hufflepuff[] hufflepuffs) {
        System.out.println("Количество учащихся " + hufflepuffs.length);
        for (int i = 0; i < hufflepuffs.length; i++) {
            System.out.println(hufflepuffs[i]);
        }
    }

    public static void print(Ravenclaw[] ravenclaws) {
        System.out.println("Количество учащихся " + ravenclaws.length);
        for (int i = 0; i < ravenclaws.length; i++) {
            System.out.println(ravenclaws[i]);
        }
    }

    public static void print(Slytherin[] slytherins) {
        System.out.println("Количество учащихся " + slytherins.length);
        for (int i = 0; i < slytherins.length; i++) {
            System.out.println(slytherins[i]);
        }
    }
}
