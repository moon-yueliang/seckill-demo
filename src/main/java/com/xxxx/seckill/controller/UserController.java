package com.xxxx.seckill.controller;


import com.xxxx.seckill.pojo.User;
import com.xxxx.seckill.rabbitmq.MQSender;
import com.xxxx.seckill.vo.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jianghao
 * @since 2021-08-19
 */
@Controller
@RequestMapping("/user")
public class UserController {

//    @Autowired
//    private MQSender mqSender;
//    /**
//     * 用户信息（测试）
//     */
//    @RequestMapping("/info")
//    @ResponseBody
//    public RespBean info(User user) {
//        return RespBean.success(user);
//    }
//
//    /**
//     * 测试发送RabbMQ消息
//     */
//    @RequestMapping("/mq")
//    @ResponseBody
//    public void mq(){
//        mqSender.send("hello");
//    }
//
//    /**
//     * Fanout模式
//     */
//    @RequestMapping("/mq/fanout")
//    @ResponseBody
//    public void mq01(){
//        mqSender.send("hello");
//    }
//
//    /**
//     * Direct模式
//     */
//    @RequestMapping("/mq/direct01")
//    @ResponseBody
//    public void mq02(){
//        mqSender.send01("hello,Red");
//    }
//
//    @RequestMapping("/mq/direct02")
//    @ResponseBody
//    public void mq03(){
//        mqSender.send02("hello,Green");
//    }
//
//    /**
//     * topic模式
//     */
//    @RequestMapping("/mq/topic01")
//    @ResponseBody
//    public void mq04(){
//        mqSender.send03("hello,red");
//    }
//
//    @RequestMapping("/mq/topic02")
//    @ResponseBody
//    public void mq05(){
//        mqSender.send04("hello,green");
//    }
//
//    /**
//     * Headers模式
//     */
//    @RequestMapping("/mq/header01")
//    @ResponseBody
//    public void mq06() {
//        mqSender.send05("Hello,Header01");
//    }
//
//    @RequestMapping("/mq/header02")
//    @ResponseBody
//    public void mq07() {
//        mqSender.send06("Hello,Header02");
//    }

}
