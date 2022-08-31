import java.util.ArrayList;
import java.util.Scanner;

public class Project 
{
    Scanner input = new Scanner(System.in);

    public ArrayList<User> entire = new ArrayList<User>();

    private String state[] = {"Em propcessor de criação", "Iniciado", "Em andamento", "Concluído"};

    private String name;
    private String describe;
    private String startDate;
    private String endDate;
    private String status = state[0];

    public String show()
    {
        return "name: "+this.name+"\ndescribe: "+this.describe+"\nrole: "+this.status+"\n";
    }


    
}
