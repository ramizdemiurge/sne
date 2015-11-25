package meta.morphosis.frames;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import meta.morphosis.metodlar;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JToolBar;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyAdapter;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.DropMode;
import javax.swing.SwingConstants;

public class Frame1 extends JFrame {
	private JTextField txtMetamorphosis;
	private JTextField textField_md5;
	private JTextField textField_base64;
	private JTextField textField_hex;
	private JTextField textField_char;
	private JTextField textField_sha1;
	private JTextField textField_sha256;
	private JTextField textField_sha512;
	private JTextField textField_ucrypt;
	private JTextField textField_md2;
	private JTextField textField_sha384;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 frame = new Frame1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Frame1() {
		getContentPane().setBackground(Color.DARK_GRAY);
		setResizable(false);
		setTitle("SSE - Super Simple Encoder");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Frame1.class.getResource("/com/sun/java/swing/plaf/windows/icons/Question.gif")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 415, 501);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.WHITE);
		menuBar.setForeground(Color.BLACK);
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		mnFile.setFont(new Font("Tahoma", Font.PLAIN, 12));
		menuBar.add(mnFile);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Exit");
		mntmNewMenuItem.setFont(new Font("Tahoma", Font.PLAIN, 12));
		mntmNewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_MASK));
		mntmNewMenuItem.setSelectedIcon(new ImageIcon(Frame1.class.getResource("/javax/swing/plaf/basic/icons/image-delayed.png")));
		mntmNewMenuItem.setIcon(new ImageIcon("C:\\Users\\adsf\\Desktop\\favicon.ico"));
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		mnFile.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1 = new JMenu("Help");
		mnNewMenu_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmWikipedia = new JMenuItem("Wikipedia");
		mntmWikipedia.setFont(new Font("Tahoma", Font.PLAIN, 12));
		mnNewMenu_1.add(mntmWikipedia);
		
		JMenuItem mntmAbout = new JMenuItem("About");
		mntmAbout.setFont(new Font("Tahoma", Font.PLAIN, 12));
		mntmAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "About JFrame works!");
				
			}
		});
		mntmAbout.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0));
		mnNewMenu_1.add(mntmAbout);
		getContentPane().setLayout(null);
		
		txtMetamorphosis = new JTextField();
		txtMetamorphosis.setText("The free man is a warrior. - Nietzsche");
		txtMetamorphosis.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyReleased(KeyEvent e) {
				try
				{
				 String text = txtMetamorphosis.getText();
				 if(text != null && !text.isEmpty()) {
					
					 textField_md5.setText(metodlar.Do_md5(text));
					 textField_base64.setText(metodlar.Do_enBase64(text));
					 textField_hex.setText(metodlar.Do_hex(text));
					 textField_char.setText(metodlar.Do_char(text));
					 textField_sha1.setText(metodlar.Do_sha1(text));
					 textField_sha256.setText(metodlar.Do_sha256(text));
					 textField_sha512.setText(metodlar.Do_sha512(text));
					 textField_ucrypt.setText(metodlar.Do_ucrypt(text));
					 textField_md2.setText(metodlar.Do_md2(text));
					 textField_sha384.setText(metodlar.Do_sha384(text));
					 
					 
					 
				 } else {
					 textField_md5.setText("");
					 textField_base64.setText("");
					 textField_hex.setText("");
					 textField_char.setText("");
					 textField_sha1.setText("");
					 textField_sha256.setText("");
					 textField_sha512.setText("");
					 textField_ucrypt.setText("");
					 textField_md2.setText("");
					 textField_sha384.setText("");
					  }
				 
				 
				 
				
				 
				 
				 
				} catch(Exception errst){ JOptionPane.showMessageDialog(null, "Error: "+errst+".");}
			}
		});
		txtMetamorphosis.setBounds(82, 24, 250, 23);
		getContentPane().add(txtMetamorphosis);
		txtMetamorphosis.setColumns(10);
		
		textField_md5 = new JTextField();
		textField_md5.setEditable(false);
		textField_md5.setBounds(82, 112, 250, 20);
		getContentPane().add(textField_md5);
		textField_md5.setColumns(10);
		
		JLabel lblMd = new JLabel("MD5");
		lblMd.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMd.setForeground(Color.WHITE);
		lblMd.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblMd.setBounds(10, 115, 62, 14);
		getContentPane().add(lblMd);
		
		textField_base64 = new JTextField();
		textField_base64.setEditable(false);
		textField_base64.setBounds(82, 342, 250, 20);
		getContentPane().add(textField_base64);
		textField_base64.setColumns(10);
		
		JLabel lblBase = new JLabel("Base64");
		lblBase.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBase.setForeground(Color.WHITE);
		lblBase.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblBase.setBounds(10, 345, 62, 14);
		getContentPane().add(lblBase);
		
		textField_hex = new JTextField();
		textField_hex.setEditable(false);
		textField_hex.setBounds(82, 373, 250, 20);
		getContentPane().add(textField_hex);
		textField_hex.setColumns(10);
		
		JLabel lblHex = new JLabel("Hex");
		lblHex.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHex.setForeground(Color.WHITE);
		lblHex.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblHex.setBounds(10, 376, 62, 14);
		getContentPane().add(lblHex);
		
		JLabel lblNewLabel = new JLabel("Text");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(26, 28, 46, 14);
		getContentPane().add(lblNewLabel);
		
		textField_char = new JTextField();
		textField_char.setEditable(false);
		textField_char.setBounds(82, 404, 250, 20);
		getContentPane().add(textField_char);
		textField_char.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Char");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(10, 407, 62, 14);
		getContentPane().add(lblNewLabel_1);
		
		textField_sha1 = new JTextField();
		textField_sha1.setEditable(false);
		textField_sha1.setBounds(82, 183, 250, 20);
		getContentPane().add(textField_sha1);
		textField_sha1.setColumns(10);
		
		JLabel lblSha = new JLabel("SHA1");
		lblSha.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblSha.setForeground(Color.WHITE);
		lblSha.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSha.setBounds(26, 186, 46, 14);
		getContentPane().add(lblSha);
		
		textField_sha256 = new JTextField();
		textField_sha256.setEditable(false);
		textField_sha256.setBounds(82, 214, 250, 20);
		getContentPane().add(textField_sha256);
		textField_sha256.setColumns(10);
		
		JLabel lblSha_1 = new JLabel("SHA256");
		lblSha_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblSha_1.setForeground(Color.WHITE);
		lblSha_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSha_1.setBounds(26, 217, 46, 14);
		getContentPane().add(lblSha_1);
		
		textField_sha512 = new JTextField();
		textField_sha512.setEditable(false);
		textField_sha512.setBounds(82, 280, 250, 20);
		getContentPane().add(textField_sha512);
		textField_sha512.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("SHA512");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(26, 283, 46, 14);
		getContentPane().add(lblNewLabel_2);
		
		textField_ucrypt = new JTextField();
		textField_ucrypt.setEditable(false);
		textField_ucrypt.setBounds(82, 311, 250, 20);
		getContentPane().add(textField_ucrypt);
		textField_ucrypt.setColumns(10);
		
		JLabel lblUnixCrypt = new JLabel("Unix Crypt");
		lblUnixCrypt.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblUnixCrypt.setForeground(Color.WHITE);
		lblUnixCrypt.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUnixCrypt.setBounds(0, 314, 72, 14);
		getContentPane().add(lblUnixCrypt);
		
		textField_md2 = new JTextField();
		textField_md2.setEditable(false);
		textField_md2.setBounds(82, 152, 250, 20);
		getContentPane().add(textField_md2);
		textField_md2.setColumns(10);
		
		JLabel lblMd_1 = new JLabel("MD2");
		lblMd_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblMd_1.setForeground(Color.WHITE);
		lblMd_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMd_1.setBounds(26, 155, 46, 14);
		getContentPane().add(lblMd_1);
		
		textField_sha384 = new JTextField();
		textField_sha384.setEditable(false);
		textField_sha384.setBounds(82, 249, 250, 20);
		getContentPane().add(textField_sha384);
		textField_sha384.setColumns(10);
		
		JLabel lblSha_2 = new JLabel("SHA384");
		lblSha_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblSha_2.setForeground(Color.WHITE);
		lblSha_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSha_2.setBounds(26, 252, 46, 14);
		getContentPane().add(lblSha_2);
		
		JLabel fon = new JLabel("");
		fon.setIcon(new ImageIcon(Frame1.class.getResource("/meta/morphosis/img/back.gif")));
		fon.setBounds(0, 0, 409, 452);
		getContentPane().add(fon);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
