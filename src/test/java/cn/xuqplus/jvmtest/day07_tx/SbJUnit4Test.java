package cn.xuqplus.jvmtest.day07_tx;

import cn.xuqplus.jvmtest.day07_tx.service.BService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
//@RunWith(SpringRunner.class) // junit-4.12+, spring-test-4.3+
@SpringBootTest(classes = BConfig.class)
public class SbJUnit4Test {

    @Resource
    private BService bService;

    @Test
    public void a() {
        log.info(">> {}", bService);
    }
}
