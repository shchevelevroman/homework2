public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var dog = 8.0; // начало д/з №1
        dog = dog + 4.0;
        dog = dog - 3.5;// значение переменной должна быть 3.5
        System.out.println(dog);
        var cat = 3.6;
        cat = cat + 4;
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        paper = paper + 4;
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;// начало д/з №2
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var weightTotal = weightBoxer1 + weightBoxer2;
        System.out.println("Общий вес бойцов " + weightTotal + " кг!");
        var weightOdds = weightBoxer2 - weightBoxer1;
        System.out.println("Разница в весе между бойцами " + weightOdds + " кг!");
        var overLoadWeight = weightBoxer2 % weightBoxer1;
        System.out.println("Боец номер 2, тяжелее на " + overLoadWeight + " кг!");

        var totalTimeWork = 640;
        var timeworker = 8;
        var totalWorker = totalTimeWork / timeworker;
        System.out.println("Всего работников компании - " + totalWorker + " человек");

        var totalWorkerPlus = totalWorker + 94;
        var timeWorkerPlus = totalTimeWork / totalWorkerPlus;
        System.out.println("Если в компании работает " + totalWorkerPlus + " человек, то всего " + timeWorkerPlus + " часов работы может быть поделеномежду сотрудниками");



    }
}