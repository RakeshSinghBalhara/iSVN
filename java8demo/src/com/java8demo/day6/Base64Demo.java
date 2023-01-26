package com.java8demo.day6;

import java.util.Arrays;
import java.util.Base64;
import java.util.List;

public class Base64Demo {
	public static void main(String[] args) {
		
		String password = "ThisisPassword@12345";
		
		String str = Base64.getEncoder().encodeToString(password.getBytes()); //VGhpc2lzUGFzc3dvcmRAMTIzNDU=
		System.out.println("encodeToString:- "+str);
		
		byte[] decode = Base64.getDecoder().decode(str);
		String s  = new String(decode);
		System.out.println(s);
		
		System.out.println(new String(Base64.getDecoder().decode(str)));
		
		String url = "https://www.google.com/";
		
		byte[] encode = Base64.getUrlEncoder().encode(url.getBytes());
		System.out.println(new String(encode));
		
		byte[] decode2 = Base64.getUrlDecoder().decode(encode);
		System.out.println("Array size "+decode2.length);
		System.out.println("String length".length());
		List<Integer> asList = Arrays.asList(45,67,98,56,45);
		System.out.println(asList.size());
		
		Employee emp = new Employee(1, "Sandeep");
		System.out.println(emp);
		
		System.out.println("--------- "+ decode.toString());
		System.out.println(decode.toString());
		
		System.out.println(new String(decode2));
		
		// len
	}

}
