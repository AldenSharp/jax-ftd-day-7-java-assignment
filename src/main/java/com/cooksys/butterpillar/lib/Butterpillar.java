package com.cooksys.butterpillar.lib;

import com.cooksys.butterpillar.model.IButterpillar;

public class Butterpillar implements IButterpillar {
	
	private double length;
	private double leavesEaten;

	@Override
	public int compareTo(IButterpillar o) {
		if(this.length > o.getLength()) {
			return 1;
		}
		if(this.length < o.getLength()) {
			return -1;
		}
		if(this.leavesEaten > o.getLeavesEaten()) {
			return 1;
		}
		if(this.leavesEaten < o.getLeavesEaten()) {
			return -1;
		}
		return 0;
	}

	@Override
	public void setLength(double length) {
		this.length = length;

	}

	@Override
	public double getLength() {
		return length;
	}

	@Override
	public void setLeavesEaten(double leavesEaten) {
		this.leavesEaten = leavesEaten;

	}

	@Override
	public double getLeavesEaten() {
		return leavesEaten;
	}

}
