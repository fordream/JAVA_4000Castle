package Main;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Edit.GUI.MapEditPanel;
import Play.GUI.StagePanel;


public class MainFrame extends SimpleJFrame 
{

	private MainPanel mainPanel;

	
	
	public MainFrame() {
		super("MainFrame", 500, 500);
		
		mainPanel = new MainPanel(this);
		
		this.add(mainPanel);
		
		
		
		// TODO Auto-generated constructor stub
	}


}
