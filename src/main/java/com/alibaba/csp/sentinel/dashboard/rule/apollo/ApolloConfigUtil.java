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

/**
 * @author hantianwei@gmail.com
 * @since 1.5.0
 */
public final class ApolloConfigUtil {
    /**
     * 流控规则id
     */
    public static final String FLOW_DATA_ID_POSTFIX = "flow-rules";
    /**
     * 降级规则id
     */
    public static final String DEGRADE_DATA_ID_POSTFIX = "degrade-rules";
    /**
     * 热点规则id
     */
    public static final String PARAM_FLOW_DATA_ID_POSTFIX = "param-flow-rules";
    /**
     * 系统规则id
     */
    public static final String SYSTEM_DATA_ID_POSTFIX = "system-rules";
    /**
     * 授权规则id
     */
    public static final String AUTHORITY_DATA_ID_POSTFIX = "authority-rules";

    public static final String NAMESPACE_NAME = "application";

    private ApolloConfigUtil() {
    }

    public static String getFlowDataId() {
        return FLOW_DATA_ID_POSTFIX;
    }

    public static String getDegradeDataId() {
        return DEGRADE_DATA_ID_POSTFIX;
    }

    public static String getParamFlowDataId() {
        return PARAM_FLOW_DATA_ID_POSTFIX;
    }

    public static String getSystemDataId() {
        return SYSTEM_DATA_ID_POSTFIX;
    }

    public static String getAuthorityDataId() {
        return AUTHORITY_DATA_ID_POSTFIX;
    }

}
