package 合根植物;

import java.util.ArrayList;  
import java.util.HashMap;  
import java.util.Iterator;  
import java.util.Scanner;  
public class Main2 {  
    static Scanner scanf=new Scanner(System.in);  
    static HashMap<Integer, Zw> hm=new HashMap<Integer,Zw>();       //hashmap键值对不需要遍历  
    static int count=0; //计数  
    public static void main(String[] args) {  
        int m=scanf.nextInt();  //行  
        int n=scanf.nextInt();      //列  
        for (int i = 0; i < m*n; i++) {  
            Zw zw=new Zw();  
            hm.put(i+1, zw);        //给每个方格一个编号  
        }  
        int k=scanf.nextInt();  //边数  
        for (int i = 0; i < k; i++) {  
            int start=scanf.nextInt();  //边的起点    
            int end=scanf.nextInt();        //边的终点  
            Zw zw=hm.get(start);    //取出一个点  
            zw.to.add(end); //给该点可达点添加进集合  
            Zw zw2=hm.get(end); //重点！敲黑板       
            zw2.to.add(start);//当该点被可达时也添加进，  即有向改无向  
        }  
        for (int i = 1; i <=m*n; i++) {  
            digui(i,true);  //第一个参数是遍历，第二个表示是最外层递归，最后计数要做判断  
        }  
        System.out.println(count);//答案  
    }  
    public static void digui(int i,boolean b){  
        if(!hm.get(i).life){    //如果该块没有被走过再进入  
            hm.get(i).life=true;    //先设为true表示被走过  
            ArrayList<Integer> list=hm.get(i).to; //得到该块可达路径集合（包括被可达路径）  
            Iterator<Integer> iterable= list.iterator();  //迭代  
            while (iterable.hasNext()) {    //如果有可达路径进入循环  
                int temp=iterable.next();   //得到可达点  
                    digui(temp,false);  //遍历可达路径的可达路径  
            }  
            if(b){  //如果是最外层循环结束，即一条路走完。  
                count++;  
            }  
        }  
    }  
}  
class Zw{  
    public ArrayList<Integer> to=new ArrayList<Integer>();  //可达路径集合  
    boolean life=false; //该点是否被遍历过  
}  