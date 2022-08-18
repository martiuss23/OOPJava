package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.NodepadView;

public class NodepadListener implements ActionListener {
	
	private NodepadView nodepadView;
	
	public NodepadListener(NodepadView nodepadView) {
		this.nodepadView = nodepadView;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String str = e.getActionCommand();
		if(str.equals("Save")) {
			nodepadView.save();
		}
	}

}
