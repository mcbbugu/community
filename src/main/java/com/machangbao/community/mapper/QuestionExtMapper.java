package com.machangbao.community.mapper;

import com.machangbao.community.model.Question;

public interface QuestionExtMapper {
    int inView(Question question);

    int inCommentCount(Question record);
}