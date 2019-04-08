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

/**
 * Builder for {@link AttributeInfo} instances.
 *
 * @author Phillip Webb
 */
public class AttributeInfoBuilder extends FeatureInfoBuilder {

    private final AttributeInfo built;

    AttributeInfoBuilder(AttributeInfo built) {
        super(built);
        this.built = built;
    }

    public void displayName(String displayName) {
        this.built.setDisplayName(displayName);
    }

    public void getMethod(String getMethod) {
        this.built.setGetMethod(getMethod);
    }

    public void is(boolean is) {
        this.built.setIs(is);
    }

    public void readable(boolean readable) {
        this.built.setReadable(readable);
    }

    public void setMethod(String setMethod) {
        this.built.setSetMethod(setMethod);
    }

    public void writeable(boolean writeable) {
        this.built.setWriteable(writeable);
    }
}
