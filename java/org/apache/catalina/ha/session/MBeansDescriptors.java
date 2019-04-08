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
package org.apache.catalina.ha.session;

import org.apache.tomcat.util.modeler.ManagedBeanRegistrar;
import org.apache.tomcat.util.modeler.ManagedBeanRegistry;

public class MBeansDescriptors implements ManagedBeanRegistrar {

    @Override
    public void registerManagedBeans(ManagedBeanRegistry registry) {
        registry.add(managedBean -> {
            managedBean.name("JvmRouteBinderValve");
            managedBean.description("mod_jk jvmRoute jsessionid cookie backup correction");
            managedBean.domain("Catalina");
            managedBean.group("Valve");
            managedBean.type("org.apache.catalina.ha.session.JvmRouteBinderValve");
            managedBean.attribute(attribute -> {
                attribute.name("asyncSupported");
                attribute.description("Does this valve support async reporting? ");
                attribute.type("boolean");
                attribute.is(true);
            });
            managedBean.attribute(attribute -> {
                attribute.name("className");
                attribute.description("Fully qualified class name of the managed object");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("enabled");
                attribute.description("enable a jvm Route check");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("numberOfSessions");
                attribute.description("number of jvmRoute session corrections");
                attribute.type("long");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("sessionIdAttribute");
                attribute.description("Name of attribute with sessionid value before turnover a session");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("stateName");
                attribute.description("The name of the LifecycleState that this component is currently in");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.operation(operation -> {
                operation.name("start");
                operation.description("Stops the Cluster JvmRouteBinderValve");
                operation.impact("ACTION");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("stop");
                operation.description("Stops the Cluster JvmRouteBinderValve");
                operation.impact("ACTION");
                operation.returnType("void");
            });
        });
        registry.add(managedBean -> {
            managedBean.name("DeltaManager");
            managedBean.description("Cluster Manager implementation of the Manager interface");
            managedBean.domain("Catalina");
            managedBean.group("Manager");
            managedBean.type("org.apache.catalina.ha.session.DeltaManager");
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
                attribute.name("counterNoStateTransfered");
                attribute.description("Count the failed session transfers noStateTransfered");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("counterReceive_EVT_GET_ALL_SESSIONS");
                attribute.description("Count receive EVT_GET_ALL_SESSIONS messages");
                attribute.type("long");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("counterReceive_EVT_ALL_SESSION_DATA");
                attribute.description("Count receive EVT_ALL_SESSION_DATA messages");
                attribute.type("long");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("counterReceive_EVT_SESSION_CREATED");
                attribute.description("Count receive EVT_SESSION_CREATED messages");
                attribute.type("long");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("counterReceive_EVT_SESSION_DELTA");
                attribute.description("Count receive EVT_SESSION_DELTA messages");
                attribute.type("long");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("counterReceive_EVT_SESSION_ACCESSED");
                attribute.description("Count receive EVT_SESSION_ACCESSED messages");
                attribute.type("long");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("counterReceive_EVT_SESSION_EXPIRED");
                attribute.description("Count receive EVT_SESSION_EXPIRED messages");
                attribute.type("long");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("counterReceive_EVT_ALL_SESSION_TRANSFERCOMPLETE");
                attribute.description("Count receive EVT_ALL_SESSION_TRANSFERCOMPLETE messages");
                attribute.type("long");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("counterReceive_EVT_CHANGE_SESSION_ID");
                attribute.description("Count receive EVT_CHANGE_SESSION_ID messages");
                attribute.type("long");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("counterReceive_EVT_ALL_SESSION_NOCONTEXTMANAGER");
                attribute.description("Count receive EVT_ALL_SESSION_NOCONTEXTMANAGER messages");
                attribute.type("long");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("counterSend_EVT_GET_ALL_SESSIONS");
                attribute.description("Count send EVT_GET_ALL_SESSIONS messages");
                attribute.type("long");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("counterSend_EVT_ALL_SESSION_DATA");
                attribute.description("Count send EVT_ALL_SESSION_DATA messages");
                attribute.type("long");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("counterSend_EVT_SESSION_CREATED");
                attribute.description("Count send EVT_SESSION_CREATED messages");
                attribute.type("long");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("counterSend_EVT_SESSION_DELTA");
                attribute.description("Count send EVT_SESSION_DELTA messages");
                attribute.type("long");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("counterSend_EVT_SESSION_ACCESSED");
                attribute.description("Count send EVT_SESSION_ACCESSED messages");
                attribute.type("long");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("counterSend_EVT_SESSION_EXPIRED");
                attribute.description("Count send EVT_SESSION_EXPIRED messages");
                attribute.type("long");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("counterSend_EVT_ALL_SESSION_TRANSFERCOMPLETE");
                attribute.description("Count send EVT_ALL_SESSION_TRANSFERCOMPLETE messages");
                attribute.type("long");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("counterSend_EVT_CHANGE_SESSION_ID");
                attribute.description("Count send EVT_CHANGE_SESSION_ID messages");
                attribute.type("long");
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
                attribute.name("expireSessionsOnShutdown");
                attribute.description("expire all sessions cluster wide as one node goes down");
                attribute.type("boolean");
                attribute.is(true);
            });
            managedBean.attribute(attribute -> {
                attribute.name("invalidatedSessions");
                attribute.description("describe version");
                attribute.type("[Ljava.lang.String;");
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
                attribute.name("notifyListenersOnReplication");
                attribute.description("Send session attribute change events on backup nodes");
                attribute.type("boolean");
                attribute.is(true);
            });
            managedBean.attribute(attribute -> {
                attribute.name("notifySessionListenersOnReplication");
                attribute.description("Send session start/stop events on backup nodes");
                attribute.type("boolean");
                attribute.is(true);
            });
            managedBean.attribute(attribute -> {
                attribute.name("notifyContainerListenersOnReplication");
                attribute.description("Send container events on backup nodes");
                attribute.type("boolean");
                attribute.is(true);
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
                attribute.name("sendAllSessions");
                attribute.description("Send all sessions at one big block");
                attribute.type("boolean");
                attribute.is(true);
            });
            managedBean.attribute(attribute -> {
                attribute.name("sendAllSessionsSize");
                attribute.description("session block size when sendAllSessions=false (default=1000)");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("sendAllSessionsWaitTime");
                attribute.description("wait time between send session block (default 2 sec)");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("sessionAverageAliveTime");
                attribute.description("Average time an expired session had been alive");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("sessionCounter");
                attribute.description("Total number of sessions created by this manager");
                attribute.type("long");
            });
            managedBean.attribute(attribute -> {
                attribute.name("sessionMaxAliveTime");
                attribute.description("Longest time an expired session had been alive");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("sessionReplaceCounter");
                attribute.description("Total number of replaced sessions that load from external nodes");
                attribute.type("long");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("stateName");
                attribute.description("The name of the LifecycleState that this component is currently in");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("stateTransfered");
                attribute.description("Is session state transferred complete? ");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("stateTransferTimeout");
                attribute.description("state transfer timeout in sec");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("receivedQueueSize");
                attribute.description("length of receive queue size when session received from other node");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("rejectedSessions");
                attribute.description("Number of sessions we rejected due to maxActive being reached");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("noContextManagerReceived");
                attribute.description("Is no context manager message received? ");
                attribute.type("boolean");
                attribute.is(true);
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
                attribute.name("stateTimestampDrop");
                attribute.description("All session messages before state transfer message creation are dropped.");
                attribute.type("boolean");
                attribute.is(true);
            });
            managedBean.attribute(attribute -> {
                attribute.name("recordAllActions");
                attribute.description("Flag whether send all actions for session across Tomcat cluster nodes.");
                attribute.type("boolean");
                attribute.is(true);
            });
            managedBean.attribute(attribute -> {
                attribute.name("sessionAttributeNameFilter");
                attribute.description("The string pattern used for including session attributes in replication. Null means all attributes are included.");
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
                operation.name("expireSession");
                operation.description("Expired the given session");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("sessionId");
                    parameter.description("The session id for the session to be expired");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("expireAllLocalSessions");
                operation.description("expire all active local sessions and replicate the invalid sessions");
                operation.impact("ACTION");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("findSession");
                operation.description("Return the active Session, associated with this Manager, with the specified session id (if any)");
                operation.impact("ACTION");
                operation.returnType("org.apache.catalina.Session");
                operation.parameter(parameter -> {
                    parameter.name("id");
                    parameter.description("The session id for the session to be returned");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("findSessions");
                operation.description("Return the set of active Sessions associated with this Manager.");
                operation.impact("ACTION");
                operation.returnType("[Lorg.apache.catalina.Session;");
            });
            managedBean.operation(operation -> {
                operation.name("getAllClusterSessions");
                operation.description("send to oldest cluster member that this node need all cluster sessions (resync member)");
                operation.impact("ACTION");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("getCreationTime");
                operation.description("Return the creation time for this session");
                operation.impact("ACTION");
                operation.returnType("java.lang.String");
                operation.parameter(parameter -> {
                    parameter.name("sessionId");
                    parameter.description("The session id for the session ");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("getLastAccessedTime");
                operation.description("Get the last access time. This one gets updated whenever a request finishes. ");
                operation.impact("ACTION");
                operation.returnType("java.lang.String");
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
                operation.name("getThisAccessedTime");
                operation.description("Get the last access time. This one gets updated whenever a request starts. ");
                operation.impact("ACTION");
                operation.returnType("java.lang.String");
                operation.parameter(parameter -> {
                    parameter.name("sessionId");
                    parameter.description("Id of the session");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("listSessionIds");
                operation.description("Return the list of active primary session ids");
                operation.impact("ACTION");
                operation.returnType("java.lang.String");
            });
            managedBean.operation(operation -> {
                operation.name("processExpires");
                operation.description("Invalidate all sessions that have expired.s");
                operation.impact("ACTION");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("resetStatistics");
                operation.description("Reset all statistics");
                operation.impact("ACTION");
                operation.returnType("void");
            });
        });
        registry.add(managedBean -> {
            managedBean.name("BackupManager");
            managedBean.description("Cluster Manager implementation of the Manager interface");
            managedBean.domain("Catalina");
            managedBean.group("Manager");
            managedBean.type("org.apache.catalina.ha.session.BackupManager");
            managedBean.attribute(attribute -> {
                attribute.name("activeSessions");
                attribute.description("Number of active primary sessions at this moment");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("activeSessionsFull");
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
                attribute.name("invalidatedSessions");
                attribute.description("Get the list of invalidated session.");
                attribute.type("[Ljava.lang.String;");
            });
            managedBean.attribute(attribute -> {
                attribute.name("mapName");
                attribute.description("mapName");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("mapSendOptions");
                attribute.description("mapSendOptions");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("mapSendOptionsName");
                attribute.description("mapSendOptions name.");
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
                attribute.description("The name of component. ");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("notifyListenersOnReplication");
                attribute.description("Send session attribute change events on backup nodes");
                attribute.type("boolean");
                attribute.is(true);
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
                attribute.name("sessionAverageAliveTime");
                attribute.description("Average time an expired session had been alive");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("sessionCounter");
                attribute.description("Total number of sessions created by this manager");
                attribute.type("long");
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
            });
            managedBean.attribute(attribute -> {
                attribute.name("rpcTimeout");
                attribute.description("Timeout for RPC messages, how long we will wait for a reply");
                attribute.type("long");
            });
            managedBean.attribute(attribute -> {
                attribute.name("terminateOnStartFailure");
                attribute.description("Flag for whether to terminate this map that failed to start.");
                attribute.type("boolean");
                attribute.is(true);
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
                attribute.name("recordAllActions");
                attribute.description("Flag whether send all actions for session across Tomcat cluster nodes.");
                attribute.type("boolean");
                attribute.is(true);
            });
            managedBean.attribute(attribute -> {
                attribute.name("sessionAttributeNameFilter");
                attribute.description("The string pattern used for including session attributes in replication. Null means all attributes are included.");
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
            managedBean.attribute(attribute -> {
                attribute.name("accessTimeout");
                attribute.description("The timeout for a ping message in replication map.");
                attribute.type("long");
            });
            managedBean.operation(operation -> {
                operation.name("expireSession");
                operation.description("Expired the given session");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("sessionId");
                    parameter.description("The session id for the session to be expired");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("findSession");
                operation.description("Return the active Session, associated with this Manager, with the specified session id (if any)");
                operation.impact("ACTION");
                operation.returnType("org.apache.catalina.Session");
                operation.parameter(parameter -> {
                    parameter.name("id");
                    parameter.description("The session id for the session to be returned");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("findSessions");
                operation.description("Return the set of active Sessions associated with this Manager.");
                operation.impact("ACTION");
                operation.returnType("[Lorg.apache.catalina.Session;");
            });
            managedBean.operation(operation -> {
                operation.name("getCreationTime");
                operation.description("Return the creation time for this session");
                operation.impact("ACTION");
                operation.returnType("java.lang.String");
                operation.parameter(parameter -> {
                    parameter.name("sessionId");
                    parameter.description("The session id for the session ");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("getLastAccessedTime");
                operation.description("Get the last access time. This one gets updated whenever a request finishes. ");
                operation.impact("ACTION");
                operation.returnType("java.lang.String");
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
                operation.name("getThisAccessedTime");
                operation.description("Get the last access time. This one gets updated whenever a request starts. ");
                operation.impact("ACTION");
                operation.returnType("java.lang.String");
                operation.parameter(parameter -> {
                    parameter.name("sessionId");
                    parameter.description("Id of the session");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("listSessionIds");
                operation.description("Return the list of active primary session ids");
                operation.impact("ACTION");
                operation.returnType("java.lang.String");
            });
            managedBean.operation(operation -> {
                operation.name("getSessionIdsFull");
                operation.description("Returns the list of all sessions IDS (primary, backup and proxy).");
                operation.impact("ACTION");
                operation.returnType("java.util.Set");
            });
            managedBean.operation(operation -> {
                operation.name("processExpires");
                operation.description("Invalidate all sessions that have expired.s");
                operation.impact("ACTION");
                operation.returnType("void");
            });
        });
    }
}
