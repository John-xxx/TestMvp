package com.chaman.testmvp.base;

import java.lang.ref.WeakReference;

/**
 * Created by Chaman on 2017/11/2.
 */

public abstract class BasePresenter<T> {

    /**
     * 当内存不足可释放内存
     */
    protected WeakReference<T> mViewRef;

    /**
     * 解除管理
     */
    public void detachView() {
        if (mViewRef != null){
            mViewRef.clear();
            mViewRef = null;
        }
    }

    /**
     * presenter 和 view 绑定
     * @param view
     */
    public void attachView(T view) {
        mViewRef = new WeakReference<T>(view);
    }


    public abstract void setMainModel(int i);

    public abstract void fetch();
}
