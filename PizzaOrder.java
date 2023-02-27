import java.util.Scanner;

public class PizzaOrder {
    private String name, adres;
    private String Enum;
    private Boolean soys, complete = false;

    public PizzaOrder(String name, String adres, String Enum, Boolean soys){
        this.name = name;
        this.adres = adres;
        this.Enum = Enum;
        this.soys = soys;
    }
    public PizzaOrder(){}
    public void order(){
        if (!this.complete) {
            if (soys){
                System.out.println("Заказ принят " + this.Enum + " Пицца " + this.name + " по адресу " + this.adres + " c соусом ");
                this.complete = true;
            }
            if (!soys){
                System.out.println("Заказ принят " + this.Enum + " Пицца " + this.name + " по адресу " + this.adres + " без соуса ");
                this.complete= true;
            }
        } else{System.out.println("Заказ уже принят");}
    }
    public void cancel(){
        System.out.println("Заказ отменен");
        this.complete = false;
    }

    public String toString() {
        return "Название пиццы " + this.name + ",, "
                    + " адрес : " + this.adres + ",,"
                    + " Размер : " + this.Enum + ",,"
                    + " нужен ли соус " + this.soys + ",,"
                    + " Принят ли  : " + this.complete;
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
        String name, adres;
        String Enum;
        Boolean soys;
        int a;
        System.out.println("Название пиццы");
        name = getStr();
        System.out.println("адрес");
        adres = getStr();
        System.out.println("размер");
        Enum = getStr();
        System.out.println("Наличие соуса 1-да 2 нет");
        a = getNum();
        if (a==1){soys = true;}else{soys = false;}
        PizzaOrder Pi = new PizzaOrder(name, adres, Enum, soys);
        Pi.order();
        Pi.order();
        Pi.cancel();
        System.out.println(Pi);
    }
    }