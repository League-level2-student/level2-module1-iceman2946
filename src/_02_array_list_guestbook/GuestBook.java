package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	ArrayList <String> guestbook= new ArrayList<String>();
	JButton add= new JButton("Add Names"); 
	JButton view= new JButton("View Names");
	void Guest() {
		JFrame frame= new JFrame(); 
		frame.setVisible(true);
		JPanel panel= new JPanel();
		frame.add(panel);
		add.addActionListener(this);
		view.addActionListener(this);
		panel.add(add);
		panel.add(view);
		guestbook.add("Guest #1: Bob Banders");
		guestbook.add("Guest #2: Sandy Summers");
		guestbook.add("Guest #3: Greg Ganders");
		guestbook.add("Guest $4: Donny Doners");
		frame.pack();
	}
	public static void main(String[] args) {
		new GuestBook().Guest();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed= (JButton) arg0.getSource();
		if(buttonPressed==add) {
			String name= JOptionPane.showInputDialog("Please add your name here.");
			guestbook.add(name);
		}
		if(buttonPressed==view) {
			JOptionPane.showMessageDialog(null, guestbook);
		}
		
	}
}
