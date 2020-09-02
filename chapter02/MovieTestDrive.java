package chapter02;

//第一次写这个代码时，是尝试在shell里编译的，当时有点傻，直接把两个代码放在一起编译了，错了还不知道为什么。
//原因是因为用了两个public class,但是好像我去掉了public还是没有运行成功，随缘再试试！！！

//你在使用main() 的时候，你没有真正进入对象的大门，因为你是初步学习java，所以后面的慢慢来。


public class MovieTestDrive {
	public static void main(String[] args) {
		Movie one  = new Movie();
		one.title = "Gone with the Stock";
		one.genre = "Tragic";
		one.rating = -2;
		Movie two = new Movie();
		two.title = "Lost in Cubicle Space";
		two.genre = "Comedy";
		two.rating = 5;
		two.playIt(); 
		Movie three = new Movie();
		three.title = "Byte Club";
		three.genre = "Tragic but ultimately uplifting";
		three.rating = 127;
	}
}
