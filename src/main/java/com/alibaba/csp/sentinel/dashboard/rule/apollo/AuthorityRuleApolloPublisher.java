/*
 * Copyright 1999-2018 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.csp.sentinel.dashboard.rule.apollo;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.AuthorityRuleEntity;
import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.DegradeRuleEntity;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 授权规则
 *
 * @author: chenyin
 * @date: 2019-07-12 14:17
 */
@Component("authorityRuleApolloPublisher")
public class AuthorityRuleApolloPublisher extends BaseApolloRulePublisher {

    @Override
    public void publish(String app, Object rules) throws Exception {
        List<AuthorityRuleEntity> authorityRuleEntityList = (List<AuthorityRuleEntity>) rules;
        for (AuthorityRuleEntity authorityRuleEntity : authorityRuleEntityList) {
            authorityRuleEntity.setGmtCreate(null);
            authorityRuleEntity.setGmtModified(null);
            authorityRuleEntity.setIp(null);
            authorityRuleEntity.setPort(null);
        }
        super.publish(app, rules);
    }

    @Override
    protected String getDataId() {
        return ApolloConfigUtil.getAuthorityDataId();
    }
}
