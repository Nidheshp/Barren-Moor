import java.util.Scanner;

public class Main {

	protected static int[][] grid;
	private static int dimensions = 15;
	static Player player = new Player(1, 1);
	static Treasure treasure = new Treasure(12, 14);
	static Scanner inputFromUser = new Scanner(System.in);
	private static int Up = 8, Down = 2, Left = 4, Right = 6;

	public static void main(String[] args) {

		System.out.println("You're in a Swamp.");
		System.out.println("You see some treasure in the distance.");
		System.out.println("Find a way to get to the treasure!");

		startGame();

	}

	private static void startGame() {

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

		while (treasure.getTreasureX() != player.getPlayerX() || treasure.getTreasureY() != player.getPlayerY()) {

			inputFromUser(player);

			for (int i = 0; i < dimensions; i++) {
				for (int j = 0; j < dimensions; j++) {
					grid[i][j] = 0;
					grid[player.getPlayerX()][player.getPlayerY()] = 5;
					grid[treasure.getTreasureX()][treasure.getTreasureY()] = 1;
					System.out.print(" " + grid[i][j] + " ");

				}
				System.out.println();

			}

		}
		System.out.println("Congrats You've Won");
	}

	public static void inputFromUser(Player player) {

		int direction1 = inputFromUser.nextInt();

		switch (direction1) {
		case 8:
			player.PlayerX = player.PlayerX - 1;
			break;
		case 6:
			player.PlayerY = player.PlayerY + 1;
			break;
		case 2:
			player.PlayerX = player.PlayerX + 1;
			break;
		case 4:
			player.PlayerY = player.PlayerY - 1;
			break;

		}

	}

}
