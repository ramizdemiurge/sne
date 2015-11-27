package meta.morphosis;
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
public class metodlar 
{
	private static final String version = "1.0.0.0";
	private static final String author = "Ramiz Abdullayev :: metamorphosis (meta++)";
	
	
	public static String getVersion() 
	{
    	return version;
    }
	
	public static String getAuthor() 
	{
    	return author;
    }
	

    public static String BYTETOSTRING(byte[] bytes)
    {
        String str = "";
        for(int i = 0; i < bytes.length; str += (char)bytes[i++]);
        return str;
    }


    //------ MD5 ------------------------------------
    public static String Do_md5(String anyarg) 
    {
        
        return org.apache.commons.codec.digest.DigestUtils.md5Hex(anyarg);
    }
    
    //------ MD2 ------------------------------------
    public static String Do_md2(String anyarg) 
    {
        
        return org.apache.commons.codec.digest.DigestUtils.md2Hex(anyarg);
    }
    
    //------ Sha384 ---------------------------------
    public static String Do_sha384(String anyarg) 
    {
        
        return org.apache.commons.codec.digest.DigestUtils.sha384Hex(anyarg);
    }
    
    //------ Sha256 ---------------------------------
    public static String Do_sha256(String anyarg) 
    {
    	
        return org.apache.commons.codec.digest.DigestUtils.sha256Hex(anyarg);
    }
    
    //------ Sha512 ---------------------------------
    public static String Do_sha512(String anyarg) 
    {
    	
        return org.apache.commons.codec.digest.DigestUtils.sha512Hex(anyarg); 
    }
    
    //------ UnixCrypt -------------------------------
    public static String Do_ucrypt(String anyarg) 
    {
    	
        return org.apache.commons.codec.digest.UnixCrypt.crypt(anyarg); 
    }
    
    
    //String sha256hex = org.apache.commons.codec.digest.DigestUtils.sha256Hex(stringText);   
    //------ Sha1 ------------------------------------
    public static String Do_sha1(String anyarg) 
    {
       
        return org.apache.commons.codec.digest.DigestUtils.sha1Hex(anyarg);
    }


  //------ Base64 ----------------------------------
    public static String Do_enBase64(String anyarg) 
    {
        byte[] z = org.apache.commons.codec.binary.Base64.encodeBase64(anyarg.getBytes());
        return BYTETOSTRING(z);
    }
  //------ Base64dec ----------------------------------
    public static String Do_decBase64(String anyarg) 
    {
        byte[] z = org.apache.commons.codec.binary.Base64.decodeBase64(anyarg);

        return BYTETOSTRING(z);
    }
    
    //------ Base32 ----------------------------------
   /* public static String Do_enBase32(String anyarg) {
        //byte[] z = org.apache.commons.codec.binary.Base32(anyarg.getBytes());
        		//.encodeBase64(anyarg.getBytes());
        //anyarg = BYTETOSTRING(z);
        return anyarg;
    } */


    //------ Hex ------------------------------------
    public static String Do_hex(String anyarg) 
    {
    	
        return org.apache.commons.codec.binary.Hex.encodeHexString(anyarg.getBytes(/* charset */));
    }

    //------ Char -----------------------------------
    public static String Do_char(String anyarg) 
    {
    	String temp="";
    	char z[] = anyarg.toCharArray();
    	
    	for(int i=0;i <= (z.length-1); i++)
    	{
    		int ascii = (int) z[i];
    		if(i<(z.length-1))
    		{
    			
    		temp += String.valueOf(ascii+",");
    		}
    		else
    			{
    			temp += String.valueOf(ascii);
    			}

    	}
    
        return "Char("+temp+")";
    }
    
   

}
