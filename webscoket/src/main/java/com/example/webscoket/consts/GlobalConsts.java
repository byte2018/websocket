package com.example.webscoket.consts;

/**
 * @program: easy
 * @description: WebScoket常量配置
 * @author: 王震
 * @create: 2019-05-06 10:11
 **/
public class GlobalConsts {

    /**
     * @Description Stomp的端点
     **/
    public static final String ENDPOINT = "/gs-guide-websocket";
    /**
     * @Description 收发消息url前缀
     **/
    public static final String APP_PREFIX = "/app";
    /**
     * @Description 接收消息地址
     **/
    public static final String RECEIVE_MAPPING = "/receive";

    /**
     * @Description 点对点消息推送地址前缀
     **/
    public static final String P2PPUSHBASEPATH = "/user";
    /**
     * @Description 点对点消息推送地址后缀,最后的地址为/user/用户识别码/msg
     **/
    public static final String P2PPUSHPATH = "/msg";
}
