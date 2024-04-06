public class Alici extends User {
    private String aldigiKitab;

    public Alici(String tamAd, String nomre, String username, String password, int qiymet, String aldigiKitab) {
        this.aldigiKitab = aldigiKitab;
    }

    public String getAldigiKitab() {
        return aldigiKitab;
    }

    public void setAldigiKitab(){
        this.aldigiKitab = aldigiKitab;
    }
}
