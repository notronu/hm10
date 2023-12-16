// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        String firstName = "Ivan";
        System.out.println(firstName);
        String middleName = "Ivanovich";
        System.out.println(middleName);
        String lastName = "Ivanov";
        System.out.println(lastName);
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println(fullName);

        System.out.println("Задача 2");
        String fullName1 = fullName.replace("Ivanov Ivan Ivanovich", "IVANOV IVAN IVANOVICH");
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName1);

        System.out.println("Задача 3");
        String fullName2 = "Иванов Семён Семёнович";
        String fullName3 = fullName2.replace("Иванов Семён Семёнович", "Иванов Семен Семенович");
        System.out.println("Данные Ф. И. О. сотрудника —" + fullName3);







    }
}