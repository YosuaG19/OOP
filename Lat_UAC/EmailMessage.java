package Lat_UAC;

public class EmailMessage extends Message{
    EmailMessage (ILogin login, String sender, String recipient, String content){
        super(login, sender, recipient, content);
    }

    public void send(String name, String pass){
        if (this.getLogin().verify(name, pass)){
            System.out.println("Email " + outContent());
            return;
        }

        System.out.println("Email authentication failed for user: " + name);
    }
}
