package com.project.projectboardadmin.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import com.fastcampus.projectboardadmin.dto.ArticleDto;

@RequiredArgsConstructor
@Service
public class ArticleManagementService {

    public List<com.fastcampus.projectboardadmin.dto.ArticleDto> getArticles(){
        return List.of();
    }

    public ArticleDto getArticle(Long articleId){
        return null;
    }

    public void deleteArticle(Long articleId){

    }
}
