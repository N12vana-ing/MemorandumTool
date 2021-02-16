package com.zyk.dao.user;

import org.apache.ibatis.session.ResultContext;
import org.apache.ibatis.session.ResultHandler;

import java.util.HashMap;
import java.util.Map;

public class UserResultHandler implements ResultHandler {

    private final Map mapResults = new HashMap();

    @Override
    public void handleResult(ResultContext resultContext) {
        Map map = (Map)resultContext.getResultObject();
        mapResults.put(map.get("key"), map.get("value"));
    }

    public Map getMapResults() {
        return mapResults;
    }
}
