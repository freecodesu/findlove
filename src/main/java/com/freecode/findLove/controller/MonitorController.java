package com.freecode.findLove.controller;

import com.freecode.findLove.model.MonitorRes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;

/**
 * 系统参数监控
 */
@ResponseBody
@RestController
public class MonitorController {

    @GetMapping("/monitor")
    public MonitorRes getSystemMonitor(){
        MonitorRes monitorRes = new MonitorRes();
        OperatingSystemMXBean operatingSystemMXBean = ManagementFactory.getOperatingSystemMXBean();
        // TODO: 2023/7/23 获取CPU，内存，磁盘占用
        return monitorRes;
    }

}
