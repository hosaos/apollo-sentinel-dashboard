package com.alibaba.csp.sentinel.dashboard.rule.apollo;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.AuthorityRuleEntity;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 授权规则
 *
 * @author: chenyin
 * @date: 2019-07-12 14:17
 */
@Component("authorityRuleApolloProvider")
public class AuthorityRuleApolloProvider extends BaseApolloRuleProvider {

    @Override
    public List<AuthorityRuleEntity> getRules(String appName) throws Exception {
        return super.getRules(appName);
    }

    @Override
    protected String getDataId() {
        return ApolloConfigUtil.getAuthorityDataId();
    }

    @Override
    protected Class getRuleClazz() {
        return AuthorityRuleEntity.class;
    }
}
