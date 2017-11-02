package com.chaman.testmvp.implement;

import com.chaman.testmvp.bean.Girl;
import com.chaman.testmvp.model.MainModel;

import java.util.ArrayList;
import java.util.List;

/**
 * model的实现V1
 * Created by Chaman on 2017/11/2.
 */

public class MainModelImpV2 implements MainModel{
    @Override
    public void loadGirl(GirlOnLoadListener listener) {
        List<Girl> data = new ArrayList<>();
        data.add(new Girl());
        data.add(new Girl());
        data.add(new Girl());
        data.add(new Girl());

        /**
         * 加载完成后回调
         */
        listener.onComplete(data);
    }
}
