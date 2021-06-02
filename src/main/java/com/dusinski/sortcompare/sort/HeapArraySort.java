package com.dusinski.sortcompare.sort;

public class HeapArraySort implements SortAlgorithm{


    @Override
    public void sort(int[] arr) {

        int n = arr.length;

        // build heap
        for (int i=n/2-1;i>=0;i--){
            heapSort(arr,n,i);
        }

        // sort heap
        for (int i=n-1;i>0;i--){
            int swap = arr[0];
            arr[0]=arr[i];
            arr[i]=swap;
            heapSort(arr,i,0);
        }

    }

private void heapSort(int[] arr, int heapSize, int i){
        int largest = i;
        int leftNode=2*i+1;
        int rightNode =2*i+2;

        if (leftNode<heapSize&&arr[leftNode]>arr[largest]){
            largest=leftNode;
        }
        if (rightNode<heapSize&&arr[rightNode]>arr[largest]){
            largest=rightNode;
        }

        if (largest!=i){
            int swap = arr[i];
            arr[i]=arr[largest];
            arr[largest]=swap;

            heapSort(arr,heapSize,largest);
        }



}




}
