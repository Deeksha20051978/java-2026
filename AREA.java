
class rectangle {
    int l;
    int b;
    rectangle(int l, int b){
        this.l = l;
        this.b = b;
        
    }
    int area(){
        return l*b;  
    }
    int perimeter(){
        return 2*(l+b);
    }
}

public class AREA {
    public static void main(String[] args){
        rectangle r=new rectangle(5,10);
        System.out.println(r.area());
        System.out.println(r.perimeter());
    }
}
