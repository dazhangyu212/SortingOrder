package com.longyin.src;

import com.longyin.utils.Datas;

/**
 * 
 * @author octopus
 * ʱ�临�Ӷȣ�O��n^2��.�����Ĳ��������ж��ֲ�������2-·��������
 */
public class InsertSort {
	/**
	 * ��������
	 * ˼·�������ݲ��뵽������������С�
	 * �ҵĲ��͵�ַ��http://blog.csdn.net/u010156024/article/details/48932219
	 */
	public static void main(String[] args) {
		int[] data = Datas.data;
		int temp;
		for (int i = 1; i < data.length; i++) {
			temp = data[i];//������������ֵ
			int j = i;
			for (; j>0 && temp<data[j-1]; j--) {
				data[j] = data[j-1];
				//������������ֵǰ���Ԫ�رȸ�ֵ�󣬾�����ƶ�һλ
			}
			//�ڲ�ѭ���������ҵ������λ�ø�ֵ���ɡ�
			data[j]=temp;
		}
		Datas.prints("��������");
	}
}
