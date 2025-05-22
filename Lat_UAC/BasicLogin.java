package Lat_UAC;

public class BasicLogin implements ILogin{
    private String name, pass;

    BasicLogin (String name, String pass){
        this.name = name;
        this.pass = pass;
    }

    public boolean verify (String name, String pass){
        if (name.equals(this.name) && pass.equals(this.pass)) return true;
        return false;
    }
}