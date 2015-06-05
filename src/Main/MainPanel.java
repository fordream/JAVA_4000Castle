package Main;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Edit.GUI.MapEditPanel;
import Play.GUI.StagePanel;


public class MainPanel extends JPanel implements ActionListener
{

	private MainFrame mainFrame;
	private StagePanel stagePanel;
	private MapEditPanel mapEditPanel;
	
	private JButton playButton;
	private JButton editButton;
	private JButton closeButton;
	private JLabel label;
	
	public MainPanel(MainFrame mainFrame) {
		super();
	
		this.setMainFrame(mainFrame);
		this.setBounds(0, 0, 500, 500);
		
		label = new JLabel("������ ");
		label.setBounds(250, 100, 100, 50);
		this.add(label);
		
		playButton = new JButton("PLAY");
		playButton.setBounds(250, 200, 100, 50);
		playButton.addActionListener(this);
		this.add(playButton);
		
		editButton = new JButton("EDIT");
		editButton.setBounds(250, 300, 100, 50);
		editButton.addActionListener(this);
		this.add(editButton);
		
		closeButton = new JButton("CLOSE");
		closeButton.setBounds(250, 400, 100, 50);
		closeButton.addActionListener(this);
		this.add(closeButton);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == playButton)
		{
			getMainFrame().remove(this);
			getMainFrame().repaint();
			stagePanel = new StagePanel(mainFrame);
			getMainFrame().add(stagePanel);
		}
		else if(e.getSource() == editButton)
		{
			getMainFrame().remove(this);
			getMainFrame().repaint();
			mapEditPanel = new MapEditPanel(mainFrame);
			getMainFrame().add(mapEditPanel);
		}
		else if(e.getSource() == closeButton)
		{
			getMainFrame().dispose();
		}
	}

	public MainFrame getMainFrame() {
		return mainFrame;
	}

	public void setMainFrame(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
	}
}
