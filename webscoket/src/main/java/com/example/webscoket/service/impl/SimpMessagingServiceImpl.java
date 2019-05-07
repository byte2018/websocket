package com.example.webscoket.service.impl;

import com.example.webscoket.service.SimpMessagingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

/**
 * @program: webscoket
 * @description: 消息服务接口实现
 * @author: 王震
 * @create: 2019-05-06 21:48
 **/
@Service
public class SimpMessagingServiceImpl implements SimpMessagingService {

    @Autowired
    private SimpMessagingTemplate template;
    /**
     * @Author 王震
     * @Description 定义消息发送模板，点对点发送
     * @Date 21:48 2019/5/6
     * @Param [user, destination, payload]
     * @return void
     **/
    @Override
    public void sendP2P(String user, String destination, Object payload) {
        template.convertAndSendToUser(user, destination, payload);
    }
}
