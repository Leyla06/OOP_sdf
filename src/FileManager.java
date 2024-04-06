import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
    private static FileManager instance;
    private FileWriter fileWriter;
    private FileManager()
    {
        try {
            fileWriter = new FileWriter("file.txt", true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static FileManager getInstance(){
        if (instance == null)
        {
            instance = new FileManager();
        }
        return instance;
    }
    public void saveToFile(Alici alici)
    {
        try {
            fileWriter.write("Istifadeci adi: " + alici.getUsername() + ", Sifre: " + alici.getPassword() + ", Tam ad: " + alici.getTamAd() + ", Nomre: " + alici.getNomre() + ", Aldigi kitab:" + alici.getAldigiKitab() + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void closeFile()
    {
        try {
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
