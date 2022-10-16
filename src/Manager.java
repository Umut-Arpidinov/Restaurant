import java.util.Objects;
import java.util.Scanner;
public class Manager {
    String managerName;
    String managerPassword;
    Scanner scanner;
    public  Manager(){
        managerName = "Maks";
        managerPassword = "1111";
        scanner = new Scanner(System.in);
    }
    public void welcome(){
        System.out.println("Welcome Manager!");
        System.out.println("");
        if (managerName == null || managerPassword == null){
            System.out.println("Sorry! No one is registered as a manager");
        }else {
            logInasmanager();
        }
        System.out.println("Press m to return to main menu");
        System.out.println("Press e to exit the project");
        String checkCommand = scanner.nextLine();
        if(checkCommand.equals("m")){
            return;
        }else{
            return;
        }
    }
    private void logInasmanager() {
        System.out.println("Insert your name and password");
        System.out.print("Name -- ");
        String checkName = scanner.nextLine();
        System.out.print("Password -- ");
        String checkPassword = scanner.nextLine();
        if (!checkPassword.equals(this.managerPassword) && !checkName.equals(this.managerName)) {
            System.out.println("Incorrect password or name");
            logInasmanager();
        } else {
            System.out.println("You logged in as Manager!");
        }
    }
}
