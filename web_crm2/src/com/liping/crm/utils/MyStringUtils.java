package com.liping.crm.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MyStringUtils {
	
	public static String getMd5Value(String value){
		
		try {
			//1获得jdk提供的消息摘要算法工具
			MessageDigest messageDigest=MessageDigest.getInstance("MD5");
			//加密
			byte[] md5ValueByteArray=messageDigest.digest(value.getBytes());
			//将10进制转换成16进制
			
			BigInteger bigInteger=new BigInteger(1,md5ValueByteArray);
			
			return bigInteger.toString(16);
			
		} catch (Exception e) {
			throw new RuntimeException(e);
			
		}
	}
	

}
