import java.util.ArrayList;
import java.util.Scanner;
import java.time.format.DateTimeFormatter; 

public class Activity {
    Scanner input = new Scanner(System.in);

    public ArrayList<User> entire = new ArrayList<User>();

    private String name;
    private String description;
    private String startDate;
    private String endDate;
    private String admin;

    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public String show()
    {
        return "name: "+this.name+"\ndescription: "+this.description+"\nadmin: "+this.admin+"\n";
    }

    public String getName()
    {
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public String getStartDate()
    {
        return this.startDate.toString();
    }

    public String getEndtDate()
    {
        return this.endDate.toString();
    }

    public String getAdmin()
    {
        return this.admin;
    }

    public void setName()
    {
        System.out.printf("\nwhat is the activity' name?=>");
        this.name = input.nextLine();
    }

    public void setDescription()
    {
        System.out.printf("\nwhat is the activity' describe?=>");
        this.description = input.nextLine();
    }

    public void setStartDate()
    {
        System.out.printf("what is the activity' start?=>");
        this.startDate = input.nextLine();
    }

    public void setEndtDate()
    {
        System.out.printf("what is the activity' end?=>");
        this.endDate = input.nextLine();
    }

    public void setAdmin()
    {
        System.out.println("\nwhat is the admin' CPF.\n=>");
        this.admin = input.nextLine();
    }
}
