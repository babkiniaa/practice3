public class PaintExample {
    public static void main(String[] args){
        Circle ci = new Circle();
        System.out.println(FigureUtil.area(ci));
        System.out.println(FigureUtil.perimeter(ci));
        FigureUtil.draw(ci);
        FigureUtil.draw(ci, Figure.Color.Yellow);

        Rectangle re = new Rectangle();
        System.out.println(FigureUtil.area(re));
        System.out.println(FigureUtil.perimeter(re));
        FigureUtil.draw(re);
        FigureUtil.draw(re, Figure.Color.Green);

        Sqare sq = new Sqare();
        System.out.println(FigureUtil.area(sq));
        System.out.println(FigureUtil.perimeter(sq));
        FigureUtil.draw(sq);
        FigureUtil.draw(sq, Figure.Color.White);

        Triangle tr = new Triangle();
        System.out.println(FigureUtil.area(tr));
        System.out.println(FigureUtil.perimeter(tr));
        FigureUtil.draw(tr);
        FigureUtil.draw(tr, Figure.Color.Blue);

    }
}
