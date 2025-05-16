package ru.sechko.homework.myexception;


import java.util.regex.Pattern;

public class Main {
    static String regLogin = "^[a-zA-Z0-9_]{1,19}$";
    static String regPassword = "^[a-zA-Z0-9_]{1,19}$";

    public static void main(String[] args) {

        isCorrectData("user", "123", "123");

    }

    public static boolean isCorrectData (String login, String password, String confirmPassword) {
        try{
            checkLogin(login);
            checkPassword(password, confirmPassword);
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.err.println("Ошибка при вводе данных: " + e.getMessage());
            return false;
        }
    }

    public static void checkLogin(String login) {
        if (login == null || !Pattern.matches(regLogin, login)) {
            throw new WrongLoginException("Недопустимое значение логина. " +
                    "Валидные символы: цифры и буквы латинского алфавита. " +
                    "Максимальная длина 20 символов.");
        }
    }

    public static void checkPassword(String password,  String confirmPassword) {
        if (password ==  null || !Pattern.matches(regPassword, password)) {
            throw new WrongPasswordException("Недопустимое значение пароля. " +
                    "Валидные символы: цифры и буквы латинского алфавита. " +
                    "Максимальная длина 20 символов.");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
    }
}
