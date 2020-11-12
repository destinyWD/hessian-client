package spi;

import core.common.SpiSerivce;
import spi.vo.LookResult;

/**
 * Created by WD on 2018/3/9.
 */
public interface Look extends SpiSerivce {
    LookResult execute(Object... objects);
}
