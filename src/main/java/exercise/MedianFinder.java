package exercise;

import java.util.PriorityQueue;

/**
 * &#064;Author  asxy
 * &#064;Version  1.0
 * &#064;Date  2023/8/22
 */
class MedianFinder {

    private PriorityQueue<Integer> maxHeap;
    private PriorityQueue<Integer> minHeap;

    // o1 新添加的参数  o2 队列中的首个参数书
    public MedianFinder() {
        maxHeap = new PriorityQueue<>((o1, o2) -> o2 - o1);
        minHeap = new PriorityQueue<>((o1, o2) -> o1 - o2);
    }

    public void addNum(int num) {
        if(minHeap.isEmpty() || minHeap.peek() <= num){
            minHeap.offer(num);
            if(minHeap.size() > maxHeap.size() + 1){
                maxHeap.offer(minHeap.poll());
            }
        }else {
            maxHeap.offer(num);
            if(minHeap.size() < maxHeap.size()){
                minHeap.offer(maxHeap.poll());
            }
        }
    }

    public double findMedian() {
        if(minHeap.size() > maxHeap.size()){
            return minHeap.peek();
        }
        return (minHeap.peek() + maxHeap.peek())/2.0;
    }
}