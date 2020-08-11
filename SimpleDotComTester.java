package chapter05;

public class SimpleDotComTester {
	public static void main(String[] args) {
		/* 新建了一个对象SimpleDotCom,将它给对象变量dot 
		 * 这里的对象SimpleDotComTester也是一个类，类的具体代码写在另外一个程序里了*/
		SimpleDotCom dot = new SimpleDotCom();
		int[] locations = { 2, 3, 4 };
		//这个类对象调用setLocationCells方法
		dot.setLocationCells(locations);
		//改进 增加用户输入  当前状态下，用户无法多次输入，就不可能kill!
		//这应该就是一个test code的写法，所以还没写完
		String userGuess = "2";
		String result = dot.checkYourself(userGuess);
		String testResult = "failed";
		if(result.equals("hit")) {
			testResult = "passed";
		}
		System.out.println(testResult);
	}

}
