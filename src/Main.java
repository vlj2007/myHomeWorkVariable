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
    public static void task1(){
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Значение dog: " + dog);
        System.out.println("Значение cat: " + cat);
        System.out.println("Значение paper: " + paper);
    }
    public static void task2(){
        System.out.println("Задача 2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Значение dog: " + dog);
        dog += 4;
        System.out.println("Увеличим значение на 4 dog: " + dog);

        System.out.println("Значение cat:" + cat);
        cat += 4;
        System.out.println("Увеличим значение на 4 cat: " + cat);

        System.out.println("Значение paper:" + paper);
        paper += 4;
        System.out.println("Увеличим значение на 4 cat: " + paper);

    }

    public static void task3(){
        System.out.println("Задача 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Значение dog: " + dog);
        dog -= 3.5;
        System.out.println("Уменшение значение на 5,5 dog: " + dog);

        System.out.println("Значение cat: " + cat);
        cat -= 1.6;
        System.out.println("Уменшение значение на 1.6 cat: " + cat);

        System.out.println("Значение paper:" + paper);
        paper -= 7639;
        System.out.println("Уменшение значение на 7639 cat: " + paper);

    }

    public static void task4(){
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println("Значение friend:" + friend);
        friend *= 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);
    }

    public static void task5(){
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println("Значение frog:" + frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);
    }

    public static void task6(){
        System.out.println("Задача 6");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        System.out.println("Вес первого боксера " + firstBoxer);
        System.out.println("Вес второго боксера " + secondBoxer);

        var weightTwoBoxers = firstBoxer + secondBoxer;
        System.out.println("Общий вес двух бойцов " + weightTwoBoxers);

        var differenceTwoBoxers = secondBoxer - firstBoxer;
        System.out.println("Разницу между весами бойцов " + differenceTwoBoxers);
    }

    public static void task7(){
        System.out.println("Задача 7");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;

        System.out.println("Способ 1");
        System.out.println("Вычитание из большего веса меньшего.");
        var differenceTwoBoxers = secondBoxer - firstBoxer;
        System.out.println(differenceTwoBoxers);

        System.out.println("Способ 2");
        System.out.println(" С помощь функции остаток от деления.");
        var remainderDivision = secondBoxer % firstBoxer;
        System.out.println(remainderDivision);
    }

    public static void task8(){
        System.out.println("Задача 8");
        var totalHours = 640;
        System.out.println("Всего часов " + totalHours);
        var everyEmployee = 8;
        System.out.println("Часов на одного сотрудника " + everyEmployee);
        var totalEmployees =  totalHours / everyEmployee;
        System.out.println("Всего работников в компании — " + totalEmployees + " человек.");
        var peopleMore = 94;
        var allPeople = totalEmployees + peopleMore;
        var resultTask = allPeople * 8;
        System.out.println("Если в компании работает " + allPeople + " человек, то всего " + resultTask + " часов работы может быть поделено между сотрудниками");
    }

}