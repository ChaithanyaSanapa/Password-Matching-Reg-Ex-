package com.java.RegExpressions;
import java.util.regex.Matcher;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Match4Password {
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print(" Enter Password  (It shoud contain 1 Caps,1 Specialchar,1 Numeric ) : ");
	  String exp="(?=.*[!@#$%^&*])(?=.*[A-Z])(?=.*[0-9]).{6,9}";
	  String p1=s.next();
	  Pattern p=Pattern.compile(exp);
	  Matcher m=p.matcher(p1);
	  if(m.matches()) System.out.println(" Valid Password ");
	  else System.out.println(" Invalid Password ");
	}
}