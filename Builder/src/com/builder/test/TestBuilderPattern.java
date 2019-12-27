package com.builder.test;

import com.builder.Computer;

public class TestBuilderPattern {
	public static void main(String[] args) {
		// without any inconsistent state or arguments management issues
		Computer comp = new Computer.ComputerBuilder("500 GB", "2 GB").setBluetoothEnabled(true)
				.setGraphicsCardEnabled(true).build();	
	}
}