package com.crestasomexamseatplanning.gui;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MainGUI extends JFrame implements ActionListener {
	@Autowired
	AddRoomUI addRoomUi;

	public MainGUI() {
		JButton addRoom = new JButton("Add Room");
		addRoom.addActionListener(this);
		add(addRoom);
		pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		setVisible(false);
		addRoomUi.setVisible(true);
	}
}
