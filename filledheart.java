public class filledheart {
    public static void main(String[] args) {
        for(double y=1.5; y>=-1.5;y-=0.1){
            for(double x=-1.5;x<=1.5;x+=0.05){
                double a = x*x+y*y-1;
                if(a*a*a-x*x*y*y*y<=0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
