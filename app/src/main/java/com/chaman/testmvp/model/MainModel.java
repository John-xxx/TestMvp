package com.chaman.testmvp.model;

import com.chaman.testmvp.bean.Girl;
import java.util.List;

/**
 * Created by Chaman on 2017/11/2.
 */

public interface MainModel {

    /**
     * 加载数据，添加回调
     * @param listener
     */
    void loadGirl(GirlOnLoadListener listener);

    interface GirlOnLoadListener {
        /**
         * 加载完成
         * @param girls
         */
        void onComplete(List<Girl> girls);
    }
}
