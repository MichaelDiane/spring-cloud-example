package com.taolue.example.stream.sender;
/** 
* @author Michael.Zhang
* @version 创建时间：2018年8月1日 下午4:17:41 
* @desc [消息生产者] 
*/

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;

public interface SinkSender {
    @Output(Source.OUTPUT)
    MessageChannel output();
}
