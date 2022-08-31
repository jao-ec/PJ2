import java.util.ArrayList;

public class Search {

    public int search(ArrayList<User> accounts, String cpf)
    {
        for(int i=0; i<accounts.size(); i++)
        {
            if(cpf == (accounts.get(i).getCpf()).intern())
            {
                return i;
            }
        }
        return -1;
    }
}