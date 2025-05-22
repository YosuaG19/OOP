package Lat_UAC;

public abstract class Message {
    private ILogin login;
    private String sender, recipient, content;

    Message (ILogin login, String sender, String recipient, String content){
        this.login = login;
        this.sender = sender;
        this.recipient = recipient;
        this.content = content;
    }

    public ILogin getLogin() {
        return login;
    }

    public abstract void send(String name, String pass);

    public String outContent(){
        return "send from " + sender + " to " + recipient + ": " + content;
    }
}
