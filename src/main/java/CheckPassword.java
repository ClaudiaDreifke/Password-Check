import java.util.Scanner;

public class CheckPassword {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie ein Passwort ein:");
        String password = sc.nextLine();

        if (checkLength(password) == false) {
            System.out.println(" Bitte nutzen Sie mindestens 8 Zeichen für Ihr Passwort!");
        } else if (checkDigits(password) == false) {
            System.out.println(" Bitte nutzen Sie Ziffern für Ihr Passwort!");
        } else if (checkUpperLowerCase(password) == false) {
            System.out.println(" Bitte nutzen Sie Groß- und Kleinschreibung für Ihr Passwort!");
        } else if (checkNoUnsecureWords(password) == false) {
            System.out.println(" Bitte nutzen Sie keine unsicheren Wörter für Ihr Passwort!");
        } else
            System.out.println("Ihr Passwort ist super!");

    }

    public static boolean checkLength(String password) {
        int minimumLength = 8;
        return password.length() >= minimumLength;
    }

    public static boolean checkDigits(String password) {
        boolean check = false;
        int stop = (password.length() - 1);
        for (int i = 0; i < stop; i++) {
            char[] PasswordArray = password.toCharArray();
            if (Character.isDigit(PasswordArray[i])) {
                check = true;
                break;
            }
        }
        return check;
    }

    public static boolean checkUpperLowerCase(String password) {
        boolean checkUpperCase = false;
        boolean checkLowerCase = false;
        int stop = (password.length());
        for (int i = 0; i < stop; i++) {
            char[] PasswordArray = password.toCharArray();
            if (Character.isUpperCase(PasswordArray[i])) {
                checkUpperCase = true;
            } else checkLowerCase = true;
        }
        return checkUpperCase && checkLowerCase;
    }

    public static boolean checkNoUnsecureWords(String password) {
        boolean check = true;
        String[] UnsecureWords = {"Hallo", "Passwort", "Password", "123", "abc", "qwertz", "qwerty"};
        int stop = (UnsecureWords.length);
        for (int i = 0; i < stop; i++) {
            if (password.equalsIgnoreCase(UnsecureWords[i])) {
                check = false;
            }
        }
        return check;
    }
}
