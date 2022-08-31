import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        ArrayList<User> profile = new ArrayList<User>();
        ArrayList<Project> project = new ArrayList<Project>();
        ArrayList<Activity> activities = new ArrayList<Activity>();
        Login login = new Login();
        Search search = new Search();

        String menu = "[1] - Creat user\n"+
                      "[2] - Login\n"+
                      "[3] - Recover Password\n"+
                      "[4] - consulta\n"+
                      "[5] - exit\n";

       int choise, index, consulta;
       String aux;
       Boolean activ = true;
       Scanner input = new Scanner(System.in);

        while(activ)
        {
            System.out.println(menu);
            choise = input.nextInt();

            switch(choise)
            {
                case 1 :    
                    User newUser = new User();
                    profile.add(newUser);
                    break;
                case 2 :
                    index = login.checkLogin(profile);

                    if(index > -1)
                    {
                        login.menu(index, profile);
                    }

                    break;
                case 3:
                    String cpf;
                    System.out.printf("\ncpf: ");
                    input.next();
                    cpf = input.nextLine();
                    input.next();
                    index = search.search(profile, cpf);
                    if(index > -1)
                    {
                        System.out.printf("\nWhats is the new password.\n=>");
                        String pass = input.nextLine();
                        profile.get(index).setPassword(pass);
                    }

                    break;
                case 4:
                    System.out.printf("\nConsultar: [1] - Usuario\n[2] - Projeto\n[3] - Atividade\n=>");
                    consulta = input.nextInt();

                    switch(consulta)
                    {
                        case 1:
                            if(profile.isEmpty())
                            {
                                System.out.println("Does not have any user still.");
                                break;
                            }

                            for(User i: profile)
                            {
                                System.out.println(i.show());
                            }
                            break;
                        case 2:
                            if(project.isEmpty())
                            {
                                System.out.println("Does not have any project still.");
                                break;
                            }

                            for(Project i: project)
                            {
                                System.out.println(i.show());
                            }
                            break;
                        case 3:
                            if(activities.isEmpty())
                            {
                                System.out.println("Does not have any activity still.");
                                break;
                            }
                            for(Activity i: activities)
                            {
                                System.out.println(i.show());
                                break;
                            }
                    }
                    break;
                case 5:
                    activ = false;
                    break;
            }

        }
    }
}