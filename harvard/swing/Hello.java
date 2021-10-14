package app.swing;

import javax.swing.*;

public class Hello extends JFrame {
	JButton clickOn;
	JLabel label;
	JPanel panel;

	public Hello() {
		// Set up the look and feel of window
		panel = new JPanel();
		add(panel);
		clickOn = new JButton();
		clickOn.setText("Click On");
		clickOn.setBounds(200, 500, 260, 90);
		clickOn.setToolTipText("Press the button");
		panel.add(clickOn);
		label = new JLabel();
		panel.add(label);
		setTitle("Hello World Application!");
		setSize(500, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
        // Mouse button listener 
		clickOn.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			// Method to call on action 
			public void mouseClicked(java.awt.event.MouseEvent ae) {
				clickOnMouseClicked(ae);

			}
		}); 
	}

	private void clickOnMouseClicked(java.awt.event.MouseEvent ae) {
		label.setText("Hello World");
	}

	public static void main(String[] args) { 
		// invoke Runnable class
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Hello();
			}
		});

	}

}
