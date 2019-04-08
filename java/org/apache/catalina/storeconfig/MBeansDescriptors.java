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
package org.apache.catalina.storeconfig;

import org.apache.tomcat.util.modeler.ManagedBeanRegistrar;
import org.apache.tomcat.util.modeler.ManagedBeanRegistry;

public class MBeansDescriptors implements ManagedBeanRegistrar {

    @Override
    public void registerManagedBeans(ManagedBeanRegistry registry) {
        registry.add(managedBean -> {
            managedBean.name("StoreConfig");
            managedBean.className("org.apache.catalina.mbeans.ClassNameMBean");
            managedBean.description("Implementation of a store server.xml config");
            managedBean.domain("Catalina");
            managedBean.group("StoreConfig");
            managedBean.type("org.apache.catalina.storeconfig.StoreConfig");
            managedBean.operation(operation -> {
                operation.name("storeConfig");
                operation.description("Store Server");
                operation.impact("ACTION");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("storeServer");
                operation.description("Store Server from ObjectName");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("objectname");
                    parameter.description("Objectname from Server");
                    parameter.type("java.lang.String");
                });
                operation.parameter(parameter -> {
                    parameter.name("backup");
                    parameter.description("store Context with backup");
                    parameter.type("boolean");
                });
                operation.parameter(parameter -> {
                    parameter.name("externalAllowed");
                    parameter.description("store all Context external that have a configFile");
                    parameter.type("boolean");
                });
            });
            managedBean.operation(operation -> {
                operation.name("storeContext");
                operation.description("Store Context from ObjectName");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("objectname");
                    parameter.description("ObjectName from Context");
                    parameter.type("java.lang.String");
                });
                operation.parameter(parameter -> {
                    parameter.name("backup");
                    parameter.description("store with Backup");
                    parameter.type("boolean");
                });
                operation.parameter(parameter -> {
                    parameter.name("externalAllowed");
                    parameter.description("store all or store only internal server.xml context (configFile == null)");
                    parameter.type("boolean");
                });
            });
            managedBean.operation(operation -> {
                operation.name("store");
                operation.description("Store Server");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("server");
                    parameter.description("Server");
                    parameter.type("org.apache.catalina.Server");
                });
            });
            managedBean.operation(operation -> {
                operation.name("store");
                operation.description("Store Context");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("context");
                    parameter.description("Context");
                    parameter.type("org.apache.catalina.context");
                });
            });
            managedBean.operation(operation -> {
                operation.name("store");
                operation.description("Store Host");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("host");
                    parameter.description("Host");
                    parameter.type("org.apache.catalina.Host");
                });
            });
            managedBean.operation(operation -> {
                operation.name("store");
                operation.description("Store Service");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("service");
                    parameter.description("service");
                    parameter.type("org.apache.catalina.Service");
                });
            });
        });
    }
}
