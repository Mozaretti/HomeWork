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
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
    }
    public static void task2(){
        System.out.println("Задача 2");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);


    }
public static void task3(){
    System.out.println("Задача 3");
        double dog = 8;
    double cat = 3.6;
    double paper = 763789;
    dog = dog - 3.5;
    cat = cat - 1.6;
    paper = paper - 7639;
    System.out.println(dog);
    System.out.println(cat);
    System.out.println(paper);

}
public static void task4(){
    System.out.println("Задача 4");
    var friend = 19;
    System.out.println(friend);
    friend = friend + 2;
    System.out.println(friend);
    friend = friend / 7;
    System.out.println(friend);
}
public static void task5(){
    System.out.println("Задача 5");
    var frog = 3.5;
    System.out.println(frog);
    frog = frog * 10;
    System.out.println(frog);
    frog = frog / 3.5;
    System.out.println(frog);
    frog = frog + 4;
    System.out.println(frog);
}
public static void task6() {
    System.out.println("Задача 6");
    var boxer1 = 78.2;
    var boxer2 = 82.7;
    var sumWeight = boxer1 + boxer2;
    System.out.println("Общий вес боксеров " + sumWeight + " кг!.");
    var diffWeight = boxer1 - boxer2;
    System.out.println("Разница веса бойцов " + diffWeight + " кг!");
}
public static void task7(){
    System.out.println("Задача 7");
    var boxer1 = 78.2;
    var boxer2 = 82.7;
    var diffWeight = boxer2 - boxer1;
    System.out.println("Разница веса боксёров " + diffWeight + " кг!");
    diffWeight = boxer2 % boxer1;
    System.out.println("Разница веса боксёров " + diffWeight + " кг!");
}
public static void task8(){
    System.out.println("Задача 8");
    var time1 = 640;
    var time2 = 8;
    var man = time1 / time2;
    System.out.println("Всего работников в компании " + man + " человек.");
    var time = 640;
    var man1 = 80;
    var man2 = 94;
    var sumWeight = man1 + man2;
    var timeWeight = time / sumWeight;
    System.out.println("Если в компании работает " + sumWeight + " человек, то всего " + timeWeight +
            " часа работы может быть поделено между сотрудниками.");

}



}