package com.longyin.src;

import java.util.ArrayList;
import java.util.Iterator;

import com.longyin.utils.Datas;

public class BucketSort {
	 
    /** 
     * Ͱ�����㷨����arr����Ͱ�����������Է���arr�� 
     * @param arr 
     * �ҵĲ��͵�ַ��http://blog.csdn.net/u010156024/article/details/48932219
     */  
	public static void main(String[] args){
		bucketSort(Datas.datad);
		for (int i = 0; i < Datas.datad.length; i++) {
			System.out.print(Datas.datad[i]+",");
		}
		System.out.println("\njfag="+Math.floor(-0.01));
	}
    public static void bucketSort(double arr[]){  
         
        int n = arr.length;
         
        ArrayList<Double> arrList[] = new ArrayList[n];
        //��arr�е������ȵĵķֲ���[0,1)�ϣ�ÿ��Ͱ��һ��list��������ڴ�Ͱ�ϵ�Ԫ��   
        for(int i =0;i<n;i++){
            int temp = (int) Math.floor(n*arr[i]);
            if(null==arrList[temp]){
                arrList[temp] = new ArrayList<>();
            }
            arrList[temp].add(arr[i]);
        }  
         
        //��ÿ��Ͱ�е������в�������   
        for(int i = 0;i<n;i++){  
            if(null!=arrList[i])  
                insert(arrList[i]);  
        }  
         
        //�Ѹ���Ͱ���������ϲ�   
        int count = 0; 
         
        for(int i = 0;i<n;i++){  
            if(null!=arrList[i]){  
                Iterator<Double> iter = arrList[i].iterator();  
                while(iter.hasNext()){  
                    Double d = (Double)iter.next();  
                    arr[count] = d;
                    count++;  
                }  
            }  
        }  
    }  
     
    /** 
     * �ò��������ÿ��Ͱ�������� 
     * @param list 
     */  
    public static void insert(ArrayList<Double> list){  
        if(list.size()>1){  
            for(int i =1;i<list.size();i++){  
                if((Double)list.get(i)<(Double)list.get(i-1)){  
                    double temp = (Double) list.get(i);  
                    int j = i-1;  
                    for(;j>=0&&((Double)list.get(j)>(Double)list.get(j+1));j--)  
                        list.set(j+1, list.get(j));  
                    list.set(j+1, temp);  
                }
            }
        }
    }
}
