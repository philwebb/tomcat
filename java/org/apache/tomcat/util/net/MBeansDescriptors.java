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
package org.apache.tomcat.util.net;

import org.apache.tomcat.util.modeler.ManagedBeanRegistrar;
import org.apache.tomcat.util.modeler.ManagedBeanRegistry;

public class MBeansDescriptors implements ManagedBeanRegistrar {

    @Override
    public void registerManagedBeans(ManagedBeanRegistry registry) {
        registry.add(managedBean -> {
            managedBean.name("NioEndpoint");
            managedBean.className("org.apache.catalina.mbeans.ClassNameMBean");
            managedBean.domain("Catalina");
            managedBean.group("ThreadPool");
            managedBean.type("org.apache.tomcat.util.net.NioEndpoint");
            managedBean.attribute(attribute -> {
                attribute.name("acceptCount");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("acceptorThreadCount");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("acceptorThreadPriority");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("alpnSupported");
                attribute.type("boolean");
                attribute.is(true);
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("bindOnInit");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("connectionCount");
                attribute.type("long");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("connectionLinger");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("connectionTimeout");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("currentThreadCount");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("currentThreadsBusy");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("daemon");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("defaultSSLHostConfigName");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("deferAccept");
                attribute.type("boolean");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("domain");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("executorTerminationTimeoutMillis");
                attribute.type("long");
            });
            managedBean.attribute(attribute -> {
                attribute.name("keepAliveCount");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("keepAliveTimeout");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("localPort");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("maxConnections");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("maxKeepAliveRequests");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("maxThreads");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("minSpareThreads");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("modelerType");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("name");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("paused");
                attribute.type("boolean");
                attribute.is(true);
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("pollerThreadCount");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("pollerThreadPriority");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("port");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("portOffset");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("portWithOffset");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("running");
                attribute.type("boolean");
                attribute.is(true);
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("sSLEnabled");
                attribute.type("boolean");
                attribute.is(true);
            });
            managedBean.attribute(attribute -> {
                attribute.name("selectorTimeout");
                attribute.type("long");
            });
            managedBean.attribute(attribute -> {
                attribute.name("sniParseLimit");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("sslImplementation");
                attribute.type("org.apache.tomcat.util.net.SSLImplementation");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("sslImplementationName");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("tcpNoDelay");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("threadPriority");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("useInheritedChannel");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("useSendfile");
                attribute.type("boolean");
            });
            managedBean.operation(operation -> {
                operation.name("addNegotiatedProtocol");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("param0");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("bind");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("closeServerSocketGraceful");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("createExecutor");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("destroy");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("findSslHostConfigs");
                operation.returnType("[Lorg.apache.tomcat.util.net.SSLHostConfig;");
            });
            managedBean.operation(operation -> {
                operation.name("getAttribute");
                operation.returnType("java.lang.Object");
                operation.parameter(parameter -> {
                    parameter.name("param0");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("getProperty");
                operation.returnType("java.lang.String");
                operation.parameter(parameter -> {
                    parameter.name("param0");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("hasNegotiableProtocols");
                operation.returnType("boolean");
            });
            managedBean.operation(operation -> {
                operation.name("init");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("pause");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("reloadSslHostConfig");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("param0");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("reloadSslHostConfigs");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("removeSslHostConfig");
                operation.returnType("org.apache.tomcat.util.net.SSLHostConfig");
                operation.parameter(parameter -> {
                    parameter.name("param0");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("resume");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("setProperty");
                operation.returnType("boolean");
                operation.parameter(parameter -> {
                    parameter.name("param0");
                    parameter.type("java.lang.String");
                });
                operation.parameter(parameter -> {
                    parameter.name("param1");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("shutdownExecutor");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("start");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("startInternal");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("stop");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("stopInternal");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("unbind");
                operation.returnType("void");
            });
        });
        registry.add(managedBean -> {
            managedBean.name("Nio2Endpoint");
            managedBean.className("org.apache.catalina.mbeans.ClassNameMBean");
            managedBean.domain("Catalina");
            managedBean.group("ThreadPool");
            managedBean.type("org.apache.tomcat.util.net.Nio2Endpoint");
            managedBean.attribute(attribute -> {
                attribute.name("acceptCount");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("acceptorThreadCount");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("acceptorThreadPriority");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("alpnSupported");
                attribute.type("boolean");
                attribute.is(true);
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("bindOnInit");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("connectionCount");
                attribute.type("long");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("connectionLinger");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("connectionTimeout");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("currentThreadCount");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("currentThreadsBusy");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("daemon");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("defaultSSLHostConfigName");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("deferAccept");
                attribute.type("boolean");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("domain");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("executorTerminationTimeoutMillis");
                attribute.type("long");
            });
            managedBean.attribute(attribute -> {
                attribute.name("keepAliveCount");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("keepAliveTimeout");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("localPort");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("maxConnections");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("maxKeepAliveRequests");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("maxThreads");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("minSpareThreads");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("modelerType");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("name");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("paused");
                attribute.type("boolean");
                attribute.is(true);
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("port");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("portOffset");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("portWithOffset");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("running");
                attribute.type("boolean");
                attribute.is(true);
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("sSLEnabled");
                attribute.type("boolean");
                attribute.is(true);
            });
            managedBean.attribute(attribute -> {
                attribute.name("sniParseLimit");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("sslImplementation");
                attribute.type("org.apache.tomcat.util.net.SSLImplementation");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("sslImplementationName");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("tcpNoDelay");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("threadPriority");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("useSendfile");
                attribute.type("boolean");
            });
            managedBean.operation(operation -> {
                operation.name("addNegotiatedProtocol");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("param0");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("bind");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("closeServerSocketGraceful");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("createExecutor");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("destroy");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("findSslHostConfigs");
                operation.returnType("[Lorg.apache.tomcat.util.net.SSLHostConfig;");
            });
            managedBean.operation(operation -> {
                operation.name("getAttribute");
                operation.returnType("java.lang.Object");
                operation.parameter(parameter -> {
                    parameter.name("param0");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("getProperty");
                operation.returnType("java.lang.String");
                operation.parameter(parameter -> {
                    parameter.name("param0");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("hasNegotiableProtocols");
                operation.returnType("boolean");
            });
            managedBean.operation(operation -> {
                operation.name("init");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("pause");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("reloadSslHostConfig");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("param0");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("reloadSslHostConfigs");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("removeSslHostConfig");
                operation.returnType("org.apache.tomcat.util.net.SSLHostConfig");
                operation.parameter(parameter -> {
                    parameter.name("param0");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("resume");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("setProperty");
                operation.returnType("boolean");
                operation.parameter(parameter -> {
                    parameter.name("param0");
                    parameter.type("java.lang.String");
                });
                operation.parameter(parameter -> {
                    parameter.name("param1");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("shutdownExecutor");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("start");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("startInternal");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("stop");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("stopInternal");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("unbind");
                operation.returnType("void");
            });
        });
        registry.add(managedBean -> {
            managedBean.name("AprEndpoint");
            managedBean.className("org.apache.catalina.mbeans.ClassNameMBean");
            managedBean.domain("Catalina");
            managedBean.group("ThreadPool");
            managedBean.type("org.apache.tomcat.util.net.AprEndpoint");
            managedBean.attribute(attribute -> {
                attribute.name("acceptCount");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("acceptorThreadCount");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("acceptorThreadPriority");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("alpnSupported");
                attribute.type("boolean");
                attribute.is(true);
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("bindOnInit");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("connectionCount");
                attribute.type("long");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("connectionLinger");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("connectionTimeout");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("currentThreadCount");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("currentThreadsBusy");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("daemon");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("defaultSSLHostConfigName");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("deferAccept");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("domain");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("executorTerminationTimeoutMillis");
                attribute.type("long");
            });
            managedBean.attribute(attribute -> {
                attribute.name("ipv6v6only");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("keepAliveCount");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("keepAliveTimeout");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("localPort");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("maxConnections");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("maxKeepAliveRequests");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("maxThreads");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("minSpareThreads");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("modelerType");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("name");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("paused");
                attribute.type("boolean");
                attribute.is(true);
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("pollTime");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("port");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("portOffset");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("portWithOffset");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("running");
                attribute.type("boolean");
                attribute.is(true);
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("sSLEnabled");
                attribute.type("boolean");
                attribute.is(true);
            });
            managedBean.attribute(attribute -> {
                attribute.name("sendfileCount");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("sendfileSize");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("tcpNoDelay");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("threadPriority");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("useSendfile");
                attribute.type("boolean");
            });
            managedBean.operation(operation -> {
                operation.name("addNegotiatedProtocol");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("param0");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("bind");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("closeServerSocketGraceful");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("createExecutor");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("destroy");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("findSslHostConfigs");
                operation.returnType("[Lorg.apache.tomcat.util.net.SSLHostConfig;");
            });
            managedBean.operation(operation -> {
                operation.name("getAttribute");
                operation.returnType("java.lang.Object");
                operation.parameter(parameter -> {
                    parameter.name("param0");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("getProperty");
                operation.returnType("java.lang.String");
                operation.parameter(parameter -> {
                    parameter.name("param0");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("getSslContext");
                operation.returnType("long");
                operation.parameter(parameter -> {
                    parameter.name("param0");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("hasNegotiableProtocols");
                operation.returnType("boolean");
            });
            managedBean.operation(operation -> {
                operation.name("init");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("pause");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("reloadSslHostConfig");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("param0");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("reloadSslHostConfigs");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("removeSslHostConfig");
                operation.returnType("org.apache.tomcat.util.net.SSLHostConfig");
                operation.parameter(parameter -> {
                    parameter.name("param0");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("resume");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("setProperty");
                operation.returnType("boolean");
                operation.parameter(parameter -> {
                    parameter.name("param0");
                    parameter.type("java.lang.String");
                });
                operation.parameter(parameter -> {
                    parameter.name("param1");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("shutdownExecutor");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("start");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("startInternal");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("stop");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("stopInternal");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("unbind");
                operation.returnType("void");
            });
        });
    }
}
