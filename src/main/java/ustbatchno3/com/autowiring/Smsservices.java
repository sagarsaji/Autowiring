package ustbatchno3.com.autowiring;

public class Smsservices implements Messageservices {

	public void sendmsg(String msg) {
		// TODO Auto-generated method stub
		System.out.println("SMS message : " + msg);
	}

}
