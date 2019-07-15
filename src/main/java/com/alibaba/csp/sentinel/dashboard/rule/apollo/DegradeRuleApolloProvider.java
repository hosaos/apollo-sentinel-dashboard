package com.alibaba.csp.sentinel.dashboard.rule.apollo;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.DegradeRuleEntity;
import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.FlowRuleEntity;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 降级规则
 *
 * @author: chenyin
 * @date: 2019-07-12 14:17
 */
@Component("degradeRuleApolloProvider")
public class DegradeRuleApolloProvider extends BaseApolloRuleProvider {

    @Override
    public List<DegradeRuleEntity> getRules(String appName) throws Exception {
        return super.getRules(appName);
    }

    @Override
    protected String getDataId() {
        return ApolloConfigUtil.getDegradeDataId();
    }

    @Override
    protected Class getRuleClazz() {
        return DegradeRuleEntity.class;
    }
}
