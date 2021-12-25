package week1.day1;

public class Mobile {
	
private void makeCall() {

	System.out.println("Call me");
}

private void sendMsg() {

	System.out.println("Message me");
}

	public static void main(String[] args) {
		
		Mobile myPh = new Mobile();
		myPh.makeCall();
		myPh.sendMsg();
		

	}
	


}
