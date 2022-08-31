import java.util.ArrayList;
import java.util.Scanner;

public class User 
{
    ArrayList<Activity> Todo = new ArrayList<Activity>();
    ArrayList<Project> projetos = new ArrayList<Project>();

    Scanner input = new Scanner(System.in);

    private String name;
    private String role;
    private String scholarship;
    private String cpf;
    private String password;
    Boolean coordenador = false;

    public User()
    {
        this.setName();
        this.setRole();
        this.setCpf();
        this.setPassword();

        coordenador = (this.role.intern().toLowerCase() == "pesquisador" || this.role.intern().toLowerCase() == "professor") ? true : false;
    }


    public String getName()
    {
        return this.name;
    }

    public String getRole()
    {
        return this.role;
    }

    public String getScholarship()
    {
        return this.scholarship;
    }

    public String getCpf()
    {
        return this.cpf;
    }

    public String getPassword()
    {
        return this.password;
    }

    public Boolean getCoordenador()
    {
        return this.coordenador;
    }

    private void setName()
    {
        System.out.printf("Hello, what is your name?\n=>");
        this.name = input.nextLine();
    }

    private void setRole()
    {
        System.out.printf("Hello, what is your Role?\n=>");
        this.role = input.nextLine();
    }

    private void setScholarship()
    {
        System.out.printf("Hello, what is the scholarship value.\n=>");
        this.scholarship = input.nextLine();
    }

    private void setCpf()
    {
        System.out.printf("Hello, what is your CPF.\n=>");
        this.cpf = input.nextLine();
    }

    private void setPassword()
    {
        System.out.printf("Hello, what is your Password.\n=>");
        this.password = input.nextLine();
    }

    public void setPassword(String pass)
    {
        this.password = pass;
    }

    public String show()
    {
        return "name: "+this.name+"\ncpf: "+this.cpf+"\nrole: "+this.role+"\n";
    }

    
}
