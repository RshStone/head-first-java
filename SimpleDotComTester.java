package chapter05;

public class SimpleDotComTester {
	public static void main(String[] args) {
		/* �½���һ������SimpleDotCom,�������������dot 
		 * ����Ķ���SimpleDotComTesterҲ��һ���࣬��ľ������д������һ����������*/
		SimpleDotCom dot = new SimpleDotCom();
		int[] locations = { 2, 3, 4 };
		//�����������setLocationCells����
		dot.setLocationCells(locations);
		//�Ľ� �����û�����  ��ǰ״̬�£��û��޷�������룬�Ͳ�����kill!
		//��Ӧ�þ���һ��test code��д�������Ի�ûд��
		String userGuess = "2";
		String result = dot.checkYourself(userGuess);
		String testResult = "failed";
		if(result.equals("hit")) {
			testResult = "passed";
		}
		System.out.println(testResult);
	}

}
