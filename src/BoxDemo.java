class Box {
    double width;
    double height;
    double depth;
    Box(double w,double h, double d){
        System.out.println("Конструирование объекта Box");
        width=w;
        height=h;
        depth=d;
    }
    double volume() {
        return width * height * depth;
    }
}
class BoxDemo6 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        vol=mybox1.volume();
        System.out.println("Объем равен " + vol);
        vol=mybox2.volume();
        System.out.println("Объем равен " + vol);
    }
}
