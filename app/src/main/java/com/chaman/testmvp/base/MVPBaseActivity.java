package com.chaman.testmvp.base;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Chaman on 2017/11/2.
 */

public abstract class MVPBaseActivity<V,T extends BasePresenter<V>> extends Activity{
    protected  T mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //创建Presenter
        mPresenter = createPresenter();
        //内存泄露
        //关联view
        mPresenter.attachView((V)this);
    }


    protected abstract T createPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.detachView();
    }
}
