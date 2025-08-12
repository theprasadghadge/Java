public class fibonachi {

    public static void fibonachiNo(int limit)

    {
        long n1 = 0;
        long n2 = 1;
        System.out.println("1:"+n1);
        System.out.println("2:"+n2);
        for (int i = 0; i < limit - 2; i++) {
            long result = n1 + n2;
            System.out.println((i+3)+":"+result);
            n1 = n2;
            n2 = result;
        }
    }
       public static void main(String[] args) {
        fibonachiNo(50);
    }

}
