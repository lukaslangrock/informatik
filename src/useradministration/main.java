package useradministration;

import lib.TIO;

public class main {
    public static void main(String[] args) {
        TIO.prt("Welcome the User Database Management System.");
        Usermanager manager = new Usermanager();

        boolean repeat = true;
        do {
            TIO.prt("The following operations are avilable:");
            TIO.prt("1: Create user");
            TIO.prt("2: Delete user");
            TIO.prt("3: Search for user");
            TIO.prt("4: Exit");
            switch (TIO.AskInt("Select an option (1/2/3):")) {
                case 1:
                    manager.newUser(TIO.AskString("Enter Username:"), TIO.AskString("Enter Password:"));
                    break;
                
                case 2:
                    manager.delUser(TIO.AskString("Enter Username:"), TIO.AskString("Enter Password:"));
                    break;
                
                case 3:
                    if (manager.checkUser(TIO.AskString("Enter Username:"))) {
                        TIO.prt("User found!");
                    } else {
                        TIO.prt("User was not found!");
                    }
                    break;
                
                case 4:
                    TIO.prt("Notice: This database is ephemeral and all data is gone!");
                    TIO.prt("Goodybe!");
                    repeat = false;
                    break;
                    
                default:
                    TIO.prt("Error: This operations is not avilable!");
                    break;
            }
        } while (repeat);
        
        TIO.prt("Exiting User Database Management System...");
    }
}