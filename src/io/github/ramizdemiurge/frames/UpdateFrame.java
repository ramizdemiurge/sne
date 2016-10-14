package io.github.ramizdemiurge.frames;
/*
 * @author ramizdemiurge :: metamorphosis
 * @author Ramiz Abdullayev
 * @version 1.3.0.0
 * @website https://github.com/ramizdemiurge/sne
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
 */
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class UpdateFrame extends JDialog {
	private static final long serialVersionUID = 6573669488100183241L;

	private static String newv;

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
	private UpdateFrame() {
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
			JLabel lblYourVersion = new JLabel("Your version: "+io.github.ramizdemiurge.metodlar.getVersion());
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

		JLabel lblNewVersionOf = new JLabel("New version is available");
		lblNewVersionOf.setBounds(144, 11, 258, 14);
		panel.add(lblNewVersionOf);
		lblNewVersionOf.setFont(new Font("Tahoma", Font.BOLD, 12));
		{
			JLabel label = new JLabel("");
			label.setIcon(new ImageIcon(About.class.getResource("/io/github/ramizdemiurge/img/logo_80x80.gif")));
			label.setBounds(20, 21, 80, 80);
			panel.add(label);
		}

		txtHttpsgithubcommetaplusplusssetreemasterexejar = new JTextField();
		txtHttpsgithubcommetaplusplusssetreemasterexejar.setToolTipText("Download URL");
		txtHttpsgithubcommetaplusplusssetreemasterexejar.setBounds(144, 92, 258, 20);
		panel.add(txtHttpsgithubcommetaplusplusssetreemasterexejar);
		txtHttpsgithubcommetaplusplusssetreemasterexejar.setText("http://ramizdemiurge.github.io/sne");
		txtHttpsgithubcommetaplusplusssetreemasterexejar.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						java.net.URL url = null;
						try
						{
							url = new java.net.URL("http://ramizdemiurge.github.io/sne");
						} catch (MalformedURLException e1)
						{
							e1.printStackTrace();
						}
						URI uri = null;
						try
						{
							uri = new URI(url.getProtocol(), url.getHost(), url.getPath(), url.getQuery(), null);
						} catch (URISyntaxException e1)
						{
							e1.printStackTrace();
						}
						try
						{
							Desktop.getDesktop().browse(uri);
						} catch (IOException e1)
						{
							e1.printStackTrace();
						}
						dispose();
					}
				});
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
