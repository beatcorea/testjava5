package com.tech.trans;

public abstract class Trans {
	protected int cusCnt;//인원
	protected int dis;//이동거리
	
	public Trans(int cusCnt, int dis) {
		this.cusCnt=cusCnt;
		this.dis=dis;
	}
	
	public abstract int getCharge();
	
	@Override
	public String toString() {
		return cusCnt+":"+dis;
	}

}
