package com.wuzp.testrv.testRecycler;

import java.io.Serializable;

/**
 * Created by wuzp on 2019/2/26.
 */

public class Person implements Serializable {

    public String name;

    public Person() {
        this.name = "name is null";
    }

    public Person(String name) {
        this.name = name;
    }
}
