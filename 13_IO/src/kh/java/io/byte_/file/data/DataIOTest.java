package kh.java.io.byte_.file.data;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIOTest {

	public static void main(String[] args) {

		DataIOTest d = new DataIOTest();
		//d.test1();
		d.test2();
	}

	//쓰기
	public void test1() {
		File f = new File("data/sample.dat"); //data폴더를 만들어놔야한다
		
		try(
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(f))
		){
			//자바 자료형별로 작성가능(자료형 크기별로 작성)
			dos.writeBoolean(true);
			dos.writeInt(300);
			dos.writeDouble(3.14);
			dos.writeChar('안');
			dos.writeChar('녕');
			dos.writeUTF("자바자바자바"); //String
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		System.out.println("DataOutputStream 작업완료");
	}
	
	//읽어오기
	public void test2() {
		File f = new File("data/sample.dat");
		
		try( 
			DataInputStream dis = new DataInputStream(new FileInputStream(f));
		){
			//쓰여진 자료형 순서대로 읽어올것(아니면 깨질수있음) -> 그래서 ObjectIOStream을 더 많이씀
			System.out.println(dis.readBoolean());
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
