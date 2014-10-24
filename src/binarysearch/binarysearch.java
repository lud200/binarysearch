package binarysearch;
import java.util.*;
import java.io.*;

public class binarysearch {
	public static void main(String[] args){
		test t=new test();
		String s=t.cat(68, 108);
		System.out.println(s);
		test t2=new test();
		String s2=t.cat(35, 59);
		System.out.println(s2);
	}
}

class test{
	public String cat(int a, int b){
		StringBuffer sb=new StringBuffer();
		for(int i=a;i<=b;i++){
			char c=(char)i;
			sb.append(c);
		}
		String s=sb.toString();
		return s;
	}
}