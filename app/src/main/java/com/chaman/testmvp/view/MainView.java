package com.chaman.testmvp.view;

import com.chaman.testmvp.bean.Girl;

import java.util.List;

/**
 * Created by Chaman on 2017/11/2.
 */

public interface MainView {

    /**
     * 加载进度条
     */
    void showLoading();

    /**
     * 显示数据
     * @param girls
     */
    void showGirls(List<Girl> girls);

}
