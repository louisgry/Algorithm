package ds.stack;

/**
 * @author Louis
 * @date Create in 2019/12/10 23:31
 */
public class TrappingRainWater {
    public int trap(int[] height) {
        // Stack
        Stack<Integer> stack = new Stack<Integer>();
        int res = 0, i = 0;
        while(i < height.length) {
            if(stack.empty() || height[i]<height[stack.peek()]) {
                // 左边界坐标入栈
                stack.push(i);
                i++;
            }
            else {
                // 栈顶元素就是可以装雨水的坑
                int hole_idx = stack.pop();
                if (stack.empty()) {
                    continue;
                }
                // 距离=右边界坐标-左边界坐标-1
                int dist = i - stack.peek() - 1;
                // 新栈顶是左边界，取左右的最小高度减去坑的高度
                int h = Math.min(height[i], height[stack.peek()])-height[hole_idx];
                res += dist * h;
            }
        }
        return res;
    }
//    public int trap(int[] height) {
//        // 暴力解法
//        int res = 0;
//        for(int i=1; i<height.length; i++) {
//            int maxLeft = 0, maxRight = 0;
//            // 往左
//            for(int j=i; j>=0; j--) {
//                maxLeft = Math.max(maxLeft, height[j]);
//            }
//            // 往右
//            for(int j=i; j<height.length; j++) {
//                maxRight = Math.max(maxRight, height[j]);
//            }
//            res += Math.min(maxLeft, maxRight)-height[i];
//        }
//        return res;
//    }
}
