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
package org.apache.catalina.startup;

import org.apache.tomcat.util.modeler.ManagedBeanRegistrar;
import org.apache.tomcat.util.modeler.ManagedBeanRegistry;

public class MBeansDescriptors implements ManagedBeanRegistrar {

    @Override
    public void registerManagedBeans(ManagedBeanRegistry registry) {
        registry.add(managedBean -> {
            managedBean.name("ContextConfig");
            managedBean.description("Startup event listener for a Context that configures the properties of that Context, and the associated defined servlets");
            managedBean.domain("Catalina");
            managedBean.group("Listener");
            managedBean.type("org.apache.catalina.startup.ContextConfig");
            managedBean.attribute(attribute -> {
                attribute.name("className");
                attribute.description("Fully qualified class name of the managed object");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("defaultContextXml");
                attribute.description("The location of the default context file");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("defaultWebXml");
                attribute.description("The location of the default deployment descriptor");
                attribute.type("java.lang.String");
            });
        });
        registry.add(managedBean -> {
            managedBean.name("EngineConfig");
            managedBean.description("Startup event listener for a Engine that configures the properties of that Engine, and the associated defined contexts");
            managedBean.domain("Catalina");
            managedBean.group("Listener");
            managedBean.type("org.apache.catalina.startup.EngineConfig");
            managedBean.attribute(attribute -> {
                attribute.name("className");
                attribute.description("Fully qualified class name of the managed object");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
        });
        registry.add(managedBean -> {
            managedBean.name("HostConfig");
            managedBean.description("Startup event listener for a Host that configures the properties of that Host, and the associated defined contexts");
            managedBean.domain("Catalina");
            managedBean.group("Listener");
            managedBean.type("org.apache.catalina.startup.HostConfig");
            managedBean.attribute(attribute -> {
                attribute.name("className");
                attribute.description("Fully qualified class name of the managed object");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("configBaseName");
                attribute.description("The base directory for Context configuration files");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("contextClass");
                attribute.description("The Java class name of the Context implementation we should use");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("copyXML");
                attribute.description("The copy XML config file flag for this component");
                attribute.type("boolean");
                attribute.is(true);
            });
            managedBean.attribute(attribute -> {
                attribute.name("deployXML");
                attribute.description("The deploy XML config file flag for this component");
                attribute.type("boolean");
                attribute.is(true);
            });
            managedBean.attribute(attribute -> {
                attribute.name("unpackWARs");
                attribute.description("The unpack WARs flag");
                attribute.type("boolean");
                attribute.is(true);
            });
            managedBean.operation(operation -> {
                operation.name("addServiced");
                operation.description("Add a web application to the serviced list to show it gets serviced by another component");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("name");
                    parameter.description("Application name");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("check");
                operation.description("Check a web application name for updates");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("name");
                    parameter.description("Application name");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("checkUndeploy");
                operation.description("Undeploy any old versions of applications deployed using parallel deployment that have no active sessions");
                operation.impact("ACTION");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("getDeploymentTime");
                operation.description("Get the instant where an application was deployed");
                operation.impact("ACTION");
                operation.returnType("long");
                operation.parameter(parameter -> {
                    parameter.name("name");
                    parameter.description("Application name");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("isDeployed");
                operation.description("Was this web application deployed by this component");
                operation.impact("ACTION");
                operation.returnType("boolean");
                operation.parameter(parameter -> {
                    parameter.name("name");
                    parameter.description("Application name");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("isServiced");
                operation.description("Is a web application serviced by another component");
                operation.impact("ACTION");
                operation.returnType("boolean");
                operation.parameter(parameter -> {
                    parameter.name("name");
                    parameter.description("Application name");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("manageApp");
                operation.description("Add a web application managed externally");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("context");
                    parameter.description("Context to add");
                    parameter.type("org.apache.catalina.Context");
                });
            });
            managedBean.operation(operation -> {
                operation.name("removeServiced");
                operation.description("Remove a web application from the serviced list to show it isn't serviced by another component");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("name");
                    parameter.description("Application name");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("unmanageApp");
                operation.description("Remove a web application from checks");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("contextPath");
                    parameter.description("The application path");
                    parameter.type("java.lang.String");
                });
            });
        });
    }
}
