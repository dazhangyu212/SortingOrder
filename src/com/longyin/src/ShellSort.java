package com.longyin.src;

import com.longyin.utils.Datas;

public class ShellSort {

	/**
	 * �ҵĲ��͵�ַ��http://blog.csdn.net/u010156024/article/details/48932219
	 * ϣ������������������
	 * ����Ҳ���ѡ�
	 * ˼·������ѭ��
	 * ��һ��ѭ������������-�������ų���Ľ������εݼ�һ��
	 * �ڶ���ѭ������������
	 * ������ѭ�����Ƚ�Ԫ�أ�����Ԫ�ء�
	 * ������Ҫע����ǣ��Ƚϵ�����Ԫ�غͽ���������Ԫ���ǲ�ͬ�ġ�
	 */
	public static void main(String[] args) {
		int[] data = Datas.data;
		System.out.println("��ʼ����");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]+",");
		}
		int k;
		for (int div = data.length/2; div>0; div/=2) {
			for (int j = div; j < data.length; j++) {
				int temp = data[j];
				for (k=j; k>=div && temp<data[k-div] ; k-=div) {
					data[k] = data[k-div];
				}
				data[k] = temp;
			}
		}
		Datas.prints("ϣ������");
	}
}
