import java.io.*;
// Singleton
public class FileManager {
    private static FileManager instance;
    private FileWriter fileWriter;
    private FileReader fileReader;
    private BufferedReader bufferedReader;
    String file = "file.txt";
FileManager()
{
    try {
        fileWriter = new FileWriter(file, true);// file - e yazmaq ucun istifade olunur
        fileReader = new FileReader(file); // file -i oxumaq ucun istifade olunur
        bufferedReader = new BufferedReader(fileReader); //metn tipli file-i oxumaq ucun istifade olunur
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}
public static FileManager getInstance(){ // getInstance() Singleton design patterns-de isledilen metoddur
    if (instance == null)
    {
        instance = new FileManager();
    }
    return instance;
}
public void saveToFile(User user) //melumatlarin file-da saxlanimasi ucun method
{
    try {
        // melumatlari file-e yazir
        fileWriter.write("Istifadeci adi: " + user.getUsername() + ", Sifre: " + user.getPassword() + ", Tam ad: " + user.getTamAd() + ", Nomre: " + user.getNomre() + ", Aldigi kitab:" + user.getAldigiKitab() + "\n");
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}
public void data()
{
    String line;
    while (true){
        try {
            if (((line = bufferedReader.readLine()) != null)) break;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(line);
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
