package chapter05;

public class SimpleDotCom {
	int[] locationCells;
	int numOfHits = 0;

	public void setLocationCells(int[] locs) {
		locationCells = locs;
	}

	public String checkYourself(String stringGuess) {
		/*Integer��һ��java�����Ѿ���װ�õ���
		 * ��������parseInt���������stringGuessת������
		 */
		int guess = Integer.parseInt(stringGuess);
		String result = "miss";
		//for��һ��д����: ��ʾin����˼
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
