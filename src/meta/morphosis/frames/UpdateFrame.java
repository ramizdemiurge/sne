package meta.morphosis.frames;
/**
 * 
 * @author metamorphosis (meta++)
 * @author Ramiz Abdullayev
 * @version 1.0.0.0
 * https://github.com/metaplusplus/sse
 * 
 * Copyright 2015 Ramiz Abdullayev
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import java.awt.Color;

public class UpdateFrame extends JDialog {
	private static final long serialVersionUID = 6573669488100183241L;

	public static String newv;

	private final JPanel contentPanel = new JPanel();
	private JTextField txtHttpsgithubcommetaplusplusssetreemasterexejar;

	/**
	 * Launch the application.
	 */
	public static void main(String newver) {
		try {
			newv = newver;
			UpdateFrame dialog = new UpdateFrame();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public UpdateFrame() {
		setAutoRequestFocus(false);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setTitle("Update notifier");
		setResizable(false);
		setFont(new Font("Tahoma", Font.PLAIN, 12));
		setBounds(100, 100, 450, 216);
		setAlwaysOnTop(true);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(0, 0, 0, 0));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 11, 414, 123);
		contentPanel.add(panel);
		panel.setLayout(null);
		{
			JLabel lblYourVersion = new JLabel("Your version: "+meta.morphosis.metodlar.getVersion());
			lblYourVersion.setBounds(144, 36, 258, 14);
			panel.add(lblYourVersion);
			lblYourVersion.setFont(new Font("Tahoma", Font.PLAIN, 11));
		}
		{
			JLabel lblNewVersion = new JLabel("New version: "+newv);
			lblNewVersion.setBounds(144, 61, 258, 14);
			panel.add(lblNewVersion);
			lblNewVersion.setFont(new Font("Tahoma", Font.PLAIN, 11));
		}
		
		JLabel lblNewVersionOf = new JLabel("New version of SSE are available");
		lblNewVersionOf.setBounds(144, 11, 258, 14);
		panel.add(lblNewVersionOf);
		lblNewVersionOf.setFont(new Font("Tahoma", Font.BOLD, 12));
		{
			JLabel label = new JLabel("");
			label.setIcon(new ImageIcon(About.class.getResource("/meta/morphosis/img/logo_80x80.gif")));
			label.setBounds(20, 21, 80, 80);
			panel.add(label);
		}
		
		txtHttpsgithubcommetaplusplusssetreemasterexejar = new JTextField();
		txtHttpsgithubcommetaplusplusssetreemasterexejar.setForeground(Color.RED);
		txtHttpsgithubcommetaplusplusssetreemasterexejar.setBackground(Color.WHITE);
		txtHttpsgithubcommetaplusplusssetreemasterexejar.setToolTipText("Download URL");
		txtHttpsgithubcommetaplusplusssetreemasterexejar.setBounds(144, 92, 258, 20);
		panel.add(txtHttpsgithubcommetaplusplusssetreemasterexejar);
		txtHttpsgithubcommetaplusplusssetreemasterexejar.setText("https://github.com/metaplusplus/sse/tree/master/EXE+JAR");
		txtHttpsgithubcommetaplusplusssetreemasterexejar.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
