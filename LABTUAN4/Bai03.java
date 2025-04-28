package labtuan4;

class Shape{
    private String color = "red";
    private boolean filled = true;
    
    public Shape(){
        this.color = "red";
        this.filled = true;
    }
    
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    
    public void setColor(String color1){
        this.color = color1;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setFilled(boolean filled1){
        this.filled = filled1;
    }
    
    public boolean getFilled(){
        return filled;
    }
    
    @Override
    public String toString(){
        return "color = " + color + ", filled = " + filled;
    }
}

class Circle1 extends Shape{
    private double radius = 1.0;
    
    public Circle1(){
        super();
        this.radius = 1.0;
    }
    
    public Circle1(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    
    public void setRadius(double radius1){
        this.radius = radius1;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public double getArea(){
        return Math.PI * radius * radius;
    }
    
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", radius = " + radius;
    }
}

class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;
    
    public Rectangle(){
        super();
        this.width = 1.0;
        this.length = 1.0;
    }
    
    public Rectangle(double width, double length){
        super();
        this.width = width;
        this.length = length;
    }
    
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    
    public void setWidth(double width1){
        this.width = width1;
    }
    
    public double getWidth(){
        return width;
    }
    
    public void setLength(double length1){
        this.length = length1;
    }
    
    public double getlength(){
        return length;
    }
    
    public double getArea(){
        return width * length;
    }
    
    public double getPerimeter(){
        return (width + length) * 2; 
    }
    
    @Override
    public String toString(){
        return super.toString() + ", width = " + width + ", length = " + length;
    }
}

class Square extends Rectangle{
    public Square(){
        super();
    }
    
    public Square(double side){
        super(side, side);
    }
    
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    
    public void setSide(double side1){
        setWidth(side1);
        setLength(side1);
    }
    
    public double getSide(){
        return getWidth();
    }
    
    @Override
    public String toString(){
        return super.toString() + ", side = " + getSide();
    }
}

public class Bai03 {
    public static void main(String[] args) {
        Shape shape = new Shape("blue", false);
        
        System.out.println(shape.toString());
        
        Circle1 circle = new Circle1(2.0, "green", true);
        
        System.out.println(circle.toString());
        
        System.out.println(circle.getArea());
        
        System.out.println(circle.getPerimeter());
        
        Rectangle rectangle = new Rectangle(3.0, 4.0, "yellow", false);
        
        System.out.println(rectangle.toString());
        
        System.out.println(rectangle.getArea());
        
        System.out.println(rectangle.getPerimeter());
        
        Square square = new Square(2.5, "purple", true);
        
        System.out.println(square.toString());
        
        System.out.println(square.getArea());
        
        System.out.println(square.getPerimeter());
    }
}
