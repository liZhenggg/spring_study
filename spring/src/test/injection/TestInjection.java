package test.injection;

import main.java.com.lzg.ioc.injection.service.InjectionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestInjection extends UnitTestBase {

    public TestInjection() {
        super("classpath:main/resources/spring-config.xml");
    }

    @Test
    public void testSetter() {
        InjectionService service = super.getBean("injectionService");
        service.save("这是要保存的数据");
    }
}
