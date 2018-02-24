import java.util.Scanner;

public class Application {
    private Scanner scn = new Scanner(System.in);
    private boolean isRunning = true;
    private String com = "";

    public static void main(String[] args) {
        Application myapp = new Application();
        myapp.mainLoop();
    }

    private void  mainLoop(){

        while (isRunning) {

            scn = new Scanner(System.in);

            System.out.print("Enter command: ");
            com = scn.next();
            checkCommand();

        }
        scn.close();
        System.out.println("bye");
    }

    private void checkCommand() {
        switch (com.toLowerCase()) {

            case "exit":
                app.isRunning = false;
                break;

            case "about":
                System.out.println("*********************************************");
                System.out.println("     Делайте ставки, теряйте деньги          ");
                System.out.println("Сделал vik24rus в 2016 году в учебных целях  ");
                System.out.println("*********************************************");
                System.out.println("___________________________________________________________\n" +
                        "___________________________________________________________\n" +
                        "_______________________________________________AIgg________\n" +
                        "__________________________________________gggggggggg_______\n" +
                        "_______________________________________gggggggggggggg______\n" +
                        "____________________________________ggggggggggggggggggg____\n" +
                        "__________ggg____ggggggg__________gggggggggggg_____ggggg___\n" +
                        "_______ggggggggggggggggggggggggggggggggggggggg_____________\n" +
                        "______gggggg__ggggggggggggggggggggggggggggggg______________\n" +
                        "_____gggggg___gggggggggggggggggggggggggggggg_______________\n" +
                        "_____ggggg____ggggggggggggggggggggggggggggg________________\n" +
                        "_____gggg_____Xgggggggggggggggggggggggggggg________________\n" +
                        "____gg_________ggggggggggggggggggggggggggg_________________\n" +
                        "_______________gggggggg_gggggggggggggggggg_________________\n" +
                        "___________gggggggggggg_____________ggggggX________________\n" +
                        "__________hggg____gggg________________ggggg________________\n" +
                        "__________ggR_____ggg___________________gggg_______________\n" +
                        "__________gg_____gggg___________ggg__ggggggggg_____________\n" +
                        "_________ggg______ggg____________gggggg____ggg_____________\n" +
                        "_______gggg_________ggE______________________gg____________\n" +
                        "_______gg____________ggg______________________gg___________\n" +
                        "______________________gggT_____________________ggg_________\n" +
                        "_______________________gggg_____________________ggg________\n" +
                        "___________________________________________________________\n" +
                        "___________________________________________________________\n" +
                        "___________________________________________________________ ");
                break;

            case "help":
                System.out.println("go");
                System.out.println("money");
                System.out.println("bankmoney"); // букмекерские деньги
                System.out.println("history"); //история забегов и потери/получения денег
                System.out.println("help");
                System.out.println("about");
                System.out.println("exit");


                break;
            case "bankmoney":

                System.out.println("Денег у букмекера: " + bookmaker.BookmakerMoney());

                break;

            case "go":

                bookmaker.checkMoney();
                go();

                break;

            case "money":
                System.out.println("Баланс: " + player.viewMoney());
                break;

            case "history":
                bookmaker.seeHistory();
                break;

            default:
                System.out.println("ERROR - Unknown command!");
                break;
        }
    }
}
