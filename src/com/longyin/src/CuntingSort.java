package com.longyin.src;

import com.longyin.utils.Datas;

public class CuntingSort {

	/**
	 * ��������
	 * ˼·������һ��������������ֵ��ͬ��С�����飬
	 * �������Ŵ�����������ÿ�����ֳ��ֵĸ�����
	 * �ҵĲ��͵�ַ��http://blog.csdn.net/u010156024/article/details/48932219
	 */
	public static void main(String[] args) {
		cunting(Datas.data, 333);
		Datas.prints("��������");
	}

	public static void cunting(int[] data,int max){
		int[] temp = new int[max+1];
		int[] result = new int[data.length];
		/**
		 * ��ѭ�����ó�ʼֵΪ0
		 */
		for (int i = 0; i < temp.length; i++) {
			temp[i]=0;
		}
		/**
		 * ��for���ѭ������ԭ���飬��������Ԫ�س��ֵĸ��������
		 * temp���������Ӧ��λ���ϡ�
		 * temp���鳤�������ֵ�ĳ���һ�¡���֤ÿ��Ԫ�ض���һ����Ӧ��λ�á�
		 */
		for (int i = 0; i < data.length; i++) {
			temp[data[i]]+=1;
		}
		/**
		 * �ۼ�ÿ��Ԫ�س��ֵĸ�����
		 * ͨ����ѭ����temp�д��ԭ����������С�ڵ������ĸ�����
		 * Ҳ����˵��ʱtemp�д�ŵľ��Ƕ�Ӧ��Ԫ��������������д�ŵ�λ��+1��
		 */
		for (int i = 1; i < temp.length; i++) {
			temp[i]=temp[i]+temp[i-1];
		}
		/**
		 * �����С�������Ҳ���������ȷ�Ľ�����������ȶ��ġ�
		 * ֻ�дӴ�С�������������ȶ��ġ�
		 * result�д�������Ľ����
		 */
		for (int i = data.length-1; i>=0; i--) {
			int index = temp[data[i]];
			result[index-1]= data[i];
			temp[data[i]]--;
		}
		Datas.data = result;
	}
}
