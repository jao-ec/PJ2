import java.util.ArrayList;
import java.util.Scanner;

public class Login {

    public Scanner input = new Scanner(System.in);
    public Search searcher = new Search();

    public int checkLogin(ArrayList<User> accounts)
    {
        String cpf, password;
        Boolean check = false;
        int index = 0;

        if(accounts.isEmpty())
        {
            System.out.printf("\nNo registers.\n");
            input.nextLine();
            return -1;
        }

        System.out.printf("\nCpf:\n=>");
        cpf = input.nextLine();
        System.out.printf("Password:\n=>");
        password = input.nextLine();

        for(int i=0; i<accounts.size(); i++)
        {
            if(cpf.intern()     == (accounts.get(i).getCpf()).intern() && 
               password.intern() == (accounts.get(i).getPassword()).intern()) 
               {
                    index = i;
                    check = true;
                    break;
               }
        }

        if(!check)
        {
            System.out.println("\nCpf or Password is incorrect.");
            input.nextLine();
            return -1;
        }
        else return index;
    }

    public void menu(int index, ArrayList<User> profile){
        User current = profile.get(index);
        
    }
    
}
