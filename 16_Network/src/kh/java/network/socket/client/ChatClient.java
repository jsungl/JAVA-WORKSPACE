package kh.java.network.socket.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ChatClient {

	public static final String SERVER_IP = "localhost";
//	public static final String SERVER_IP = "khmclass.iptime.org"; //강사님컴퓨터 서버IP
	public static final int SERVER_PORT = 7777;
	
	public static void main(String[] args) {
		
		new ChatClient().init();

	}
	
	public void init() {
		
		try {
			//1. 소켓생성 및 연결요청
			Socket socket = new Socket(SERVER_IP,SERVER_PORT);
			
			//2. 소켓용 입출력 스트림 준비
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream())); 
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			
			
			//3. 서버통신
//			System.out.println("서버 : " + br.readLine()); //서버웰컴메세지
			
			//4. 채팅
			String data = "";
			Scanner sc = new Scanner(System.in); //사용자키보드입력
			while((data = br.readLine()) != null) {
				
				System.out.println("서버 : " + data);
				System.out.print("클라이언트 : ");
				String msg = sc.nextLine();
				//소켓에 쓰기작업
				pw.println(msg);
				pw.flush();
				
				//클라이언트가 exit입력시
				if("exit".contentEquals(msg)) { 
					System.out.println("채팅프로그램 종료");
					break;
				}
			}
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	
}

