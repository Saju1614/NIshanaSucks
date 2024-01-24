
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class TicketMaster {


    //    Show s1 = new Show();
    static ArrayList<String> allShows = new ArrayList<String>();


    public TicketMaster(ArrayList<String> allShows) {
        TicketMaster.allShows = allShows;
    }


    public static ArrayList<String> AllShows() throws FileNotFoundException{
        File myFile = new File("H:\\M359AlvinSaju\\Unit 4 again\\src\\showData.txt");
        Scanner scan = new Scanner(myFile);




        for (int j = 0; j < 24; j++) {
            allShows.add(scan.nextLine()+"\n");
        }
        scan.close();
        return allShows;
    }


//    public static void main(String[] args) throws FileNotFoundException {
//        System.out.println(AllShows());
//        System.out.println(allShows);
//
//    }
}
