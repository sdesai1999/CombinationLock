import java.util.Scanner;

/**
 * AP Computer Science Project Chapter 5
 * 
 * @author Saurav Desai 
 * @version 11/17/15
 */
public class CombinationLock
{
    private char aCombo;
    private char bCombo;
    private char cCombo;
    private boolean locked;
    
    /**
     * Constructor for objects of class CombinationLock
     * this constructor creates a new lock with a specific combination
     * the lock is automatically locked
     */
    public CombinationLock(char a, char b, char c)
    {
        aCombo = a;
        bCombo = b;
        cCombo = c;
        locked = true;
    }
    
    /**
     * method open
     * will open the lock if the entered combination is correct and let the user know by returning a string
     * if the combination is incorrect, a string will be returned to notify the user
     * if the lock is already open, it will let the user know by returning a string
     * 
     * @param  none
     * @return     String
     */
    public String open()
    {
        if (locked == true)
        {
            System.out.print("Please enter the first letter of the combination in upper case (i.e. \"A\" not \"a\"): ");
            Scanner scan1 = new Scanner(System.in);
            String a1 = scan1.nextLine();
            char a = a1.charAt(0);
        
            System.out.print("Please enter the second letter of the combination in upper case (i.e. \"A\" not \"a\"): ");
            String b1 = scan1.nextLine();
            char b = b1.charAt(0);
        
            System.out.print("Please enter the final letter of the combination in upper case (i.e. \"A\" not \"a\"): ");
            String c1 = scan1.nextLine();
            char c = c1.charAt(0);
            
            if (a == aCombo && b == bCombo && c == cCombo)
            {
                locked = false;
                return "The lock has successfully been unlocked.";
            }
            else
            {
                locked = true;
                return "You have entered a wrong combination.";
            }
        }
        else
        {
            locked = false;
            return "The lock has already been opened.";
        }
    }
    
    /**
     * method close
     * will close the lock and let the user know by returning a string
     * if the lock is already closed, it will let the user know by returning a string
     * 
     * @param  none
     * @return     String 
     */
    public String close()
    {
        if (locked == false)
        {
            locked = true;
            return "The lock has been closed.";
        }
        else
        {
            locked = true;
            return "The lock is already closed.";
        }
    }
    
    /**
     * method changeCombination
     * will change the combination of the lock, and the user will be notified if they did it 
     * will not let the user change the combination if the lock is closed
     * 
     * @param  none
     * @return     String
     */
    public String changeCombination()
    {
        if (locked == false)
        {
            System.out.print("Please enter the first letter of your new combination in upper case (i.e. \"A\" not \"a\"): ");
            Scanner scan1 = new Scanner(System.in);
            String a1 = scan1.nextLine();
            char a = a1.charAt(0);
        
            System.out.print("Please enter the second letter of your new combination in upper case (i.e. \"A\" not \"a\"): ");
            String b1 = scan1.nextLine();
            char b = b1.charAt(0);
        
            System.out.print("Please enter the final letter of your new combination in upper case (i.e. \"A\" not \"a\"): ");
            String c1 = scan1.nextLine();
            char c = c1.charAt(0);
        
            aCombo = a;
            bCombo = b;
            cCombo = c;
            
            return "The combination has been changed.";
        }
        else
        {
            return "The lock is closed, so you can't change the combination yet.";
        }
    }
}
