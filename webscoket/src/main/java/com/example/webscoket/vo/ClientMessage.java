package com.example.webscoket.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: easy
 * @description: 客户端发过来的消息
 * @author: 王震
 * @create: 2019-05-06 10:22
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientMessage {
    private int id;
    private String name;

}
