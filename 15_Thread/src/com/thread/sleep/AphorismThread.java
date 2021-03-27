package com.thread.sleep;

public class AphorismThread extends Thread {

	private long millis;
	
	public AphorismThread(long millis) {
		this.millis = millis;
	}
	
	@Override
	public void run() {
		
		String[] str = {"세상이 널 버렸다고 생각하는가? 세상은 널 가진 적이 없다","나의 장점은 드리블도 스피드도 아닌 축구에 대한 열정이다"
				,"사막이 아름다운 것은 어딘가에 샘이 숨겨져 있기 때문이다.","한 번 실패와 영원한 실패를 혼동하지 마라"
				,"겨울이 오면 봄이 멀지 않으리","때때로 우리는 너무 많이 생각하고, 너무 적게 느낀다","인생은 원래 공평하지 못하다. 그런 현실에 대하여 불평할 생각하지 말고 받아들여라."
				,"기회는 새와 같은 것, 날아가기 전에 꼭 잡아라","한 번 실수하는 것보다 두 번 묻는 것이 더 낫다","위대한 것은 방향을 결정하는 것이다"};
		
		for(int i =0; i < str.length; i++) {
			System.out.println(str[i]);
			try {
				Thread.sleep(millis);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
