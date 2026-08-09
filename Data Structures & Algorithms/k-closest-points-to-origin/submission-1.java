class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(b[0], a[0]));

        for (int i = 0; i < points.length; i++) {
            int x = points[i][0];
            int y = points[i][1];
            int distance = x * x + y * y;
            if (pq.size() < k) {
                pq.offer(new int[] {distance, i});
            } else if (pq.peek()[0] > distance) {
                pq.poll();
                pq.offer(new int[] {distance, i});
            }
        }

        int[][] result = new int[k][2];
        for (int i = 0; i < k; i++) {
            int index = pq.poll()[1];

            result[i][0] = points[index][0];
            result[i][1] = points[index][1];
        }
        return result;
    }
}
