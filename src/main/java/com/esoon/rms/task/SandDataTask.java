package com.esoon.rms.task;

/*
 *@Date 2023/5/4
 *@User fuxh
 *@Todo 定时发送采集的数据
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class SandDataTask {

    @Scheduled(cron = "${time.cron}")
    public void sayWord() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("时间" + sdf.format(new Date()) + " 你好，world.");
    }
}
