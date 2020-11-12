package core.common;

import core.common.BaseExecuteResult;

/**
 * Created by WD on 2018/3/9.
 */
public interface SpiSerivce {
    /**
     * @return 返回对像规范是 BaseResult<T>的实现
     */
    public BaseExecuteResult<?> execute(Object... args);
}
