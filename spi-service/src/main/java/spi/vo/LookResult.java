package spi.vo;


import core.common.BaseExecuteResult;

import java.io.Serializable;

/**
 * Created by WD on 2018/3/9.
 */
public class LookResult extends BaseExecuteResult<String> implements Serializable  {

    private static final long serialVersionUID = -6630727945081235170L;

    public LookResult(String reqType) {
        super(reqType);
    }
}
