package com.lbg.classes;

public class PotatoVariety {
    private String name;
    private double averageMass;
    private String texture;

    private static boolean edible = true;

    public PotatoVariety(String name, double averageMass, String texture){
        this.name = name;
        this.averageMass = averageMass;
        this.texture = texture;
    }
    public PotatoVariety(String name){
        this(name, 0, null);
    }

    @Override
    public String toString() {
        // return super.toString();
        StringBuilder str = new StringBuilder();
        str.append("Name: ");
        str.append(this.getName());
        str.append("\n Average Mass: ");
        str.append(this.getAverageMass());
        str.append("\n Texture: ");
        str.append(this.getTexture());
        str.append("\n Edible: ");
        str.append(this.getEdible());
        return str.toString();
    }

    public String getName(){
        return this.name;
    }
    public double getAverageMass(){ return this.averageMass;
    }
    public String getTexture(){
        return this.texture;
    }

    public boolean getEdible() { return edible; }
}
