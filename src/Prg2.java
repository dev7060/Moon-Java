//if else ladder Java
class Prg2 {
    public static void main(String... args){
        //int a = 5, b = 6, c = 7;
        //int a=10, b=9, c=8;
        int a=5, b=7, c=6;
        if(a>b && a>c){
            System.out.println("A = " + a + " is the greatest!");
        }else if(b>a && b>c){
            System.out.println("B = " + b + " is the greatest!");
        }else{
            System.out.println("C = " + c + " is the greatest!");
        }
    }
}