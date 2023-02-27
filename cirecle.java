import javax.swing.text.Style;
import java.util.Scanner;
public class cirecle {
    public int radius;
    public String color;
    public void Area() {
            System.out.println("Площадь круга = " + (radius * radius * 3.14));
        }
    public void Perimetr() {
            System.out.println("Периметр круга = " + (2 * radius * 3.14));
        }
    public cirecle(int rad, String col) {
        radius = rad;
        color = col;
    }
    public String toString() {
        return "Радиус : " + this.radius + ",, "
                + " Цвет : " + this.color;
    }

    static int getNum(){
        Scanner num = new Scanner(System.in);
        return num.nextInt();
    }
    static String getStr(){
        Scanner str = new Scanner(System.in);
        return str.nextLine();
    }
    public static void main(String[] args) {
        int rad;
        String color;
        System.out.println("Введите радиус : ");
        rad = getNum();
        System.out.println("Введите цвет : ");
        color = getStr();
        cirecle ci = new cirecle(rad,color);
        ci.Area();
        ci.Perimetr();
        System.out.println(ci);

    }
}
