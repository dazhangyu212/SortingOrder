package com.longyin.src;

import com.longyin.utils.Datas;

public class SelectSort {

	/**
	 * �ҵĲ��͵�ַ��http://blog.csdn.net/u010156024/article/details/48932219
	 * ѡ������
	 * ˼·:ÿ��ѭ���õ���Сֵ���±꣬Ȼ�󽻻����ݡ�
	 * ���������λ�ò�����ԭ����λ�ã��򽻻���
	 */
	public static void main(String[] args) {
		selectSort(Datas.data);
		Datas.prints("ѡ������");
	}
	public static void selectSort(int[] data){
		int index=0;
		for (int i = 0; i < data.length; i++) {
			index = i;
			for (int j = i; j < data.length; j++) {
				if (data[index]>data[j]) {
					index = j;
				}
			}
			if (index != i) {
				swap(data,index,i);
			}
		}
	}
	public static void swap(int[] data,int i,int j){
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
}