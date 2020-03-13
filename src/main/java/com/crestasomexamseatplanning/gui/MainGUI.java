package com.crestasomexamseatplanning.gui;

import java.awt.Button;

import javax.swing.JFrame;

import org.springframework.stereotype.Component;

@Component
public class MainGUI extends JFrame {
	public MainGUI() {
		add(new Button("Test Button"));
		pack();

	}
}
