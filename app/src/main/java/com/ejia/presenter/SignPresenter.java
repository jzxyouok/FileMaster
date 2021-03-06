package com.ejia.presenter;

import com.ejia.entity.EJAMessage;
import com.ejia.entity.Sign;
import com.ejia.model.ISignModel;
import com.ejia.model.SignModel;
import com.ejia.view.ISignView;

import java.util.List;

/**
 * Created by yangzhongyu on 2017/1/31.
 */
public class SignPresenter implements ISignPresenter {

    private ISignModel mSignModel = new SignModel();

    private ISignView mSignView ;

    public SignPresenter(ISignView signView){
        mSignView = signView;
    }

    @Override
    public void querySignListByPhone(String phone) {
        mSignModel.querySignListByPhone(phone,new NetworkListener<List<Sign>>() {
            @Override
            public void onResponse(List<Sign> signs) {
                  mSignView.onQuerySignList(signs);
            }

            @Override
            public void onFailure() {

            }
        });
    }
}
