
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JSimulator {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JPanel pnlOne = new JPanel();
	JPanel pnlSecond = new JPanel();
	CardLayout cardLayout = new CardLayout();

	private final JButton goToPanelTwo = new JButton("Panel2");
	private final JButton button = new JButton("New button");
	private final JButton button_1 = new JButton("New button");
	private final JButton button_2 = new JButton("New button");
	private final JButton button_3 = new JButton("New button");
	private final JButton button_4 = new JButton("New button");
	private final JButton button_5 = new JButton("New button");
	private final JButton button_6 = new JButton("New button");
	private final JButton button_7 = new JButton("New button");
	private final JButton button_8 = new JButton("New button");
	private final JButton button_9 = new JButton("New button");
	private final JButton button_10 = new JButton("New button");
	private final JButton button_11 = new JButton("New button");
	private final JButton button_12 = new JButton("New button");
	private final JButton button_13 = new JButton("New button");
	private final JButton button_14 = new JButton("New button");
	private final JButton goToPanelOne = new JButton("Go back");

	public JSimulator() {

		panel.setLayout(cardLayout);

		pnlOne.setBackground(Color.YELLOW);

		pnlOne.setLayout(null);
		JLabel label = new JLabel("This is first panel");
		label.setBounds(272, 5, 80, 14);
		pnlOne.add(label);

		pnlSecond.setBackground(Color.GREEN);
		pnlSecond.setLayout(null);
		JLabel label_1 = new JLabel("This is second panel");
		label_1.setBounds(264, 5, 95, 14);
		pnlSecond.add(label_1);

		// Add panels and set constraints.
		panel.add(pnlOne, "pnlFirst");
		panel.add(pnlSecond, "pnlSecond");

		// Inizializzo panelOne
		inizializePanelOne();

		// Inizializzo panelTwo
		inizializePanelTwo();

		// Visualizzo la finestra principale
		showWindow();

		// Actions buttons
		goToPanelOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cardLayout.show(panel, "pnlFirst");
			}
		});

		goToPanelTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cardLayout.show(panel, "pnlSecond");
			}
		});
	}

	public void showWindow() {
		// Shows first layout on startup of application.
		/*
		 * Pass parent container (where you set CardLayout) and constraint of
		 * panel you would like to show.
		 */
		cardLayout.show(panel, "pnlFirst");
		frame.setBounds(100, 100, 556, 465);
		frame.getContentPane().add(panel);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
	}

	public void inizializePanelOne() {
		addButtonsToPanelOne();
		setButtonsBoundsPanelOne();

	}

	public void inizializePanelTwo() {
		addButtonsToPanelTwo();
		setButtonsBoundsPanelTwo();

	}

	public void setButtonsBoundsPanelOne() {

		goToPanelTwo.setBounds(0, 366, 130, 36);
		button_1.setBounds(280, 366, 130, 36);
		button.setBounds(140, 366, 130, 36);
		button_2.setBounds(420, 366, 130, 36);
		button_3.setBounds(0, 305, 50, 50);
		button_4.setBounds(0, 244, 50, 50);
		button_5.setBounds(0, 183, 50, 50);
		button_6.setBounds(0, 122, 50, 50);
		button_7.setBounds(0, 61, 50, 50);
		button_8.setBounds(0, 0, 50, 50);
		button_9.setBounds(500, 305, 50, 50);
		button_10.setBounds(500, 244, 50, 50);
		button_11.setBounds(500, 183, 50, 50);
		button_12.setBounds(500, 122, 50, 50);
		button_13.setBounds(500, 61, 50, 50);
		button_14.setBounds(500, 0, 50, 50);
	}

	public void setButtonsBoundsPanelTwo() {
		goToPanelOne.setBounds(264, 216, 89, 23);
	}

	public void addButtonsToPanelOne() {

		pnlOne.add(goToPanelTwo);
		pnlOne.add(button);
		pnlOne.add(button_1);
		pnlOne.add(button_2);
		pnlOne.add(button_3);
		pnlOne.add(button_4);
		pnlOne.add(button_5);
		pnlOne.add(button_6);
		pnlOne.add(button_7);
		pnlOne.add(button_8);
		pnlOne.add(button_9);
		pnlOne.add(button_10);
		pnlOne.add(button_11);
		pnlOne.add(button_12);
		pnlOne.add(button_13);
		pnlOne.add(button_14);
	}

	public void addButtonsToPanelTwo() {
		pnlSecond.add(goToPanelOne);
	}

}