package com.example.webscoket.config;

import com.example.webscoket.consts.GlobalConsts;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/**
 * @Author 王震
 * @Description Webscoket配置类
 * @Date 21:33 2019/5/6
 **/
@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        /**
         * 配置消息代理
         * 启动简单Broker，消息的发送的地址符合配置的前缀来的消息才发送到这个broker
         */
        config.enableSimpleBroker(GlobalConsts.P2PPUSHBASEPATH);
        config.setUserDestinationPrefix(GlobalConsts.P2PPUSHBASEPATH);
        config.setApplicationDestinationPrefixes(GlobalConsts.APP_PREFIX);
    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        /**
         * 注册 Stomp的端点
         * addEndpoint：添加STOMP协议的端点。这个HTTP URL是供WebSocket或SockJS客户端访问的地址
         * setAllowedOrigins("*") 允许跨域
         * withSockJS：指定端点使用SockJS协议
         */
        registry.addEndpoint(GlobalConsts.ENDPOINT)
                .setAllowedOrigins("*")
                .withSockJS();
    }

}
