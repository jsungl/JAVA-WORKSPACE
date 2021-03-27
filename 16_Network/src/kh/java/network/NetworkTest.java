package kh.java.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;

public class NetworkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NetworkTest n = new NetworkTest();
		//n.test1();
		//n.test2();
		n.test3();
	}
	
	/*
	 * InetAddress
	 * IP주소에 대한 정보를 가진 클래스
	 * 
	 * -ip : 10.10.10.10 4바이트로 이루어진 실제주소
	 * -hostname : naver.com, iei.or.kr
	 * 
	 * 모든 메소드가 Static(객체로만들어서사용x)
	 */
	public void test1() {
		try {
			InetAddress naver = InetAddress.getByName("naver.com");
			System.out.println(naver.getHostAddress());
			
			//모든ip주소얻는법
			InetAddress[] arr = InetAddress.getAllByName("naver.com");
			System.out.println(arr.length);
			for(InetAddress ip : arr) {
				System.out.println(ip.getHostAddress()); //naver.com으로 연결되는 ip주소들
			}
			
			//내컴퓨터의 ip주소
			InetAddress localhost = InetAddress.getLocalHost();
			System.out.println(localhost.getHostAddress()); //cmd에서 봤던 ip주소확인
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	/*
	 * URL
	 * protocol + hostname + port + 자원path 를 관리해주는 자바클래스
	 * 
	 * https://------->protocol
	 * docs.oracle.com---------->hostname
	 * :443 ------------>port ,프로토콜에 대한 기본포트는 생략가능 https-443 http-80 ftp-20
	 * /javase/8/docs/api/java/util/ArrayList.html------->자원path
	 * 	
	 * protocol : 통신규약 http https ftp...
	 * 
	 * port : 서비스번호. 컴퓨터내에 특정프로그램(서버프로그램)을 가리키는 논리적인 번호
	 * 
	 */
	public void test2() {
		try {
//			URL url = new URL("https://docs.oracle.com:443/javase/8/docs/api/java/util/ArrayList.html");
			URL url = new URL("https://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%EC%BD%94%EB%A1%9C%EB%82%98&oquery=%EB%82%B4+ip&tqi=U%2FjJiwp0Yihss4TKP4hssssstC8-267089");
			System.out.println(url.getProtocol()); //protocol부분 출력(:생략)
			System.out.println(url.getHost()); //hostname(도메인부분)
//			System.out.println(url.getPort()); //port
//			System.out.println(url.getDefaultPort()); //url에 port번호가 안적혀있을경우
			System.out.println(url.getPort() != -1 ? url.getPort() : url.getDefaultPort()); 			
			System.out.println(url.getPath()); //path
			System.out.println(url.getQuery()); //사용자입력값(?뒤)
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/*
	 * URL 연결요청
	 * -> 결과를 파일로 저장
	 */
	public void test3() {
		String address = "https://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%EC%BD%94%EB%A1%9C%EB%82%98&oquery=%EB%82%B4+ip&tqi=U%2FjJiwp0Yihss4TKP4hssssstC8-267089";
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			URL url = new URL(address);
			URLConnection conn = url.openConnection(); //외부서버와 내컴퓨터와 통신
			//응답받아올준비
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			bw = new BufferedWriter(new FileWriter("search_result.html"));
			
			String data = "";
			while((data = br.readLine()) != null ) {
				//System.out.println(data);
				bw.write(data);
				bw.write("\n");
			}
			
			System.out.println("파일검색완료");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
