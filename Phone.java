import javax.swing.text.Style;
import java.util.Scanner;
public class Phone {
    public int number, weight;
    public String model, name = "Patrik";

    public void receiveCall(String name) {
            System.out.println("Имя звонящего " + name);
        }

    public String toString(){
        return "Номер : " + this.number + ",, "
                + " Вес телефона : " + this.weight + ",,"
                + "Модель : " + this.model + ",,"
                + "Имя : " + this.name;
    }
    public void getNumber() {
            System.out.println("Номер звонящего " + number);
        }
    public void receiveCall(int number, String name){
        System.out.println("Номер звонящего " + number + " Имя звонящего " + name);
    }

    public void sendMessange(int mass[]){
        for(int i=0; i<mass.length; i++){
            System.out.println(mass[i]);
        }
    }
    public Phone(int num, String mod, int wei) {
        number = num;
        model = mod;
        weight = wei;
        Phone ph = new Phone(1, "model");
    }
    public Phone(int num, String mod){
        model = mod;
        number = num;
    }
    public Phone(){}

    static int getNum(){
        Scanner num = new Scanner(System.in);
        return num.nextInt();
    }

    static String getStr(){
        Scanner str = new Scanner(System.in);
        return str.nextLine();
    }

    public static void main(String [] args){
        Phone ph = new Phone();
        System.out.println("Введите номер 1 телфона ");
        ph.number = getNum();
        System.out.println("Введите модель телфона ");
        ph.model = getStr();
        System.out.println("Введите вес телфона ");
        ph.weight = getNum();

        System.out.println(ph.number + " " + ph.model + " " + ph.weight);
        System.out.println();

        ph.receiveCall("Polka");
        System.out.println();

        ph.getNumber();
        System.out.println();
        ph.receiveCall(ph.number, ph.name);

        System.out.println(ph);

        int n;
        System.out.println("Введите количество номеров");
        n = getNum();
        int[] mass = new int[n];
        for (int i = 0; i<n;i++) {
            mass[i]=getNum();

        }
        ph.sendMessange(mass);
    }
    }
