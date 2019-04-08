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
package org.apache.catalina.loader;

import org.apache.tomcat.util.modeler.ManagedBeanRegistrar;
import org.apache.tomcat.util.modeler.ManagedBeanRegistry;

public class MBeansDescriptors implements ManagedBeanRegistrar {

    @Override
    public void registerManagedBeans(ManagedBeanRegistry registry) {
        registry.add(managedBean -> {
            managedBean.name("WebappLoader");
            managedBean.description("Classloader implementation which is specialized for handling web applications");
            managedBean.domain("Catalina");
            managedBean.group("Loader");
            managedBean.type("org.apache.catalina.loader.WebappLoader");
            managedBean.attribute(attribute -> {
                attribute.name("className");
                attribute.description("Fully qualified class name of the managed object");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("delegate");
                attribute.description("The 'follow standard delegation model' flag that will be used to configure our ClassLoader");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("reloadable");
                attribute.description("The reloadable flag for this Loader");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("stateName");
                attribute.description("The name of the LifecycleState that this component is currently in");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("loaderRepositories");
                attribute.description("Repositories set in the real loader");
                attribute.type("[Ljava.lang.String;");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("loaderRepositoriesString");
                attribute.description("Repositories set in the real loader");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.operation(operation -> {
                operation.name("toString");
                operation.description("Info about the loader");
                operation.impact("INFO");
                operation.returnType("String");
            });
        });
        registry.add(managedBean -> {
            managedBean.name("WebappClassLoader");
            managedBean.description("Classloader implementation which is specialized for handling web applications");
            managedBean.domain("Catalina");
            managedBean.group("Loader");
            managedBean.type("org.apache.catalina.loader.WebappClassLoader");
            managedBean.attribute(attribute -> {
                attribute.name("className");
                attribute.description("Fully qualified class name of the managed object");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("contextName");
                attribute.description("Name of the webapp context");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("delegate");
                attribute.description("The 'follow standard delegation model' flag that will be used to configure our ClassLoader");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("stateName");
                attribute.description("The name of the LifecycleState that this component is currently in");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("URLs");
                attribute.description("The URLs of this loader");
                attribute.type("[Ljava.net.URL;");
            });
        });
        registry.add(managedBean -> {
            managedBean.name("ParallelWebappClassLoader");
            managedBean.description("Classloader implementation which is specialized for handling web applications and is capable of loading classes in parallel");
            managedBean.domain("Catalina");
            managedBean.group("Loader");
            managedBean.type("org.apache.catalina.loader.ParallelWebappClassLoader");
            managedBean.attribute(attribute -> {
                attribute.name("className");
                attribute.description("Fully qualified class name of the managed object");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("contextName");
                attribute.description("Name of the webapp context");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("delegate");
                attribute.description("The 'follow standard delegation model' flag that will be used to configure our ClassLoader");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("stateName");
                attribute.description("The name of the LifecycleState that this component is currently in");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("URLs");
                attribute.description("The URLs of this loader");
                attribute.type("[Ljava.net.URL;");
            });
        });
    }
}
