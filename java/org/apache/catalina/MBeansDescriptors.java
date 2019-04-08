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
package org.apache.catalina;

import org.apache.tomcat.util.modeler.ManagedBeanRegistrar;
import org.apache.tomcat.util.modeler.ManagedBeanRegistry;

public class MBeansDescriptors implements ManagedBeanRegistrar {

    @Override
    public void registerManagedBeans(ManagedBeanRegistry registry) {
        registry.add(managedBean -> {
            managedBean.name("Group");
            managedBean.className("org.apache.catalina.mbeans.GroupMBean");
            managedBean.description("Group from a user database");
            managedBean.domain("Users");
            managedBean.group("Group");
            managedBean.type("org.apache.catalina.Group");
            managedBean.attribute(attribute -> {
                attribute.name("description");
                attribute.description("Description of this group");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("groupname");
                attribute.description("Group name of this group");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("roles");
                attribute.description("MBean Names of roles for this group");
                attribute.type("[Ljava.lang.String;");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("users");
                attribute.description("MBean Names of user members of this group");
                attribute.type("[Ljava.lang.String;");
                attribute.writeable(false);
            });
            managedBean.operation(operation -> {
                operation.name("addRole");
                operation.description("Add a new authorized role for this group");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("role");
                    parameter.description("Role to be added");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("removeRole");
                operation.description("Remove an old authorized role for this group");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("role");
                    parameter.description("Role to be removed");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("removeRoles");
                operation.description("Remove all authorized roles for this group");
                operation.impact("ACTION");
                operation.returnType("void");
            });
        });
        registry.add(managedBean -> {
            managedBean.name("Role");
            managedBean.className("org.apache.catalina.mbeans.RoleMBean");
            managedBean.description("Security role from a user database");
            managedBean.domain("Users");
            managedBean.group("Role");
            managedBean.type("org.apache.catalina.Role");
            managedBean.attribute(attribute -> {
                attribute.name("description");
                attribute.description("Description of this role");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("rolename");
                attribute.description("Role name of this role");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
        });
        registry.add(managedBean -> {
            managedBean.name("User");
            managedBean.className("org.apache.catalina.mbeans.UserMBean");
            managedBean.description("User from a user database");
            managedBean.domain("Users");
            managedBean.group("User");
            managedBean.type("org.apache.catalina.User");
            managedBean.attribute(attribute -> {
                attribute.name("fullName");
                attribute.description("Full name of this user");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("groups");
                attribute.description("MBean Names of groups this user is a member of");
                attribute.type("[Ljava.lang.String;");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("password");
                attribute.description("Password of this user");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("roles");
                attribute.description("MBean Names of roles for this user");
                attribute.type("[Ljava.lang.String;");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("username");
                attribute.description("User name of this user");
                attribute.type("java.lang.String");
            });
            managedBean.operation(operation -> {
                operation.name("addGroup");
                operation.description("Add a new group membership for this user");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("groupname");
                    parameter.description("Group name of the new group");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("addRole");
                operation.description("Add a new authorized role for this user");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("role");
                    parameter.description("Role to be added");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("removeGroup");
                operation.description("Remove an old group membership for this user");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("groupname");
                    parameter.description("Group name of the old group");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("removeGroups");
                operation.description("Remove all group memberships for this user");
                operation.impact("ACTION");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("removeRole");
                operation.description("Remove an old authorized role for this user");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("role");
                    parameter.description("Role to be removed");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("removeRoles");
                operation.description("Remove all authorized roles for this user");
                operation.impact("ACTION");
                operation.returnType("void");
            });
        });
    }
}
