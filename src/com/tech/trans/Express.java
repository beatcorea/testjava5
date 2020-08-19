package com.tech.trans;

public class Express extends Trans implements Start, End{
	private int eDan;
	public Express(int cusCnt, int dis, int eDan) {
		super(cusCnt, dis);
		this.eDan=eDan;
	}
	
	@Override
	public int getCharge() {
		return cusCnt*dis*eDan;
	}

}
