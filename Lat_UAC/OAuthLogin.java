package Lat_UAC;

public class OAuthLogin implements ILogin {
    private String token;

    OAuthLogin (String token){
        this.token = token;
    }

    public boolean verify (String name, String pass){
        if (pass.equals(this.token)) return true;
        return false;
    }
}
