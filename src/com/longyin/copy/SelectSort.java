package com.longyin.copy;
/**
 * ����:SelectSort
 * ����:
 * ��˾:�������οƼ��߿Ƽ��ɷ����޹�˾
 * ����:zhangyu
 * ����ʱ��:2016��5��25��
 */
public class SelectSort {
	/**
	 * ѡ������
	 * ˼·:ÿ��ѭ���õ���Сֵ���±�,Ȼ�󽻻�
	 * ���������λ�õ���ԭ����λ��,�򲻽���
	 * @param args
	 */
	public static void main(String[] args) {
		
	}
	
	public static void selectSort(int[] data){
		int index = 0;
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

	private static void swap(int[] data, int i, int j) {
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
}
