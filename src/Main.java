import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserManager um = new UserManager();
        Scanner scanner = new Scanner(System.in);
        Alici alici = new Alici("Leyla Xelilova", "05656565", "leyla06", "9989897", 6, "Harry Potter");
        System.out.println("Login\n");
        System.out.println("Register\n");
        System.out.println("Logout\n");
        System.out.println("Secin => ");
        String secim = scanner.nextLine();
        switch (secim){
            case "login": um.login(); break;
            case "register": um.register(); break;
            case "logout": um.logout(); break;
        }
        FileManager.getInstance().saveToFile(alici);
    }
}