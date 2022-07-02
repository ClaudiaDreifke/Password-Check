import java.util.Scanner;

public class CheckPassword {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie ein Passwort ein:");
        String Password = sc.nextLine();

        if (checkLength(Password) == false) {
            System.out.println(" Bitte nutzen Sie mindestens 8 Zeichen für Ihr Passwort!");
        } else if (checkDigits(Password) == false) {
            System.out.println(" Bitte nutzen Sie Ziffern für Ihr Passwort!");
        } else if (checkUpperLowerCase(Password) == false) {
            System.out.println(" Bitte nutzen Sie Groß- und Kleinschreibung für Ihr Passwort!");
        } else if (checkNoUnsecureWords(Password) == false) {
            System.out.println(" Bitte nutzen Sie keine unsicheren Wörter für Ihr Passwort!");
        } else
            System.out.println("Ihr Passwort ist super!");

    }

    public static boolean checkLength(String Password) {
        int minimumLength = 8;
        return Password.length() >= minimumLength;
    }

    public static boolean checkDigits(String Password) {
        boolean check = false;
        int stop = (Password.length() - 1);
        for (int i = 0; i < stop; i++) {
            char[] PasswordArray = Password.toCharArray();
            if (Character.isDigit(PasswordArray[i])) {
                check = true;
                break;
            } else check = false;
        }
        return check;
    }

    public static boolean checkUpperLowerCase(String Password) {
        boolean checkUpperCase = false;
        boolean checkLowerCase = false;
        int stop = (Password.length());
        for (int i = 0; i < stop; i++) {
            char[] PasswordArray = Password.toCharArray();
            if (Character.isUpperCase(PasswordArray[i])) {
                checkUpperCase = true;
            } else checkLowerCase = true;
        }
        return checkUpperCase && checkLowerCase;
    }

    public static boolean checkNoUnsecureWords(String Password) {
        boolean check = true;
        String[] UnsecureWords = {"Hallo", "Passwort", "Password", "123", "abc", "qwertz", "qwerty"};
        int stop = (UnsecureWords.length);
        for (int i = 0; i < stop; i++) {
            if (Password.equalsIgnoreCase(UnsecureWords[i])) {
                check = false;
            }
        }
        return check;
    }
}
