package com.jim.blocks;

public class Vector3 {
	
	public Vector3(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Vector3(Vector3 prevVector) {
		this.x = prevVector.x;
		this.y = prevVector.y;
		this.z = prevVector.z;
	}
	
	public int x;
	public int y;
	public int z;
	
	public void add (Vector3 vector) {
		this.x += vector.x;
		this.y += vector.y;
		this.z += vector.z;
	}
}