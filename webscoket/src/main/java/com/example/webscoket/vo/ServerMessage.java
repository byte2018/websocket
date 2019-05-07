package com.example.webscoket.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: easy
 * @description: 服务端返回消息
 * @author: 王震
 * @create: 2019-05-06 10:25
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServerMessage {
    private String content;
}
