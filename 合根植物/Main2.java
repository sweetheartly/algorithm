package �ϸ�ֲ��;

import java.util.ArrayList;  
import java.util.HashMap;  
import java.util.Iterator;  
import java.util.Scanner;  
public class Main2 {  
    static Scanner scanf=new Scanner(System.in);  
    static HashMap<Integer, Zw> hm=new HashMap<Integer,Zw>();       //hashmap��ֵ�Բ���Ҫ����  
    static int count=0; //����  
    public static void main(String[] args) {  
        int m=scanf.nextInt();  //��  
        int n=scanf.nextInt();      //��  
        for (int i = 0; i < m*n; i++) {  
            Zw zw=new Zw();  
            hm.put(i+1, zw);        //��ÿ������һ�����  
        }  
        int k=scanf.nextInt();  //����  
        for (int i = 0; i < k; i++) {  
            int start=scanf.nextInt();  //�ߵ����    
            int end=scanf.nextInt();        //�ߵ��յ�  
            Zw zw=hm.get(start);    //ȡ��һ����  
            zw.to.add(end); //���õ�ɴ����ӽ�����  
            Zw zw2=hm.get(end); //�ص㣡�úڰ�       
            zw2.to.add(start);//���õ㱻�ɴ�ʱҲ��ӽ���  �����������  
        }  
        for (int i = 1; i <=m*n; i++) {  
            digui(i,true);  //��һ�������Ǳ������ڶ�����ʾ�������ݹ飬������Ҫ���ж�  
        }  
        System.out.println(count);//��  
    }  
    public static void digui(int i,boolean b){  
        if(!hm.get(i).life){    //����ÿ�û�б��߹��ٽ���  
            hm.get(i).life=true;    //����Ϊtrue��ʾ���߹�  
            ArrayList<Integer> list=hm.get(i).to; //�õ��ÿ�ɴ�·�����ϣ��������ɴ�·����  
            Iterator<Integer> iterable= list.iterator();  //����  
            while (iterable.hasNext()) {    //����пɴ�·������ѭ��  
                int temp=iterable.next();   //�õ��ɴ��  
                    digui(temp,false);  //�����ɴ�·���Ŀɴ�·��  
            }  
            if(b){  //����������ѭ����������һ��·���ꡣ  
                count++;  
            }  
        }  
    }  
}  
class Zw{  
    public ArrayList<Integer> to=new ArrayList<Integer>();  //�ɴ�·������  
    boolean life=false; //�õ��Ƿ񱻱�����  
}  