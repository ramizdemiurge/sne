package meta.morphosis;

public class metodlar {
	

    public static String BYTETOSTRING(byte[] bytes)
    {
        String str = "";
        for(int i = 0; i < bytes.length; str += (char)bytes[i++]);
        return str;
    }


    //------ MD5 ------------------------------------
    public static String Do_md5(String anyarg) {
        anyarg = org.apache.commons.codec.digest.DigestUtils.md5Hex(anyarg);
        return anyarg;
    }
    
    //------ MD2 ------------------------------------
    public static String Do_md2(String anyarg) {
        anyarg = org.apache.commons.codec.digest.DigestUtils.md2Hex(anyarg);
        return anyarg;
    }
    
    //------ Sha384 ---------------------------------
    public static String Do_sha384(String anyarg) {
        anyarg = org.apache.commons.codec.digest.DigestUtils.sha384Hex(anyarg);
        return anyarg;
    }
    
    //------ Sha256 ---------------------------------
    public static String Do_sha256(String anyarg) {
    	anyarg = org.apache.commons.codec.digest.DigestUtils.sha256Hex(anyarg); 
        return anyarg;
    }
    
    //------ Sha512 ---------------------------------
    public static String Do_sha512(String anyarg) {
    	anyarg = org.apache.commons.codec.digest.DigestUtils.sha512Hex(anyarg); 
        return anyarg;
    }
    
    //------ UnixCrypt -------------------------------
    public static String Do_ucrypt(String anyarg) {
    	anyarg = org.apache.commons.codec.digest.UnixCrypt.crypt(anyarg); 
        return anyarg;
    }
    
    
    //String sha256hex = org.apache.commons.codec.digest.DigestUtils.sha256Hex(stringText);   
    //------ Sha1 ------------------------------------
    public static String Do_sha1(String anyarg) {
        anyarg = org.apache.commons.codec.digest.DigestUtils.sha1Hex(anyarg);
        return anyarg;
    }


    //------ Base64 ----------------------------------
    public static String Do_enBase64(String anyarg) {
        byte[] z = org.apache.commons.codec.binary.Base64.encodeBase64(anyarg.getBytes());
        anyarg = BYTETOSTRING(z);
        return anyarg;
    }
    
    //------ Base32 ----------------------------------
   /* public static String Do_enBase32(String anyarg) {
        //byte[] z = org.apache.commons.codec.binary.Base32(anyarg.getBytes());
        		//.encodeBase64(anyarg.getBytes());
        //anyarg = BYTETOSTRING(z);
        return anyarg;
    } */


    //------ Hex ------------------------------------
    public static String Do_hex(String arg) {
        arg = org.apache.commons.codec.binary.Hex.encodeHexString(arg.getBytes(/* charset */));
        return arg;
    }

    //------ Char -----------------------------------
    public static String Do_char(String arg) 
    {
    	String temp="";
    	char z[] = arg.toCharArray();
    	
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
    
    	temp = "Char("+temp+")";
        return temp;
    }

}
