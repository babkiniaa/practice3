import java.util.Scanner;

public class Books {

    public static class Book {
        private String title;
        private int years;

        public Book(String title, int years) {
            this.title = title;
            this.years = years;
        }
        public Book(){

        }
        public String toString(){
            return "Книга называется : " + this.title + ",, "
                    + " Книга была издана в : " + this.years;
        }
    }
    public static class Author {
        private String name, pol, email;
        public Author(String name, String pol, String email){
                this.name = name;
                this.pol = pol;
                this.email = email;

        }
        public Author(){}
        public String toString(){
            return "Имя автора: " + this.name + ",, "
                    + " Пол автора : " + this.pol + ",,"
                    + " email автора : " + this.email;
        }
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
        String title;
        int years;
        System.out.println("Введите название книги");
        title = getStr();
        System.out.println("Введите год издания книги");
        years = getNum();
        Book Bo = new Book(title, years);
        System.out.println(Bo);

        String name,pol,email;
        System.out.println("Введите имя автора");
        name = getStr();
        System.out.println("Введите пол автора");
        pol = getStr();
        System.out.println("Введите email автора");
        email = getStr();
        Author au = new Author(name, pol, email);
        System.out.println(au);

    }
}