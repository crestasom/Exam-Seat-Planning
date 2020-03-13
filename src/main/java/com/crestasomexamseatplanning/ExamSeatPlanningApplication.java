package com.crestasomexamseatplanning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import com.crestasomexamseatplanning.gui.MainGUI;

@SpringBootApplication
public class ExamSeatPlanningApplication implements CommandLineRunner {
	@Autowired
	MainGUI gui;

	public static void main(String[] args) {
		new SpringApplicationBuilder(ExamSeatPlanningApplication.class).headless(false).run(args);

	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		gui.setVisible(true);
	}

}
