package classes;

public class Login {
    public void TryLogin(String usm, String pwd) {
        if(usm == "Admin123" && pwd == "admin123") {
            System.out.println("Login Success");
        } else {
            throw new ArithmeticException("Username or Password are wrong");
        }
    }
}
