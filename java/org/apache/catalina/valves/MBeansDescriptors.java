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
package org.apache.catalina.valves;

import org.apache.tomcat.util.modeler.ManagedBeanRegistrar;
import org.apache.tomcat.util.modeler.ManagedBeanRegistry;

public class MBeansDescriptors implements ManagedBeanRegistrar {

    @Override
    public void registerManagedBeans(ManagedBeanRegistry registry) {
        registry.add(managedBean -> {
            managedBean.name("AccessLogValve");
            managedBean.description("Valve that generates a web server access log");
            managedBean.domain("Catalina");
            managedBean.group("Valve");
            managedBean.type("org.apache.catalina.valves.AccessLogValve");
            managedBean.attribute(attribute -> {
                attribute.name("asyncSupported");
                attribute.description("Does this valve support async reporting.");
                attribute.type("boolean");
                attribute.is(true);
            });
            managedBean.attribute(attribute -> {
                attribute.name("buffered");
                attribute.description("Flag to buffering.");
                attribute.type("boolean");
                attribute.is(true);
            });
            managedBean.attribute(attribute -> {
                attribute.name("checkExists");
                attribute.description("Check for file existence before logging.");
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
                attribute.name("condition");
                attribute.description("The value to look for conditional logging. The same as conditionUnless.");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("conditionIf");
                attribute.description("The value to look for conditional logging.");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("conditionUnless");
                attribute.description("The value to look for conditional logging.");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("directory");
                attribute.description("The directory in which log files are created");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("enabled");
                attribute.description("Enable Access Logging");
                attribute.type("boolean");
                attribute.is(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("encoding");
                attribute.description("Character set used to write the log file");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("fileDateFormat");
                attribute.description("The format for the date for date based log rotation");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("locale");
                attribute.description("The locale used to format timestamps in the access log lines");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("pattern");
                attribute.description("The pattern used to format our access log lines");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("prefix");
                attribute.description("The prefix that is added to log file filenames");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("rotatable");
                attribute.description("Flag to indicate automatic log rotation.");
                attribute.type("boolean");
                attribute.is(true);
            });
            managedBean.attribute(attribute -> {
                attribute.name("renameOnRotate");
                attribute.description("Flag to defer inclusion of the date stamp in the log file name until rotation.");
                attribute.type("boolean");
                attribute.is(true);
            });
            managedBean.attribute(attribute -> {
                attribute.name("stateName");
                attribute.description("The name of the LifecycleState that this component is currently in");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("suffix");
                attribute.description("The suffix that is added to log file filenames");
                attribute.type("java.lang.String");
            });
            managedBean.operation(operation -> {
                operation.name("rotate");
                operation.description("Check if the log file is due to be rotated and rotate if it is");
                operation.impact("ACTION");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("rotate");
                operation.description("Move the existing log file to a new name");
                operation.impact("ACTION");
                operation.returnType("boolean");
                operation.parameter(parameter -> {
                    parameter.name("newFileName");
                    parameter.description("File name to move the log file to.");
                    parameter.type("java.lang.String");
                });
            });
        });
        registry.add(managedBean -> {
            managedBean.name("CrawlerSessionManagerValve");
            managedBean.description("Valve that ensures web crawlers always use sessions even if no session ID is presented by the client");
            managedBean.domain("Catalina");
            managedBean.group("Valve");
            managedBean.type("org.apache.catalina.valves.CrawlerSessionManagerValve");
            managedBean.attribute(attribute -> {
                attribute.name("asyncSupported");
                attribute.description("Does this valve support async reporting.");
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
                attribute.name("clientIpSessionId");
                attribute.description("Current Map of client IP address to session ID managed by this Valve");
                attribute.type("java.util.Map");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("crawlerUserAgents");
                attribute.description("Specify the regular expression used to identify crawlers based in the User-Agent header provided.");
                attribute.type("java.lang.String");
                attribute.writeable(true);
            });
            managedBean.attribute(attribute -> {
                attribute.name("sessionInactiveInterval");
                attribute.description("Specify the session timeout (in seconds) for a crawler's session.");
                attribute.type("int");
                attribute.writeable(true);
            });
            managedBean.attribute(attribute -> {
                attribute.name("stateName");
                attribute.description("The name of the LifecycleState that this component is currently in");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
        });
        registry.add(managedBean -> {
            managedBean.name("ErrorReportValve");
            managedBean.description("Implementation of a Valve that outputs HTML error pages");
            managedBean.domain("Catalina");
            managedBean.group("Valve");
            managedBean.type("org.apache.catalina.valves.ErrorReportValve");
            managedBean.attribute(attribute -> {
                attribute.name("asyncSupported");
                attribute.description("Does this valve support async reporting.");
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
                attribute.name("stateName");
                attribute.description("The name of the LifecycleState that this component is currently in");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("showReport");
                attribute.description("Enables/Disables full error reports");
                attribute.type("boolean");
                attribute.is(true);
            });
            managedBean.attribute(attribute -> {
                attribute.name("showServerInfo");
                attribute.description("Enables/Disables server info on error pages");
                attribute.type("boolean");
                attribute.is(true);
            });
        });
        registry.add(managedBean -> {
            managedBean.name("ExtendedAccessLogValve");
            managedBean.description("Valve that generates a web server access log");
            managedBean.domain("Catalina");
            managedBean.group("Valve");
            managedBean.type("org.apache.catalina.valves.ExtendedAccessLogValve");
            managedBean.attribute(attribute -> {
                attribute.name("asyncSupported");
                attribute.description("Does this valve support async reporting.");
                attribute.type("boolean");
                attribute.is(true);
            });
            managedBean.attribute(attribute -> {
                attribute.name("buffered");
                attribute.description("Flag to buffering.");
                attribute.type("boolean");
                attribute.is(true);
            });
            managedBean.attribute(attribute -> {
                attribute.name("checkExists");
                attribute.description("Check for file existence before logging.");
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
                attribute.name("condition");
                attribute.description("The value to look for conditional logging. The same as conditionUnless.");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("conditionIf");
                attribute.description("The value to look for conditional logging.");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("conditionUnless");
                attribute.description("The value to look for conditional logging.");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("directory");
                attribute.description("The directory in which log files are created");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("enabled");
                attribute.description("Enable Access Logging");
                attribute.type("boolean");
                attribute.is(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("encoding");
                attribute.description("Character set used to write the log file");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("fileDateFormat");
                attribute.description("The format for the date date based log rotation.");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("locale");
                attribute.description("The locale used to format timestamps in the access log lines");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("pattern");
                attribute.description("The pattern used to format our access log lines");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("prefix");
                attribute.description("The prefix that is added to log file filenames");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("rotatable");
                attribute.description("Flag to indicate automatic log rotation.");
                attribute.type("boolean");
                attribute.is(true);
            });
            managedBean.attribute(attribute -> {
                attribute.name("renameOnRotate");
                attribute.description("Flag to defer inclusion of the date stamp in the log file name until rotation.");
                attribute.type("boolean");
                attribute.is(true);
            });
            managedBean.attribute(attribute -> {
                attribute.name("suffix");
                attribute.description("The suffix that is added to log file filenames");
                attribute.type("java.lang.String");
            });
            managedBean.operation(operation -> {
                operation.name("rotate");
                operation.description("Check if the log file is due to be rotated and rotate if it is");
                operation.impact("ACTION");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("rotate");
                operation.description("Move the existing log file to a new name");
                operation.impact("ACTION");
                operation.returnType("boolean");
                operation.parameter(parameter -> {
                    parameter.name("newFileName");
                    parameter.description("File name to move the log file to.");
                    parameter.type("java.lang.String");
                });
            });
        });
        registry.add(managedBean -> {
            managedBean.name("SemaphoreValve");
            managedBean.description("Valve that does concurrency control");
            managedBean.domain("Catalina");
            managedBean.group("Valve");
            managedBean.type("org.apache.catalina.valves.SemaphoreValve");
            managedBean.attribute(attribute -> {
                attribute.name("asyncSupported");
                attribute.description("Does this valve support async reporting.");
                attribute.type("boolean");
                attribute.is(true);
            });
            managedBean.attribute(attribute -> {
                attribute.name("block");
                attribute.description("Should this be blocked until a permit is available?");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("className");
                attribute.description("Fully qualified class name of the managed object");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("concurrency");
                attribute.description("Desired concurrency level");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("fairness");
                attribute.description("Use a fair semaphore");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("interruptible");
                attribute.description("Should this be blocked interruptibly until a permit is available?");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("stateName");
                attribute.description("The name of the LifecycleState that this component is currently in");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
        });
        registry.add(managedBean -> {
            managedBean.name("RemoteAddrValve");
            managedBean.description("Concrete implementation of RequestFilterValve that filters based on the string representation of the remote client's IP address");
            managedBean.domain("Catalina");
            managedBean.group("Valve");
            managedBean.type("org.apache.catalina.valves.RemoteAddrValve");
            managedBean.attribute(attribute -> {
                attribute.name("addConnectorPort");
                attribute.description("Append the server connector port to the client IP separated by a semicolon");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("allow");
                attribute.description("The allow expression");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("allowValid");
                attribute.description("Becomes false if assigned value of allow expression is not syntactically correct");
                attribute.type("boolean");
                attribute.is(true);
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("asyncSupported");
                attribute.description("Does this valve support async reporting.");
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
                attribute.name("deny");
                attribute.description("The deny expression");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("denyStatus");
                attribute.description("HTTP response status code that is used when rejecting denied request");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("denyValid");
                attribute.description("Becomes false if assigned value of deny expression is not syntactically correct");
                attribute.type("boolean");
                attribute.is(true);
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("invalidAuthenticationWhenDeny");
                attribute.description("Send an invalid authentication header instead of deny");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("stateName");
                attribute.description("The name of the LifecycleState that this component is currently in");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.operation(operation -> {
                operation.name("isAllowed");
                operation.description("Tests whether a client with this IP address value is allowed access by the current valve configuration");
                operation.impact("INFO");
                operation.returnType("boolean");
                operation.parameter(parameter -> {
                    parameter.name("ipAddress");
                    parameter.description("IP address to be tested");
                    parameter.type("java.lang.String");
                });
            });
        });
        registry.add(managedBean -> {
            managedBean.name("RemoteHostValve");
            managedBean.description("Concrete implementation of RequestFilterValve that filters based on the string representation of the remote client's host name");
            managedBean.domain("Catalina");
            managedBean.group("Valve");
            managedBean.type("org.apache.catalina.valves.RemoteHostValve");
            managedBean.attribute(attribute -> {
                attribute.name("addConnectorPort");
                attribute.description("Append the server connector port to the client IP separated by a semicolon");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("allow");
                attribute.description("The allow expression");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("allowValid");
                attribute.description("Becomes false if assigned value of allow expression is not syntactically correct");
                attribute.type("boolean");
                attribute.is(true);
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("asyncSupported");
                attribute.description("Does this valve support async reporting.");
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
                attribute.name("deny");
                attribute.description("The deny expression");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("denyStatus");
                attribute.description("HTTP response status code that is used when rejecting denied request");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("denyValid");
                attribute.description("Becomes false if assigned value of deny expression is not syntactically correct");
                attribute.type("boolean");
                attribute.is(true);
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("invalidAuthenticationWhenDeny");
                attribute.description("Send an invalid authentication header instead of deny");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("stateName");
                attribute.description("The name of the LifecycleState that this component is currently in");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.operation(operation -> {
                operation.name("isAllowed");
                operation.description("Tests whether a client with this host name is allowed access by the current valve configuration");
                operation.impact("INFO");
                operation.returnType("boolean");
                operation.parameter(parameter -> {
                    parameter.name("hostName");
                    parameter.description("host name to be tested");
                    parameter.type("java.lang.String");
                });
            });
        });
        registry.add(managedBean -> {
            managedBean.name("RemoteIpValve");
            managedBean.description("Valve that sets client information (eg IP address) based on data from a trusted proxy");
            managedBean.domain("Catalina");
            managedBean.group("Valve");
            managedBean.type("org.apache.catalina.valves.RemoteIpValve");
            managedBean.attribute(attribute -> {
                attribute.name("asyncSupported");
                attribute.description("Does this valve support async reporting.");
                attribute.type("boolean");
                attribute.is(true);
            });
            managedBean.attribute(attribute -> {
                attribute.name("httpServerPort");
                attribute.description("Value returned by ServletRequest.getServerPort() when the protocolHeader indicates http protocol");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("httpsServerPort");
                attribute.description("Value returned by ServletRequest.getServerPort() when the protocolHeader indicates https protocol");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("internalProxies");
                attribute.description("Regular expression that matches IP addresses of internal proxies");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("protocolHeader");
                attribute.description("The protocol header (e.g. \"X-Forwarded-Proto\")");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("protocolHeaderHttpsValue");
                attribute.description("The value of the protocol header for incoming https request (e.g. \"https\")");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("proxiesHeader");
                attribute.description("The proxies header name (e.g. \"X-Forwarded-By\")");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("remoteIpHeader");
                attribute.description("The remote IP header name (e.g. \"X-Forwarded-For\")");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("stateName");
                attribute.description("The name of the LifecycleState that this component is currently in");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("trustedProxies");
                attribute.description("Regular expression that matches IP addresses of trusted proxies");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
        });
        registry.add(managedBean -> {
            managedBean.name("StuckThreadDetectionValve");
            managedBean.description("Detect long requests for which their thread might be stuck");
            managedBean.domain("Catalina");
            managedBean.group("Valve");
            managedBean.type("org.apache.catalina.valves.StuckThreadDetectionValve");
            managedBean.attribute(attribute -> {
                attribute.name("asyncSupported");
                attribute.description("Does this valve support async reporting.");
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
                attribute.name("stateName");
                attribute.description("The name of the LifecycleState that this component is currently in");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("stuckThreadCount");
                attribute.description("Count of the threads currently considered stuck");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("stuckThreadIds");
                attribute.description("IDs of the threads currently considered stuck. Each ID can then be used with the Threading MBean to retrieve data about it.");
                attribute.type("long[]");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("stuckThreadNames");
                attribute.description("Names of the threads currently considered stuck.");
                attribute.type("java.lang.String[]");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("threshold");
                attribute.description("Duration in seconds after which a request is considered as stuck");
                attribute.type("int");
            });
        });
    }
}
