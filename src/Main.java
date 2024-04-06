import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserManager um = new UserManager();
        Scanner scanner = new Scanner(System.in);
        User user = new User("Leyla06", "1234567", "Leyla Xelilova", "2354655676", 7, "Harry Potter");
        System.out.println("Login\n");
        System.out.println("Register\n");
        System.out.println("Logout\n");
        System.out.print("Secin => ");
        String secim = scanner.nextLine();
        switch (secim){
            case "login": um.login(user); break;
            case "register": um.register(user); break;
            case "logout": um.logout(user); break;
        }
        FileManager.getInstance().saveToFile(user);
    }
}