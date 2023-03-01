package homework;

public class Hw {
    public static void Task1(){
        var age = 18;

        System.out.println("Task 1:");

        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ",он не достиг совершеннолетия, нужно немного подождать");
        }

        System.out.println(" ");
    }
    public static void Task2(){
        var temperature = 7;

        System.out.println("Task 2: ");

        if(temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов - нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature + " градусов - можно идти без шапки.");
        }

        System.out.println(" ");
    }
    public static void Task3(){
        var speed = 82;

        System.out.println("Task 3:");

        if(speed > 60){
            System.out.println("Если скорость " + speed + " то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " то можно езить спокойно");
        }

        System.out.println(" ");
    }
    public static void Task4(){
        var age = 22;

        System.out.println("Task 4:");

        if(age >= 2 && age <=6){
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в детский сад");
        }
        if(age >= 7 && age <= 18){
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу");
        }
        if(age > 18 && age <= 24){
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в университет");
        }
        if(age > 24){
            System.out.println("Если возраст человека равен " + age + " то ему пора ходить на работу");
        }

        System.out.println(" ");
    }
    public static void Task5(){
        var age = 22;

        System.out.println("Task 5:");

        if(age < 5){
            System.out.println("Если возраст ребенка равен " + age + ", то ему  нельзя кататься на аттракционе.");
        }
        if(age >= 5 && age < 14){
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        }
        if(age > 14){
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }

        System.out.println(" ");
    }
    public static void Task6(){
        var checkPlace = 3;

        System.out.println("Task 6:");

        if( checkPlace > 102){
            System.out.println("В вагоне нет мест.");
        } else if( checkPlace > 60 && checkPlace <= 102){
            System.out.printf("В вагоне есть только стоячие места.");
        } else if(checkPlace > 0 && checkPlace <= 60) {
            System.out.println("В вагоне есть сидячие и стоячие места.");
        }

        System.out.println(" ");
    }
    public static void Task7(){
        int one, two, three;

        one   = 3;
        two   = 2;
        three = 1;

        System.out.println("Task 7:");

        if(three > one && three > two){
            System.out.println("Большее число - three = " + three);
        } else if(two > three && two > one){
            System.out.println("Большее число - two = " + two);
        } else if(one > two && one > three){
            System.out.println("Большее число - one = " + one);
        }
    }
}
