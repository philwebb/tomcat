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
package org.apache.catalina.mbeans;

import org.apache.tomcat.util.modeler.ManagedBeanRegistrar;
import org.apache.tomcat.util.modeler.ManagedBeanRegistry;

public class MBeansDescriptors implements ManagedBeanRegistrar {

    @Override
    public void registerManagedBeans(ManagedBeanRegistry registry) {
        registry.add(managedBean -> {
            managedBean.name("MBeanFactory");
            managedBean.description("Factory for MBeans and corresponding components");
            managedBean.domain("Catalina");
            managedBean.type("org.apache.catalina.mbeans.MBeanFactory");
            managedBean.operation(operation -> {
                operation.name("createAjpConnector");
                operation.description("Create a new AjpConnector");
                operation.impact("ACTION");
                operation.returnType("java.lang.String");
                operation.parameter(parameter -> {
                    parameter.name("parent");
                    parameter.description("MBean Name of the associated parent component");
                    parameter.type("java.lang.String");
                });
                operation.parameter(parameter -> {
                    parameter.name("address");
                    parameter.description("The IP address on which to bind");
                    parameter.type("java.lang.String");
                });
                operation.parameter(parameter -> {
                    parameter.name("port");
                    parameter.description("TCP port number to listen on");
                    parameter.type("int");
                });
            });
            managedBean.operation(operation -> {
                operation.name("createDataSourceRealm");
                operation.description("Create a new DataSource Realm");
                operation.impact("ACTION");
                operation.returnType("java.lang.String");
                operation.parameter(parameter -> {
                    parameter.name("parent");
                    parameter.description("MBean Name of the associated parent component");
                    parameter.type("java.lang.String");
                });
                operation.parameter(parameter -> {
                    parameter.name("dataSourceName");
                    parameter.description("The JNDI named JDBC DataSource");
                    parameter.type("java.lang.String");
                });
                operation.parameter(parameter -> {
                    parameter.name("roleNameCol");
                    parameter.description("The column in the user role table that names a role");
                    parameter.type("java.lang.String");
                });
                operation.parameter(parameter -> {
                    parameter.name("userCredCol");
                    parameter.description("The column in the user table that holds the user's credentials");
                    parameter.type("java.lang.String");
                });
                operation.parameter(parameter -> {
                    parameter.name("userNameCol");
                    parameter.description("The column in the user table that holds the user's username");
                    parameter.type("java.lang.String");
                });
                operation.parameter(parameter -> {
                    parameter.name("userRoleTable");
                    parameter.description("The table that holds the relation between user's and roles");
                    parameter.type("java.lang.String");
                });
                operation.parameter(parameter -> {
                    parameter.name("userTable");
                    parameter.description("The table that holds user data");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("createHttpConnector");
                operation.description("Create a new HttpConnector");
                operation.impact("ACTION");
                operation.returnType("java.lang.String");
                operation.parameter(parameter -> {
                    parameter.name("parent");
                    parameter.description("MBean Name of the associated parent component");
                    parameter.type("java.lang.String");
                });
                operation.parameter(parameter -> {
                    parameter.name("address");
                    parameter.description("The IP address on which to bind");
                    parameter.type("java.lang.String");
                });
                operation.parameter(parameter -> {
                    parameter.name("port");
                    parameter.description("TCP port number to listen on");
                    parameter.type("int");
                });
            });
            managedBean.operation(operation -> {
                operation.name("createHttpsConnector");
                operation.description("Create a new HttpsConnector");
                operation.impact("ACTION");
                operation.returnType("java.lang.String");
                operation.parameter(parameter -> {
                    parameter.name("parent");
                    parameter.description("MBean Name of the associated parent component");
                    parameter.type("java.lang.String");
                });
                operation.parameter(parameter -> {
                    parameter.name("address");
                    parameter.description("The IP address on which to bind");
                    parameter.type("java.lang.String");
                });
                operation.parameter(parameter -> {
                    parameter.name("port");
                    parameter.description("TCP port number to listen on");
                    parameter.type("int");
                });
            });
            managedBean.operation(operation -> {
                operation.name("createJDBCRealm");
                operation.description("Create a new JDBC Realm");
                operation.impact("ACTION");
                operation.returnType("java.lang.String");
                operation.parameter(parameter -> {
                    parameter.name("parent");
                    parameter.description("MBean Name of the associated parent component");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("createJNDIRealm");
                operation.description("Create a new JNDI Realm");
                operation.impact("ACTION");
                operation.returnType("java.lang.String");
                operation.parameter(parameter -> {
                    parameter.name("parent");
                    parameter.description("MBean Name of the associated parent component");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("createMemoryRealm");
                operation.description("Create a new Memory Realm");
                operation.impact("ACTION");
                operation.returnType("java.lang.String");
                operation.parameter(parameter -> {
                    parameter.name("parent");
                    parameter.description("MBean Name of the associated parent component");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("createUserDatabaseRealm");
                operation.description("Create a new UserDatabaseRealm");
                operation.impact("ACTION");
                operation.returnType("java.lang.String");
                operation.parameter(parameter -> {
                    parameter.name("parent");
                    parameter.description("MBean Name of the associated parent component");
                    parameter.type("java.lang.String");
                });
                operation.parameter(parameter -> {
                    parameter.name("resourceName");
                    parameter.description("Global JNDI resource name of the associated");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("createStandardContext");
                operation.description("Create a new StandardContext");
                operation.impact("ACTION");
                operation.returnType("java.lang.String");
                operation.parameter(parameter -> {
                    parameter.name("parent");
                    parameter.description("MBean Name of the associated parent component");
                    parameter.type("java.lang.String");
                });
                operation.parameter(parameter -> {
                    parameter.name("path");
                    parameter.description("The context path for this Context");
                    parameter.type("java.lang.String");
                });
                operation.parameter(parameter -> {
                    parameter.name("docBase");
                    parameter.description("Document base directory (or WAR) for this Context");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("createStandardServiceEngine");
                operation.description("Create a new StandardService and StandardEngine");
                operation.impact("ACTION");
                operation.returnType("java.lang.String");
                operation.parameter(parameter -> {
                    parameter.name("domain");
                    parameter.description("Domain used for MBeans associated with the new Service");
                    parameter.type("java.lang.String");
                });
                operation.parameter(parameter -> {
                    parameter.name("defaultHost");
                    parameter.description("Default host name for the new Engine");
                    parameter.type("java.lang.String");
                });
                operation.parameter(parameter -> {
                    parameter.name("baseDir");
                    parameter.description("Base directory value for the new Engine");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("createStandardHost");
                operation.description("Create a new StandardHost");
                operation.impact("ACTION");
                operation.returnType("java.lang.String");
                operation.parameter(parameter -> {
                    parameter.name("parent");
                    parameter.description("MBean Name of the associated parent component");
                    parameter.type("java.lang.String");
                });
                operation.parameter(parameter -> {
                    parameter.name("name");
                    parameter.description("Unique name of this Host");
                    parameter.type("java.lang.String");
                });
                operation.parameter(parameter -> {
                    parameter.name("appBase");
                    parameter.description("set host deployment directory");
                    parameter.type("java.lang.String");
                });
                operation.parameter(parameter -> {
                    parameter.name("autoDeploy");
                    parameter.description("The auto deploy flag for this Host");
                    parameter.type("boolean");
                });
                operation.parameter(parameter -> {
                    parameter.name("deployOnStartup");
                    parameter.description("The deploy on startup flag for this Host");
                    parameter.type("boolean");
                });
                operation.parameter(parameter -> {
                    parameter.name("deployXML");
                    parameter.description("deploy Context XML config files property");
                    parameter.type("boolean");
                });
                operation.parameter(parameter -> {
                    parameter.name("unpackWARs");
                    parameter.description("Unpack WARs property");
                    parameter.type("boolean");
                });
            });
            managedBean.operation(operation -> {
                operation.name("createStandardManager");
                operation.description("Create a new StandardManager");
                operation.impact("ACTION");
                operation.returnType("java.lang.String");
                operation.parameter(parameter -> {
                    parameter.name("parent");
                    parameter.description("MBean Name of the associated parent component");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("createUserDatabaseRealm");
                operation.description("Create a new UserDatabase Realm");
                operation.impact("ACTION");
                operation.returnType("java.lang.String");
                operation.parameter(parameter -> {
                    parameter.name("parent");
                    parameter.description("MBean Name of the associated parent component");
                    parameter.type("java.lang.String");
                });
                operation.parameter(parameter -> {
                    parameter.name("resourceName");
                    parameter.description("Global JNDI resource name of our UserDatabase instance");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("createValve");
                operation.description("Create a new Valve for the given Container");
                operation.impact("ACTION");
                operation.returnType("java.lang.String");
                operation.parameter(parameter -> {
                    parameter.name("className");
                    parameter.description("Fully qualified class name of the Valve to create");
                    parameter.type("java.lang.String");
                });
                operation.parameter(parameter -> {
                    parameter.name("parent");
                    parameter.description("MBean Name of the associated parent component");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("createWebappLoader");
                operation.description("Create a new Web Application Loader");
                operation.impact("ACTION");
                operation.returnType("java.lang.String");
                operation.parameter(parameter -> {
                    parameter.name("parent");
                    parameter.description("MBean Name of the associated parent component");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("removeConnector");
                operation.description("Remove an existing Connector");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("name");
                    parameter.description("MBean Name of the component to be removed");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("removeContext");
                operation.description("Remove an existing Context");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("name");
                    parameter.description("MBean Name of the component to be removed");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("removeHost");
                operation.description("Remove an existing Host");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("name");
                    parameter.description("MBean Name of the component to be removed");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("removeLoader");
                operation.description("Remove an existing Loader");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("name");
                    parameter.description("MBean Name of the component to be removed");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("removeManager");
                operation.description("Remove an existing Manager");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("name");
                    parameter.description("MBean Name of the component to be removed");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("removeRealm");
                operation.description("Remove an existing Realm");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("name");
                    parameter.description("MBean Name of the component to be removed");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("removeService");
                operation.description("Remove an existing Service");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("name");
                    parameter.description("MBean Name of the component to be removed");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("removeValve");
                operation.description("Remove an existing Valve");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("name");
                    parameter.description("MBean Name of the component to be removed");
                    parameter.type("java.lang.String");
                });
            });
        });
    }
}
