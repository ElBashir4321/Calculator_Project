package com.example.Calcultor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.swing.*;

@SpringBootApplication
public class CalcultorApplication {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(CalculatorView::new);
		SpringApplication.run(CalcultorApplication.class, args);
	}

}
