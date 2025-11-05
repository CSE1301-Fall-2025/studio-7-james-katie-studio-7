public class Rectangle {
    private int width;
    private int length;

    public Rectangle(int iniWidth, int iniLength) {
        width = iniWidth;
        length = iniLength;
    }

    public double perimeter() {
        double per = 2*(width + length);
        return per;
    }
    
    public double area() {
        double area = width*length;
        return area;
    }

    public boolean comparison(Rectangle a) {
        double areaA = a.area();
        double areaB = this.area();
        if (areaA < areaB) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        Rectangle a = new Rectangle(1,1);
        Rectangle b = new Rectangle(2,2);
        System.out.println(b.comparison(a));
    }
}
	