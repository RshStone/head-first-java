package chapter05;

public class Game {
	/*
	 * numOfGuesses GameHelper helper randomNum locations isAlive guess result
	 * setLovationCells
	 */
	public static void main(String[] args) {
		int numOfGuesses = 0;
		GameHelper helper = new GameHelper();

		int randomNum = (int) (Math.random() * 5);
		int[] locations = { randomNum, randomNum + 1, randomNum + 2 };

		SimpleDotCom dot = new SimpleDotCom();
		dot.setLocationCells(locations);

		boolean isAlive = true;

		while (isAlive == true) {
			String guess = helper.getUserInput("enter a number");
			String result = dot.checkYourself(guess);
			numOfGuesses++;
			if (result.equals("kill")) {
				isAlive = false;
				System.out.println("You took " + numOfGuesses + " guesses");
			}
		}
	}

}
