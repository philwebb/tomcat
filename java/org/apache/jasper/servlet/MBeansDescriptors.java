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
package org.apache.jasper.servlet;

import org.apache.tomcat.util.modeler.ManagedBeanRegistrar;
import org.apache.tomcat.util.modeler.ManagedBeanRegistry;

public class MBeansDescriptors implements ManagedBeanRegistrar {

    @Override
    public void registerManagedBeans(ManagedBeanRegistry registry) {
        registry.add(managedBean -> {
            managedBean.name("JspMonitor");
            managedBean.description("JSP Monitoring");
            managedBean.domain("Catalina");
            managedBean.group("Monitoring");
            managedBean.type("org.apache.jasper.servlet.JspServlet");
            managedBean.attribute(attribute -> {
                attribute.name("jspCount");
                attribute.description("The number of JSPs that have been loaded into a webapp");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("jspReloadCount");
                attribute.description("The number of JSPs that have been reloaded");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("jspUnloadCount");
                attribute.description("The number of JSPs that have been unloaded");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("jspQueueLength");
                attribute.description("The length of the JSP queue (if enabled via maxLoadedJsps)");
                attribute.type("int");
            });
        });
    }
}
