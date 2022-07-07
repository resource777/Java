
public class Round {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 소수점 넷째자리에서 반올림..
		double pi = 3.141592;
		double newpi = Math.round(pi*1000) / 1000.0;
		System.out.println(newpi);
	}
}
