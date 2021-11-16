public class Euclid {

 
    public static int gcf(int p, int q)
    {
        if (q == 0) return p;
        else return gcf(q, p % q);

    }

    public static int gcff(int p, int q) {
        while (q != 0) {
            int temp = q;
            q = p % q;
            p = temp;
        }
        return p;
    }
    
  
    public static void main(String[] args) {
        int p = Integer.parseInt(args[0]);
        int q = Integer.parseInt(args[1]);
        int d  = gcf(p, q); 
        int d2 = gcff(p, q); 
        System.out.println("gcf(" + p + ", " + q + ") = " + d);
        System.out.println("gcff(" + p + ", " + q + ") = " + d2);
    }
}