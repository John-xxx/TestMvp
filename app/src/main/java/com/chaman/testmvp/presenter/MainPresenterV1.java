package com.chaman.testmvp.presenter;

import com.chaman.testmvp.base.BasePresenter;
import com.chaman.testmvp.bean.Girl;
import com.chaman.testmvp.implement.MainModelImpV1;
import com.chaman.testmvp.implement.MainModelImpV2;
import com.chaman.testmvp.model.MainModel;
import com.chaman.testmvp.view.MainView;

import java.util.List;

/**
 * Created by Chaman on 2017/11/2.
 */

public class MainPresenterV1 extends BasePresenter<MainView>{

    //view interface
    MainView mainView;
    //model interface
    MainModel mainModel ;

    /**
     * 通过构造方法实例化Mainview
     *
     * @param mainView
     */
    public MainPresenterV1(MainView mainView) {
        this.mainView = mainView;
    }

    /**
     * 绑定view 和 model
     */
    public void fetch() {
        //让model load data

        mainView.showLoading();

        if (mainModel != null) {
            mainModel.loadGirl(new MainModel.GirlOnLoadListener() {
                @Override
                public void onComplete(List<Girl> girls) {
                    //给view显示
                    mainView.showGirls(girls);
                }
            });
        }
    }

    /**
     * 根据不同需要实现不同的model实现
     * @param i
     */
    public void setMainModel(int i) {
        switch (i) {
            case 1:
                // model实现1
                mainModel = new MainModelImpV1();
                break;
            case 2:
                //model实现2
                mainModel = new MainModelImpV2();
                break;
        }
    }

}
