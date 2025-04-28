package labtuan4;

class Circle{
    private double radius = 1.0;
    private String color = "red";
    
    public Circle(){
        this.radius = 1.0;
        this.color = "red";
    }
    
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    
    public void setRadius(double radius1){
        this.radius = radius1;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public void setColor(String color1){
        this.color = color1;
    }
    
    public String getColor(){
        return color;
    }
    
    public double getArea(){
        return Math.PI * radius * radius;
    }
    
    @Override
    public String toString(){
        return "radius = " + radius + ", color = " + color;
    }
}

class Cylinder extends Circle{
    private double height = 1.0;
    
    public Cylinder(){
        super();
        this.height = 1.0;
    }
    
    public Cylinder(double radius){
        super(radius, "red");
        this.height = 1.0;
    }
    
    public Cylinder(double radius, double height){
        super(radius, "red");
        this.height = height;
    }
    
    public void setHeight(double height1){
        this.height = height1;
    }
    
    public double getHeight(){
        return height;
    }
    
    public double getVolume(){
        return getArea() * height;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", height = " + height;
    }
}

public class Bai01 {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0, "blue");
        
        System.out.println(circle.toString());
        
        System.out.println(circle.getArea());
        
        Cylinder cylinder = new Cylinder(2.0, 3.0);
        cylinder.setColor("green");
        
        System.out.println(cylinder.toString());
        
        System.out.println(cylinder.getVolume());
    }
}
