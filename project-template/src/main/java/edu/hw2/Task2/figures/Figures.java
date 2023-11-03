package edu.hw2.Task2.figures;

public class Figures {
    public static class Rectangle {
        public final int width;
        public final int height;

        public Rectangle(int height, int width) {
            this.height = height;
            this.width = width;
        }

        public double area() {
            return width * height;
        }
        public Rectangle setWidth(int width){
            return new Rectangle(this.height, width);
        }
        public Rectangle setHeight(int height){
            return new Rectangle(height, this.width);
        }
    }

    public class Square extends Rectangle {
        public Square(int width) {
            super(width, width);
        }


    }

}
