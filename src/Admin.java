import java.util.Scanner;

public class Admin {
    String adminName;
    String adminPassword;
    Scanner scanner;
    public  Admin(){
        adminName = "Umut";
        adminPassword = "a0000";
        scanner = new Scanner(System.in);
    }


    public void welcome(){
        System.out.println("Welcome admin!");
        System.out.println("");
        logIn();
    }
    private void logIn(){
        System.out.println("Insert your name and password");
        System.out.print("Name --");
        String checkName = scanner.nextLine();
        System.out.print("Password --");
        String checkPassword = scanner.nextLine();
        if(!checkPassword.equals(this.adminPassword) && !checkName.equals(this.adminName)){
            System.out.println("Incorrect password or name");
            logIn();
        }
        else{
            System.out.println("You logged in as admin!");
        }
    }


}
