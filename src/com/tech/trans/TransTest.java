package com.tech.trans;

public class TransTest {
	public static void printCharge(Trans tran) {
		System.out.println("============");
		System.out.println(tran.toString());
		System.out.println("------------");
		System.out.println(tran.getCharge());
		System.out.println("------------");
	}
	
	public static void main(String[] args) {
		Trans[] trans=new Trans[4];
		trans[0]=new Train(5,100,200);
		trans[1]=new Express(10,100,100);
		trans[2]=new Train(2,10,500);
		trans[3]=new Train(1,100,200);
		for (Trans tran : trans) {
			printCharge(tran);
			}
		for (int i = 0; i < trans.length; i++) {
			printCharge(trans[i]);
		}
	}

}
