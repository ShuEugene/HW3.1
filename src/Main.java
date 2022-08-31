//  Домашнее задание 3.1 (Урока №5. Условный оператор. Часть 1)
public class Main {
    public static void main(String[] args) {
//  ДЗ 3.1.1
        byte age = 5;
        System.out.println(commingOfAge(age));

//  ДЗ 3.1.2
        System.out.println(ageRelatedOpportunityes(age));

//  ДЗ 3.1.3
        byte wagonCapacity = 120;
        byte sittingPlaces = 60;
        int ticketNumber = 121;
        System.out.println(theOpportunityToGo(wagonCapacity, sittingPlaces, ticketNumber));
    }

    static String commingOfAge(int age) {
        if (age >= 18) return "\nПоздравляю с совершеннолетием!";
        else return "\nСовершеннолетие ещё наступило. Подожди немного, пожалуйста.";
    }

    static String ageRelatedOpportunityes(int age) {
        if (age >= 24)
            return "\nПоздравляем с окончанием университета" +
                    " и получением возможности трудоустроиться!";
        else if (age >= 18)
            return "\nПоздравляем с выпуском из школы! " +
                    "Теперь можно поступить в университет.";
        else if (age >= 7)
            return "\nШкола - первый шаг на пути к грамотности и самосовершенствованию." +
                    " Пусть лёгок и светел будет твой путь!";
        else return "\nПодростай малышь, не спеши. Всё у тебя ещё впереди.";
    }

    static String theOpportunityToGo(int wagonCapacity, int sittingPlaces, int ticketNumber) {
        if (ticketNumber > wagonCapacity) return "\nСвободных мест в этом вагоне нет." +
                " Пройдите, пожалуйста, в следующий.";
        else if (ticketNumber > sittingPlaces) return "\nВсе места для сидения в вагоне заняты." +
                " Вы можете поехать стоя.";
        else if (ticketNumber > 0) return "\nВ вагоне ещё есть места для сидения. Приятного пути!";
        else return "Проезд без билета запрещён. Приобретите, пожалуйста, билет.";
    }
}