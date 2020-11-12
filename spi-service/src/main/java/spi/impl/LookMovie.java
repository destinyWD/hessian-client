package spi.impl;

import spi.Look;
import spi.vo.LookResult;

/**
 * Created by WD on 2018/3/9.
 */
public class LookMovie implements Look {
    public LookResult execute(Object... objects) {
        System.out.println("———————LookMovie start");
        LookResult lr = new LookResult("看电影");
        lr.setIsSuccess(0);
        lr.setErrorCode("9999");
        return lr;
    }
}
