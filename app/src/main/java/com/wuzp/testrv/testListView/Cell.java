package com.wuzp.testrv.testListView;

import java.io.Serializable;

/**
 * Created by wuzp on 2019/2/27.
 */

public class Cell implements Serializable {
    public String name;
    public int num;

    public Cell() {
    }

    public Cell(String name, int num) {
        this.name = name;
        this.num = num;
    }
}
