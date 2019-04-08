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
package org.apache.catalina.webresources;

import org.apache.tomcat.util.modeler.ManagedBeanRegistrar;
import org.apache.tomcat.util.modeler.ManagedBeanRegistry;

public class MBeansDescriptors implements ManagedBeanRegistrar {

    @Override
    public void registerManagedBeans(ManagedBeanRegistry registry) {
        registry.add(managedBean -> {
            managedBean.name("StandardRoot");
            managedBean.description("Provides the resources implementation for a web application");
            managedBean.domain("Catalina");
            managedBean.group("WebResourceRoot");
            managedBean.type("org.apache.catalina.webresources.StandardRoot");
            managedBean.attribute(attribute -> {
                attribute.name("allowLinking");
                attribute.description("Does this resources implementation allow the use of symbolic links?");
                attribute.type("boolean");
                attribute.writeable(true);
            });
            managedBean.attribute(attribute -> {
                attribute.name("cachingAllowed");
                attribute.description("Is in memory caching of resource content and metadata enabled?");
                attribute.type("boolean");
                attribute.is(true);
                attribute.writeable(true);
            });
            managedBean.attribute(attribute -> {
                attribute.name("stateName");
                attribute.description("The current Lifecycle state of this object");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("trackLockedFiles");
                attribute.description("Does this resources implementation track requests that lock files?");
                attribute.type("boolean");
                attribute.writeable(true);
            });
            managedBean.attribute(attribute -> {
                attribute.name("trackedResources");
                attribute.description("List of resources currently being tracked for possible resource leaks");
                attribute.type("java.util.List");
                attribute.writeable(false);
            });
        });
        registry.add(managedBean -> {
            managedBean.name("Cache");
            managedBean.description("Provides caching of resource metadata and content");
            managedBean.domain("Catalina");
            managedBean.group("WebResourceRoot");
            managedBean.type("org.apache.catalina.webresources.Cache");
            managedBean.attribute(attribute -> {
                attribute.name("hitCount");
                attribute.description("The number of requests for resources that were served from the cache");
                attribute.type("long");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("lookupCount");
                attribute.description("The number of requests for resources");
                attribute.type("long");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("maxSize");
                attribute.description("The maximum permitted size of the cache in kB");
                attribute.type("long");
                attribute.writeable(true);
            });
            managedBean.attribute(attribute -> {
                attribute.name("objectMaxSize");
                attribute.description("The maximum permitted size for a single object in the cache in kB");
                attribute.type("int");
                attribute.writeable(true);
            });
            managedBean.attribute(attribute -> {
                attribute.name("size");
                attribute.description("The current estimate of the cache size in kB");
                attribute.type("long");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("ttl");
                attribute.description("The time-to-live for cache entries in milliseconds");
                attribute.type("long");
                attribute.writeable(true);
            });
            managedBean.operation(operation -> {
                operation.name("clear");
                operation.description("Clears all cached content from the cache.");
                operation.impact("ACTION");
                operation.returnType("void");
            });
        });
    }
}
