import java.util.*;
public class Heap {

	public int arr[];
//	public int size;
	public int n;
	
	public Heap() {
//		arr[0] = 0;
//		size = 0;
	}
	public void insertIntoHeap(int arr[], int val) {
		n = n + 1;
		int index = n;
		arr[index]= val;
		while(index > 1) {
			int parent = index/2;
				if(arr[parent] < arr[index]) {
					int temp = arr[parent];
					arr[parent] = arr[index];
					arr[index] = temp;
					index = parent;
				}
				else {
					return;
				}
			}
	}
	
	public void display() {
		for(int i = 1; i<= n ; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}
	
	public void delete() {
		if(n == 0) {
			System.out.println("No element present for deletion ");
		}
		arr[1] = arr[n];
		n--;
		int i = 1;
		while(i<n) {
			int leftIndex = 2*i;
			int rightIndex = 2*i+1;
			if(leftIndex < n && arr[i] < arr[leftIndex]) {
				int temp = arr[leftIndex];
				arr[leftIndex] = arr[i];
				arr[i] = temp;
				i = leftIndex;
			}
			else if(rightIndex < n && arr[i] < arr[rightIndex]) {
				int temp = arr[rightIndex];
				arr[rightIndex] = arr[i];
				arr[i] = temp;
				i = rightIndex;
			}
			else {
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		Heap h = new Heap();
		int arr[]= {60,10,50,30,20,90,80};
		h.n = 7;
		h.arr=new int[100];
		System.arraycopy(arr, 0, h.arr, 1, h.n);
		h.insertIntoHeap(h.arr,69);
//		h.insertIntoHeap(50);
//		h.insertIntoHeap(90);
//		h.insertIntoHeap(40);
//		h.insertIntoHeap(33);
//		h.insertIntoHeap(70);
		h.display();
		System.out.println();
		h.delete();
		h.display();

	}

}
