package Pro.sky;

import Pro.sky.Human;

public class Main {


    public static void main(String[] args) {

        task1();
        task2();
        task3();
    }

    public static void task1() {

        Human human = new Human("Максим", 1988, "Минск");
        Human human1 = new Human("Аня", 1993, "Москва");
        Human human2 = new Human("Катя", 1992, "Калининград");
        Human human3 = new Human("Артем", 1995, "Москва");

        System.out.println("Привет! Меня зовут " + human.getName() + ". Я из города " + human.getTown() + ". Я родился в " + human.getYearOfBirth() + " году. Будем знакомы!");
        System.out.println("Привет! Меня зовут " + human1.getName() + ". Я из города " + human1.getTown() + ". Я родился в " + human1.getYearOfBirth() + " году. Будем знакомы!");
        System.out.println("Привет! Меня зовут " + human2.getName() + ". Я из города " + human2.getTown() + ". Я родился в " + human2.getYearOfBirth() + " году. Будем знакомы!");
        System.out.println("Привет! Меня зовут " + human3.getName() + ". Я из города " + human3.getTown() + ". Я родился в " + human3.getYearOfBirth() + " году. Будем знакомы!");
}

    public static void task2() {

        Human human = new Human("Максим",  1988, "Минск", "бренд-менеджер");
        Human human1 = new Human("Аня", 1993, "Москва", "методист образовательных программ");
        Human human2 = new Human("Катя", 1992, "Калининград", "продакт-менеджер");
        Human human3 = new Human("Артем", 1995, "Москва", "директор по развитию бизнеса");
        System.out.println(human);
        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
    }

    public static void task3() {
        Human humanA = new Human(null,1930,null,null);
        Human humanB = new Human("Иван",1930,null,null);
        Human humanC = new Human(null,1930,"Санкт-Петербург",null);
        Human humanD = new Human(null,1930,null,"Менеджер среднего звена");
        Human humanE = new Human("",1930,"","");
        Human human = new Human("Максим", 1988, "Минск", "бренд-менеджер");
        Human human1 = new Human("Аня", 1993, "Москва", "методист образовательных программ");
        Human human2 = new Human("Катя", 1992, "Калининград", "продакт-менеджер");
        Human human3 = new Human("Артем", 1995, "Москва", "директор по развитию бизнеса");
        System.out.println(humanA);
        System.out.println(humanB);
        System.out.println(humanC);
        System.out.println(humanD);
        System.out.println(humanE);
        System.out.println(human);
        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
    }


}