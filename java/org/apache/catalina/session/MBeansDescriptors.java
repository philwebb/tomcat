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
package org.apache.catalina.session;

import org.apache.tomcat.util.modeler.ManagedBeanRegistrar;
import org.apache.tomcat.util.modeler.ManagedBeanRegistry;

public class MBeansDescriptors implements ManagedBeanRegistrar {

    @Override
    public void registerManagedBeans(ManagedBeanRegistry registry) {
        registry.add(managedBean -> {
            managedBean.name("StandardManager");
            managedBean.description("Standard implementation of the Manager interface");
            managedBean.domain("Catalina");
            managedBean.group("Manager");
            managedBean.type("org.apache.catalina.session.StandardManager");
            managedBean.attribute(attribute -> {
                attribute.name("activeSessions");
                attribute.description("Number of active sessions at this moment");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("className");
                attribute.description("Fully qualified class name of the managed object");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("duplicates");
                attribute.description("Number of duplicated session ids generated");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("expiredSessions");
                attribute.description("Number of sessions that expired ( doesn't include explicit invalidations )");
                attribute.type("long");
            });
            managedBean.attribute(attribute -> {
                attribute.name("jvmRoute");
                attribute.description("Retrieve the JvmRoute for the enclosing Engine");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("maxActive");
                attribute.description("Maximum number of active sessions so far");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("maxActiveSessions");
                attribute.description("The maximum number of active Sessions allowed, or -1 for no limit");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("name");
                attribute.description("The descriptive name of this Manager implementation (for logging)");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("pathname");
                attribute.description("Path name of the disk file in which active sessions");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("processExpiresFrequency");
                attribute.description("The frequency of the manager checks (expiration and passivation)");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("processingTime");
                attribute.description("Time spent doing housekeeping and expiration");
                attribute.type("long");
            });
            managedBean.attribute(attribute -> {
                attribute.name("secureRandomAlgorithm");
                attribute.description("The secure random number generator algorithm name");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("secureRandomClass");
                attribute.description("The secure random number generator class name");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("secureRandomProvider");
                attribute.description("The secure random number generator provider name");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("sessionAverageAliveTime");
                attribute.description("Average time an expired session had been alive");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("sessionCreateRate");
                attribute.description("Session creation rate in sessions per minute");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("sessionCounter");
                attribute.description("Total number of sessions created by this manager");
                attribute.type("long");
            });
            managedBean.attribute(attribute -> {
                attribute.name("sessionExpireRate");
                attribute.description("Session expiration rate in sessions per minute");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("sessionMaxAliveTime");
                attribute.description("Longest time an expired session had been alive");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("stateName");
                attribute.description("The name of the LifecycleState that this component is currently in");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("rejectedSessions");
                attribute.description("Number of sessions we rejected due to maxActive being reached");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("sessionAttributeNameFilter");
                attribute.description("The string pattern used for including session attributes in distribution. Null means all attributes are included.");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("sessionAttributeValueClassNameFilter");
                attribute.description("The regular expression used to filter session attributes based on the implementation class of the value. The regular expression is anchored and must match the fully qualified class name.");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("warnOnSessionAttributeFilterFailure");
                attribute.description("Should a WARN level log message be generated if a session attribute fails to match sessionAttributeNameFilter or sessionAttributeClassNameFilter?");
                attribute.type("boolean");
            });
            managedBean.operation(operation -> {
                operation.name("backgroundProcess");
                operation.description("Invalidate all sessions that have expired.");
                operation.impact("ACTION");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("expireSession");
                operation.description("Expire a session");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("sessionId");
                    parameter.description("Id of the session");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("getCreationTime");
                operation.description("Get the creation time");
                operation.impact("ACTION");
                operation.returnType("java.lang.String");
                operation.parameter(parameter -> {
                    parameter.name("sessionId");
                    parameter.description("Id of the session");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("getCreationTimestamp");
                operation.description("Get the creation timestamp");
                operation.impact("ACTION");
                operation.returnType("long");
                operation.parameter(parameter -> {
                    parameter.name("sessionId");
                    parameter.description("Id of the session");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("getLastAccessedTime");
                operation.description("Get the last access time");
                operation.impact("ACTION");
                operation.returnType("java.lang.String");
                operation.parameter(parameter -> {
                    parameter.name("sessionId");
                    parameter.description("Id of the session");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("getLastAccessedTimestamp");
                operation.description("Get the last access timestamp");
                operation.impact("ACTION");
                operation.returnType("long");
                operation.parameter(parameter -> {
                    parameter.name("sessionId");
                    parameter.description("Id of the session");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("getSessionAttribute");
                operation.description("Return a session attribute");
                operation.impact("ACTION");
                operation.returnType("java.lang.String");
                operation.parameter(parameter -> {
                    parameter.name("sessionId");
                    parameter.description("Id of the session");
                    parameter.type("java.lang.String");
                });
                operation.parameter(parameter -> {
                    parameter.name("key");
                    parameter.description("key of the attribute");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("listSessionIds");
                operation.description("Return the list of active session ids");
                operation.impact("ACTION");
                operation.returnType("java.lang.String");
            });
        });
        registry.add(managedBean -> {
            managedBean.name("PersistentManager");
            managedBean.description("Persistent Manager");
            managedBean.domain("Catalina");
            managedBean.group("Manager");
            managedBean.type("org.apache.catalina.session.PersistentManager");
            managedBean.attribute(attribute -> {
                attribute.name("activeSessions");
                attribute.description("Number of active sessions at this moment");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("className");
                attribute.description("Fully qualified class name of the managed object");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("duplicates");
                attribute.description("Number of duplicated session ids generated");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("expiredSessions");
                attribute.description("Number of sessions that expired ( doesn't include explicit invalidations )");
                attribute.type("long");
            });
            managedBean.attribute(attribute -> {
                attribute.name("jvmRoute");
                attribute.description("Retrieve the JvmRoute for the enclosing Engine");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("maxActive");
                attribute.description("Maximum number of active sessions so far");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("maxActiveSessions");
                attribute.description("The maximum number of active Sessions allowed, or -1 for no limit");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("maxIdleBackup");
                attribute.description("Indicates how many seconds old a session can get, after its last use in a request, before it should be backed up to the store. -1 means sessions are not backed up.");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("maxIdleSwap");
                attribute.description("Indicates how many seconds old a session can get, after its last use in a request, before it should be backed up to the store. -1 means sessions are not backed up.");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("minIdleSwap");
                attribute.description(" The minimum time in seconds that a session must be idle before it can be swapped out of memory, or -1 if it can be swapped out at any time.");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("name");
                attribute.description("The descriptive name of this Manager implementation (for logging)");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("processExpiresFrequency");
                attribute.description("The frequency of the manager checks (expiration and passivation)");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("processingTime");
                attribute.description("Time spent doing housekeeping and expiration");
                attribute.type("long");
            });
            managedBean.attribute(attribute -> {
                attribute.name("saveOnRestart");
                attribute.description("Indicates whether sessions are saved when the Manager is shut down properly. This requires the unload() method to be called.");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("secureRandomClass");
                attribute.description("The random number generator class name");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("sessionAverageAliveTime");
                attribute.description("Average time an expired session had been alive");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("sessionCreateRate");
                attribute.description("Session creation rate in sessions per minute");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("sessionCounter");
                attribute.description("Total number of sessions created by this manager");
                attribute.type("long");
            });
            managedBean.attribute(attribute -> {
                attribute.name("sessionExpireRate");
                attribute.description("Session expiration rate in sessions per minute");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("sessionMaxAliveTime");
                attribute.description("Longest time an expired session had been alive");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("stateName");
                attribute.description("The name of the LifecycleState that this component is currently in");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("rejectedSessions");
                attribute.description("Number of sessions we rejected due to maxActive being reached");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("sessionAttributeNameFilter");
                attribute.description("The string pattern used for including session attributes in distribution. Null means all attributes are included.");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("sessionAttributeValueClassNameFilter");
                attribute.description("The regular expression used to filter session attributes based on the implementation class of the value. The regular expression is anchored and must match the fully qualified class name.");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("warnOnSessionAttributeFilterFailure");
                attribute.description("Should a WARN level log message be generated if a session attribute fails to match sessionAttributeNameFilter or sessionAttributeClassNameFilter?");
                attribute.type("boolean");
            });
            managedBean.operation(operation -> {
                operation.name("backgroundProcess");
                operation.description("Invalidate all sessions that have expired.");
                operation.impact("ACTION");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("expireSession");
                operation.description("Expire a session");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("sessionId");
                    parameter.description("Id of the session");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("getCreationTime");
                operation.description("Get the creation time");
                operation.impact("ACTION");
                operation.returnType("java.lang.String");
                operation.parameter(parameter -> {
                    parameter.name("sessionId");
                    parameter.description("Id of the session");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("getCreationTimestamp");
                operation.description("Get the creation timestamp");
                operation.impact("ACTION");
                operation.returnType("long");
                operation.parameter(parameter -> {
                    parameter.name("sessionId");
                    parameter.description("Id of the session");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("getLastAccessedTime");
                operation.description("Get the last access time");
                operation.impact("ACTION");
                operation.returnType("java.lang.String");
                operation.parameter(parameter -> {
                    parameter.name("sessionId");
                    parameter.description("Id of the session");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("getLastAccessedTimestamp");
                operation.description("Get the last access timestamp");
                operation.impact("ACTION");
                operation.returnType("long");
                operation.parameter(parameter -> {
                    parameter.name("sessionId");
                    parameter.description("Id of the session");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("getSessionAttribute");
                operation.description("Return a session attribute");
                operation.impact("ACTION");
                operation.returnType("java.lang.String");
                operation.parameter(parameter -> {
                    parameter.name("sessionId");
                    parameter.description("Id of the session");
                    parameter.type("java.lang.String");
                });
                operation.parameter(parameter -> {
                    parameter.name("key");
                    parameter.description("key of the attribute");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("listSessionIds");
                operation.description("Return the list of active session ids");
                operation.impact("ACTION");
                operation.returnType("java.lang.String");
            });
            managedBean.operation(operation -> {
                operation.name("isLoaded");
                operation.description("If the session id is loaded in memory?");
                operation.impact("ACTION");
                operation.returnType("boolean");
                operation.parameter(parameter -> {
                    parameter.name("sessionId");
                    parameter.description("Id of the session");
                    parameter.type("java.lang.String");
                });
            });
        });
    }
}
