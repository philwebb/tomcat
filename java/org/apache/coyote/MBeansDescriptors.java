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
package org.apache.coyote;

import org.apache.tomcat.util.modeler.ManagedBeanRegistrar;
import org.apache.tomcat.util.modeler.ManagedBeanRegistry;

public class MBeansDescriptors implements ManagedBeanRegistrar {

    @Override
    public void registerManagedBeans(ManagedBeanRegistry registry) {
        registry.add(managedBean -> {
            managedBean.name("RequestGroupInfo");
            managedBean.description("Runtime information of a group of requests");
            managedBean.domain("Catalina");
            managedBean.group("Connector");
            managedBean.type("org.apache.coyote.RequestGroupInfo");
            managedBean.attribute(attribute -> {
                attribute.name("maxTime");
                attribute.description("Maximum time to process a request");
                attribute.type("long");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("processingTime");
                attribute.description("Total time to process the requests");
                attribute.type("long");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("requestCount");
                attribute.description("Number of requests processed");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("errorCount");
                attribute.description("Number of errors");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("bytesReceived");
                attribute.description("Amount of data received, in bytes");
                attribute.type("long");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("bytesSent");
                attribute.description("Amount of data sent, in bytes");
                attribute.type("long");
                attribute.writeable(false);
            });
            managedBean.operation(operation -> {
                operation.name("resetCounters");
                operation.description("Reset counters");
                operation.impact("ACTION");
                operation.returnType("void");
            });
        });
    }
}
