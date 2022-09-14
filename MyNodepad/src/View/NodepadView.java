package View;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JP opupMenu;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

import Controller.NodepadListener;
import Model.NodepadModel;

public class NodepadView extends JFrame{
	private NodepadModel nodepadModel;
	private NodepadListener nodepadListener;
	
	private JMenuBar menuBar;
	
	private JMenu jMenuFile;
	private JMenuItem itemNew;
	private JMenuItem itemOpen;
	private JMenuItem itemSave;
	private JMenuItem itemExit;;
	
	private JMenu jMenuEdit;
	private JMenu jMenuFormat;
	private JMenu jMenuView;
	private JMenu jMenuHelp;
	
	private JTextArea jTextArea;
	private JPanel center;
	
	private JPopupMenu jPopupMenu;
	
	public NodepadView() {
		nodepadModel = new NodepadModel("testFile.txt");
		nodepadListener = new NodepadListener(this);
		this.init();
	}
	
	public void init() {
		this.setTitle("Nodepad");
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout(10, 10));
		
		this.initJMenuBar();
		//this.initPopup();
		this.initCenter();
		
		
		this.setJMenuBar(menuBar);
		this.add(center, BorderLayout.CENTER);
		this.setVisible(true);
	}
	
	public void initJMenuBar() {
		menuBar = new JMenuBar();
		this.initMenuFile();
		menuBar.add(jMenuFile);
		
		jMenuEdit = new JMenu("Edit");
		menuBar.add(jMenuEdit);
		jMenuFormat = new JMenu("Format");
		menuBar.add(jMenuFormat);
		jMenuView = new JMenu("View");
		menuBar.add(jMenuView);
		jMenuHelp = new JMenu("Help");
		menuBar.add(jMenuHelp);
	}
	
	public void initCenter() {
		center = new JPanel(new BorderLayout());
		
		jTextArea = new JTextArea();
		center.add(jTextArea, BorderLayout.CENTER);
	}
	
	public void initMenuFile() {
		jMenuFile = new JMenu("File");
		
		itemNew = new JMenuItem("New");
		itemNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
		itemNew.addActionListener(nodepadListener);
		jMenuFile.add(itemNew);
		itemOpen = new JMenuItem("Open");
		itemOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
		itemOpen.addActionListener(nodepadListener);
		jMenuFile.add(itemOpen);
		itemSave = new JMenuItem("Save");
		itemSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
		itemSave.addActionListener(nodepadListener);
		jMenuFile.add(itemSave);
		jMenuFile.addSeparator();
		
		itemExit = new JMenuItem("Exit");
		itemExit.addActionListener(nodepadListener);
		jMenuFile.add(itemExit);
		
	}
	
	public void save() {
		String content = jTextArea.getText();
		//System.out.println(content);
		nodepadModel.save(content);
	}
	
}
