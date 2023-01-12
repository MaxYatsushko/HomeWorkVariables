public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 () {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("Задача 1");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task2 () {
        var dog = 8.0 + 4;
        var cat = 3.6 + 4;
        var paper = 763789 + 4;

        System.out.println("Задача 2");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task3 () {
        var dog = 8.0 - 3.5;
        var cat = 3.6 - 1.6;
        var paper = 763789 - 7639;

        System.out.println("Задача 3");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task4 () {
        System.out.println("Задача 4");

        var friend = 19;
        System.out.println(friend);

        friend = friend + 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend);
    }

    public static void task5 () {
        System.out.println("Задача 5");

        var frog = 3.5;
        System.out.println(frog);

        frog *= 10;
        System.out.println(frog);

        frog /= 3.5;
        System.out.println(frog);

        frog += 4;
        System.out.println(frog);
    }

    public static void task6 () {
        System.out.println("Задача 6");

        var firstBoxerWeight = 78.2;
        System.out.println("Вес первого боксера:" + firstBoxerWeight + " кг");

        var secondBoxerWeight = 82.7;
        System.out.println("Вес второго боксера:" + secondBoxerWeight + " кг");

        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес двух бойцов:" + totalWeight + " кг");

        var deltaWeight = firstBoxerWeight - secondBoxerWeight;
        System.out.println("Разница в весе между бойцами:" + (deltaWeight > 0 ? 1: -1 * deltaWeight)  + " кг");
    }

    public static void task7() {
        System.out.println("Задача 7");

        var firstBoxerWeight = 78.2;
        System.out.println("Вес первого боксера:" + firstBoxerWeight + " кг");

        var secondBoxerWeight = 82.7;
        System.out.println("Вес второго боксера:" + secondBoxerWeight + " кг");

        var fisrtWayDivision = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница в весе между бойцами:" + fisrtWayDivision + " кг");

        var secondWayDivision = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Разница в весе между бойцами:" + secondWayDivision  + " кг");
    }

    public static void task8() {
        System.out.println("Задача 8");

        var totalHours = 640;
        var workerCapacity = 8;
        var numberWorkers = totalHours / workerCapacity;

        System.out.println("Всего работников в компании — " + numberWorkers + " человек");

        numberWorkers += 94;
        System.out.println("Если в компании работает " + numberWorkers + " человек, то всего " + (numberWorkers * workerCapacity) + " часов работы может быть поделено между сотрудниками");

    }
}