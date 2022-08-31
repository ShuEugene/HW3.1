//  Домашнее задание 3.1 (Урока №5. Условный оператор. Часть 1)
public class Main {
    public static void main(String[] args) {
//  ДЗ 3.1.1(+3)
        byte age = 1;
        System.out.println(commingOfAge(age));

//  ДЗ 3.1.2(+3)
        System.out.println(ageRelatedOpportunityes(age));

//  ДЗ 3.1.3(+3)
        byte wagonCapacity = 120;
        byte sittingPlaces = 60;
        int ticketNumber = 121;
        System.out.println(theOpportunityToGo(wagonCapacity, sittingPlaces, ticketNumber));

//  ДЗ 3.1.7.1
        System.out.println("\nЕсли возраст человека равен " + age +
                ", то ему сто́ит ходить " + placeOfEmployement(age) + ".");

//  ДЗ 3.1.7.2
        System.out.println(canRide(age));

//  ДЗ 3.1.7.3 вар.1
        int one = 2;
        int two = 1;
        int free = 3;
        System.out.printf("\nИз чисел %d, %d и %d бо́льшим является %s.",
                one, two, free, aLargerNumber(one, two, free));
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

    static String placeOfEmployement(int age) {
        if (age > 24) return "на работу";
            else if (age >= 18 && age <= 24) return "в университет";
                else if (age >= 7 && age < 18) return "в школу";
                else if (age >= 2 && age < 7) return "в детский сад";
        return "рядом с мамой";
    }

    static String canRide(int age) {
        if (age > 14) return "\nДобро пожаловать на аттракцион!";
        else if (age >= 5 && age <= 14) return "\nТебе можно кататься только со старшими.";
        return "\nИзвини, малышь, но тебе пока сюда нельзя.";
    }

    static String aLargerNumber(int one, int two, int free) {
        if (one == two && one == free) return "никакое; все три числа равны";
        else if (one == two && one > free) return "первое и второе; они равны";
        else if (two == free && two >one) return "второе и третье; они равны";
        else if (free == one && free > two) return "первое и третье; они равны";
        else if (one > two && one > free) return "первое";
        else if (two > one && two > free) return "второе";
        return "третье";
    }
}