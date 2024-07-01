/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe.pkgfinal.pkg_.tshabalala;

/**
 *
 * @author RC_Student_lab
 */
public class LoginFinal {
    private String username;
    private String name;
    private String surname;
    private String password;

    // check if username meets formatting requirements
    public boolean checkUsername(String username) {
        this.username = username;
        return username.length() <= 55 && username.contains("_");
    }

    // check if password meets complexity requirements
    public boolean checkPasswordComplexity(String password) {
        int uppercase = 0, digit = 0, specialC = 0;
        if (password.length() >= 8) {
            for (char c : password.toCharArray()) {
                if (Character.isUpperCase(c)) uppercase++;
                else if (Character.isDigit(c)) digit++;
                else if (!Character.isLetterOrDigit(c)) specialC++;
            }
            return uppercase > 0 && digit > 0 && specialC > 0;
        }
        return false;
    }

    // Method to register a user
    public String registerUser(String username, String password, String firstName, String lastName) {
        this.name = firstName;
        this.surname = lastName;
        String correctUsername = checkUsername(username) ? "Username successfully captured" : "Username is not correctly formatted";
        String correctPassword = checkPasswordComplexity(password) ? "Password successfully captured" : "Password is not correctly formatted";

        if (checkUsername(username) && checkPasswordComplexity(password)) {
            this.username = username;
            this.password = password;
            return correctUsername + "\n" + correctPassword + "\nUsername and password entered successfully\nRegistration successful";
        }
        return correctUsername + "\n" + correctPassword + "\nRegistration unsuccessful";
    }

    // Method to check if login details match
    public boolean loginUser(String uName, String pWord) {
        return username != null && username.equals(uName) && password != null && password.equals(pWord);
    }

    public String returnLoginStatus(String username, String password) {
        return loginUser(username, password) ? "Login successful" : "Login unsuccessful";
    }
}


