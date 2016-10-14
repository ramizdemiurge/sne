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

public class Splashframe
{
    public static void main(int a)
    {
        JWindow window = new JWindow();
        //Image duduk = new ImageIcon(this.getClass().getResouce("/splash.gif")).getImage();
        window.getContentPane().add(new JLabel("", new ImageIcon(Splashframe.class.getResource("/io/github/ramizdemiurge/img/SNE_logo.gif")), SwingConstants.CENTER));
        window.setBounds(500, 150, 402, 302);
        window.setLocationRelativeTo(null);
        window.setAlwaysOnTop(true);
        window.setVisible(true);
        try
        {
            Thread.sleep(a);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        window.setVisible(false);
        /*
        JFrame frame = new JFrame();
        frame.add(new JLabel("Welcome"));
        frame.setVisible(true);
        frame.setSize(300,100); */

        window.dispose();
        MFrame.main(null);
    }
    public void make(int msec)
    {
        main(msec);
    }


}
