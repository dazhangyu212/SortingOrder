package com.longyin.copy;
/**
 * 类名:SelectSort
 * 描述:
 * 公司:北京海鑫科技高科技股份有限公司
 * 作者:zhangyu
 * 创建时间:2016年5月25日
 */
public class SelectSort {
	/**
	 * 选择排序
	 * 思路:每次循环得到最小值的下标,然后交换
	 * 如果交换的位置等于原来的位置,则不交换
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
