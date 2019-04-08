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
package org.apache.catalina.deploy;

import org.apache.tomcat.util.modeler.ManagedBeanRegistrar;
import org.apache.tomcat.util.modeler.ManagedBeanRegistry;

public class MBeansDescriptors implements ManagedBeanRegistrar {

    @Override
    public void registerManagedBeans(ManagedBeanRegistry registry) {
        registry.add(managedBean -> {
            managedBean.name("NamingResourcesImpl");
            managedBean.className("org.apache.catalina.mbeans.NamingResourcesMBean");
            managedBean.description("Holds and manages the naming resources defined in the J2EE Enterprise Naming Context and their associated JNDI context");
            managedBean.domain("Catalina");
            managedBean.group("Resources");
            managedBean.type("org.apache.catalina.deploy.NamingResourcesImpl");
            managedBean.attribute(attribute -> {
                attribute.name("container");
                attribute.description("The container with which the naming resources are associated.");
                attribute.type("java.lang.Object");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("environments");
                attribute.description("MBean Names of the set of defined environment entries for this web application");
                attribute.type("[Ljava.lang.String;");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("resources");
                attribute.description("MBean Names of all the defined resource references for this application.");
                attribute.type("[Ljava.lang.String;");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("resourceLinks");
                attribute.description("MBean Names of all the defined resource link references for this application.");
                attribute.type("[Ljava.lang.String;");
                attribute.writeable(false);
            });
            managedBean.operation(operation -> {
                operation.name("addEnvironment");
                operation.description("Add an environment entry for this web application");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("envName");
                    parameter.description("New environment entry name");
                    parameter.type("java.lang.String");
                });
                operation.parameter(parameter -> {
                    parameter.name("type");
                    parameter.description("New environment entry type");
                    parameter.type("java.lang.String");
                });
                operation.parameter(parameter -> {
                    parameter.name("value");
                    parameter.description("New environment entry value");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("addResource");
                operation.description("Add a resource reference for this web application");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("resourceName");
                    parameter.description("New resource reference name");
                    parameter.type("java.lang.String");
                });
                operation.parameter(parameter -> {
                    parameter.name("type");
                    parameter.description("New resource reference type");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("addResourceLink");
                operation.description("Add a resource link reference for this web application");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("resourceLinkName");
                    parameter.description("New resource reference name");
                    parameter.type("java.lang.String");
                });
                operation.parameter(parameter -> {
                    parameter.name("type");
                    parameter.description("New resource reference type");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("removeEnvironment");
                operation.description("Remove any environment entry with the specified name");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("envName");
                    parameter.description("Name of the environment entry to remove");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("removeResource");
                operation.description("Remove any resource reference with the specified name");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("resourceName");
                    parameter.description("Name of the resource reference to remove");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("removeResourceLink");
                operation.description("Remove any resource link reference with the specified name");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("resourceLinkName");
                    parameter.description("Name of the resource reference to remove");
                    parameter.type("java.lang.String");
                });
            });
        });
    }
}
