//200% asking in interview whch i will never attend lets gooo!!
class Book{
    String title;
    Book(String title){
        this.title = title;
    }
}
class Library{
    String name;
    Book book;
    Library(String name,String title){
        this.name = name;
        this.book = new Book(title);
    }
    void show(){
        System.out.print(name+"has book "+book.title);
    }
    
}
public class comp {
    public static void main(String[] args) {
        Library l = new Library("teenage dreams ","summertime memories");
        l.show();
    }
    
}
