import java.util.Scanner;


public class Application  {
    private Scanner scn = new Scanner(System.in);
    private String com = "";
    private String[] sqlcom ;
    private db mydb = new db();

    public static void main(String[] args) {
        Application myapp = new Application();
        System.out.print("App was started. Enter '--stop' to exit.\n");
        System.out.print("Enter name and message or --all...\n\n");
        myapp.mainLoop();
    }

    private void  mainLoop(){
        com = scn.nextLine();
        if (com.equals("--stop") ) {
            System.out.println("App was stopped\n");
            System.exit(0);

        }else if (com.equals("--all")){
            mydb.print();
            mainLoop();
        }else{
            try {
                sqlcom = com.split(" ");
                mydb.add(sqlcom[0] , sqlcom[1]);
                System.out.printf("Enter name and message or --all...\n\n");
            } finally {
                mainLoop();
            }
        }
    }
}
