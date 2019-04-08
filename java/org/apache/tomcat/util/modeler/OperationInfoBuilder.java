/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.tomcat.util.modeler;

import java.util.function.Consumer;

/**
 * Builder for {@link OperationInfo} instances.
 *
 * @author Phillip Webb
 */
public class OperationInfoBuilder extends FeatureInfoBuilder {

    private final OperationInfo built;

    OperationInfoBuilder(OperationInfo built) {
        super(built);
        this.built = built;
    }

    public void impact(String impact) {
        this.built.setImpact(impact);
    }

    public void role(String role) {
        this.built.setRole(role);
    }

    public void returnType(String returnType) {
        this.built.setReturnType(returnType);
    }

    public void parameter(Consumer<ParameterInfoBuilder> parameter) {
        this.built.addParameter(ParameterInfo.build(parameter));
    }
}
