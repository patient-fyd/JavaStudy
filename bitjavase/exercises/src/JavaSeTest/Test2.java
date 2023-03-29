package JavaSeTest;

/**
 * @Author: Fourteen-Y
 * @Description: 给出一个有序的整数数组 A 和有序的整数数组 B ，请将数组 B 合并到数组 A 中，变成一个有序的升序数组
 * 注意：
 * 1.保证 A 数组有足够的空间存放 B 数组的元素， A 和 B 中初始的元素数目分别为 m 和 n，A的数组空间大小为 m+n
 * 2.不要返回合并的数组，将数组 B 的数据合并到 A 里面就好了，且后台会自动将合并后的数组 A 的内容打印出来，所以也不需要自己打印
 * 3. A 数组在[0,m-1]的范围也是有序的
 * 输入
 * [4,5,6],[1,2,3]
 * 输出
 * [1,2,3,4,5,6]
 * @Date: 2022/7/3 0:45
 */
public class Test2 {


    public void merge(int[] A,int m,int[] B,int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(i>=0 && j >=0){
            if(A[i] >= B[j]){
                A[k] = A[i];
                k--;
                i--;
            } else{
                A[k] = B[j];
                j--;
                k--;
            }
        }
        while(i >= 0){
            A[k] = A[i];
            k--;
            i--;
        }
        while(j >= 0){
            A[k] = B[j];
            j--;
            k--;
        }
    }
}
