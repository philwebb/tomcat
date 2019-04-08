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
package org.apache.catalina.users;

import org.apache.tomcat.util.modeler.ManagedBeanRegistrar;
import org.apache.tomcat.util.modeler.ManagedBeanRegistry;

public class MBeansDescriptors implements ManagedBeanRegistrar {

    @Override
    public void registerManagedBeans(ManagedBeanRegistry registry) {
        registry.add(managedBean -> {
            managedBean.name("MemoryUserDatabase");
            managedBean.className("org.apache.catalina.mbeans.MemoryUserDatabaseMBean");
            managedBean.description("In-memory user and group database");
            managedBean.domain("Users");
            managedBean.group("UserDatabase");
            managedBean.type("org.apache.catalina.users.MemoryUserDatabase");
            managedBean.attribute(attribute -> {
                attribute.name("groups");
                attribute.description("MBean Names of all defined groups");
                attribute.type("[Ljava.lang.String;");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("pathname");
                attribute.description("Relative or absolute pathname to database file");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("roles");
                attribute.description("MBean Names of all defined roles");
                attribute.type("[Ljava.lang.String;");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("users");
                attribute.description("MBean Names of all defined users");
                attribute.type("[Ljava.lang.String;");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("readonly");
                attribute.description("No persistent save of the user database");
                attribute.type("boolean");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("writeable");
                attribute.description("Check if user database is writeable");
                attribute.is(true);
                attribute.writeable(false);
            });
            managedBean.operation(operation -> {
                operation.name("createGroup");
                operation.description("Create new group and return MBean name");
                operation.impact("ACTION");
                operation.returnType("java.lang.String");
                operation.parameter(parameter -> {
                    parameter.name("groupname");
                    parameter.description("Group name of the new group");
                    parameter.type("java.lang.String");
                });
                operation.parameter(parameter -> {
                    parameter.name("description");
                    parameter.description("Description of the new group");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("createRole");
                operation.description("Create new role and return MBean name");
                operation.impact("ACTION");
                operation.returnType("java.lang.String");
                operation.parameter(parameter -> {
                    parameter.name("rolename");
                    parameter.description("Role name of the new role");
                    parameter.type("java.lang.String");
                });
                operation.parameter(parameter -> {
                    parameter.name("description");
                    parameter.description("Description of the new role");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("createUser");
                operation.description("Create new user and return MBean name");
                operation.impact("ACTION");
                operation.returnType("java.lang.String");
                operation.parameter(parameter -> {
                    parameter.name("username");
                    parameter.description("User name of the new user");
                    parameter.type("java.lang.String");
                });
                operation.parameter(parameter -> {
                    parameter.name("password");
                    parameter.description("Password of the new user");
                    parameter.type("java.lang.String");
                });
                operation.parameter(parameter -> {
                    parameter.name("fullName");
                    parameter.description("Full name of the new user");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("findGroup");
                operation.description("Return MBean Name of the specified group (if any)");
                operation.impact("INFO");
                operation.returnType("java.lang.String");
                operation.parameter(parameter -> {
                    parameter.name("groupname");
                    parameter.description("Group name of the requested group");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("findRole");
                operation.description("Return MBean Name of the specified role (if any)");
                operation.impact("INFO");
                operation.returnType("java.lang.String");
                operation.parameter(parameter -> {
                    parameter.name("rolename");
                    parameter.description("Role name of the requested role");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("findUser");
                operation.description("Return MBean Name of the specified user (if any)");
                operation.impact("INFO");
                operation.returnType("java.lang.String");
                operation.parameter(parameter -> {
                    parameter.name("username");
                    parameter.description("User name of the requested user");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("removeGroup");
                operation.description("Remove existing group (and all user memberships)");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("groupname");
                    parameter.description("Group name of the group to remove");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("removeRole");
                operation.description("Remove existing role");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("rolename");
                    parameter.description("Role name of the role to remove");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("removeUser");
                operation.description("Remove existing user (and all group memberships)");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("username");
                    parameter.description("User name of the user to remove");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("save");
                operation.description("Save current users and groups to persistent storage");
                operation.impact("ACTION");
                operation.returnType("void");
            });
        });
    }
}
