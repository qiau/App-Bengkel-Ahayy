package interfaces;

public interface Authenticable {
    public boolean login(String username, String passsword);
    public boolean register(String name, String address, String phoneNumber, 
            String username,String password);
}
