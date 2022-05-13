package com.example.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.example.domain.entity.MessageEntity;
import com.example.domain.repository.MessageRepository;

/**
 * アカウント情報を操作するビジネスロジックを実装します
 */
@Service
@Transactional
public class MessageService implements ServiceInterFace<List<MessageEntity>> {

    // Beenからリポジトリの呼び出し
    @Autowired
    MessageRepository messageRepository;

    /**
     * アカウント情報を全て取得します
     * 
     * @return List<MessageEntity> アカウント情報リスト
     */
    public List<MessageEntity> getAll() {
        return messageRepository.findAll();
    }

    /**
     * ツイートを保存します
     * 
     * @param Map postParam ツイート文字
     * @return void
     */
    public void storeMessage(Map postParam) {
        // 保存したいAcountEntityをリストに挿入
        List<MessageEntity> entities = Arrays.asList(
                new MessageEntity(
                        // アカウントのID
                        0,
                        // メールアドレス
                        postParam.get("messageTitle").toString(),
                        // パスワード
                        postParam.get("messageDetail").toString(),
                        // ユーザネーム
                        postParam.get("submitAccount").toString()
                // アカウント詳細
                ));
        // アカウントデータを保存
        messageRepository.saveAll(entities);
    }
}
