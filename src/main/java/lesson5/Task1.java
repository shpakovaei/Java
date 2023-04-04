package lesson5;

public class Task1 {
    public static void main(String[] args) {

        Phonebook myPhoneBook = new Phonebook();

        myPhoneBook.addData("Иванова Ксения", "12-23-34");
        myPhoneBook.addData("Лебедев Виктор", "45-56-67");
        myPhoneBook.addData("Иванова Ксения", "78-89-90");
        myPhoneBook.addData("Иванова Ксения", "13-35-56");
        myPhoneBook.addData("Зырянов Лев", "13-67-89");
        myPhoneBook.addData("Лебедев Виктор", "78-98-56");

        myPhoneBook.printPb();

    }

}
