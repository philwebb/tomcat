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

package org.apache.tomcat.util.modeler;

import java.util.function.Consumer;

/**
 * <p>A registry of managed bean (MBean) descriptors passed to the
 * {@link ManagedBeanRegistrar} as a destination for descriptors.
 *
 * @author Phillip Webb
 */
@FunctionalInterface
public interface ManagedBeanRegistry {

    /**
     * Add one or more {@link ManagedBean} instances (via
     * {@link ManagedBeanBuilder}) to this registry.
     * @param managedBean
     *            a consumer used to provide access to the builder
     */
    void add(Consumer<ManagedBeanBuilder> managedBean);

}
