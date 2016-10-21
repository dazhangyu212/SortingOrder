package com.longyin.src;

import com.longyin.utils.Datas;

public class QuickSort {

	/**
	 * �ҵĲ��͵�ַ��http://blog.csdn.net/u010156024/article/details/48932219
	 * ��������
	 * �����ҵ�������ֵ��Ȼ��ֱ��ƶ��������ߵ����ݣ�
	 * ����ֵ���ָ�����飬һ�����ֵ����һ�����ֵ��С��
	 * Ȼ��ݹ�����������顣
	 * �������������С��CUTOFFʱ��ʹ�ò�������
	 */
	public static void main(String[] args) {
		quickSort(Datas.data,0,Datas.data.length-1);
		Datas.prints("��������");
	}
	public static void quickSort(int[] data,int left,int right){
		int CUTOFF = 1;
		if (left+CUTOFF<right) {
			//�ҵ���ֵ��
			int media = media3(data, left, right);
			//�������ҽ磬left,rightֵ����
			int i =left;
			int j = right-1;
			//ѭ���ƶ��������ߵ�Ԫ��
			while (true) {
				while(data[++i]<media){
					System.out.println("�±�:"+i+",����:"+data[i]);
				};
				while (data[--j]>media){
					System.out.println("�±�:"+j+",����:"+data[j]);
				};
				if (i>j) {
					break;
				}
				swap(data, i, j);
			}
			//����ֵ���ƶ���i������ֵ��������i����
			swap(data, i, right-1);
			//�ݹ�������ֵ�����ߵ�����
			quickSort(data, left, i-1);
			quickSort(data, i+1, right);
		}else {
			/**
			 * ��������
			 * ���������Ԫ������20��ʱ��
			 * �����������ܲ���ֱ�Ӳ�������á�
			 * ����else������棬�ڴ������������������
			 * ����ʹ��ֱ�Ӳ���������á�
			 */
			InsertSort.main(null);
		}
	}
	/**
	 * �ҵ���ֵ��
	 * @param data
	 * @param left ���������ʼλ
	 * @param right ������ҽ���λ
	 * @return
	 */
	public static int media3(int[] data,int left,int right){
		int center = (left+right)/2;
		/**
		 * ǰ����if���ıȽϣ�
		 * ʹ����Сֵ��������ߡ�
		 */
		if (data[center]<data[left]) {
			swap(data, center, left);
		}
		if (data[right]<data[left]) {
			swap(data, right, left);
		}
		/**
		 * ������if���ʹ�����ֵ�������ұߡ�
		 * �м�ֵ�������м�λ�á�
		 */
		if (data[right]<data[center]) {
			swap(data, right, center);
		}
		//���м��λ�÷���right-1��λ�á�
		swap(data, center, right-1);
		return data[right-1];
	}
	/**
	 * ��������
	 * @param data ����
	 * @param i ��С�����±�
	 * @param j �ϴ������±�
	 */
	public static void swap(int[] data,int i,int j){
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
		System.out.println("����:�±�"+i+","+data[i]+"���±�"+j+","+data[j]);
	}

}
