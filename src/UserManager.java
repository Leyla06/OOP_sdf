import java.util.Scanner;

public class UserManager implements UserService{
    Scanner scanner = new Scanner(System.in);
    User user = new User();

    @Override
    public void register() {
        System.out.println("Adinizi,soyadinizi daxil edin:");
        String tamAd = scanner.nextLine();
        System.out.println("Istifadeci adini daxil edin:");
        String username = scanner.nextLine();
        System.out.println("Nomrenizi daxil edin:");
        String nomre = scanner.nextLine();
        System.out.println("Sifreni daxil edin:");
        String password = scanner.nextLine();
        System.out.println("Istifadeci sisteme daxil oldu.");
    }

    @Override
    public void login() {
        System.out.println("Istifadeci adini daxil edin:");
        String username = scanner.nextLine();
        System.out.println("Sifreni daxil edin:");
        String password = scanner.nextLine();
        if (username.equals(user.getUsername()) && password.equals(user.getPassword()))
        {
            System.out.println("Sisteme daxil olundu.");
        }
        else
        {
            System.out.println("Melumatlar tapilmadi.");
        }
    }

    @Override
    public void logout() {
        System.out.println("Sistemden cixildi.");
    }
}
