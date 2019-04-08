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
package org.apache.catalina.tribes.membership;

import org.apache.tomcat.util.modeler.ManagedBeanRegistrar;
import org.apache.tomcat.util.modeler.ManagedBeanRegistry;

public class MBeansDescriptors implements ManagedBeanRegistrar {

    @Override
    public void registerManagedBeans(ManagedBeanRegistry registry) {
        registry.add(managedBean -> {
            managedBean.name("McastService");
            managedBean.description("Cluster Membership service implementation");
            managedBean.domain("Catalina");
            managedBean.group("Cluster");
            managedBean.type("org.apache.catalina.tribes.membership.McastService");
            managedBean.attribute(attribute -> {
                attribute.name("address");
                attribute.description("Multicast IP Address");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("bind");
                attribute.description("Multicast IP Interface address (default auto)");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("dropTime");
                attribute.description("Timeout from frequency ping after member disappear notify");
                attribute.type("long");
            });
            managedBean.attribute(attribute -> {
                attribute.name("frequency");
                attribute.description("Ping Frequency at msec");
                attribute.type("long");
            });
            managedBean.attribute(attribute -> {
                attribute.name("localLoopbackDisabled");
                attribute.description("Is local loopback disabled?");
                attribute.type("boolean");
                attribute.is(true);
            });
            managedBean.attribute(attribute -> {
                attribute.name("localMemberName");
                attribute.description("Complete local receiver information");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("membersByName");
                attribute.description("Complete remote sender information");
                attribute.type("[Ljava.lang.String;");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("port");
                attribute.description("Multicast UDP Port");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("recoveryCounter");
                attribute.description("Counter after membership failure socket restarted");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("recoveryEnabled");
                attribute.description("Membership recovery enabled");
                attribute.type("boolean");
                attribute.is(true);
            });
            managedBean.attribute(attribute -> {
                attribute.name("recoverySleepTime");
                attribute.description("Sleep time between next socket recovery (5000 msec)");
                attribute.type("long");
            });
            managedBean.attribute(attribute -> {
                attribute.name("soTimeout");
                attribute.description("Multicast Socket Timeout");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("Ttl");
                attribute.description("");
                attribute.type("int");
            });
            managedBean.operation(operation -> {
                operation.name("start");
                operation.description("Start the cluster membership");
                operation.impact("ACTION");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("stop");
                operation.description("Stop the cluster membership");
                operation.impact("ACTION");
                operation.returnType("void");
            });
        });
        registry.add(managedBean -> {
            managedBean.name("MemberImpl");
            managedBean.description("Cluster member");
            managedBean.domain("Catalina");
            managedBean.group("Cluster");
            managedBean.type("org.apache.catalina.tribes.membership.MemberImpl");
            managedBean.attribute(attribute -> {
                attribute.name("failing");
                attribute.description("Has a problem been observed with this member (failing is worse than suspect)");
                attribute.type("boolean");
                attribute.is(true);
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("hostname");
                attribute.description("The name of the host where this member is located");
                attribute.type("String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("memberAliveTime");
                attribute.description("The number of milliseconds since this member was created");
                attribute.type("long");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("msgCount");
                attribute.description("The number of messages sent by this member");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("name");
                attribute.description("The unique name of this member within the cluster");
                attribute.type("String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("port");
                attribute.description("The tcp port the member is listening on");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("ready");
                attribute.description("Is this member ready to send messages");
                attribute.type("boolean");
                attribute.is(true);
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("securePort");
                attribute.description("The tcp(SSL) port the member is listening on");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("serviceStartTime");
                attribute.description("The time the member was started");
                attribute.type("long");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("suspect");
                attribute.description("Has a potential problem been observed with this member (failing is worse than suspect)");
                attribute.type("boolean");
                attribute.is(true);
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("udpPort");
                attribute.description("The upd port the member is listening on");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("local");
                attribute.description("The flag indicating that this member is a local member");
                attribute.type("boolean");
                attribute.is(true);
                attribute.writeable(false);
            });
        });
        registry.add(managedBean -> {
            managedBean.name("StaticMember");
            managedBean.description("Cluster static member");
            managedBean.domain("Catalina");
            managedBean.group("Cluster");
            managedBean.type("org.apache.catalina.tribes.membership.StaticMember");
            managedBean.attribute(attribute -> {
                attribute.name("failing");
                attribute.description("Has a problem been observed with this member (failing is worse than suspect)");
                attribute.type("boolean");
                attribute.is(true);
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("hostname");
                attribute.description("The name of the host where this member is located");
                attribute.type("String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("memberAliveTime");
                attribute.description("The number of milliseconds since this member was created");
                attribute.type("long");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("msgCount");
                attribute.description("The number of messages sent by this member");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("name");
                attribute.description("The unique name of this member within the cluster");
                attribute.type("String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("port");
                attribute.description("The tcp port the member is listening on");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("ready");
                attribute.description("Is this member ready to send messages");
                attribute.type("boolean");
                attribute.is(true);
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("securePort");
                attribute.description("The tcp(SSL) port the member is listening on");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("serviceStartTime");
                attribute.description("The time the member was started");
                attribute.type("long");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("suspect");
                attribute.description("Has a potential problem been observed with this member (failing is worse than suspect)");
                attribute.type("boolean");
                attribute.is(true);
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("udpPort");
                attribute.description("The upd port the member is listening on");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("local");
                attribute.description("The flag indicating that this member is a local member");
                attribute.type("boolean");
                attribute.is(true);
                attribute.writeable(false);
            });
        });
    }
}
