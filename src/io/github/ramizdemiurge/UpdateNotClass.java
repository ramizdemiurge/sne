package io.github.ramizdemiurge;
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
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;


class UpdateNotClass {
	static class Updater extends Thread {
		private static String ver = io.github.ramizdemiurge.metodlar.getVersion();
		@Override
		public void run()
		{
			try
			{
	        URLConnection connection = new URL("https://raw.githubusercontent.com/ramizdemiurge/sne/master/VERSION").openConnection();
	        InputStream is = connection.getInputStream();
	        InputStreamReader reader = new InputStreamReader(is);
	        char[] buffer = new char[256];
	        int rc;
	        StringBuilder sb = new StringBuilder();
	        while ((rc = reader.read(buffer)) != -1)
	        sb.append(buffer, 0, rc);
	        reader.close();
	        if (!Objects.equals(ver, sb.toString()))
	        {
	        //System.out.println(ver+"!="+sb);
	        //JOptionPane.showMessageDialog(null, "Download new version "+sb.toString()+" from github page!");
	        	try {
	        		sleep(600);
	        	}catch (InterruptedException iex) {}
				io.github.ramizdemiurge.frames.UpdateFrame.main(sb.toString());
	        }

	        //------------
			}
			catch(Exception asdasd)
			{System.out.println("Error with connection to server.");}

		}


	}

}
