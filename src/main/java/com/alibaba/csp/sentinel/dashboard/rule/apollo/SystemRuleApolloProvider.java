package com.alibaba.csp.sentinel.dashboard.rule.apollo;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.SystemRuleEntity;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 系统规则
 *
 * @author: chenyin
 * @date: 2019-07-12 14:17
 */
@Component("systemRuleApolloProvider")
public class SystemRuleApolloProvider extends BaseApolloRuleProvider {

    @Override
    public List<SystemRuleEntity> getRules(String appName) throws Exception {
        return super.getRules(appName);
    }

    @Override
    protected String getDataId() {
        return ApolloConfigUtil.getSystemDataId();
    }

    @Override
    protected Class getRuleClazz() {
        return SystemRuleEntity.class;
    }
}
