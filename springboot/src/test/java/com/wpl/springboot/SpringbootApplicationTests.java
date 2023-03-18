package com.wpl.springboot;

import com.wpl.springboot.entity.Report;
import com.wpl.springboot.service.IReportService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
class SpringbootApplicationTests {

    @Resource
    private IReportService reportService;

    @Test
    public void reportTest() {
        List<Report> list = reportService.list();
        for (Report report:list) {
            System.out.println(report.getResult());
        }
    }

}
