import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {9,13,12,3,0,3,21};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void mergeSort(int[] array) {
        //1.归并排序就是采用分治法的思想，将一个大区间从中间不断分成一个一个小区间，将小区间先排序，再将小区间归并，得到完全有序的区间
        //2.递归退出条件：left>=right 即区间只剩一个或者没有元素
        mergeSortInteger(array,0,array.length);
    }

    private static void mergeSortInteger(int[] array, int left, int right){
        if(left >= right-1){
            return;
        }
        //找到中间点，将区间分成最有两边
        int mid = (left + right) / 2;
        mergeSortInteger(array,left,mid);  //分左边
        mergeSortInteger(array,mid,right); //分右边
        merge(array,left,mid,right);  //将两个区间进行归并排序
    }

    private static void merge(int[] array, int left, int mid, int right) {
        int length = right - left;
        int[] extra = new int[length];
        int i = left;
        int j = mid;
        int m = 0;
        while(i < mid && j < right){
            if(array[i] <= array[j]){
                extra[m++] = array[i++];
            }else{
                extra[m++] = array[j++];
            }
        }
        while(i < mid){
            extra[m++] = array[i++];
        }
        while(j < right){
            extra[m++] = array[j++];
        }
        for (int x = 0; x < length; x++) {
            array[left + x] = extra[x];
        }
    }
}
