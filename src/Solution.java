import java.util.*;
public class Solution {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int n=sc.nextInt();
            int[] array=new int[n+1];
            int[] res=new int[n+1];
            Map<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<n;i++){
                int  p=sc.nextInt();
                array[p]=sc.nextInt();
                res[p]=array[p];
                int c=map.getOrDefault(array[p],0);
                map.put(array[p],c+1);
            }
            Boolean flag=false;
            Arrays.sort(array);
            System.out.println(Arrays.toString(array));
            System.out.println(Arrays.toString(res));
            int sum=0;
            for(int i=1;i<array.length;i++){
                for(int j=1;j<res.length;j++){
                    if(array[i]==res[j]){
                        if(map.get(array[i])==1) {
                            System.out.println(j + " " + array[i]);
                            break;
                        }else{
                            //一个分数对应多个同学
                            System.out.println(j + " " + array[i]);
                            flag=true;
                            sum++;
                        }
                    }
                }
                if(flag){
                    i+=sum-1;
                }
                flag=false;
                sum=0;
            }
        }
    }
}
