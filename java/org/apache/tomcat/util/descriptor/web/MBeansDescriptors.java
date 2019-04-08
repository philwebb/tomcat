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
package org.apache.tomcat.util.descriptor.web;

import org.apache.tomcat.util.modeler.ManagedBeanRegistrar;
import org.apache.tomcat.util.modeler.ManagedBeanRegistry;

public class MBeansDescriptors implements ManagedBeanRegistrar {

    @Override
    public void registerManagedBeans(ManagedBeanRegistry registry) {
        registry.add(managedBean -> {
            managedBean.name("ContextEnvironment");
            managedBean.className("org.apache.catalina.mbeans.ContextEnvironmentMBean");
            managedBean.description("Representation of an application environment entry");
            managedBean.domain("Catalina");
            managedBean.group("Resources");
            managedBean.type("org.apache.tomcat.util.descriptor.web.ContextEnvironment");
            managedBean.attribute(attribute -> {
                attribute.name("className");
                attribute.description("Fully qualified class name of the managed object");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("description");
                attribute.description("The description of this environment entry");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("name");
                attribute.description("The name of this environment entry");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("override");
                attribute.description("Does this environment entry allow overrides by the application deployment descriptor");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("type");
                attribute.description("The type of this environment entry");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("value");
                attribute.description("The value of this environment entry");
                attribute.type("java.lang.String");
            });
        });
        registry.add(managedBean -> {
            managedBean.name("ContextResource");
            managedBean.className("org.apache.catalina.mbeans.ContextResourceMBean");
            managedBean.description("Representation of a resource reference for a web application");
            managedBean.domain("Catalina");
            managedBean.group("Resources");
            managedBean.type("org.apache.tomcat.util.descriptor.web.ContextResource");
            managedBean.attribute(attribute -> {
                attribute.name("auth");
                attribute.description("The authorization requirement for this resource");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("description");
                attribute.description("The description of this resource");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("name");
                attribute.description("The name of this resource");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("scope");
                attribute.description("The sharing scope of this resource factory");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("type");
                attribute.description("The type of this environment entry");
                attribute.type("java.lang.String");
            });
        });
        registry.add(managedBean -> {
            managedBean.name("ContextResourceLink");
            managedBean.className("org.apache.catalina.mbeans.ContextResourceLinkMBean");
            managedBean.description("Representation of a resource link for a web application");
            managedBean.domain("Catalina");
            managedBean.group("Resources");
            managedBean.type("org.apache.tomcat.util.descriptor.web.ContextResourceLink");
            managedBean.attribute(attribute -> {
                attribute.name("global");
                attribute.description("The global name of this resource");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("name");
                attribute.description("The name of this resource");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("description");
                attribute.description("The description of this resource");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("type");
                attribute.description("The type of this resource");
                attribute.type("java.lang.String");
            });
        });
    }
}
