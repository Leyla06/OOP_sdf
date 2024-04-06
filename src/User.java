import java.util.Scanner;

public class User {
    private String tamAd;
    private String nomre;
    private String username;
    private String password;
    private int qiymet;
    private String aldigiKitab;

    public User(String username, String password, String tamAd, String nomre, int qiymet, String aldigiKitab) {
        this.username = username;
        this.password = password;
        this.tamAd = tamAd;
        this.nomre = nomre;
        this.qiymet = qiymet;
        this.aldigiKitab = aldigiKitab;
    }

    public String getUsername()
    {
        return username;
    }
    public String getPassword()
    {
        return password;
    }
    public void setUsername()
    {
        this.username = username;
    }
    public void setPassword()
    {
        this.password = password;
    }
    public String getTamAd()
    {
        return tamAd;
    }
    public void setTamAd()
    {
        this.tamAd = tamAd;
    }
    public String getNomre()
    {
        return nomre;
    }
    public void setNomre()
    {
        this.nomre = nomre;
    }
    public int getQiymet()
    {
        return qiymet;
    }
    public void setQiymet()
    {
        this.qiymet = qiymet;
    }
    public String getAldigiKitab() {
        return aldigiKitab;
    }

    public void setAldigiKitab(){
        this.aldigiKitab = aldigiKitab;
    }
}
