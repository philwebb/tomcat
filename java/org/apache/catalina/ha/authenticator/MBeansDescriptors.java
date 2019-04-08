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
package org.apache.catalina.ha.authenticator;

import org.apache.tomcat.util.modeler.ManagedBeanRegistrar;
import org.apache.tomcat.util.modeler.ManagedBeanRegistry;

public class MBeansDescriptors implements ManagedBeanRegistrar {

    @Override
    public void registerManagedBeans(ManagedBeanRegistry registry) {
        registry.add(managedBean -> {
            managedBean.name("ClusterSingleSignOn");
            managedBean.description("A Valve that supports a 'single signon' user experience on a whole cluster");
            managedBean.domain("Catalina");
            managedBean.group("Valve");
            managedBean.type("org.apache.catalina.ha.authenticator.ClusterSingleSignOn");
            managedBean.attribute(attribute -> {
                attribute.name("asyncSupported");
                attribute.description("Does this valve support async reporting?");
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
                attribute.name("requireReauthentication");
                attribute.description("Should we attempt to reauthenticate each request against the security Realm?");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("cookieDomain");
                attribute.description("(Optional) Domain to be used by sso cookies");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("mapSendOptions");
                attribute.description("mapSendOptions");
                attribute.type("int");
                attribute.writeable(false);
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
            });
            managedBean.attribute(attribute -> {
                attribute.name("accessTimeout");
                attribute.description("The timeout for a ping message in replication map.");
                attribute.type("long");
            });
        });
    }
}
