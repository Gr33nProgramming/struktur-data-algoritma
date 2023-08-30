package Rekursif;

public class Belajar1 {
    public static void main(String[] args) {
        System.out.println(pangkatRekursif(2,3));
        System.out.println(faktorial(5));
        System.out.println(cekNilai(5));
    }
    private static int pangkatRekursif(int x, int n){
        if(n == 0){
            return 1;
        }else if(n > 0){
            return x * pangkatRekursif(x, n - 1);
        }else{
            return (1 / pangkatRekursif(x, -n));
        }
    }
    private static int faktorial(int n){
        if(n == 0){
            return 1;
        }else{
            return n * faktorial(n - 1);
        }
    }
    private static int cekNilai(int n){
        return n * (n - 1) ;
    }
}
