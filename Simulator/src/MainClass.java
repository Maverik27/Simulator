
import java.awt.EventQueue;
import java.sql.SQLException;

public class MainClass {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CardLayoutDemo frame = new CardLayoutDemo();
					// frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}