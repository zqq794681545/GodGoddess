package com.godgoddess.base.util;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.MessageDigest;

public class Md5 {

	public static String md5Digest(String src) {
		// 定义数字签名方法, 可用：MD5, SHA-1
		MessageDigest md;
		byte[] b = null;
		try {
			md = MessageDigest.getInstance("MD5");
			b = md.digest(src.getBytes("utf-8"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return byte2HexStr(b).toLowerCase();
	}

	private static String byte2HexStr(byte[] b) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < b.length; i++) {
			String s = Integer.toHexString(b[i] & 0xFF);
			if (s.length() == 1) {
				sb.append("0");
			}
			sb.append(s.toUpperCase());
		}
		return sb.toString();
	}
	
	public static String md5Digest(File file) {
		
		byte[] b = getBytes(file);
		return byte2HexStr(b).toLowerCase();
	}
	
	private static byte[] getBytes(File file){
		
        byte[] buffer = null;  
        try {  
            FileInputStream fis = new FileInputStream(file);  
            ByteArrayOutputStream bos = new ByteArrayOutputStream(1000);  
            byte[] b = new byte[1000];  
            int n;  
            while ((n = fis.read(b)) != -1) {  
                bos.write(b, 0, n);  
            }  
            fis.close();  
            bos.close();  
            buffer = bos.toByteArray();  
        } catch (FileNotFoundException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
        return buffer;  
    }
	
	public static void main(String[] arg){
		
		String str = md5Digest(new File("E:\\Downloads\\P60908-083741.jpg"));
		System.out.println(str);
	}
	
}
