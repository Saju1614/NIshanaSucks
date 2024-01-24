import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class TicketMasterDriver {
    public static void main(String[] args) throws FileNotFoundException {
        Show print = new Show();
        // TicketMaster.AllShows();
        System.out.println(print);


        Scanner scan = new Scanner(System.in);
        int Human;
        boolean continueScan = true;
        while (continueScan) {
            System.out.println("1.Search");
            System.out.println("2.Option A-Z");
            System.out.println("3.Option Z-A");
            System.out.println("4.Lowest to Highest");
            System.out.println("5.Highest to Lowest");
            System.out.println("6.Quit");
            System.out.println("Please write a number from 1-6");
            try {
                Human = scan.nextInt();
                // continueScan = false;


//                System.out.println("Human-->"+Human);
                if (Human < 1 || Human > 6) {
                    System.out.println("Please write a number from 1-6");
                    // continueScan = true;
                } else {
                    continueScan = false;
                }
                if (Human == 1) {
                    scan.nextLine();
                    System.out.println("What do you want to search?");
                    String serch1 = scan.nextLine();
                    ArrayList<String> specificShows = new ArrayList<String>();
                    ArrayList<String> allShows = TicketMaster.AllShows();
                    // System.out.println("allShows size:"+allShows.size());
                    for (int i = 0; i < allShows.size(); i++) {
                        serch1 = serch1.toLowerCase();
                        String place = allShows.get(i).toLowerCase();
                        if (place.contains(serch1)) {
                            //System.out.println("Adding "+i+": "+allShows.get(i));
                            specificShows.add(allShows.get(i));
                        }
                    }
                    System.out.println("specificShows:"+specificShows);
                    if(specificShows.size()==0){
                        System.out.println("Please write another one");
                        scan.nextLine();
                    }
                    continueScan = true;
                }
                if (Human == 6) {
                    scan.close();
                }


            }
            catch (Exception e) {
                System.out.println("Error: "+e.toString());
                System.out.println("Please write a number from 1-6");
                scan.nextLine();
                continueScan = true;
            }


        }
    }
}