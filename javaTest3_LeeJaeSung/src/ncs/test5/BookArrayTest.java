package ncs.test5;

public class BookArrayTest {

	public static void main(String[] args) {

		Book[] bArray = new Book[3];
		Book book1 = new Book("자바의 정석","남궁성",30000,"도우출판",0.1);
		Book book2 = new Book("열혈강의 자바","구정은",29000,"프리렉",0.1);
		Book book3 = new Book("객체지향 JAVA8","금영욱",30000,"북스홈",0.1);
		bArray[0] = book1;
		bArray[1] = book2;
		bArray[2] = book3;
		
		
		for(int i = 0; i < bArray.length; i++) {
			System.out.println(bArray[i].getTitle() + ", " + bArray[i].getAuthor() + ", " + bArray[i].getPublisher()
					+", "+ bArray[i].getPrice() + ", " + (int)(bArray[i].getDiscountRate()*100) + "% 할인");
			double rate = bArray[i].getPrice() * bArray[i].getDiscountRate();
			double price = bArray[i].getPrice() - rate;
			System.out.println("할인된 가격 : " + (int)price + "원");
		}
	}

}
