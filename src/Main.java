public class Main {
    public static void main(String[] args) {

        int x =(int) Math.floor(Math.random()*100);
        Shape[] shapes =new Shape[3];
        shapes[0] =new Circle(x,"yellow",false);
        shapes[1] = new Shape(x, x, "yellow", false) {
            @Override
            public void resize(double percent) {

            }
        };
        shapes[2] = new Shape(x, "yellow", true) {
            @Override
            public void resize(double percent) {

            }
        };
        for (Shape a:
                shapes) {
            System.out.println(a);
        }
        for (Shape a:
                shapes) {
            a.resize(Math.random()*100);
        }
        System.out.println(shapes);
    }


}