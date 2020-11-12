package core.factory;

import core.common.BaseExecuteResult;

/**
 * Created by WD on 2018/3/9.
 */
public interface ExtensionFactory {
    /**
     *
     * @param interfaceAliasName
     *            对应接口实现类的的别名
     * @param <T>
     * @return
     */
    <T> T getExtensionInstances(String interfaceAliasName);

    /**
     *
     * @param interfaceAliasName
     *            对应接口实现类的的别名
     * @param <T>
     * @return
     */
    <T> T getExtensionInstancesURL(String interfaceAliasName);

    /**
     * 获取对应接口实现并执行
     *
     * @param interfaceAliasName
     * 			对应接口实现类的的别名
     * @param args
     * 			执行所需参数
     * @return
     */
    <S extends BaseExecuteResult<?>> S execute(String interfaceAliasName, Object... args);
}
