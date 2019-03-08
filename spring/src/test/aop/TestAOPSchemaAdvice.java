package test.aop;

import main.java.com.lzg.schema.advice.biz.AspectBiz;
import main.java.com.lzg.schema.advice.introductions.Fit;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAOPSchemaAdvice extends UnitTestBase {
    public TestAOPSchemaAdvice() {
        super("classpath:main/resources/spring-config.xml");
    }

    @Test
    public void testBiz() {
        AspectBiz biz = super.getBean("aspectBiz");
        biz.biz();
    }

    @Test
    public void testBizInit() {
        AspectBiz biz = super.getBean("aspectBiz");
        biz.init("myService", 3);
    }

    @Test
    public void testIntroductions() {
        Fit fit = (Fit) super.getBean("aspectBiz");
        fit.filter();
    }
}
