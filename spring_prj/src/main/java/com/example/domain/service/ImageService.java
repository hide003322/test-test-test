package com.example.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import com.example.domain.entity.ImageEntity;
import com.example.domain.repository.ImageRepository;

/**
 * アカウント情報を操作するビジネスロジックを実装します
 */
@Service
@Transactional
public class ImageService implements ServiceInterFace<List<ImageEntity>> {
    // Beenからリポジトリの呼び出し
    @Autowired
    ImageRepository imageRepository;

    /**
     * 画像情報を全て取得します
     * 
     * @return List<ImageEntity> アカウント情報リスト
     */
    public List<ImageEntity> getAll() {
        return imageRepository.findAll();
    }
}
