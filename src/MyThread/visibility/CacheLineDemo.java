package MyThread.visibility;

import java.util.concurrent.CountDownLatch;

public class CacheLineDemo {
    public static  long COUNT = 10_000_000_00L;

    /**
     * 由于cpu读取数据是按照数据块来读取的 一个数据块一般是64字节
     * 所以为了防止两个同时被修改的值 在不同cpu在同一个缓存行中被不同核的cpu改变值导致触发缓存一致性协议降低效率
     * 可以设置一些无用变量防止上述情况的产生
     * */
    private static class T{
        private long p1,p2,p3,p4,p5,p6,p7;
        public long x = 0L;
        //private long p9,p10,p11,p12,p13,p14,p15;
    }

    public static T[] arr = new T[2];

    static {
        arr[0] = new T();
        arr[1] = new T();
    }

    public static void main(String[] args) throws Exception {
        CountDownLatch countDownLatch = new CountDownLatch(2);
        Thread t1 = new Thread(()->{
            for (long i = 0 ; i < COUNT;i++){
                arr[0].x=i;
            }
            countDownLatch.countDown();
        });

        Thread t2 = new Thread(()->{
            for (long j = 0 ; j < COUNT;j++){
                arr[1].x=j;
            }
            countDownLatch.countDown();
        });
        final long start = System.nanoTime();
        t1.start();
        t2.start();
        countDownLatch.await();
        System.out.println((System.nanoTime()-start)/1000000+"ms");
    }
}
