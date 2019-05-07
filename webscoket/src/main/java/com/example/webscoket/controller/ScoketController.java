package com.example.webscoket.controller;

        import com.alibaba.fastjson.JSON;
        import com.example.webscoket.consts.GlobalConsts;

        import com.example.webscoket.service.SimpMessagingService;
        import com.example.webscoket.vo.ClientMessage;
        import com.example.webscoket.vo.ServerMessage;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.messaging.handler.annotation.MessageMapping;
        import org.springframework.stereotype.Controller;
        import org.springframework.web.util.HtmlUtils;

/**
 * @program: easy
 * @description: webscoket测试controller
 * @author: 王震
 * @create: 2019-05-06 10:26
 **/
@Controller
public class ScoketController {

    @Autowired
    private SimpMessagingService simpMessagingService;

    /**
     * @Author 王震
     * @Description 接收和相应消息
     * @Date 16:42 2019/5/7
     * @Param [message]
     * @return void
     **/
    @MessageMapping(GlobalConsts.RECEIVE_MAPPING)
    public void scoket(ClientMessage message){
        simpMessagingService.sendP2P(message.getId() + "", GlobalConsts.P2PPUSHPATH, JSON.toJSON(new ServerMessage("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!")));
    }


}
