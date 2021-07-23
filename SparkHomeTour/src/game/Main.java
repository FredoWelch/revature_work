package game;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
	   System.out.println("Welcome to my home tour there wont be much to see, so keep expectations low, IM POOR. \n To navigate thru the home just simple use commands such a go, move, and walk followed by the direction you wish to travel.\n");
       RoomManager rm = new RoomManager();
       rm.walk();
       Player player = new Player(rm.startingRoom);
       while (true) {
           printRoom(player);
           parse(collectInput(), player);
       }
   
   }

   public static void printRoom(Player player) {
       System.out.println(player.getCurrentRoom().toString());
   }

   public static String[] collectInput() {
       Scanner in = new Scanner(System.in);
       String input = in.nextLine().toLowerCase();
      String[]words = input.split(" ");
      return words;

       
   }

   public static void parse(String[] input, Player player) {
       switch (input[0]) {
       case "go", "Go", "move", "Move","GO", "walk", "WALK", "Walk", "MOVE":
           player.setCurrentRoom(player.getCurrentRoom().getExit(input[1]));
           break;
       case "Leave", "leave", "LEAVE", "exit","EXIT", "Exit":
    	   System.out.println("Thank you for visiting");
    	   break;

       default:
           break;
       }
   }
}