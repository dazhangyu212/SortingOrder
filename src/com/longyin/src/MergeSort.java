package com.longyin.src;

import com.longyin.utils.Datas;

public class MergeSort {

	/**
	 * �ҵĲ��͵�ַ��http://blog.csdn.net/u010156024/article/details/48932219
	 * �鲢����
	 * ˼·���������������������飬���кϲ��ǳ��򵥡�
	 * ���ԾͶ�ԭ��������зָ�ָ�ɸ�����������飬
	 * Ȼ��ݹ�ϲ���
	 */
	public static void main(String[] args) {
		int[] data = Datas.data;
		merge(data);
		Datas.prints("�鲢����");
	}
	public static void merge(int[] data){
		int[] temp = new int[data.length];
		merge0(data, temp, 0, data.length-1);
	}
	public static void merge0(int[] data,int[] temp,int left,int rigth){
		if (left<rigth) {
			int center = (left+rigth)/2;
			merge0(data, temp, left, center);
			merge0(data, temp, center+1, rigth);
			mergeSort(data,temp,left,center,rigth);
		}
	}
	public static void mergeSort(int[] data,int[] temp,int left,int center,int right){
		int leftEnd = center;
		int rightStar = center+1;
		int len = right-left+1;
		int tempPos = left;
		/**
		 * ���������ѭ����������⡣
		 * ��ʵ��ʵ�����Ѿ������������бȽϣ�
		 * ��Ԫ����ӵ�temp�����б��档
		 */
		while (left<=leftEnd&&rightStar<=right) {
			if (data[left]<=data[rightStar]) {
				temp[tempPos++] = data[left++];
			}else {
				temp[tempPos++] = data[rightStar++];
			}
		}
		while (left<=leftEnd) {
			temp[tempPos++]=data[left++];
		}
		while (rightStar<=right) {
			temp[tempPos++]=data[rightStar++];
		}
		/**
		 * �ؼ���һ��������Ŀ���������
		 * Ϊʲô�����еĿ����Ǵ�right--��ʼ������
		 * ԭ���ǣ�ͨ��˵��ͼ�У�����֪����Ԫ�رȽ�֮��
		 * �ὫԪ�ظ�ֵ��temp�������Ӧ��λ���ϣ�������Ӱ������λ�õ����ݡ�
		 * ���������ѭ����Ҳû��ʹ������λ����������ݣ���������
		 * �����Ѿ������Ԫ�ء�
		 * ����Ŀ����Ǵ�right��ʼ��rightλ���Ǳ����������ұߵ�Ԫ��
		 * ��ʵҲ���Դ�left��ʼ��ֻ����left�������������ֵ�Ѿ��ı䣬
		 * ���Զ���һ��int leftFlag = left;�����ʼ����ߵ�λ�ã�
		 * ��ʱ�����ѭ�����Ը�Ϊ��
		 * for (int i = 0; i < len; i++,leftFlag++) {
		 * 	data[leftFlag]=temp[leftFlag];
		 * }
		 * ���г�����ᷢ�֣���ȷ��������
		 */
		for (int i = 0; i < len; i++,right--) {
			data[right]=temp[right];
		}
	}

}
