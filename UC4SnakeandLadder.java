package Com.Bridgelab.SnakeLadder;
		/**
		 * Program to Repeat process till the Player reaches the winning position 100.
		 * 
		 * @author : TusharPatel
		 *
		 */
		public class UC4SnakeandLadder {
		public static int rollDice() {
		int dice = (int) (Math.random() * 10) % 6 + 1; 	 //In this method we are taking random no between 1 to 6 for rolling dice
		return dice;
		}	 
	    public static void playerOption() {
		int position = 0;
		while (position < 100) {
		int check = (int) (Math.random() * 10) % 3 + 1; //// Using ((RANDOM)) to check for Options.1 = ladder & 2 = snake & 0 = no play.
		System.out.println();
		System.out.println("Playing Option :" + check); // position moves below 0, then the player restarts from 0
				
		switch (check) {
		case 1:
		System.out.println("player is not playing ");
		System.out.println("player Reamain at position : " + position);
		break;
	
		case 2:
		int dice = rollDice();
		System.out.println("Dice Rolled... " + dice);
		position = position + dice;
		System.out.println("Its Ladder....");
		System.out.println("player is playing at position : " + position);
		break;
	
		default:
		int dice2 = rollDice();
		System.out.println("Dice Rolled.... " + dice2);
		position = position - dice2;
		System.out.println("its Snake");
		if (position < 1) {
		position = 0;
			}
		System.out.println("player position : " + position);
			}
			}
			}
		public static void main(String[] args) {
				System.out.println("Lets play...");
				playerOption();
			}
		}

