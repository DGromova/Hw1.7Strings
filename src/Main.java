public class Main {
    public static void main(String[] args) {
        task_1_2();
        task_3();
    }
    public static void task_1_2() {
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
    public static void task_3() {
        String fullName = "Иванов Семён Семёнович";
       //Способ 1
       //String newFullName = fullName.replace('ё', 'е');
       //System.out.println("Данные ФИО сотрудника - " + newFullName);
       //Способ 2
        String[] newFullName = fullName.split("");
        System.out.print("Данные ФИО сотрудника - ");
        for (int i = 0; i < newFullName.length; i++) {
            if (newFullName[i].contains("ё")) {
                newFullName[i] = "е";
            }
            System.out.print(newFullName[i]);
        }
    }
}