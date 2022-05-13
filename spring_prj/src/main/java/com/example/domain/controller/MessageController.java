package com.example.domain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

import com.example.domain.entity.MessageEntity;
import com.example.domain.service.MessageService;

/**
 * アカウント情報に対してのリクエストを処理します
 */
@RestController
@RequestMapping("message")
@CrossOrigin
public class MessageController {
    // Beenからserviceクラスを呼び出し
    @Autowired
    MessageService messageService;

    /**
     * アカウント情報を全件取得します
     * 
     * @return List<MessageEntity> アカウント情報リスト
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<MessageEntity> getAll() {
        return messageService.getAll();
    }

    /**
     * アカウント情報を全件取得します
     * 
     * @return List<TweetEntity> アカウント情報リスト
     */
    @RequestMapping(value = "/get/id", method = RequestMethod.GET)
    public List<MessageEntity> findById() {
        return messageService.getAll();
    }

    /**
     * アカウント情報を全件取得します
     * 
     * @param postParam
     * @return void
     */
    @RequestMapping(value = "/store", method = RequestMethod.POST)
    public void storeTweet(@RequestBody Map postParam) {
        messageService.storeMessage(postParam);
    }
}
