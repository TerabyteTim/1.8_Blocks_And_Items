package com.jim.blocksanditems;

public class Tuple<X, Y, Z> {
    //---------------vars
    private double x, y, z;

    //empty tuple
    public Tuple() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    //---------------int methods
    public Tuple(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return (int) Math.round(this.x);
    }

    public int getY() {
        return (int) Math.round(this.y);
    }

    public int getZ() {
        return (int) Math.round(this.z);
    }

    //---------------double method
    public Tuple(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getXD() {
        return this.x;
    }

    public double getYD() {
        return this.y;
    }

    public double getZD() {
        return this.z;
    }

    //---------------math methods	
    public double distance(Tuple pt) {
        return Math.sqrt(Math.pow(pt.x - this.x, 2)
                + Math.pow(pt.y - this.y, 2) + Math.pow(pt.z - this.z, 2));
    }

    public String distanceSeperated(Tuple pt) {
        int xToDisp = (int) Math.abs(this.x - pt.getX());
        int yToDisp = (int) Math.abs(this.y - pt.getY());
        int zToDisp = (int) Math.abs(this.z - pt.getZ());
        xToDisp = xToDisp != 0 ? xToDisp + 1 : 0;
        yToDisp = yToDisp != 0 ? yToDisp + 1 : 0;
        zToDisp = zToDisp != 0 ? zToDisp + 1 : 0;
        return "x: " + xToDisp + " y: " + yToDisp + " z: " + zToDisp;
    }

    public Tuple add(Tuple toAdd) {
        return new Tuple(this.x += toAdd.x, this.y += toAdd.y,
                this.z += toAdd.z);
    }

    public Tuple add(int newX, int newY, int newZ) {
        return new Tuple(this.x += newX, this.y += newY, this.z += newZ);
    }

    public Tuple add(double newX, double newY, double newZ) {
        return new Tuple(this.x += newX, this.y += newY, this.z += newZ);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Tuple)) {
            return false;
        }
        Tuple other = (Tuple) obj;
        return other.getX() == this.x && other.getY() == this.y
                && other.getZ() == this.z;
    }

    //---------------misc methods
    public void empty() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ", " + this.z + ")";
    }

    public Tuple toBlockPoint() {
        return new Tuple(Math.floor(this.x), Math.floor(this.y),
                Math.floor(this.z));
    }
}
