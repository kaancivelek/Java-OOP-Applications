import java.util.Date;
public class GeometricObject {

 private String color;
 private Boolean fillStatus;
private Date dateCreated = new Date();

 void GeometricObject(){}


    public String getColor(){return color;}
    public void setColor(String color){this.color = color;}

    public void setFillStatus(Boolean fillStatus){this.fillStatus = fillStatus;}
    public Boolean isFilled(){return fillStatus;}

    public Date getDateCreated(){return dateCreated;}
    String dateCreatedString(){return dateCreated.toString();}

}


class Circle extends GeometricObject {
    private double radius;


    void Circle(){}
    void Circle(double radius){this.radius = radius;}
    double getRadius(){return radius;}
    void setRadius(double radius){this.radius = radius;}
    double getArea(){return Math.PI * radius * radius;}
    double getPerimeter(){return 2 * Math.PI * radius;}
    double getDiameter(){return 2 * radius;}

    void circleInfo(){
        System.out.printf("Radius: %.2f Area: %.2f Perimeter: %.2f Diameter: %.2f Created Time: %s\n",getRadius(),
                getArea(), getPerimeter(), getDiameter(), dateCreatedString());
    }

}

class Rectangle extends GeometricObject {
    private double height;
    private double width;
    void Rectangle(){}
    void Rectangle(double length, double width){this.height = length;this.width = width;}
    double getHeight(){return height;}
    void setHeight(double height){this.height =height;}
    double getWidth(){return width;}
    void setWidth(double width){this.width = width;}
    double getArea(){return height * width;}
    double getPerimeter(){return 2*width+2 * height;}

    void rectangleInfo(){
        System.out.printf("Height: %.2f Width: %.2f Area: %.2f Perimeter: %.2f Created Time: %s\n",getHeight(),
                getWidth(), getArea(), getPerimeter(), dateCreatedString());}
}