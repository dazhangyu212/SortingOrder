package com.longyin.src;

import com.longyin.utils.Datas;

public class HeapSort {

	/**
	 * �ҵĲ��͵�ַ��http://blog.csdn.net/u010156024/article/details/48932219
	 * ������(�������ȶ���)
	 * Ҳ������ȫ������
	 * ��һ��������.��ʵ���ǽ������е�Ԫ�ؽ������ǲ�����
	 * 		ʹ�������е�Ԫ������ѵ����ԡ�
	 * �ڶ�����ͨ��������Ԫ��ת�����ѵ�ĩβ,
	 * 		Ȼ��ʣ�µ�Ԫ���ڹ����ѡ�
	 * 		�������
	 * ����Ҫ�Ĺ��̾��ǹ����ѵĹ��̡�
	 * ����ıȽ�˼·��ϣ�������еıȽ�˼·һ�¡�
	 * �����Ԫ���ϸ���С��Ԫ���¸���ʼ�պ�temp�Ƚϡ�
	 * temp���˵�һ�αȽϿ��ܸı��⣬���������ıȽϲ��ı��ֵ��
	 * �����Ĵ�������ýϴ��Ԫ�������ϸ�����С��Ԫ���¸���
	 */
	public static void main(String[] args) {
		int[] data = Datas.data;
		for (int i = data.length/2; i >=0; i--) {
			buildHeap(data,i,data.length);
		}
		Datas.prints("������-������");
		System.out.println("============================");
		for (int i = data.length-1; i>0; i--) {
			swap(data, 0, i);
			buildHeap(data, 0, i);
		}
		Datas.prints("������-�����");
	}
	static void swap(int[] data,int i,int j){
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
	static void buildHeap(int[] data,int i,int len){
		int leftChild = leftChild(i);
		int temp = data[i];
		for (; leftChild<len;) {
			if (leftChild != len-1 && data[leftChild]<data[leftChild+1]) {
				leftChild++;
			}
			if (temp<data[leftChild]) {
				data[i] = data[leftChild];
			}else {
				/**braek˵���������Ӷ��ȸ��ڵ�С��
				* ���ڵ���������ӽڵ�
				* ����ֱ��ֹͣ�Ƚϣ���С�ȽϵĴ�����
				*/
				break;
			}
			i = leftChild;
			leftChild = leftChild(i);
		}
		data[i] = temp;
	}
	//���ؽڵ�i������ӵ�index
	static int leftChild(int i){
		return 2*i+1;
	}
}