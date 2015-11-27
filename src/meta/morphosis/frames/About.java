package meta.morphosis.frames;

/**
 * About.java - about frame
 * @author metamorphosis (meta++)
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

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Toolkit;

public class About extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About frame = new About();
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
	public About() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(About.class.getResource("/meta/morphosis/img/logo_80x80.gif")));
		setTitle("About Super Simple Encoder");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 350, 200);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(14, 16, 316, 104);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(About.class.getResource("/meta/morphosis/img/logo_80x80.gif")));
		label.setBounds(15, 12, 80, 80);
		panel.add(label);
		
		JLabel lblSuperSimpleEncoder = new JLabel("Super Simple Encoder");
		lblSuperSimpleEncoder.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSuperSimpleEncoder.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuperSimpleEncoder.setBounds(105, 12, 166, 23);
		panel.add(lblSuperSimpleEncoder);
		
		JLabel lblVersion = new JLabel("SSE-CORE     version 1.0.0.0");
		lblVersion.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblVersion.setBounds(130, 40, 166, 14);
		panel.add(lblVersion);
		
		JLabel lblNewLabel = new JLabel("Copyright \u00A9 2015  Ramiz A. [meta++]");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setBounds(114, 85, 202, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("SSE-GUI        version 1.5.0.0");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(130, 55, 141, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblUsingApacheCommons = new JLabel("*Using Apache Commons Codec");
		lblUsingApacheCommons.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblUsingApacheCommons.setBounds(130, 70, 166, 14);
		panel.add(lblUsingApacheCommons);
		
		JButton btnNewButton = new JButton("Ok");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				//panel.Dispose(null);
				//contentPane.
				dispose();
				
			}
		});
		btnNewButton.setBounds(134, 138, 71, 23);
		contentPane.add(btnNewButton);
	}
}
