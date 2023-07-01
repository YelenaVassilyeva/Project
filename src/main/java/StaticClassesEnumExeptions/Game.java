package StaticClassesEnumExeptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Game {
    //Create Class "Game" with static method and enum
    //The enum "GameType" will list three types of games: soccer, hockey, and rugby.
    //The method
    //public static void writeNumOfPlayersPerTeam(GameType game){}
    //will check the type and create a new file with the name of the game as the name of the file
    //In the file, it will print 11 in the case of Soccer, 6 if it is Hockey, and 15 for Rugby.
    //Please use a switch case.

    public void createFile(String name) {
        File file = new File(String.valueOf(name));


        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeToFile(String name, int number) {

        try {
            FileWriter fileWriter = new FileWriter(name);
            fileWriter.write("the number of players in " + name+ " is  " + number);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error. cannot write... ");
            e.printStackTrace();
        }
    }
    public void readFromFile(String name) {
        File file = new File(name);
        try {
            Scanner scanner = new Scanner(file);
//            while(scanner.hasNextLine()){
//                String row = scanner.nextLine();
//                System.out.println(row);
//            }
            //another way to do it

            for (int i = 0; scanner.hasNextLine(); i++) {
                String row = scanner.nextLine();
                System.out.println(i);
                System.out.println(row);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

        enum Name{
            SOCCER,
            RUGBY,
            HOCKEY,
        }
        public static void writeNumOfPlayersPerTeam(Name name) {
            switch (name) {
                case RUGBY: {
                    Game game = new Game();
                    game.createFile("rugby");
                    game.writeToFile("rugby", 15);
                    game.readFromFile("rugby");

                    break;
                }
                case HOCKEY: {
                    Game game = new Game();
                    game.createFile("Hockey");
                    game.writeToFile("Hockey", 6);
                    game.readFromFile("Hockey");
                    break;

                }
                case SOCCER: {
                    Game game = new Game();
                    game.createFile("soccer");
                    game.writeToFile("soccer", 11);
                    game.readFromFile("soccer");
                    break;
                }
            }
        }




    }






