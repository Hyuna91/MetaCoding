package Ex06;

public class ArrayEx03 {
    public static void main(String[] args) {
        // 2차원 배열
        int[][] nums = {{1, 2, 3}, {4, 5, 6}};
        // {1, 2, 3} 0번지 행
        //        1  0번지 행 0번지
        //        2  0번지 행 1번지
        //        3  0번지 행 2번지
        // {4, 5, 6} 1번지 행
        //        4  1번지 행 0번지
        //        5  1번지 행 1번지
        //        6  1번지 행 2번지

        System.out.println(nums[0][0]); // 1
        System.out.println(nums[0][2]); // 3
        System.out.println(nums[1][1]); // 5


        int[][] nums2 = new int[2][2];

        nums2[0][0] = 1;
        nums2[0][1] = 2;
        nums2[1][0] = 3;
        nums2[1][1] = 4;
    }
}
