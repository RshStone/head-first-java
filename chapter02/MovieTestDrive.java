package chapter02;

//��һ��д�������ʱ���ǳ�����shell�����ģ���ʱ�е�ɵ��ֱ�Ӱ������������һ������ˣ����˻���֪��Ϊʲô��
//ԭ������Ϊ��������public class,���Ǻ�����ȥ����public����û�����гɹ�����Ե�����ԣ�����

//����ʹ��main() ��ʱ����û�������������Ĵ��ţ���Ϊ���ǳ���ѧϰjava�����Ժ������������


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
