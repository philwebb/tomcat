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
package org.apache.catalina.realm;

import org.apache.tomcat.util.modeler.ManagedBeanRegistrar;
import org.apache.tomcat.util.modeler.ManagedBeanRegistry;

public class MBeansDescriptors implements ManagedBeanRegistrar {

    @Override
    public void registerManagedBeans(ManagedBeanRegistry registry) {
        registry.add(managedBean -> {
            managedBean.name("DataSourceRealm");
            managedBean.className("org.apache.catalina.mbeans.ClassNameMBean");
            managedBean.description("Implementation of Realm that works with any JNDI configured DataSource");
            managedBean.domain("Catalina");
            managedBean.group("Realm");
            managedBean.type("org.apache.catalina.realm.DataSourceRealm");
            managedBean.attribute(attribute -> {
                attribute.name("allRolesMode");
                attribute.description("The all roles mode.");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("className");
                attribute.description("Fully qualified class name of the managed object");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("dataSourceName");
                attribute.description("The JNDI named JDBC DataSource for your database");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("localDataSource");
                attribute.description("Configures if the DataSource is local to the webapp");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("realmPath");
                attribute.description("The realm path");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("roleNameCol");
                attribute.description("The column in the user role table that names a role");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("stateName");
                attribute.description("The name of the LifecycleState that this component is currently in");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("userCredCol");
                attribute.description("The column in the user table that holds the user's credentials");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("userNameCol");
                attribute.description("The column in the user table that holds the user's username");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("userRoleTable");
                attribute.description("The table that holds the relation between user's and roles");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("userTable");
                attribute.description("The table that holds user data");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("validate");
                attribute.description("The 'validate certificate chains' flag.");
                attribute.type("boolean");
            });
            managedBean.operation(operation -> {
                operation.name("start");
                operation.description("Start");
                operation.impact("ACTION");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("stop");
                operation.description("Stop");
                operation.impact("ACTION");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("init");
                operation.description("Init");
                operation.impact("ACTION");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("destroy");
                operation.description("Destroy");
                operation.impact("ACTION");
                operation.returnType("void");
            });
        });
        registry.add(managedBean -> {
            managedBean.name("JAASRealm");
            managedBean.description("Implementation of Realm that authenticates users via the Java Authentication and Authorization Service (JAAS)");
            managedBean.domain("Catalina");
            managedBean.group("Realm");
            managedBean.type("org.apache.catalina.realm.JAASRealm");
            managedBean.attribute(attribute -> {
                attribute.name("allRolesMode");
                attribute.description("The all roles mode.");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("appName");
                attribute.description("The application name passed to the JAAS LoginContext, which uses it to select the set of relevant LoginModules");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("className");
                attribute.description("Fully qualified class name of the managed object");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("roleClassNames");
                attribute.description("Comma-delimited list of javax.security.Principal classes that represent security roles");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("realmPath");
                attribute.description("The realm path");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("stateName");
                attribute.description("The name of the LifecycleState that this component is currently in");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("userClassNames");
                attribute.description("Comma-delimited list of javax.security.Principal classes that represent individual users");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("useContextClassLoader");
                attribute.description("Sets whether to use the context or default ClassLoader.");
                attribute.type("boolean");
                attribute.is(true);
            });
            managedBean.attribute(attribute -> {
                attribute.name("validate");
                attribute.description("Should we validate client certificate chains when they are presented?");
                attribute.type("boolean");
            });
            managedBean.operation(operation -> {
                operation.name("start");
                operation.description("Start");
                operation.impact("ACTION");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("stop");
                operation.description("Stop");
                operation.impact("ACTION");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("init");
                operation.description("Init");
                operation.impact("ACTION");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("destroy");
                operation.description("Destroy");
                operation.impact("ACTION");
                operation.returnType("void");
            });
        });
        registry.add(managedBean -> {
            managedBean.name("JDBCRealm");
            managedBean.description("Implementation of Realm that works with any JDBC supported database");
            managedBean.domain("Catalina");
            managedBean.group("Realm");
            managedBean.type("org.apache.catalina.realm.JDBCRealm");
            managedBean.attribute(attribute -> {
                attribute.name("allRolesMode");
                attribute.description("The all roles mode.");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("className");
                attribute.description("Fully qualified class name of the managed object");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("connectionName");
                attribute.description("The connection username to use when trying to connect to the database");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("connectionPassword");
                attribute.description("The connection password to use when trying to connect to the database");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("connectionURL");
                attribute.description("The connection URL to use when trying to connect to the database");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("driverName");
                attribute.description("The JDBC driver to use");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("roleNameCol");
                attribute.description("The column in the user role table that names a role");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("realmPath");
                attribute.description("The realm path");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("stateName");
                attribute.description("The name of the LifecycleState that this component is currently in");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("userCredCol");
                attribute.description("The column in the user table that holds the user's credentials");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("userNameCol");
                attribute.description("The column in the user table that holds the user's username");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("userRoleTable");
                attribute.description("The table that holds the relation between user's and roles");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("userTable");
                attribute.description("The table that holds user data");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("validate");
                attribute.description("The 'validate certificate chains' flag.");
                attribute.type("boolean");
            });
            managedBean.operation(operation -> {
                operation.name("start");
                operation.description("Start");
                operation.impact("ACTION");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("stop");
                operation.description("Stop");
                operation.impact("ACTION");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("init");
                operation.description("Init");
                operation.impact("ACTION");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("destroy");
                operation.description("Destroy");
                operation.impact("ACTION");
                operation.returnType("void");
            });
        });
        registry.add(managedBean -> {
            managedBean.name("JNDIRealm");
            managedBean.description("Implementation of Realm that works with a directory server accessed via the Java Naming and Directory Interface (JNDI) APIs");
            managedBean.domain("Catalina");
            managedBean.group("Realm");
            managedBean.type("org.apache.catalina.realm.JNDIRealm");
            managedBean.attribute(attribute -> {
                attribute.name("adCompat");
                attribute.description(" The current settings for handling PartialResultExceptions");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("allRolesMode");
                attribute.description("The all roles mode.");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("alternateURL");
                attribute.description("The Alternate URL");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("authentication");
                attribute.description("The type of authentication to use");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("className");
                attribute.description("Fully qualified class name of the managed object");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("commonRole");
                attribute.description("The common role");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("connectionName");
                attribute.description("The connection username for the server we will contact");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("connectionPassword");
                attribute.description("The connection password for the server we will contact");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("connectionTimeout");
                attribute.description("The connection timeout");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("connectionURL");
                attribute.description("The connection URL for the server we will contact");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("contextFactory");
                attribute.description("The JNDI context factory for this Realm");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("protocol");
                attribute.description("The protocol to be used");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("realmPath");
                attribute.description("The realm path");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("referrals");
                attribute.description("The current setting for handling JNDI referrals.");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("roleBase");
                attribute.description("The base element for role searches");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("roleName");
                attribute.description("The name of the attribute containing roles held elsewhere");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("roleNested");
                attribute.description("The 'The nested group search flag' flag");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("roleSearch");
                attribute.description("The message format used to select roles for a user");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("roleSearchAsUser");
                attribute.description("Should the search for user roles be performed as the authenticating user?");
                attribute.type("boolean");
                attribute.is(true);
            });
            managedBean.attribute(attribute -> {
                attribute.name("roleSubtree");
                attribute.description("Should we search the entire subtree for matching memberships?");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("stateName");
                attribute.description("The name of the LifecycleState that this component is currently in");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("userBase");
                attribute.description("The base element for user searches");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("userPassword");
                attribute.description("The attribute name used to retrieve the user password");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("userPattern");
                attribute.description("The message format used to select a user");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("userRoleName");
                attribute.description("The name of the attribute in the user's entry containing roles for that user");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("userSearch");
                attribute.description("The message format used to search for a user");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("userSearchAsUser");
                attribute.description("Should the search for the user's DN be performed as the authenticating user?");
                attribute.type("boolean");
                attribute.is(true);
            });
            managedBean.attribute(attribute -> {
                attribute.name("userSubtree");
                attribute.description("Should we search the entire subtree for matching users?");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("validate");
                attribute.description("The 'validate certificate chains' flag.");
                attribute.type("boolean");
            });
            managedBean.operation(operation -> {
                operation.name("start");
                operation.description("Start");
                operation.impact("ACTION");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("stop");
                operation.description("Stop");
                operation.impact("ACTION");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("init");
                operation.description("Init");
                operation.impact("ACTION");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("destroy");
                operation.description("Destroy");
                operation.impact("ACTION");
                operation.returnType("void");
            });
        });
        registry.add(managedBean -> {
            managedBean.name("MemoryRealm");
            managedBean.description("Simple implementation of Realm that reads an XML file to configure the valid users, passwords, and roles");
            managedBean.domain("Catalina");
            managedBean.group("Realm");
            managedBean.type("org.apache.catalina.realm.MemoryRealm");
            managedBean.attribute(attribute -> {
                attribute.name("allRolesMode");
                attribute.description("The all roles mode.");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("className");
                attribute.description("Fully qualified class name of the managed object");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("pathname");
                attribute.description("The pathname of the XML file containing our database information");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("realmPath");
                attribute.description("The realm path");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("stateName");
                attribute.description("The name of the LifecycleState that this component is currently in");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("validate");
                attribute.description("The 'validate certificate chains' flag.");
                attribute.type("boolean");
            });
            managedBean.operation(operation -> {
                operation.name("start");
                operation.description("Start");
                operation.impact("ACTION");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("stop");
                operation.description("Stop");
                operation.impact("ACTION");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("init");
                operation.description("Init");
                operation.impact("ACTION");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("destroy");
                operation.description("Destroy");
                operation.impact("ACTION");
                operation.returnType("void");
            });
        });
        registry.add(managedBean -> {
            managedBean.name("UserDatabaseRealm");
            managedBean.description("Realm connected to a UserDatabase as a global JNDI resource");
            managedBean.domain("Catalina");
            managedBean.group("Realm");
            managedBean.type("org.apache.catalina.realm.UserDatabaseRealm");
            managedBean.attribute(attribute -> {
                attribute.name("allRolesMode");
                attribute.description("The all roles mode.");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("className");
                attribute.description("Fully qualified class name of the managed object");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("resourceName");
                attribute.description("The global JNDI name of the UserDatabase resource to use");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("realmPath");
                attribute.description("The realm path");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("stateName");
                attribute.description("The name of the LifecycleState that this component is currently in");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("validate");
                attribute.description("The 'validate certificate chains' flag.");
                attribute.type("boolean");
            });
            managedBean.operation(operation -> {
                operation.name("start");
                operation.description("Start");
                operation.impact("ACTION");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("stop");
                operation.description("Stop");
                operation.impact("ACTION");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("init");
                operation.description("Init");
                operation.impact("ACTION");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("destroy");
                operation.description("Destroy");
                operation.impact("ACTION");
                operation.returnType("void");
            });
        });
        registry.add(managedBean -> {
            managedBean.name("CombinedRealm");
            managedBean.description("Realm implementation that can be used to chain multiple realms");
            managedBean.domain("Catalina");
            managedBean.group("Realm");
            managedBean.type("org.apache.catalina.realm.CombinedRealm");
            managedBean.attribute(attribute -> {
                attribute.name("allRolesMode");
                attribute.description("The all roles mode.");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("className");
                attribute.description("Fully qualified class name of the managed object");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("realms");
                attribute.description("The set of realms that the combined realm is wrapping");
                attribute.type("[Ljavax.management.ObjectName;");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("realmPath");
                attribute.description("The realm path");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("stateName");
                attribute.description("The name of the LifecycleState that this component is currently in");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("validate");
                attribute.description("The 'validate certificate chains' flag.");
                attribute.type("boolean");
            });
            managedBean.operation(operation -> {
                operation.name("addRealm");
                operation.description("Add a new Realm to the set of Realms wrapped by this realm");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("theRealm");
                    parameter.description("New Realm to add");
                    parameter.type("org.apache.catalina.Realm");
                });
            });
            managedBean.operation(operation -> {
                operation.name("start");
                operation.description("Start");
                operation.impact("ACTION");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("stop");
                operation.description("Stop");
                operation.impact("ACTION");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("init");
                operation.description("Init");
                operation.impact("ACTION");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("destroy");
                operation.description("Destroy");
                operation.impact("ACTION");
                operation.returnType("void");
            });
        });
        registry.add(managedBean -> {
            managedBean.name("LockOutRealm");
            managedBean.description("Realm implementation that can be used to wrap existing realms to provide a user lock-out capability");
            managedBean.domain("Catalina");
            managedBean.group("Realm");
            managedBean.type("org.apache.catalina.realm.LockOutRealm");
            managedBean.attribute(attribute -> {
                attribute.name("allRolesMode");
                attribute.description("The all roles mode.");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("cacheSize");
                attribute.description("Number of users that have failed authentication to keep in cache. Over time the cache will grow to this size and may not shrink. Defaults to 1000.");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("cacheRemovalWarningTime");
                attribute.description("If a failed user is removed from the cache because the cache is too big before it has been in the cache for at least this period of time (in seconds) a warning message will be logged. Defaults to 3600 (1 hour).");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("className");
                attribute.description("Fully qualified class name of the managed object");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("failureCount");
                attribute.description("The number of times in a row a user has to fail authentication to be locked out. Defaults to 5.");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("lockOutTime");
                attribute.description("The time (in seconds) a user is locked out for after too many authentication failures. Defaults to 300 (5 minutes).");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("realms");
                attribute.description("The set of realms that the lockout realm is wrapping");
                attribute.type("[Ljavax.management.ObjectName;");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("realmPath");
                attribute.description("The realm path");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("validate");
                attribute.description("The 'validate certificate chains' flag.");
                attribute.type("boolean");
            });
            managedBean.operation(operation -> {
                operation.name("addRealm");
                operation.description("Add a new Realm to the set of Realms wrapped by this realm");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("theRealm");
                    parameter.description("New Realm to add");
                    parameter.type("org.apache.catalina.Realm");
                });
            });
            managedBean.operation(operation -> {
                operation.name("isLocked");
                operation.description("Determine if the specified user is locked");
                operation.impact("ACTION");
                operation.returnType("boolean");
                operation.parameter(parameter -> {
                    parameter.name("username");
                    parameter.description("User to test for being locked");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("unlock");
                operation.description("Unlock the specified user");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("username");
                    parameter.description("User to unlock");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("start");
                operation.description("Start");
                operation.impact("ACTION");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("stop");
                operation.description("Stop");
                operation.impact("ACTION");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("init");
                operation.description("Init");
                operation.impact("ACTION");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("destroy");
                operation.description("Destroy");
                operation.impact("ACTION");
                operation.returnType("void");
            });
        });
    }
}
