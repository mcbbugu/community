package com.machangbao.community.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * .
 * Created by mcbbugu
 * 2019-09-13 20:16
 */
@Data
public class PaginationDTO {

    private List<QuestionDTO> questions;

    //是否有向前按钮
    private boolean showPrevious;

    private boolean showFirstPage;

    private boolean showNext;

    private boolean showEndPage;

    //当前页
    private Integer page;

    //当前显示的可点击页
    private List<Integer> pages = new ArrayList<>();

    private Integer totalPage;

    public void setPageination(Integer totalPage, Integer page) {

        this.totalPage = totalPage;
        this.page = page;

        pages.add(page);
        for(int i = 1; i <= 3; i++){
            if(page - i > 0){
                //0表示往头部插入???
                pages.add(0, page - i);
            }

            if(page + i <= totalPage){
                pages.add(page + i);
            }
        }

        //是否展示上一页
        if(page == 1){
            showPrevious = false;
        }else{
            showPrevious = true;
        }

        //是否展示下一页
        if(page == totalPage){
            showNext = false;
        }else{
            showNext = true;
        }

        //是否有<<按钮
        if(pages.contains(1)){
            showFirstPage = false;
        }else{
            showFirstPage = true;
        }

        //是否有 >> 按钮
        if(pages.contains(totalPage)){
            showEndPage = false;
        }else{
            showEndPage = true;
        }
    }
}