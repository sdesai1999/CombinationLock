import java.util.*;

/**
 * AP Computer Science Project Chapter 5
 * 
 * @author Saurav Desai
 * @version 11/17/15
 */
public class LockDriver
{
    public static void main(String[] args)
    {
        System.out.println("\f");
        
        String open = "Open";
        String close = "Close";
        String changeCombo = "Change Combo";
        String changeCombi = "Change Combination";
        String quit = "Quit";
        
        CombinationLock lock = new CombinationLock('S','A','U');
        
        System.out.println("A lock has been created. You can:");
        System.out.println("\t •  Open the lock by typing \"Open\"");
        System.out.println("\t •  Close the lock by typing \"Close\"");
        System.out.println("\t •  Change the combo by typing \"Change Combination\" or \"Change Combo\"");
        System.out.println("\t •  Quit the program by typing \"Quit\"");
        System.out.println();
        System.out.print("What would you like to do?: ");
         
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        
        while (input.equals(quit) == false)
        {
            if (input.equals(open))
            {
                System.out.println(lock.open());
                System.out.println();
            }
            else if (input.equals(close))
            {
                System.out.println(lock.close());
                System.out.println();
            }
            else if (input.equals(changeCombo) || input.equals(changeCombi))
            {
                System.out.println(lock.changeCombination());
                System.out.println();
            }
            else if (input.equals(quit))
            {
                System.exit(0);
            }
            else
            {
                System.out.println("Invalid command. Please try one of the valid commands listed above.");
                System.out.println();
            }
            
            System.out.print("What would you like to do?: ");
            Scanner scan1 = new Scanner(System.in);
            input = scan1.nextLine();
        }
   }
}
