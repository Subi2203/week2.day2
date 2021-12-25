package org.system;

public class Assignment1_Desktop extends Assignment1_Computer{

	public void desktopSize() {
		System.out.println("Desktop size is 17 inch");
	}
	public static void main(String[] args) {
		
		Assignment1_Desktop desk = new Assignment1_Desktop();
		desk.desktopSize();
		desk.computerModel();

	}

}
