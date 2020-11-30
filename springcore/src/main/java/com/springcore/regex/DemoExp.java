package com.springcore.regex;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DemoExp {
    
	@Value("#{22+30}")
	private int x;
	
	@Value("#{35+25}")
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "DemoExp [x=" + x + ", y=" + y + "]";
	}
	
	
}
