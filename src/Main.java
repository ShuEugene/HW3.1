public class Main {
    public static void main(String[] args) {
//  Домашнее задание 3.1 (Урока №5. Условный оператор. Часть 1)
        byte age = 7;
        hw3_1_1(age);
    }

    //        ДЗ 3.1.1
    public static void hw3_1_1(int age) {
        if (age >= 18) System.out.println("\nПоздравляю с совершеннолетием!");
        else System.out.println("\nСовершеннолетие ещё наступило. Подожди немного, пожалуйста.");
    }

}