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
package org.apache.catalina.ha.deploy;

import org.apache.tomcat.util.modeler.ManagedBeanRegistrar;
import org.apache.tomcat.util.modeler.ManagedBeanRegistry;

public class MBeansDescriptors implements ManagedBeanRegistrar {

    @Override
    public void registerManagedBeans(ManagedBeanRegistry registry) {
        registry.add(managedBean -> {
            managedBean.name("FarmWarDeployer");
            managedBean.className("org.apache.catalina.mbeans.ClassNameMBean");
            managedBean.description("Farm Deployer");
            managedBean.domain("Catalina");
            managedBean.group("Cluster");
            managedBean.type("org.apache.catalina.ha.deploy.FarmWarDeployer");
            managedBean.attribute(attribute -> {
                attribute.name("deployDir");
                attribute.description("Deployment directory.");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("tempDir");
                attribute.description("The temporaryDirectory to store binary data when downloading a war from the cluster");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("watchDir");
                attribute.description("The directory where we watch for changes");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("watchEnabled");
                attribute.description("Is watching enabled?");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("processDeployFrequency");
                attribute.description("Frequency of the Farm watchDir check.");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("maxValidTime");
                attribute.description("The maximum valid time of FileMessageFactory.");
                attribute.type("int");
            });
        });
    }
}
