package Com.Bridgelab.SnakeLadder;

	/**
	 * Program for The Player then checks for a Option. They are No Play,Ladder or
	 * Snake.
	 * 
	 * @author : TusharPatel
	 */
		     public class U3SnakeandLadder {
			
			
				 
				public static int rollDice() {
					int dice = (int) (Math.random() * 10) % 6 + 1; //* In this method we are taking random no between 1 to 6 for rolling dice
					
					return dice;
				}
				 
				public static void playerOption() {
				int position = 0;
			    int check = (int) (Math.random() * 10) % 3 + 1; // Using ((RANDOM)) to check for Options.1 = ladder & 2 = snake & 0 = no play.
				System.out.println("Playing Option :" + check);
				switch (check) {
			

					case 1:
						System.out.println("player is not playing " );
						break;
			

					case 2:
						int dice = rollDice();
						System.out.println("Dice Rolled... " + dice);
						position = position + dice;
						System.out.println("Its Ladder....");
						System.out.println("player is playing at : " + position);
						break;
			

					default:
						int dice2 = rollDice();
						System.out.println("Dice Rolled.... " + dice2);
						position = position - dice2;
						System.out.println("Ohhhh....its Snake");
						System.out.println("player position : " + position);
					}
				}
			

				public static void main(String[] args) {
					System.out.println("Lets play");
					playerOption();
				}
			}


