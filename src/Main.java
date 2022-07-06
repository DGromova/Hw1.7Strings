public class Main {
    public static void main(String[] args) {
        task1_2();
        task3();
    }
    public static void task1_2() {
        //Задание 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
        //Задание 2
        String fullNameUpperCase = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullNameUpperCase);
    }
        //Задание 3
    public static void task3() {
        String fullName = "Иванов Семён Семёнович";
        String newFullName = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника - " + newFullName);
    }
}