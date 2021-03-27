package kh.java.network.socket.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {

	public static final int PORT = 7777;
	
	public static void main(String[] args) {

		new ChatServer().init();
	}

	public void init() {
		
		
		
		try {
			//1. Server socket생성
			ServerSocket serverSocket = new ServerSocket(PORT);
			
			while(true) {
				System.out.println(InetAddress.getLocalHost().getHostAddress() + " : " + PORT + "에서 연결대기중...");
				
				
				//2. Client 연결요청이 있을때 별도의 소켓을 새로 생성해 통신
				Socket socket = serverSocket.accept(); //연결요청이있을때 연결용socket객체생성
				
				//3. 소켓용 입출력스트림 준비
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream())); //소켓으로부터 읽는다
				PrintWriter pw = new PrintWriter(socket.getOutputStream());
				
				//4. welcome message
				pw.println("환영합니다");
				pw.flush(); //버퍼내용을 즉시 쓰기. 버퍼가 가득차지않아도 전송하기
				
				//5. 채팅
				String data = "";
				Scanner sc = new Scanner(System.in); //서버쪽 사용자 키보드입력
				while((data = br.readLine()) != null) {
					if("exit".equals(data)) {
						System.out.println("클라이언트가 채팅방을 나갓습니다");
						break; //작은 while문 빠져나간다 ---> 다시서버시작(바깥 while문)
					}
					System.out.println("클라이언트 : " + data);
					System.out.print("서버 : ");
					String msg = sc.nextLine();
					//소켓에 쓰기작업
					pw.println(msg);
					pw.flush();	
				}
			}
			
		}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		
	}

}
