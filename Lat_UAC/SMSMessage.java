package Lat_UAC;

public class SMSMessage extends Message{
    
    SMSMessage (ILogin login, String sender, String recipient, String content){
        super(login, sender, recipient, content);
    }

    public void send(String name, String pass){
        if (this.getLogin().verify(name, pass)){
            System.out.println("SMS " + outContent());
            return;
        }

        System.out.println("SMS authentication failed for user: " + name);
    }
}
