package Com.Bridgelab.SnakeLadder;

		// TODO Auto-generated method stub
		/**
		 * Program for Player rolls the die to get a number between 1 to 6.
		 *
		 * @author : TusharPatel
		 *
		 */
		
	public class UC2SnakeLadder {
	private int position = 0; // Initialize Start Position as Zero
		


	public int rollDice() {
	int dice = (int) (Math.random() * 10) % 6 + 1;  //In this method we are taking random no between 1 to 6 for rolling dice
	return dice;
	}
		
	public static void main(String[] args) {
	UC2SnakeLadder player1 = new UC2SnakeLadder();
	System.out.println("Player 1 rolled dice value : " + player1.rollDice());
			}
		}


