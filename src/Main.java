class Box{
    double width;
    double height;
    double depth;

    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    double volume(){
        return width*height*depth;
    }
}

public class Main{
    public static void main(String[] args) {
        Box box1 = new Box(10,20,15);
        Box box2 = new Box(3,6,9);

        double vol;

        vol = box1.volume();
        System.out.println("Объем равен: " + vol);
        vol = box2.volume();
        System.out.println("Объем равен: " + vol);
    }
}