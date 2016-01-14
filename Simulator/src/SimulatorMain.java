
import java.awt.EventQueue;
import java.sql.SQLException;

public class SimulatorMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JSimulator frame = new JSimulator();
					// frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}