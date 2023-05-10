class Box {
    double width;
    double height;
    double depth;

    double volume() {
        return width * height * depth;
    }
    void setDim(double w, double h, double d) {
        width = w;
        height =h;
        depth=d;
    }
}

class BoxDemo5 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;
        System.out.println("Объем равен " + mybox1.volume());
        System.out.println("Объем равен " + mybox2.volume());
    }
}
