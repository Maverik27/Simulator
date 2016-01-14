

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import com.jgoodies.forms.layout.FormLayout;
//import com.jgoodies.forms.layout.ColumnSpec;
//import com.jgoodies.forms.layout.RowSpec;
//import com.jgoodies.forms.layout.FormSpecs;

public class CardLayoutDemo {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JPanel pnlFirst = new JPanel();
	JPanel pnlSecond = new JPanel();
	CardLayout cardLayout = new CardLayout();

	private final JButton btnNewButton = new JButton("Panel2");
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
	private final JButton btnGoBack = new JButton("Go back");

	public CardLayoutDemo() {
		panel.setLayout(cardLayout);
		pnlFirst.setBackground(Color.YELLOW);
		pnlFirst.setLayout(null);
		JLabel label = new JLabel("This is first panel");
		label.setBounds(272, 5, 80, 14);
		pnlFirst.add(label);
		pnlSecond.setBackground(Color.GREEN);
		pnlSecond.setLayout(null);
		JLabel label_1 = new JLabel("This is second panel");
		label_1.setBounds(264, 5, 95, 14);
		pnlSecond.add(label_1);
		// Add panels and set constraints.
		panel.add(pnlFirst, "pnlFirst");
		panel.add(pnlSecond, "pnlSecond");

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cardLayout.show(panel, "pnlSecond");
			}
		});

		btnGoBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				cardLayout.show(panel, "pnlFirst");

			}
		});

		btnNewButton.setBounds(0, 366, 130, 36);

		pnlFirst.add(btnNewButton);
		button.setBounds(140, 366, 130, 36);

		pnlFirst.add(button);
		button_1.setBounds(280, 366, 130, 36);

		pnlFirst.add(button_1);
		button_2.setBounds(420, 366, 130, 36);

		pnlFirst.add(button_2);
		button_3.setBounds(0, 305, 50, 50);

		pnlFirst.add(button_3);
		button_4.setBounds(0, 244, 50, 50);

		pnlFirst.add(button_4);
		button_5.setBounds(0, 183, 50, 50);

		pnlFirst.add(button_5);
		button_6.setBounds(0, 122, 50, 50);

		pnlFirst.add(button_6);
		button_7.setBounds(0, 61, 50, 50);

		pnlFirst.add(button_7);
		button_8.setBounds(0, 0, 50, 50);

		pnlFirst.add(button_8);
		button_9.setBounds(500, 305, 50, 50);

		pnlFirst.add(button_9);
		button_10.setBounds(500, 244, 50, 50);

		pnlFirst.add(button_10);
		button_11.setBounds(500, 183, 50, 50);

		pnlFirst.add(button_11);
		button_12.setBounds(500, 122, 50, 50);

		pnlFirst.add(button_12);
		button_13.setBounds(500, 61, 50, 50);

		pnlFirst.add(button_13);
		button_14.setBounds(500, 0, 50, 50);

		pnlFirst.add(button_14);
		panel.add(pnlSecond, "pnlSecond");
		btnGoBack.setBounds(264, 216, 89, 23);

		pnlSecond.add(btnGoBack);
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

	public void run() {
		new CardLayoutDemo();
	}

}