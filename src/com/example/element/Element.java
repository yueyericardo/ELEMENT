package com.example.element;

public class Element {
	private String name;
	private int mp3;
	private int imageID;

	public Element(String name, int mp3) {
		this.name = name;
		this.mp3 = mp3;
	}
	public Element(String name, int mp3,int imageID) {
		this.name = name;
		this.mp3 = mp3;
		this.imageID=imageID;
	}

	public String getName() {
		return name;
	}

	public int getmp3() {
		return mp3;
	}

	public int getImageID() {
		return imageID;
	}

}
