import java.util.Scanner;
//UserService interfeysinden UserManager-e butun methodlari implements edilir:
public class UserManager implements UserService{
    //daxil edilen melumatlari oxumaq ucun istifade olunur:
    Scanner scanner = new Scanner(System.in);
    //User adli classin obyekti yaradilir, new yeni bir obyekt yaratmaq ucun istifade olunur, User() ise 'User' classinin konstruktorunu cagirir.
    User user = new User(null, null, null, null, 0, null);
    // bir classin metodunu diger classlarda tekrar tanitmaq ucundur:
    @Override
    public void register(User user) { //Qeydiyyat ucun method
        System.out.println("Adinizi,soyadinizi daxil edin:");
        String tamAd = scanner.nextLine();
        System.out.println("Istifadeci adini daxil edin:");
        String username = scanner.nextLine();
        System.out.println("Nomrenizi daxil edin:");
        String nomre = scanner.nextLine();
        System.out.println("Sifreni daxil edin:");
        String password = scanner.nextLine();
        user = new User(username, password, tamAd, nomre, 0, null);
        System.out.println("Istifadeci sisteme daxil oldu.");
    }

    @Override
    public void login(User user) { // daxil olmaq ucun method
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
    public void logout(User user) { // Cixis ucun method
        System.out.println("Sistemden cixildi.");
    }
}
