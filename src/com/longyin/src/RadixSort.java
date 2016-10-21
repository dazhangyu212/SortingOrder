package com.longyin.src;

import com.longyin.utils.Datas;
public class RadixSort {
	/**
	 * �ҵĲ��͵�ַ��http://blog.csdn.net/u010156024/article/details/48932219
	 * ��������
	 * ��ά���鹹��Ͱ
	 * һά�����¼ÿ��λ��ŵĸ�����
	 * ÿ�ι���Ͱ��ɣ��������ݵ�ԭ����������ȥ��
	 * ������һ��Ͱ�Ĺ�����
	 * �ֱ��λ��ʮλ����λ������
	 * �������֪�����ֵ��λ����
	 */
	public static void main(String[] args) {
		radixSort(Datas.data,3);
		Datas.prints("��������");
	}
	public static void radixSort(int[] data,int maxLen){
		//maxLen��ʾ���ֵ�ĳ���
		//LSD���λ��������	l��0��ʼ ѭ������
		int k = 0;
		int n = 1;
		int[][] bucket = new int[10][data.length];//Ͱ
		/**
		 * ��ʾͰ��ÿһ��Ҳ����ÿһλ��ŵĸ���
		 */
		int[] orders = new int[10];
		int temp = 0;
		for (int l = 0; l < maxLen; l++) {
			for (int i = 0; i < data.length; i++) {
				temp = (data[i]/n)%10;
				bucket[temp][orders[temp]] = data[i];
				orders[temp]++;
			}
			//��Ͱ�е���ֵ�����ԭ����������
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < orders[i]; j++) {
					if (orders[i]>0) {
						data[k]=bucket[i][j];
						k++;
					}
				}
				//������������¼�ĸ�������Ϊ0
				orders[i]=0;
			}
			//n����10 ȡʮλ  ��λ����ֵ
			n*=10;
			k=0;
			//kֵ��¼�������ݵ�ԭ�������е�λ�ã�������ɻָ�0
		}
	}
}