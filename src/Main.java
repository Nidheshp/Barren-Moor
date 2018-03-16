import java.util.Scanner;

public class Main {

	protected static int[][] grid;
	private static int dimensions = 20;
	static Player player = new Player (1, 1);
	static Treasure treasure = new Treasure (18, 18);
	static Scanner inputFromUser = new Scanner(System.in);
	private static int Up = 8, Down = 2, Left = 4, Right = 6;
	
	public static void main(String[] args) {
			
		System.out.println("You're in a Swamp.");
		System.out.println("You see some treasure in the distance.");
		System.out.println("Find a way to get to the treasure!");
		
		grid = new int[dimensions][dimensions];
		for (int i = 0; i < dimensions; i++) {
			for (int j = 0; j < dimensions; j++) {
				grid[i][j] = 0;
				grid[player.getPlayerX()][player.getPlayerX()] = 5;
				grid[treasure.getTreasureX()][treasure.getTreasureY()] = 1;
				System.out.print(" " + grid[i][j] + " ");
							
				
			}
			System.out.println();
		}
		while (treasure.getTreasureX() != player.getPlayerX() || treasure.getTreasureY() != player.getPlayerY())} 
		
			public static void inputFromUser(int direction, int player) {
			
			grid[player][player] = 0;
			int direction1;
			 direction = inputFromUser.nextInt();
			switch (direction) {
			case 8:
				PlayerX = PlayerX - 1;
				break;
			case 6:
				PlayerY = PlayerY + 1;
				break;
			case 2:
				PlayerX = PlayerX + 1;
				break;
			case 4:
				PlayerY = PlayerY - 1;
				break;
		}
		
		
		}
}
		
	

