package com.wuzp.testrv.testNetwork.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by wuzp on 2019/2/28.
 */

public class JokeEntity implements Serializable {
    public int allPages;
    public int ret_code;
    public List<JokeItemEntity> contentlist;
    public int currentPage;
    public int allNum;
    public int maxResult;

    public static class JokeItemEntity implements Serializable {
        public String id;
        public String title;
        public String img;
        public int type;
        public String ct;
    }
}
