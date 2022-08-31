//  Домашнее задание 3.1 (Урока №5. Условный оператор. Часть 1)
public class Main {
    public static void main(String[] args) {
        byte age = 5;
        hw3_1_1(age);
        hw3_1_2(age);
        hw3_1_3(121);
    }

//  ДЗ 3.1.1
    static void hw3_1_1(int age) {
        if (age >= 18) System.out.println("\nПоздравляю с совершеннолетием!");
        else System.out.println("\nСовершеннолетие ещё наступило. Подожди немного, пожалуйста.");
    }

//  ДЗ 3.1.2
    static void hw3_1_2(int age) {
        if (age >= 24)
            System.out.println("\nПоздравляем с окончанием университета " +
                    "и получением возможности трудоустроиться!");
        else if (age >= 18)
            System.out.println("\nПоздравляем с выпуском из школы! " +
                "Теперь можно поступить в университет.");
        else if (age >= 7)
            System.out.println("\nШкола - первый шаг на пути к грамотности и самосовершенствованию." +
                    " Пусть лёгок и светел будет твой путь!");
        else System.out.println("\nПодростай малышь, не спеши. Всё у тебя ещё впереди.");
    }

//  ДЗ 3.1.3
    public static byte wagonCapacity = 120;
    public static byte sittingPlaces = 60;
    static void hw3_1_3(int ticketNumber) {
        System.out.println(theOpportunityToLeave(ticketNumber));
    }
    public static String theOpportunityToLeave(int tn) {
        if (tn > wagonCapacity) return "\nСвободных мест в этом вагоне уже не осталось." +
                " Пройдите, пожалуйста, в следующий.";
        else if (tn > sittingPlaces) return "\nВсе места для сидения в вагоне заняты." +
                " Вы можете поехать стоя.";
        else if (tn > 0) return "\nВ вагоне ещё есть места для сидения. Приятного пути!";
        else return "Проезд без билета запрещён. Приобретите, пожалуйста, билет.";
    }
}