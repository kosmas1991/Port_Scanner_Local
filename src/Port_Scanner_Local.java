import java.io.IOException;
import java.net.ServerSocket;

public class Port_Scanner_Local {

	public static void main(String[] args) {
		int port=0;
		while (port<36565) {
			port++;
			ServerSocket server=null;
			try {
				server = new ServerSocket(port);
			} catch (IOException e) {
				System.out.println("Port " + port + " is open");
			}
			/*try {
				server.close();
			} catch (IOException e) {
				System.out.println("houston");
			} */
		}
	}

}
