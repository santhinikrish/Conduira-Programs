/*input: man superman
output: 1

input: aa aaaaa
output: 4

input: nn banana
output: 0
*/

import java.util.*;
class Main
{
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        sc.nextLine();
        String b=sc.next();
        int k=s.length();
        int m=b.length();
        int c=0;
        for(int i=0;i<=m-k;i++){
            int j;
            for(j=0;j<k;j++){
                if(b.charAt(i+j)!=s.charAt(j)){
                    break;
                }
            }
            if(j==k){
                c++;
                j=0;
            }
        }
        System.out.print(c);
    }
}
