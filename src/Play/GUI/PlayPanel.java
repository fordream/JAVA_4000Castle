package Play.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Main.MainFrame;
import Main.MainPanel;


public class PlayPanel extends JPanel implements ActionListener
{

	private StagePanel stagePanel;

	
	private JButton playButton;
	private JButton closeButton;
	private JLabel label;
	
	private MainFrame mainFrame;
	
	
	public PlayPanel(MainFrame mainFrame) {
		super();
		
		
		this.setMainFrame(mainFrame);
		this.setBounds(0, 0, 500, 500);
		
		label = new JLabel("PLAY ");
		label.setBounds(250, 100, 100, 50);
		this.add(label);
		
		playButton = new JButton("GGGG");
		playButton.setBounds(250, 200, 100, 50);
		playButton.addActionListener(this);
		this.add(playButton);
		
		closeButton = new JButton("BACK");
		closeButton.setBounds(250, 400, 100, 50);
		closeButton.addActionListener(this);
		this.add(closeButton);

	}


	public MainFrame getMainFrame() {
		return mainFrame;
	}


	public void setMainFrame(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == playButton)
		{
			
		}
		else if(e.getSource() == closeButton)
		{
			getMainFrame().remove(this);
			getMainFrame().repaint();
			stagePanel = new StagePanel(mainFrame);
			getMainFrame().add(stagePanel);
		}
	}
		
}
