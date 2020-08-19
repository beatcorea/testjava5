package com.tech.trans;

public class Train extends Trans{
	private int tDan;
	public Train(int cusCnt, int dis, int tDan) {
		super(cusCnt, dis);
		this.tDan=tDan;
	}
	
	@Override
	public int getCharge() {
		return cusCnt*dis*tDan;
	}

}
