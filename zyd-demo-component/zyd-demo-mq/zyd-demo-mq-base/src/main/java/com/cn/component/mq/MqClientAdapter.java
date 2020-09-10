package com.cn.component.mq;

import com.cn.component.mq.config.MqProperties;

/**
 * @author zyd
 * @date 2019/11/22 10:22
 * @desc
 */
public abstract class MqClientAdapter<T extends MqProperties> implements BaseMqClient {

    protected T mqProperties;

    public MqClientAdapter() {
    }

    public MqClientAdapter(T mqProperties) {
        this.mqProperties = mqProperties;
    }

    @Override
    public void init() {

    }

    @Override
    public void destroy() {

    }
}
