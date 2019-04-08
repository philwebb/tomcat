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
 * Builder for {@link ManagedBean} instances.
 *
 * @author Phillip Webb
 */
public class ManagedBeanBuilder {

    private final ManagedBean built;

    ManagedBeanBuilder(ManagedBean managedBean) {
        this.built = managedBean;
    }

    public void name(String name) {
        this.built.setName(name);
    }

    public void className(String className) {
        this.built.setClassName(className);
    }

    public void description(String description) {
        this.built.setDescription(description);
    }

    public void domain(String domain) {
        this.built.setDomain(domain);
    }

    public void group(String group) {
        this.built.setGroup(group);
    }

    public void type(String type) {
        this.built.setType(type);
    }

    public void attribute(Consumer<AttributeInfoBuilder> attribute) {
        this.built.addAttribute(AttributeInfo.build(attribute));
    }

    public void notification(Consumer<NotificationInfoBuilder> notification) {
        this.built.addNotification(NotificationInfo.build(notification));
    }

    public void operation(Consumer<OperationInfoBuilder> operation) {
        this.built.addOperation(OperationInfo.build(operation));
    }
}
