package com.longyin.src;

import com.longyin.utils.Datas;

public class BubbleSort {

	/**
	 * ð������
	 * ˼·���ڲ�ѭ��ÿ��һ���ź�һλ�������������
	 * �ҵĲ��͵�ַ��http://blog.csdn.net/u010156024/article/details/48932219
	 */
	public static void main(String[] args) {
		bubbleSort(Datas.data);
	}

	private static void bubbleSort(int[] data) {
		int temp;
		for (int i = 0; i < data.length; i++) {
			for (int j = i+1; j < data.length; j++) {
				if (data[i]>data[j]) {
					temp =data[i];
					data[i]=data[j];
					data[j] = temp;
				}
			}
		}
		Datas.prints("ð������");
	}
}
