package main.java.com.lzg.schema.advice.biz;

/**
 * 切面业务类
 */
public class AspectBiz {

    public void biz() {
        System.out.println("AspectBiz biz.");
        throw new RuntimeException();
    }

    public void init(String bizName, int times) {
        System.out.println("AspectBiz init." + bizName + " " + times);
    }
}
