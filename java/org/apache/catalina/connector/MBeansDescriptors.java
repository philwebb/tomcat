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
package org.apache.catalina.connector;

import org.apache.tomcat.util.modeler.ManagedBeanRegistrar;
import org.apache.tomcat.util.modeler.ManagedBeanRegistry;

public class MBeansDescriptors implements ManagedBeanRegistrar {

    @Override
    public void registerManagedBeans(ManagedBeanRegistry registry) {
        registry.add(managedBean -> {
            managedBean.name("CoyoteConnector");
            managedBean.className("org.apache.catalina.mbeans.ConnectorMBean");
            managedBean.description("Implementation of a Coyote connector");
            managedBean.domain("Catalina");
            managedBean.group("Connector");
            managedBean.type("org.apache.catalina.connector.Connector");
            managedBean.attribute(attribute -> {
                attribute.name("acceptCount");
                attribute.description("The accept count for this Connector");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("address");
                attribute.description("The IP address on which to bind");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("ajpFlush");
                attribute.description("Send AJP flush package for each explicit flush");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("allowTrace");
                attribute.description("Allow disabling TRACE method");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("ciphers");
                attribute.description("Comma-separated list of requested cipher suites");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("ciphersUsed");
                attribute.description("Array of ciphers suites in use");
                attribute.type("[Ljava.lang.String;");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("className");
                attribute.description("Fully qualified class name of the managed object");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("connectionLinger");
                attribute.description("Linger value on the incoming connection");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("connectionTimeout");
                attribute.description("Timeout value on the incoming connection");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("enableLookups");
                attribute.description("The 'enable DNS lookups' flag for this Connector");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("executorName");
                attribute.description("The name of the executor - if any - associated with this Connector");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("keepAliveTimeout");
                attribute.description("The number of seconds Tomcat will wait for a subsequent request before closing the connection");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("localPort");
                attribute.description("The port number on which this connector is listening to requests. If the special value for port of zero is used then this method will report the actual port bound.");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("maxHeaderCount");
                attribute.description("The maximum number of headers that are allowed by the container. 100 by default. A value of less than 0 means no limit.");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("maxKeepAliveRequests");
                attribute.description("Maximum number of Keep-Alive requests to honor per connection");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("maxParameterCount");
                attribute.description("The maximum number of parameters (GET plus POST) which will be automatically parsed by the container. 10000 by default. A value of less than 0 means no limit.");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("maxPostSize");
                attribute.description("Maximum size in bytes of a POST which will be handled by the servlet API provided features");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("maxSavePostSize");
                attribute.description("Maximum size of a POST which will be saved by the container during authentication");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("maxSwallowSize");
                attribute.description("The maximum number of request body bytes to be swallowed by Tomcat for an aborted upload");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("maxThreads");
                attribute.description("The maximum number of request processing threads to be created for the internal Executor. -1 indicates an external Executor is being used.");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("minSpareThreads");
                attribute.description("The number of request processing threads that will be created for the internal Executor. -1 indicates an external Executor is being used.");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("packetSize");
                attribute.description("The ajp packet size.");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("port");
                attribute.description("The port number (excluding any offset) on which this connector is configured to listen for requests. The special value of 0 means select a random free port when the socket is bound.");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("portOffset");
                attribute.description("The offset that will be applied to port to determine the actual port number used.");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("portWithOffset");
                attribute.description("The actual port number (including any offset) on which this connector is configured to listen for requests.");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("processorCache");
                attribute.description("The processor cache size.");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("protocol");
                attribute.description("Coyote protocol handler in use");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("protocolHandlerClassName");
                attribute.description("Coyote Protocol handler class name");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("proxyName");
                attribute.description("The Server name to which we should pretend requests to this Connector");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("proxyPort");
                attribute.description("The Server port to which we should pretend requests to this Connector");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("redirectPort");
                attribute.description("The redirect port (excluding any offset) for non-SSL to SSL redirects");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("redirectPortWithOffset");
                attribute.description("The actual redirect port (including any offset) for non-SSL to SSL redirects.");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("scheme");
                attribute.description("Protocol name for this Connector (http, https)");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("secret");
                attribute.description("Authentication secret (I guess ... not in Javadocs)");
                attribute.type("java.lang.String");
                attribute.readable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("secure");
                attribute.description("Is this a secure (SSL) Connector?");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("sslProtocols");
                attribute.description("Comma-separated list of SSL protocol variants to be enabled");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("stateName");
                attribute.description("The name of the LifecycleState that this component is currently in");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("tcpNoDelay");
                attribute.description("Should we use TCP no delay?");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("threadPriority");
                attribute.description("The thread priority for processors using the internal Executor. -1 indicates an external Executor is being used.");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("URIEncoding");
                attribute.description("Character encoding used to decode the URI");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("useBodyEncodingForURI");
                attribute.description("Should the body encoding be used for URI query parameters");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("useIPVHosts");
                attribute.description("Should IP-based virtual hosting be used? ");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("xpoweredBy");
                attribute.description("Is generation of X-Powered-By response header enabled/disabled?");
                attribute.type("boolean");
            });
            managedBean.operation(operation -> {
                operation.name("start");
                operation.description("Start");
                operation.impact("ACTION");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("stop");
                operation.description("Stop");
                operation.impact("ACTION");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("pause");
                operation.description("Start");
                operation.impact("ACTION");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("resume");
                operation.description("Stop");
                operation.impact("ACTION");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("init");
                operation.description("Init");
                operation.impact("ACTION");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("destroy");
                operation.description("Destroy");
                operation.impact("ACTION");
                operation.returnType("void");
            });
        });
    }
}
