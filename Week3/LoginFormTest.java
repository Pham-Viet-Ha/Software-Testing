import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LoginFormTest {
    public static String checkLogin(String username, String password) {
        int usernameLength = username.length();
        int passwordLength = password.length();

        if (usernameLength < 8 && passwordLength < 8) {
            return "Invalid";
        } else if (usernameLength < 8 && passwordLength >= 8 && passwordLength <= 20) {
            return "Invalid";
        } else if (usernameLength < 8 && passwordLength > 20) {
            return "Invalid";
        } else if (usernameLength >= 8 && usernameLength <= 20 && passwordLength < 8) {
            return "Invalid";
        } else if (usernameLength >= 8 && usernameLength <= 20 && passwordLength >= 8 && passwordLength <= 20) {
            return "Valid";
        } else if (usernameLength >= 8 && usernameLength <= 20 && passwordLength > 20) {
            return "Invalid";
        } else if (usernameLength > 20 && passwordLength < 8) {
            return "Invalid";
        } else if (usernameLength > 20 && passwordLength >= 8 && passwordLength <= 20) {
            return "Invalid";
        } else {
            return "Invalid";
        }
    }

    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("input.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(" ");
                String username = data[0];
                String password = data[1];
                String result = checkLogin(username, password);
                System.out.println("Username: " + username + " - Password: " + password + "\n - Result: " + result);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error: " + e);
        }
    }
}