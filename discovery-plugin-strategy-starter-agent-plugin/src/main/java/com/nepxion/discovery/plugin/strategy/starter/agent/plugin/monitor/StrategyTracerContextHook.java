package com.nepxion.discovery.plugin.strategy.starter.agent.plugin.monitor;

/**
 * <p>Title: Nepxion Discovery</p>
 * <p>Description: Nepxion Discovery</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author zifeihan
 * @version 1.0
 */

import com.nepxion.discovery.plugin.strategy.monitor.StrategyTracerContext;
import com.nepxion.discovery.plugin.strategy.starter.agent.threadlocal.ThreadLocalHook;

public class StrategyTracerContextHook implements ThreadLocalHook {
    @Override
    public Object create() {
        return StrategyTracerContext.getCurrentContext().getSpan();
    }

    @Override
    public void before(Object object) {
        StrategyTracerContext.getCurrentContext().setSpan(object);
    }

    @Override
    public void after() {
        StrategyTracerContext.clearCurrentContext();
    }
}