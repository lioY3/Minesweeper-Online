package gui;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.BorderLayout;
/**
 *
 * @author 12892
 */
import java.awt.event.*;
import connection.*;
import msg.*;
import tool.StaticTool;
import user.User;

public class GameFrame extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Creates new form GameFrame
	 */
	public GameFrame(User user, ConnectClient connectClient) {
		this.user = user;
		this.connectClient = connectClient;
		initComponents();
	}

	public User getUser() {
		return user;
	}
	
	public ConnectClient getConnectClient() {
		return connectClient;
	}
	
	public static void setLoginMsg(UserLoginMsg loginMsg) {
		loginMsg = loginMsg;
	}

	public void setBackMsg(UserBackToRoomMsg backMsg) {
		this.backMsg = backMsg;
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {
		maingame = new javax.swing.JPanel();
		bombJPanel = new BombJPanel(this);
		player = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		player1 = new javax.swing.JPanel();
		jLabel2 = new javax.swing.JLabel();
		jPanel3 = new javax.swing.JPanel();
		player2 = new javax.swing.JPanel();
		jLabel3 = new javax.swing.JLabel();
		jPanel1 = new javax.swing.JPanel();
		player3 = new javax.swing.JPanel();
		jLabel4 = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		jScrollPane2 = new javax.swing.JScrollPane();
		message = new javax.swing.JTextArea();
		input = new javax.swing.JTextField();
		send = new javax.swing.JButton();
		jLabel5 = new javax.swing.JLabel();
		prop1 = new javax.swing.JPanel();
		prop4 = new javax.swing.JPanel();
		prop3 = new javax.swing.JPanel();
		prop2 = new javax.swing.JPanel();
		exit = new javax.swing.JButton();
		ready = new javax.swing.JButton();
		jLabel6 = new javax.swing.JLabel();
		count1 = new javax.swing.JPanel();
		jLabel7 = new javax.swing.JLabel();
		time = new javax.swing.JPanel();

		setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

		maingame.setBackground(new java.awt.Color(204, 204, 204));

		javax.swing.GroupLayout maingameLayout = new javax.swing.GroupLayout(maingame);
		maingame.setLayout(new BorderLayout());
		maingame.add(bombJPanel);
		maingameLayout.setHorizontalGroup(maingameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 0, Short.MAX_VALUE));
		maingameLayout.setVerticalGroup(maingameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 504, Short.MAX_VALUE));

		jLabel1.setFont(new java.awt.Font("宋体", 0, 20)); // NOI18N
		jLabel1.setText("个人信息");

		javax.swing.GroupLayout playerLayout = new javax.swing.GroupLayout(player);
		player.setLayout(playerLayout);
		playerLayout.setHorizontalGroup(playerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(playerLayout.createSequentialGroup().addComponent(jLabel1).addGap(0, 0, Short.MAX_VALUE)));
		playerLayout.setVerticalGroup(playerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(playerLayout.createSequentialGroup().addComponent(jLabel1,
						javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 81, Short.MAX_VALUE)));

		player1.setBackground(new java.awt.Color(153, 153, 153));

		jLabel2.setFont(new java.awt.Font("宋体", 0, 20)); // NOI18N
		jLabel2.setText("玩家1");

		jPanel3.setBackground(new java.awt.Color(204, 255, 255));

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 140, Short.MAX_VALUE));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 0, Short.MAX_VALUE));

		javax.swing.GroupLayout player1Layout = new javax.swing.GroupLayout(player1);
		player1.setLayout(player1Layout);
		player1Layout.setHorizontalGroup(player1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(player1Layout.createSequentialGroup()
						.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));
		player1Layout.setVerticalGroup(player1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(player1Layout.createSequentialGroup()
						.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 91, Short.MAX_VALUE))
				.addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE));

		player2.setBackground(new java.awt.Color(153, 153, 153));

		jLabel3.setFont(new java.awt.Font("宋体", 0, 20)); // NOI18N
		jLabel3.setText("玩家2");

		jPanel1.setBackground(new java.awt.Color(204, 255, 255));

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 140, Short.MAX_VALUE));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 0, Short.MAX_VALUE));

		javax.swing.GroupLayout player2Layout = new javax.swing.GroupLayout(player2);
		player2.setLayout(player2Layout);
		player2Layout.setHorizontalGroup(player2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(player2Layout.createSequentialGroup()
						.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));
		player2Layout.setVerticalGroup(player2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(player2Layout.createSequentialGroup()
						.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 85, Short.MAX_VALUE))
				.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE));

		player3.setBackground(new java.awt.Color(153, 153, 153));

		jLabel4.setFont(new java.awt.Font("宋体", 0, 20)); // NOI18N
		jLabel4.setText("玩家3");

		jPanel2.setBackground(new java.awt.Color(204, 255, 255));

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 140, Short.MAX_VALUE));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 0, Short.MAX_VALUE));

		javax.swing.GroupLayout player3Layout = new javax.swing.GroupLayout(player3);
		player3.setLayout(player3Layout);
		player3Layout.setHorizontalGroup(player3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(player3Layout.createSequentialGroup()
						.addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));
		player3Layout.setVerticalGroup(player3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(player3Layout.createSequentialGroup()
						.addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 85, Short.MAX_VALUE))
				.addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE));

		message.setColumns(20);
		message.setRows(5);
		jScrollPane2.setViewportView(message);

		input.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				inputActionPerformed(evt);
			}
		});

		send.setText("发送");
		send.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				sendActionPerformed(evt);
			}
		});

		jLabel5.setText("拾得道具");

		prop1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		javax.swing.GroupLayout prop1Layout = new javax.swing.GroupLayout(prop1);
		prop1.setLayout(prop1Layout);
		prop1Layout.setHorizontalGroup(prop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 48, Short.MAX_VALUE));
		prop1Layout.setVerticalGroup(prop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 48, Short.MAX_VALUE));

		prop4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		javax.swing.GroupLayout prop4Layout = new javax.swing.GroupLayout(prop4);
		prop4.setLayout(prop4Layout);
		prop4Layout.setHorizontalGroup(prop4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 48, Short.MAX_VALUE));
		prop4Layout.setVerticalGroup(prop4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 0, Short.MAX_VALUE));

		prop3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		javax.swing.GroupLayout prop3Layout = new javax.swing.GroupLayout(prop3);
		prop3.setLayout(prop3Layout);
		prop3Layout.setHorizontalGroup(prop3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 48, Short.MAX_VALUE));
		prop3Layout.setVerticalGroup(prop3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 48, Short.MAX_VALUE));

		prop2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		javax.swing.GroupLayout prop2Layout = new javax.swing.GroupLayout(prop2);
		prop2.setLayout(prop2Layout);
		prop2Layout.setHorizontalGroup(prop2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 48, Short.MAX_VALUE));
		prop2Layout.setVerticalGroup(prop2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 48, Short.MAX_VALUE));

		exit.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
		exit.setText("返回");
        exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				/*ConnectionManager.releaseAll(null, null, GameFrame.this.getUser().getConn());
				System.out.println(GameFrame.this.user.getNickName()+"退出成功");
				GameFrame.this.connectClient.sendMsg(new ExitMsg(GameFrame.this.user));
				GameFrame.this.setVisible(false);
				System.exit(0);*/
				GameFrame.this.setVisible(false);
				GameFrame.this.connectClient.sendMsg(GameFrame.this.backMsg);
				new RoomFrame(user,UserDaoJdbcImpl.getConnectClient()).setVisible(true);				
			}
		});

		ready.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
		ready.setText("准备");
		ready.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				readyActionPerformed(evt);
			}
		});

		jLabel6.setFont(new java.awt.Font("宋体", 0, 20)); // NOI18N
		jLabel6.setText("地雷数");

		count1.setBackground(new java.awt.Color(204, 204, 204));

		javax.swing.GroupLayout count1Layout = new javax.swing.GroupLayout(count1);
		count1.setLayout(count1Layout);
		count1Layout.setHorizontalGroup(count1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 109, Short.MAX_VALUE));
		count1Layout.setVerticalGroup(count1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 26, Short.MAX_VALUE));

		jLabel7.setFont(new java.awt.Font("宋体", 0, 20)); // NOI18N
		jLabel7.setText("时间");

		time.setBackground(new java.awt.Color(204, 204, 204));

		javax.swing.GroupLayout timeLayout = new javax.swing.GroupLayout(time);
		time.setLayout(timeLayout);
		timeLayout.setHorizontalGroup(timeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 0, Short.MAX_VALUE));
		timeLayout.setVerticalGroup(timeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0,
				26, Short.MAX_VALUE));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(player, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(player1, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(player2, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(player3, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(layout.createSequentialGroup().addComponent(jScrollPane2).addGap(29, 29, 29))
						.addGroup(layout.createSequentialGroup()
								.addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 221,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(send)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8,
										Short.MAX_VALUE)))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
						.addGroup(layout.createSequentialGroup()
								.addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(prop1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(10, 10, 10)
								.addComponent(prop4, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(prop3, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(prop2, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(48, 48, 48)
								.addComponent(ready, javax.swing.GroupLayout.PREFERRED_SIZE, 74,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(exit,
										javax.swing.GroupLayout.PREFERRED_SIZE, 74,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addComponent(maingame, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup().addComponent(jLabel6).addGap(40, 40, 40))
								.addComponent(count1, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addComponent(jLabel7).addComponent(time, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGap(5, 5, 5)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addComponent(player, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(player1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(player2, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(player3, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup().addContainerGap()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(layout.createSequentialGroup().addComponent(jLabel6)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(count1, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jLabel7)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addComponent(maingame, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))))
				.addGap(51, 51, 51)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(22, 22, 22)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(prop1, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(prop4, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(prop3, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(
												prop2, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addGroup(layout.createSequentialGroup()
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(ready, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(send))))
				.addContainerGap(20, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>

	private void inputActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void sendActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void exitActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void readyActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	/**
	 * @param args the command line arguments
	 */
	public void runGame() {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				// new GameFrame(user).setVisible(true);
				GameFrame.this.setIconImage(StaticTool.imageIcon.getImage());
				GameFrame.this.setTitle("多人扫雷对战");
				GameFrame.this.setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JPanel count1;
	private javax.swing.JButton exit;
	private javax.swing.JTextField input;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JPanel maingame;
	private BombJPanel bombJPanel;
	// private BombJPanel bombJPanel = new BombJPanel(this);
	private javax.swing.JTextArea message;
	private javax.swing.JPanel player;
	private javax.swing.JPanel player1;
	private javax.swing.JPanel player2;
	private javax.swing.JPanel player3;
	private javax.swing.JPanel prop1;
	private javax.swing.JPanel prop2;
	private javax.swing.JPanel prop3;
	private javax.swing.JPanel prop4;
	private javax.swing.JButton ready;
	private javax.swing.JButton send;
	private javax.swing.JPanel time;
	private User user = null;
	private ConnectClient connectClient = null;
	private static UserLoginMsg loginMsg = null;
	private UserBackToRoomMsg backMsg = null;
	// End of variables declaration
}
