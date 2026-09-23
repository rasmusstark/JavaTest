package Vecka3Övningar;

public class Rectangle {

    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;

    }
    public int calculateArea(){
        return width*height;
    }
    public int calculatePerimeter(){
        return width+width+height+height;
    }

    public String isSquare(){
        if (width == height){
            return "Kvadrat";
        }
        return "Ej kvadrat";
    }

    }

