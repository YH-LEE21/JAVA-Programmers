public class Solution{


        public static int bs(int[] a, int x, int low, int high) {
            if(low > high) return low;
            int mid = (low + high) / 2;
            if(x == a[mid]) return mid;
            if(x < a[mid]) return bs(a,x,low,mid-1);
            else return bs(a,x,mid+1,high);
        }

        public static int bs_left(int[] a,int x,int low,int high) {
            if(low > high) return low;
            int mid = (low + high) / 2;
            if(x <= a[mid]) return bs_left(a,x,low,mid-1);
            else return bs_left(a,x,mid+1,high);
        }
        public static int bs_right(int[] a,int x,int low,int high) {
            if(low > high) return low;
            int mid = (low + high) / 2;
            if(x >= a[mid]) return bs_right(a,x,mid+1,high);
            else return bs_right(a,x,low,mid-1);
        }
    public static void main(String[] args) {
        int[] a = {10,20,20,20,30,40,70};
        int[] x = {5,50,80,30,20};
        for(int i = 0;i<x.length;i++){
            System.out.print(bs(a,x[i],0,a.length-1)+ " ");
            System.out.print(bs_left(a,x[i],0,a.length-1)+" ");
            System.out.println(bs_right(a,x[i],0,a.length-1));
        }
    }
}
