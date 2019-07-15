package com.alibaba.csp.sentinel.dashboard.rule.apollo;

import com.alibaba.csp.sentinel.dashboard.rule.DynamicRulePublisher;
import com.alibaba.csp.sentinel.util.AssertUtil;
import com.alibaba.fastjson.JSON;
import com.ctrip.framework.apollo.openapi.client.ApolloOpenApiClient;
import com.ctrip.framework.apollo.openapi.dto.NamespaceReleaseDTO;
import com.ctrip.framework.apollo.openapi.dto.OpenItemDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author: chenyin
 * @date: 2019-07-12 14:17
 */
@Component
public abstract class BaseApolloRulePublisher implements DynamicRulePublisher {

    @Autowired
    protected ApolloOpenApiClient apolloOpenApiClient;
    @Value("${spring.profiles.active}")
    private String env;

    @Override
    public void publish(String app, Object rules) throws Exception {
        AssertUtil.notEmpty(app, "app name cannot be empty");
        if (rules == null) {
            return;
        }
        String dataId = getDataId();

        pushRulesToApollo(app, dataId, rules);
    }

    protected abstract String getDataId();

    /**
     * 推送规则到apollo
     *
     * @param appName
     * @param dataId
     * @return
     */
    protected void pushRulesToApollo(String appName, String dataId, Object rules) {
        String namespaceName = ApolloConfigUtil.getNamespaceName();

        OpenItemDTO openItemDTO = new OpenItemDTO();
        openItemDTO.setKey(dataId);
        openItemDTO.setValue(JSON.toJSONString(rules));
//        openItemDTO.setComment("Program auto-join");
        openItemDTO.setDataChangeCreatedBy("shenyi");
        apolloOpenApiClient.createOrUpdateItem(appName, env, "default", namespaceName, openItemDTO);

        // Release configuration
        NamespaceReleaseDTO namespaceReleaseDTO = new NamespaceReleaseDTO();
        namespaceReleaseDTO.setEmergencyPublish(true);
//        namespaceReleaseDTO.setReleaseComment("Modify or add configurations");
        namespaceReleaseDTO.setReleasedBy("shenyi");
        namespaceReleaseDTO.setReleaseTitle("Modify or add configurations");
        apolloOpenApiClient.publishNamespace(appName, env, "default", namespaceName, namespaceReleaseDTO);
    }
}
