package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

import gameRule.Listener;

import gameRule.MineButton;
import tool.StaticTool;

public class BombJPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	MineButton[][] buttons = new MineButton[StaticTool.allrow][StaticTool.allcol];
	private Listener listener;
	private GameFrame gameFrame;

	public BombJPanel(GameFrame gameFrame2) {
		this.gameFrame = gameFrame2;
		this.setLayout(new GridLayout(StaticTool.allrow, StaticTool.allcol));
		init();

	}

	private void init() {

		//listener = new Listener(buttons, mainFrame);

		/*for (int i = 0; i < buttons.length; i++) {
			for (int j = 0; j < buttons[i].length; j++) {
				buttons[i][j] = new MineButton(i, j);
				
				//buttons[i][j].setPreferredSize(new Dimension(45, 45));
				//buttons[i][j].setMargin(new Insets(0, 0, 0, 0));
				//buttons[i][j].setBorder(BorderFactory.createLineBorder(Color.black, 1));
				//buttons[i][j].setFocusPainted(false);
				buttons[i][j].setIcon(StaticTool.iconBlank);
				//buttons[i][j].addMouseListener(listener);
				this.add(buttons[i][j]);
			}
		}*/
		this.add(new MineButton(1, 1));
		this.gameFrame.setVisible(true);
		Border borderLow = BorderFactory.createLoweredBevelBorder();

		Border borderEmpty = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		Border borderCom1 = BorderFactory.createCompoundBorder(borderEmpty, borderLow);

		this.setBorder(borderCom1);
		this.setBackground(Color.LIGHT_GRAY);

	}

}
