public class Main {

    public static void main(String[] args) {
        Griffindor[] griffindors = new Griffindor[3];
        Griffindor harryPotter = new Griffindor("Гарри", "Поттер", 100, 80, 100, 100, 100);
        Griffindor hermionaGranger = new Griffindor("Гермиона", "Грейнджер", 90, 100, 90, 100, 80);
        Griffindor ronWhisley = new Griffindor("Рон", "Уизли", 80, 60, 80, 60, 70);
        griffindors[0] = harryPotter;
        griffindors[1] = hermionaGranger;
        griffindors[2] = ronWhisley;

        Hufflepuff[] hufflepuffs = new Hufflepuff[3];
        Hufflepuff zaharyaSmith = new Hufflepuff("Захария", "Смит", 80, 30, 50, 70, 100);
        Hufflepuff sedrikDiggory = new Hufflepuff("Седрик", "Диггори", 90, 90, 80, 80, 90);
        Hufflepuff JustinFinchFletchli = new Hufflepuff("Джастин", "Финч-Флетчли", 60, 70, 90, 60, 70);
        hufflepuffs[0] = zaharyaSmith;
        hufflepuffs[1] = sedrikDiggory;
        hufflepuffs[2] = JustinFinchFletchli;

        Ravenclaw[] ravenclaws = new Ravenclaw[3];
        Ravenclaw chzouChang = new Ravenclaw("Чжоу", "Чанг", 80, 80, 70, 90, 80);
        Ravenclaw padmaPatil = new Ravenclaw("Падма", "Патил", 70, 50, 80, 60, 70);
        Ravenclaw markusBelbi = new Ravenclaw("Маркус", "Белби", 50, 75, 90, 80, 100);
        ravenclaws[0] = chzouChang;
        ravenclaws[1] = padmaPatil;
        ravenclaws[2] = markusBelbi;

        Slytherin[] slytherins = new Slytherin[3];
        Slytherin drakoMafoy = new Slytherin("Драко", "Малфой", 80, 100, 100, 100, 100, 100, 100);
        Slytherin grahamMontego = new Slytherin("Грэхэм", "Монтегю", 50, 70, 70, 60, 50, 50, 50);
        Slytherin gregoryGoil = new Slytherin("Грегори", "Гойл", 70, 80, 40, 70, 50, 70, 60);
        slytherins[0] = drakoMafoy;
        slytherins[1] = grahamMontego;
        slytherins[2] = gregoryGoil;

        PrintService.print(griffindors);
        PrintService.print(hufflepuffs);
        PrintService.print(ravenclaws);
        PrintService.print(slytherins);
        Griffindor.compareGriffindorStutents(ronWhisley, hermionaGranger);
        Hufflepuff.compareHufflepuffStudents(zaharyaSmith, sedrikDiggory);
        Ravenclaw.compareRavenclawStudents(padmaPatil, markusBelbi);
        Slytherin.compareSlytherinStudents(drakoMafoy, grahamMontego);
        harryPotter.compareHogwartsStudents(drakoMafoy);
    }
}