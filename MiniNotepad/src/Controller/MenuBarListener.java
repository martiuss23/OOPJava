package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import View.GUI;

public class MenuBarListener implements ActionListener{
	private GUI gui;
	
	public MenuBarListener(GUI gui) {
		this.gui = gui;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s = e.getActionCommand();
		if(s.equals("New")) {
			gui.newFile();
		}
		else if(s.equals("Open")) {
			gui.openFile();
		}
		else if(s.equals("Save")) {
			gui.saveFile();
		}
		else if(s.equals("Save As")) {
			gui.saveAsFile();
		}
		else if(s.equals("Color")) {
			gui.updateColor();
		}
	}


}
