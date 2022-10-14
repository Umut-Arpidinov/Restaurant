import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Weclome to our restaurant!\nPress s to start");
        String start = scan.nextLine();
        if(start.equals("s")){
            System.out.println("Who are you ?");
            System.out.println("Admin -- Manager -- Client");
            String role = scan.nextLine();
            if(role.equals("Admin")){
                Admin admin = new Admin();
                admin.welcome();

            }
        }


    }
}