/*input: 6
23 10 12 25 11 13
output: 4 
*/

import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int count=0,res=0;
        Arrays.sort(a);
        for(int i=0;i<n;i++)
        {
            if(i>0 && a[i]==a[i-1]+1){
                count++;
            }
            else{
                count=1;
            }
            res=Math.max(res,count);
        }
        System.out.print(res);
    }
}
