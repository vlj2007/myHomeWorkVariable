public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1(){
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Значение dog:" + dog);
        System.out.println("Значение cat:" + cat);
        System.out.println("Значение paper:" + paper);
    }
    public static void task2(){
        System.out.println("Задача 2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Значение dog:" + dog);
        dog = dog + 4;
        System.out.println("Увеличим значение на 4 dog:" + dog);

        System.out.println("Значение cat:" + cat);
        cat = cat + 4;
        System.out.println("Увеличим значение на 4 cat:" + cat);

        System.out.println("Значение paper:" + paper);
        paper = paper + 4;
        System.out.println("Увеличим значение на 4 cat:" + paper);

    }

    public static void task3(){
        System.out.println("Задача 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Значение dog:" + dog);
        dog = dog - 3.5;
        System.out.println("Уменшение значение на 5,5 dog:" + dog);

        System.out.println("Значение cat:" + cat);
        cat = cat - 1.6;
        System.out.println("Уменшение значение на 1.6 cat:" + cat);

        System.out.println("Значение paper:" + paper);
        paper = paper - 7639;
        System.out.println("Уменшение значение на 7639 cat:" + paper);

    }

    public static void task4(){
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println("Значение friend:" + friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }

}