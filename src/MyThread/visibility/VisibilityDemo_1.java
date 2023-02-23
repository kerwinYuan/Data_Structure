package MyThread.visibility;

public class VisibilityDemo_1 {
    /*
     *虽然使用了静态变量 但是静态变量是存储在内存中的 线程在执行中是将变量从内存中拿出
     *再依次经过三级缓存、二级缓存、一级缓存
     *最后被cpu取值并处理 由于没有使用volatile保证变量的可见性，导致循环无法结束
     */
    public static boolean flag = true;

    public static void main(String[] args) throws Exception{
        new Thread(()->{
            System.out.println("start");
            while(flag){
                //虽然flag没有使用volaile去修饰 但是打印日志代码包含了synchronize代码块 触发了变量同步 从而使得循环可以结束
                System.out.println("running");
            }
            System.out.println("end");
        }).start();
        Thread.sleep(1000);
        flag = false;
    }

}

