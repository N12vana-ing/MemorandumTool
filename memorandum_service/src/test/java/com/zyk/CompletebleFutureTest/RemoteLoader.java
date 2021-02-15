package com.zyk.CompletebleFutureTest;

public interface RemoteLoader {
    String load();

    default void delay() {
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class CustomerInfoService implements RemoteLoader {
    public String load() {
        this.delay();
        return "基本信息";
    }
}

class LearnRecordService implements RemoteLoader {
    public String load() {
        this.delay();
        return "学习信息";
    }
}

class WatchRecordService implements RemoteLoader {
    @Override
    public String load() {
        this.delay();
        return "观看记录";
    }
}

class OrderService implements RemoteLoader {
    @Override
    public String load() {
        this.delay();
        return "订单信息";
    }
}

class LabelService implements RemoteLoader {
    @Override
    public String load() {
        this.delay();
        return "标签信息";
    }
}