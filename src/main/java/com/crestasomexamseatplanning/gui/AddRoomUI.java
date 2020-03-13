package com.crestasomexamseatplanning.gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.crestasomexamseatplanning.model.Room;
import com.crestasomexamseatplanning.service.RoomService;

@Component
public class AddRoomUI extends JFrame implements ActionListener {
	@Autowired
	RoomService rService;

	@Autowired
	MainGUI gui;

	JTextField roomNo, capacity;
	JLabel roomNoLbl, capacityLbl;
	JPanel mainJPanel;
	JButton save, cancel;

	public AddRoomUI() {
		mainJPanel = new JPanel();
		mainJPanel.setLayout(new GridLayout(0, 2));
		roomNoLbl = new JLabel("Room Number:");
		roomNo = new JTextField();
		mainJPanel.add(roomNoLbl);
		mainJPanel.add(roomNo);
		capacityLbl = new JLabel("Room Capacity:");
		capacity = new JTextField();
		mainJPanel.add(capacityLbl);
		mainJPanel.add(capacity);
		save = new JButton("Save");
		save.addActionListener(this);
		mainJPanel.add(save);
		cancel = new JButton("Cancel");
		cancel.addActionListener(this);
		mainJPanel.add(cancel);
		add(mainJPanel);
		pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(save)) {
			String capacity = this.capacity.getText();
			String roomNo = this.roomNo.getText();
			Room r = new Room(roomNo, Integer.parseInt(capacity));
			rService.save(r);
			JOptionPane.showMessageDialog(this, "Room Has been saved");
		} else if (e.getSource().equals(cancel)) {
			gui.setVisible(true);
			setVisible(false);
		}

	}
}
