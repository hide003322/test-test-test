package com.example.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * アカウントの情報を永続化するEntity
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "message")
public class MessageEntity {
    // アカウントのID
    @Id
    @GeneratedValue
    private int id;

    // アカウントのメールアドレス
    @Column(nullable = false)
    private String message_title;

    // アカウントのパスワード
    @Column(nullable = false)
    private String message_detail;

    // ユーザの名前
    @Column(nullable = false)
    private String submit_account;
}
