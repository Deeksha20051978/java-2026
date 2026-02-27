interface A{
    void show();
}
interface B{
    void show();
}
class C implements A,B{
    public void show(){
        System.out.println("Diamond solution");
    }
}
class diamond {
    public static void main(String[] args) {
        C c = new C();
        c.show();
    }
    
}
