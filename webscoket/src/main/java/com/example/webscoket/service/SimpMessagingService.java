package com.example.webscoket.service;
/**
 * @Author 王震
 * @Description 消息服务接口实现
 * @Date 21:46 2019/5/6
 **/
public interface SimpMessagingService {
    /**
     * @Author 王震
     * @Description 定义消息发送模板，点对点发送
     * @Date 21:48 2019/5/6
     * @Param [user, destination, payload]
     * @return void
     **/
    void sendP2P(String user, String destination, Object payload);
}
