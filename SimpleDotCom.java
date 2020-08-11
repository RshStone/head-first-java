package chapter05;

public class SimpleDotCom {
	int[] locationCells;
	int numOfHits = 0;

	public void setLocationCells(int[] locs) {
		locationCells = locs;
	}

	public String checkYourself(String stringGuess) {
		/*Integer是一个java里面已经封装好的类
		 * 调用它的parseInt这个方法将stringGuess转成整数
		 */
		int guess = Integer.parseInt(stringGuess);
		String result = "miss";
		//for的一种写法，: 表示in的意思
		for (int cell : locationCells) {
			if (guess == cell) {
				result = "hit";
				numOfHits++;
				break;
			}
		}
		if (numOfHits == locationCells.length) {
			result = "kill";
		}
		System.out.println(result);
		return result;
	}

}
