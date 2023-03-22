package ustbatchno3.com.autowiring;

public class Notificationservices {

	private Messageservices messageservice;
	
	public void notifyy() {
		messageservice.sendmsg("Hey I'm Autowired");
	}

	
	public void setMessageservice(Messageservices messageservice) {
		this.messageservice = messageservice;
	}
	
	

}
