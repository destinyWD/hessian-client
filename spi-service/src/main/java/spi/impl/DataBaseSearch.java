package spi.impl;

import spi.Search;

/**
 * Created by WD on 2018/3/9.
 */
public class DataBaseSearch implements Search {
    public void search() {
        System.out.println("database搜索");
    }
}
