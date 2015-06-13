package Edit.GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Main.MainFrame;
import Main.MainPanel;
import Play.GUI.StagePanel;

public class MapEditPanel extends JPanel implements ActionListener
{

	private final int size = 10;
	private MainPanel mainPanel;
	private int status[][];
	private JButton editButton;
	private JButton closeButton;
	private JButton mapButton[][];
	private JLabel label;
	
	private MainFrame mainFrame;
	
	
	public MapEditPanel(MainFrame mainFrame) {
		super();
		
		
		this.setMainFrame(mainFrame);
		this.setBounds(0, 0, 500, 500);
		
		
		label = new JLabel("edit ");
		label.setBounds(250, 50, 100, 50);
		this.add(label);
		
		editButton = new JButton("EDIT");
		editButton.setBounds(350, 50, 100, 50);
		editButton.addActionListener(this);
		this.add(editButton);
		
		
		closeButton = new JButton("BACK");
		closeButton.setBounds(350, 400, 100, 50);
		closeButton.addActionListener(this);
		this.add(closeButton);
		
		
		
		mapButton = new JButton[size+2][size+2];
		status = new int[size+2][size+2];
		for(int i=0;i<size+2;i++)
		{
			for(int j=0;j<size+2;j++)
			{

				status[i][j] =0;
				if(i == 0||i ==size+1||j == 0||j ==size+1)
				{
					status[i][j] =1;
				}
			}

		}
		showMap();
	
	}

	public void showMap()
	{
		
		
		for(int i=0;i<size+2;i++)
		{
			for(int j=0;j<size+2;j++)
			{
				mapButton[i][j] = new JButton();
				mapButton[i][j].setBackground(Color.WHITE);
				if(status[i][j] ==1)
					mapButton[i][j].setBackground(Color.black);
				mapButton[i][j].setBounds(20+i*20,120+j*20,20,20);
				mapButton[i][j].addActionListener(this);

				this.add(mapButton[i][j]);

			}
		}
		
	}
	public void removeMap()
	{
		for(int i=0;i<size+2;i++)
		{
			for(int j=0;j<size+2;j++)
			{
				this.remove(mapButton[i][j]);
			}
		}
		this.repaint();
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
		
		if(e.getSource() == editButton)
		{
		
		}
		else if(e.getSource() == closeButton)
		{
			getMainFrame().remove(this);
			getMainFrame().repaint();
			mainPanel = new MainPanel(mainFrame);
			getMainFrame().add(mainPanel);
			return;
		}
		for(int i=0;i<size+2;i++)
		{
			for(int j=0;j<size+2;j++)
			{
				if(e.getSource() == mapButton[i][j])
				{
					if(status[i][j]==1)
						status[i][j] =0;
					else if(status[i][j]==0)
						status[i][j] =1;
					removeMap();
					showMap();
				}
			}

		}

		
		
	}
		
}

