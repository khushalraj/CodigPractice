package com.example.code;

//Find array elements that occur exactly twice.
public class Example71 {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 40, 60, 70, 80, 80, 70, 100 };
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println("occurs elements eactly twice" + arr[i]);
			}
		}

	}
}
