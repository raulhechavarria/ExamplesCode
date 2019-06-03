package testCode;

import java.lang.Object;
import javax.xml.ws.*;


public class Labelary {

	/*/// converts but upside down
	String zpl = "^xa^cfa,50^fo100,100^fdHello World^fs^xz";

	Client client = ClientBuilder.newBuilder().register(MultiPartFeature.class).build();
	// adjust print density (8dpmm), label width (4 inches), label height (6 inches), and label index (0) as necessary
	WebTarget target = client.target("http://api.labelary.com/v1/printers/8dpmm/labels/4x6/0/");
	Invocation.Builder request = target.request();
	request.accept("application/pdf"); // omit this line to get PNG images back
	Response response = request.post(Entity.entity(zpl, MediaType.APPLICATION_FORM_URLENCODED));

	if (response.getStatus() == 200) {
	    byte[] body = response.readEntity(byte[].class);
	    File file = new File("label.pdf"); // change file name for PNG images
	    Files.write(file.toPath(), body);
	} else {
	    String body = response.readEntity(String.class);
	    System.out.println("Error: " + body);
	}	
*/	
	
}
