class Solution {
    public int missingNumber(int[] a) {
    //Summation of first N numbers:
    int N=a.length;
        int sum = (N * (N + 1)) / 2;

        //Summation of all array elements:
        int s2 = 0;
        for (int i = 0; i < N; i++) {
            s2 += a[i];
        }

        int missingNum = sum - s2;
        return missingNum;
    }
}
