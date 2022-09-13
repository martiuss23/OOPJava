package View;

import java.awt.Color;
import java.awt.FileDialog;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import javax.swing.BorderFactory;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;

import Controller.MenuBarListener;
import Model.fileManager;

public class GUI extends JFrame {
	
	private JTextArea textArea;
	private JScrollPane scp;
	
	private JMenuBar jMenuBar;
	private JMenu menuFile;
	private JMenuItem itemNew;
	private JMenuItem itemOpen;
	private JMenuItem itemSave;
	private JMenuItem itemSaveAs;
	private JMenuItem itemExit;
	
	private JMenu menuEdit;
	private JMenuItem itemUndo;
	private JMenuItem itemCut;
	private JMenuItem itemCopy;
	private JMenuItem itemPaste;
	private JMenuItem itemDelete;
	private JMenuItem itemSelectAll;
	
	private JMenu menuFormat;
	private JCheckBoxMenuItem wordWrap;
	private JMenuItem itemFont;
	private JMenuItem itemColor;
	
	private JMenu menuView;
	private JMenu zoom;
	private JMenuItem zoomIn;
	private JMenuItem zoomOut;
	private JMenuItem resetZoom;
	private JCheckBoxMenuItem itemStatusBar;
	
	private JMenu menuHelp;
	
	private MenuBarListener menuBarListener;
	private fileManager modelNotepad;
	
	public GUI() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		menuBarListener = new MenuBarListener(this);
		modelNotepad  = new fileManager();
		this.setSize(800, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Notepad");
		this.setLocationRelativeTo(null);
		this.createTextArea();
		this.createMenuBar();
		this.setVisible(true);
	}
	
	
	
	public void createTextArea() {
		textArea = new JTextArea();
		scp = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scp.setBorder(BorderFactory.createEmptyBorder());
		this.add(scp);
	}
	
	public void createMenuBar() {
		jMenuBar = new JMenuBar();
		
		this.createJMenuFile();
		this.createJMenuEdit();
		this.createJMenuFormat();
		this.createJMenuView();
		this.createJMenuHelp();
		
		jMenuBar.setBackground(Color.white);
		this.setJMenuBar(jMenuBar);
	}
	
	public void createJMenuFile() {
		menuFile = new JMenu("File");
		
		itemNew = new JMenuItem("New");
		itemNew.addActionListener(menuBarListener);
		itemOpen = new JMenuItem("Open");
		itemOpen.addActionListener(menuBarListener);
		itemSave = new JMenuItem("Save");
		itemSave.addActionListener(menuBarListener);
		itemSaveAs = new JMenuItem("Save As");
		itemSaveAs.addActionListener(menuBarListener);
		itemExit = new JMenuItem("Exit");
		
		menuFile.add(itemNew);
		menuFile.add(itemOpen);
		menuFile.add(itemSave);
		menuFile.add(itemSaveAs);
		menuFile.addSeparator();
		menuFile.add(itemExit);
		
		jMenuBar.add(menuFile);
	}
	
	public void createJMenuEdit() {
		menuEdit = new JMenu("Edit");
		
		itemUndo = new JMenuItem("Undo");
		itemCut = new JMenuItem("Cut");
		itemCopy = new JMenuItem("Copy");
		itemPaste = new JMenuItem("Paste");
		itemDelete = new JMenuItem("Delete");
		itemSelectAll = new JMenuItem("Select All");
		
		menuEdit.add(itemUndo);
		menuEdit.addSeparator();
		menuEdit.add(itemCut);
		menuEdit.add(itemCopy);
		menuEdit.add(itemPaste);
		menuEdit.add(itemDelete);
		menuEdit.addSeparator();
		menuEdit.add(itemSelectAll);
		
		jMenuBar.add(menuEdit);
	}
	
	public void createJMenuFormat() {
		menuFormat = new JMenu("Format");
		wordWrap = new JCheckBoxMenuItem("Word Wrap");
		itemFont = new JMenuItem("Font");
		itemColor = new JMenuItem("Color");
		itemColor.addActionListener(menuBarListener);
		
		menuFormat.add(wordWrap);
		menuFormat.add(itemFont);
		menuFormat.add(itemColor);
		jMenuBar.add(menuFormat);
	}
	
	public void createJMenuView() {
		menuView = new JMenu("View");
		zoom = new JMenu("Zoom");
		
		zoomIn = new JMenuItem("Zoom In");
		zoomOut = new JMenuItem("Zoom Out");
		resetZoom = new JMenuItem("Restore Default Zoom");
		
		zoom.add(zoomIn);
		zoom.add(zoomOut);
		zoom.add(resetZoom);
		
		itemStatusBar = new JCheckBoxMenuItem("Status Bar");
		
		menuView.add(zoom);
		menuView.add(itemStatusBar);
		
		jMenuBar.add(menuView);
	}
	
	public void createJMenuHelp() {
		menuHelp = new JMenu("Help");
		
		jMenuBar.add(menuHelp);
	}

	public void newFile() {
		String text = textArea.getText();
		if(!text.equals("") && modelNotepad.getFile().getName().equals("Untitled")) {
			int sts = JOptionPane.showConfirmDialog(this, "Do you want to save changes Untitled?", null, JOptionPane.YES_NO_CANCEL_OPTION );
			if(sts == JOptionPane.YES_OPTION) {
				modelNotepad.createFile(text);
				textArea.setText("");
			}
			else if(sts == JOptionPane.NO_OPTION) {
				textArea.setText("");
			}
		}
		
	}
	
	public void openFile() {
		if(modelNotepad.getFile().getName().equals("Untitled")) {
			this.newFile();
		}
		JFileChooser jFileChooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files", "txt", "text");
		jFileChooser.setFileFilter(filter);
		jFileChooser.showDialog(this, "Open File");
		File fl = jFileChooser.getSelectedFile();
		if(fl != null) {
			modelNotepad.setFile(fl);
			textArea.setText(modelNotepad.readerFile());
		}
		
	}
	
	private void save() {
		JFileChooser jFileChooser = new JFileChooser();
		jFileChooser.setDialogType(JFileChooser.SAVE_DIALOG);
		jFileChooser.showDialog(this, "Save");
		File fl = jFileChooser.getSelectedFile();
		if(fl == null) return ;
		modelNotepad.setFile(fl);
		modelNotepad.writerFile(textArea.getText());
	}
	
	public void saveFile() {
		if(modelNotepad.getFile().getName().equals("Untitled")) {
			this.save();
		}
		else {
			modelNotepad.writerFile(textArea.getText());
		}
	}
	
	public void saveAsFile() {
		modelNotepad.writerFile(textArea.getText());
		this.save();
	}
	
	public void updateColor() {
		JColorChooser jColorChooser = new JColorChooser();
		Color choose = jColorChooser.showDialog(this, "Color Chooser", Color.BLACK);
		textArea.setBackground(choose);
	}
	
}
