package com.alibaba.csp.sentinel.dashboard.rule.apollo;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.FlowRuleEntity;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 流控规则
 *
 * @author: chenyin
 * @date: 2019-07-12 14:17
 */
@Component("flowRuleApolloProvider")
public class FlowRuleApolloProvider extends BaseApolloRuleProvider {

    @Override
    public List<FlowRuleEntity> getRules(String appName) throws Exception {
        return super.getRules(appName);
    }

    @Override
    protected String getDataId() {
        return ApolloConfigUtil.getFlowDataId();
    }

    @Override
    protected Class getRuleClazz() {
        return FlowRuleEntity.class;
    }
}
