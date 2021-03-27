package kh.model.vo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class BookTest {

	public static void main(String[] args) {
		
		BookTest b = new BookTest();
		b.fileSave("object/test.dat");
	}
	
	public void test1() {
		
	}
	
	public void test2() {
		
		
	}
	
	public void fileSave(String fileName){
		
		
		File f = new File(fileName);
		ObjectOutputStream oos = null;
		try{
			oos = new ObjectOutputStream(new FileOutputStream(f));
			Book b1 = new Book("자바를 정복하자", 35000);
			oos.writeObject(b1);
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
