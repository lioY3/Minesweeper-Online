package gameRule;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class BombJPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	MineButton[][] buttons = new MineButton[StaticTool.allrow][StaticTool.allcol];
	private Listener listener;
	private MainFrame mainFrame;

	public BombJPanel(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
		this.setLayout(new GridLayout(StaticTool.allrow, StaticTool.allcol));
		init();

	}

	private void init() {

		listener = new Listener(buttons, mainFrame);

		for (int i = 0; i < buttons.length; i++) {
			for (int j = 0; j < buttons[i].length; j++) {
				buttons[i][j] = new MineButton(i, j);
				
				buttons[i][j].setPreferredSize(new Dimension(45, 45));
				buttons[i][j].setMargin(new Insets(0, 0, 0, 0));
				buttons[i][j].setBorder(BorderFactory.createLineBorder(Color.black, 1));
				buttons[i][j].setFocusPainted(false);
				buttons[i][j].setIcon(StaticTool.iconBlank);
				buttons[i][j].addMouseListener(listener);
				this.add(buttons[i][j]);
			}
		}
		Border borderLow = BorderFactory.createLoweredBevelBorder();

		Border borderEmpty = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		Border borderCom1 = BorderFactory.createCompoundBorder(borderEmpty, borderLow);

		this.setBorder(borderCom1);
		this.setBackground(Color.LIGHT_GRAY);

	}

}