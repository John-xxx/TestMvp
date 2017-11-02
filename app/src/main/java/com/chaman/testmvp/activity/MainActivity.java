package com.chaman.testmvp.activity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.chaman.testmvp.R;
import com.chaman.testmvp.base.MVPBaseActivity;
import com.chaman.testmvp.bean.Girl;
import com.chaman.testmvp.presenter.MainPresenterV1;
import com.chaman.testmvp.view.MainView;

import java.util.List;

public class MainActivity extends MVPBaseActivity<MainView,MainPresenterV1> implements MainView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.text);


        //中间者实例化
//        MainPresenterV1 mainPresenterV1 = new MainPresenterV1(this);
        //用那个model的实现加载数据
        mPresenter.setMainModel(1);
        //触发加载数据
        mPresenter.fetch();
    }

    @Override
    protected MainPresenterV1 createPresenter() {
        return new MainPresenterV1(this);
    }

    @Override
    public void showLoading() {
        Toast.makeText(MainActivity.this, "加载中", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showGirls(List<Girl> girls) {

    }
}
