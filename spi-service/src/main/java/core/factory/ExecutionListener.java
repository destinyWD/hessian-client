package core.factory;

import core.common.SpiSerivce;

/**
 * Created by WD on 2018/3/9.
 */
public interface ExecutionListener {
    ExecutionResult handleExecution(SpiSerivce service, String interfaceAliasName, Object ...args);
}
