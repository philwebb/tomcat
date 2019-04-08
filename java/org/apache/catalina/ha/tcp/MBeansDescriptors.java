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
package org.apache.catalina.ha.tcp;

import org.apache.tomcat.util.modeler.ManagedBeanRegistrar;
import org.apache.tomcat.util.modeler.ManagedBeanRegistry;

public class MBeansDescriptors implements ManagedBeanRegistrar {

    @Override
    public void registerManagedBeans(ManagedBeanRegistry registry) {
        registry.add(managedBean -> {
            managedBean.name("SimpleTcpCluster");
            managedBean.description("Tcp Cluster implementation");
            managedBean.domain("Catalina");
            managedBean.group("Cluster");
            managedBean.type("org.apache.catalina.ha.tcp.SimpleTcpCluster");
            managedBean.attribute(attribute -> {
                attribute.name("channelSendOptions");
                attribute.description("This sets channel behaviour on sent messages.");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("channelSendOptionsName");
                attribute.description("channelSendOptions name.");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("channelStartOptions");
                attribute.description("This sets channel start behaviour.");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("clusterName");
                attribute.description("name of cluster");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("heartbeatBackgroundEnabled");
                attribute.description("enable that container background thread call channel heartbeat, default is that channel manage heartbeat itself.");
                attribute.type("boolean");
                attribute.is(true);
            });
            managedBean.attribute(attribute -> {
                attribute.name("notifyLifecycleListenerOnFailure");
                attribute.description("notify lifecycleListener from message transfer failure");
                attribute.type("boolean");
                attribute.is(true);
            });
            managedBean.attribute(attribute -> {
                attribute.name("stateName");
                attribute.description("The name of the LifecycleState that this component is currently in");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.operation(operation -> {
                operation.name("send");
                operation.description("send message to all cluster members");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("message");
                    parameter.description("replication message");
                    parameter.type("org.apache.catalina.ha.ClusterMessage");
                });
            });
            managedBean.operation(operation -> {
                operation.name("start");
                operation.description("Start the cluster");
                operation.impact("ACTION");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("stop");
                operation.description("Stop the cluster");
                operation.impact("ACTION");
                operation.returnType("void");
            });
        });
        registry.add(managedBean -> {
            managedBean.name("ReplicationValve");
            managedBean.description("Valve for simple tcp replication");
            managedBean.domain("Catalina");
            managedBean.group("Valve");
            managedBean.type("org.apache.catalina.ha.tcp.ReplicationValve");
            managedBean.attribute(attribute -> {
                attribute.name("asyncSupported");
                attribute.description("Does this valve support async reporting?");
                attribute.type("boolean");
                attribute.is(true);
            });
            managedBean.attribute(attribute -> {
                attribute.name("doProcessingStats");
                attribute.description("active statistics counting");
                attribute.type("boolean");
                attribute.getMethod("doStatistics");
                attribute.setMethod("setStatistics");
            });
            managedBean.attribute(attribute -> {
                attribute.name("filter");
                attribute.description("resource filter to disable session replication check");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("lastSendTime");
                attribute.description("last replicated request time");
                attribute.type("long");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("nrOfCrossContextSendRequests");
                attribute.description("number of send cross context session requests");
                attribute.type("long");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("nrOfFilterRequests");
                attribute.description("number of filtered requests");
                attribute.type("long");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("nrOfSendRequests");
                attribute.description("number of send requests");
                attribute.type("long");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("nrOfRequests");
                attribute.description("number of replicated requests");
                attribute.type("long");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("primaryIndicator");
                attribute.description("set indicator that request processing is at primary session node");
                attribute.type("boolean");
                attribute.is(true);
            });
            managedBean.attribute(attribute -> {
                attribute.name("primaryIndicatorName");
                attribute.description("Request attribute name to indicate that request processing is at primary session node");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("stateName");
                attribute.description("The name of the LifecycleState that this component is currently in");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("totalSendTime");
                attribute.description("total replicated send time");
                attribute.type("long");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("totalRequestTime");
                attribute.description("total replicated request time");
                attribute.type("long");
                attribute.writeable(false);
            });
            managedBean.operation(operation -> {
                operation.name("resetStatistics");
                operation.description("Reset all statistics");
                operation.impact("ACTION");
                operation.returnType("void");
            });
        });
    }
}
