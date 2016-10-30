import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 0; i < 1000; i ++){ 
			try {
				Desktop.getDesktop().browse(new URI("http://smartcasualstudios.com/"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
