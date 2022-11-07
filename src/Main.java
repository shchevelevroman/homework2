public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Задача №1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задача №2
        dog = dog + 4.0;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задача №3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задача №4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //Задача №5
        var frog = 3.5;
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //Задача №6
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var weightTotal = weightBoxer1 + weightBoxer2;
        System.out.println("Общий вес бойцов " + weightTotal + " кг!");
        var weightOdds = weightBoxer2 - weightBoxer1;
        System.out.println("Разница в весе между бойцами " + weightOdds + " кг!");

        //Задача №7
        System.out.println("Разница в весе между бойцами " + weightOdds + " кг!");
        var overLoadWeight = weightBoxer2 % weightBoxer1;
        System.out.println("Боец номер 2, тяжелее на " + overLoadWeight + " кг!");

        //Задача №8.1
        var totalTimeWork = 640;
        var timeworker = 8;
        var totalWorker = totalTimeWork / timeworker;
        System.out.println("Всего работников компании - " + totalWorker + " человек");

        //Задача №8.2
        var totalWorkerPlus = totalWorker + 94;
        var timeWorkerPlus = totalTimeWork / totalWorkerPlus;
        System.out.println("Если в компании работает " + totalWorkerPlus + " человек, то всего " + timeWorkerPlus + " часов работы может быть поделеномежду сотрудниками");



    }
}