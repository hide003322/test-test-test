package com.example.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.example.domain.entity.AccountEntity;
import com.example.domain.repository.AccountRepository;

/**
 * アカウント情報を操作するビジネスロジックを実装します
 */
@Service
@Transactional
public class AccountService implements ServiceInterFace<List<AccountEntity>> {

    // Beenからリポジトリの呼び出し
    @Autowired
    AccountRepository accountRepository;

    /**
     * アカウント情報を全て取得します
     * 
     * @return List<AccountEntity> アカウント情報リスト
     */
    public List<AccountEntity> getAll() {
        return accountRepository.findAll();
    }

    /**
     * ツイートを保存します
     * 
     * @param Map postParam ツイート文字
     * @return void
     */
    public void storeAccount(Map postParam) {
        // 保存したいAcountEntityをリストに挿入
        List<AccountEntity> entities = Arrays.asList(
                new AccountEntity(
                        // アカウントのID
                        0,
                        // メールアドレス
                        postParam.get("email").toString(),
                        // パスワード
                        postParam.get("password").toString(),
                        // ユーザネーム
                        postParam.get("userName").toString(),
                        // アカウント詳細
                        postParam.get("accountDetails").toString()));
        // アカウントデータを保存
        accountRepository.saveAll(entities);
    }
}
