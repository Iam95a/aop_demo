package com.chen.aop_demo.service.impl;


import com.chen.aop_demo.service.DownloadService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class DownloadServiceImpl implements DownloadService {
    @Override
    @Async
    public void download() {
        System.out.println("nihao");
    }
}
