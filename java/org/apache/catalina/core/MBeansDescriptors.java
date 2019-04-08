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
package org.apache.catalina.core;

import org.apache.tomcat.util.modeler.ManagedBeanRegistrar;
import org.apache.tomcat.util.modeler.ManagedBeanRegistry;

public class MBeansDescriptors implements ManagedBeanRegistrar {

    @Override
    public void registerManagedBeans(ManagedBeanRegistry registry) {
        registry.add(managedBean -> {
            managedBean.name("ApplicationFilterConfig");
            managedBean.description("Wrapper that represents an individual servlet-filter definition");
            managedBean.domain("Catalina");
            managedBean.group("Filter");
            managedBean.type("org.apache.catalina.core.ApplicationFilterConfig");
            managedBean.attribute(attribute -> {
                attribute.name("filterName");
                attribute.description("The name used to reference the filter in web.xml");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("filterClass");
                attribute.description("Fully qualified class name of the filter object");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("filterInitParameterMap");
                attribute.description("Return the initialization parameters associated with this filter");
                attribute.type("java.util.Map");
                attribute.writeable(false);
            });
        });
        registry.add(managedBean -> {
            managedBean.name("NamingContextListener");
            managedBean.description("Helper class used to initialize and populate the JNDI context associated with each context and server");
            managedBean.domain("Catalina");
            managedBean.group("Listener");
            managedBean.type("org.apache.catalina.core.NamingContextListener");
            managedBean.attribute(attribute -> {
                attribute.name("className");
                attribute.description("Fully qualified class name of the managed object");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("name");
                attribute.description("Name of the associated naming context");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
        });
        registry.add(managedBean -> {
            managedBean.name("StandardContext");
            managedBean.className("org.apache.catalina.mbeans.ContextMBean");
            managedBean.description("Standard Context Component");
            managedBean.domain("Catalina");
            managedBean.group("Context");
            managedBean.type("org.apache.catalina.core.StandardContext");
            managedBean.attribute(attribute -> {
                attribute.name("altDDName");
                attribute.description("The alternate deployment descriptor name.");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("antiResourceLocking");
                attribute.description("Take care to not lock resources");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("baseName");
                attribute.description("The base name used for directories, WAR files (with .war appended) and context.xml files (with .xml appended).");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("children");
                attribute.description("Object names of all children");
                attribute.type("[Ljavax.management.ObjectName;");
            });
            managedBean.attribute(attribute -> {
                attribute.name("clearReferencesRmiTargets");
                attribute.description("Should Tomcat look for memory leaks in RMI Targets and clear them if found as a work around for application coding errors?");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("clearReferencesStopThreads");
                attribute.description("Should Tomcat attempt to terminate threads that have been started by the web application? Advisable to be used only in a development environment.");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("clearReferencesStopTimerThreads");
                attribute.description("Should Tomcat attempt to terminate TimerThreads that have been started by the web application? Advisable to be used only in a development environment.");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("clearReferencesThreadLocals");
                attribute.description("Should Tomcat attempt to clear ThreadLocal variables that have been populated with classes loaded by the web application?");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("configFile");
                attribute.description("Location of the context.xml resource or file");
                attribute.type("java.net.URL");
            });
            managedBean.attribute(attribute -> {
                attribute.name("configured");
                attribute.description("The correctly configured flag for this Context.");
                attribute.type("boolean");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("cookies");
                attribute.description("Should we attempt to use cookies for session id communication?");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("crossContext");
                attribute.description("Should we allow the ServletContext.getContext() method to access the context of other web applications in this server?");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("defaultContextXml");
                attribute.description("Location of the default context.xml resource or file");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("defaultWebXml");
                attribute.description("Location of the default web.xml resource or file");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("delegate");
                attribute.description("");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("displayName");
                attribute.description("The display name of this web application");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("distributable");
                attribute.description("The distributable flag for this web application.");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("docBase");
                attribute.description("The document root for this web application");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("encodedPath");
                attribute.description("The encoded path");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("ignoreAnnotations");
                attribute.description("Ignore annotations flag.");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("instanceManager");
                attribute.description("Object that creates and destroys servlets, filters, and listeners. Include dependency injection and postConstruct/preDestroy handling");
                attribute.type("org.apache.tomcat.InstanceManager");
            });
            managedBean.attribute(attribute -> {
                attribute.name("javaVMs");
                attribute.description("The Java virtual machines on which this module is running");
                attribute.type("[Ljava.lang.String;");
            });
            managedBean.attribute(attribute -> {
                attribute.name("loader");
                attribute.description("Associated loader.");
                attribute.type("org.apache.catalina.Loader");
            });
            managedBean.attribute(attribute -> {
                attribute.name("logEffectiveWebXml");
                attribute.description("Should the effective web.xml be logged when the context starts?");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("logger");
                attribute.description("Associated logger.");
                attribute.type("org.apache.juli.logging.Log");
            });
            managedBean.attribute(attribute -> {
                attribute.name("managedResource");
                attribute.description("The managed resource this MBean is associated with");
                attribute.type("java.lang.Object");
            });
            managedBean.attribute(attribute -> {
                attribute.name("manager");
                attribute.description("Associated manager.");
                attribute.type("org.apache.catalina.Manager");
            });
            managedBean.attribute(attribute -> {
                attribute.name("mapperContextRootRedirectEnabled");
                attribute.description("Should the Mapper be used for context root redirects");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("mapperDirectoryRedirectEnabled");
                attribute.description("Should the Mapper be used for directory redirects");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("namingContextListener");
                attribute.description("Associated naming context listener.");
                attribute.type("org.apache.catalina.core.NamingContextListener");
            });
            managedBean.attribute(attribute -> {
                attribute.name("objectName");
                attribute.description("Name of the object");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("originalDocBase");
                attribute.description("The original document root for this web application");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("override");
                attribute.description("The default context.xml override flag for this web application");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("name");
                attribute.description("The name of this Context");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("parentClassLoader");
                attribute.description("Parent class loader.");
                attribute.type("java.lang.ClassLoader");
            });
            managedBean.attribute(attribute -> {
                attribute.name("path");
                attribute.description("The context path for this Context");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("paused");
                attribute.description("The request processing pause flag (while reloading occurs)");
                attribute.type("boolean");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("privileged");
                attribute.description("Access to tomcat internals");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("processingTime");
                attribute.description("Cumulative execution times of all servlets in this context");
                attribute.type("long");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("maxTime");
                attribute.description("Maximum execution time of all servlets in this context");
                attribute.type("long");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("minTime");
                attribute.description("Minimum execution time of all servlets in this context");
                attribute.type("long");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("requestCount");
                attribute.description("Cumulative request count of all servlets in this context");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("errorCount");
                attribute.description("Cumulative error count of all servlets in this context");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("publicId");
                attribute.description("The public identifier of the DTD for the web application deployment descriptor version that is being parsed");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("realm");
                attribute.description("Associated realm.");
                attribute.type("org.apache.catalina.Realm");
            });
            managedBean.attribute(attribute -> {
                attribute.name("reloadable");
                attribute.description("The reloadable flag for this web application");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("renewThreadsWhenStoppingContext");
                attribute.description("Should Tomcat renew the threads of the thread pool when the application is stopped to avoid memory leaks because of uncleaned ThreadLocal variables.");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("server");
                attribute.description("The J2EE Server this module is deployed on");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("sessionCookieName");
                attribute.description("The name to use for session cookies.'null' indicates that the name is controlled by the application.");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("sessionCookieDomain");
                attribute.description("The domain to use for session cookies.'null' indicates that the domain is controlled by the application.");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("sessionCookiePath");
                attribute.description("The path to use for session cookies.'null' indicates that the path is controlled by the application.");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("sessionTimeout");
                attribute.description("The session timeout (in minutes) for this web application");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("startTime");
                attribute.description("Time (in milliseconds since January 1, 1970, 00:00:00) when this context was started");
                attribute.type("long");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("startupTime");
                attribute.description("Time (in milliseconds) it took to start this context");
                attribute.type("long");
            });
            managedBean.attribute(attribute -> {
                attribute.name("stateName");
                attribute.description("The name of the LifecycleState that this component is currently in");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("swallowOutput");
                attribute.description("Flag to set to cause the system.out and system.err to be redirected to the logger when executing a servlet");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("tldScanTime");
                attribute.description("Time spend scanning jars for TLDs for this context");
                attribute.type("long");
            });
            managedBean.attribute(attribute -> {
                attribute.name("tldValidation");
                attribute.description("Should the parsing of *.tld files be performed by a validating parser?");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("unloadDelay");
                attribute.description("Amount of ms that the container will wait for servlets to unload");
                attribute.type("long");
            });
            managedBean.attribute(attribute -> {
                attribute.name("unpackWAR");
                attribute.description("Unpack WAR property");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("useHttpOnly");
                attribute.description("Indicates that session cookies should use HttpOnly");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("useNaming");
                attribute.description("Create a JNDI naming context for this application?");
                attribute.type("boolean");
                attribute.is(true);
            });
            managedBean.attribute(attribute -> {
                attribute.name("useRelativeRedirects");
                attribute.description("When generating location headers for 302 responses, should a relative URI be used?");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("webappVersion");
                attribute.description("The version of this web application - used in parallel deployment to differentiate different versions of the same web application");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("welcomeFiles");
                attribute.description("The welcome files for this context");
                attribute.type("[Ljava.lang.String;");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("workDir");
                attribute.description("The pathname to the work directory for this context");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("xmlValidation");
                attribute.description("Should the parsing of web.xml and web-fragment.xml files be performed by a validating parser?");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("xmlNamespaceAware");
                attribute.description("Should the parsing of web.xml and web-fragment.xml files be performed by a namespace aware parser?");
                attribute.type("boolean");
            });
            managedBean.operation(operation -> {
                operation.name("addApplicationListener");
                operation.description("Add a new Listener class name to the set of Listeners configured for this application.");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("listener");
                    parameter.description("Java class name of a listener class");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("addApplicationParameter");
                operation.description("Add a new application parameter for this application.");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("listener");
                    parameter.description("Java class name of a listener class");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("addChild");
                operation.description("Add a child to this Context");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("type");
                    parameter.description("Type(classname) of the new child to be added");
                    parameter.type("java.lang.String");
                });
                operation.parameter(parameter -> {
                    parameter.name("name");
                    parameter.description("Name of the child to be added");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("addLifecycleListener");
                operation.description("Add a lifecycle listener to this Context");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("type");
                    parameter.description("Type(classname) of the new lifecycle listener to be added");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("addLocaleEncodingMappingParameter");
                operation.description("Add a Locale Encoding Mapping");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("locale");
                    parameter.description("Locale to map an encoding for");
                    parameter.type("java.lang.String");
                });
                operation.parameter(parameter -> {
                    parameter.name("encoding");
                    parameter.description("Encoding to be used for a give locale");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("addMimeMapping");
                operation.description("Add a new MIME mapping, replacing any existing mapping for the specified extension.");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("extension");
                    parameter.description("Filename extension being mapped");
                    parameter.type("java.lang.String");
                });
                operation.parameter(parameter -> {
                    parameter.name("mimeType");
                    parameter.description("Corresponding MIME type");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("addParameter");
                operation.description("Add a new context initialization parameter, replacing any existing value for the specified name.");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("name");
                    parameter.description("Name of the new parameter");
                    parameter.type("java.lang.String");
                });
                operation.parameter(parameter -> {
                    parameter.name("value");
                    parameter.description("Value of the new parameter");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("addRoleMapping");
                operation.description("Add a security role reference for this web application.");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("role");
                    parameter.description("Security role used in the application");
                    parameter.type("java.lang.String");
                });
                operation.parameter(parameter -> {
                    parameter.name("link");
                    parameter.description("Actual security role to check for");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("addSecurityRole");
                operation.description("Add a new security role for this web application.");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("role");
                    parameter.description("New security role");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("addServletMapping");
                operation.description("Add a new servlet mapping, replacing any existing mapping for the specified pattern.");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("pattern");
                    parameter.description("URL pattern to be mapped");
                    parameter.type("java.lang.String");
                });
                operation.parameter(parameter -> {
                    parameter.name("name");
                    parameter.description("Name of the corresponding servlet to execute");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("addServletMapping");
                operation.description("Add a new servlet mapping, replacing any existing mapping for the specified pattern.");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("pattern");
                    parameter.description("URL pattern to be mapped");
                    parameter.type("java.lang.String");
                });
                operation.parameter(parameter -> {
                    parameter.name("name");
                    parameter.description("Name of the corresponding servlet to execute");
                    parameter.type("java.lang.String");
                });
                operation.parameter(parameter -> {
                    parameter.name("jspWildcard");
                    parameter.description("'true' if name identifies the JspServlet and pattern contains a wildcard; 'false' otherwise");
                    parameter.type("boolean");
                });
            });
            managedBean.operation(operation -> {
                operation.name("addValve");
                operation.description("Add a valve to this Context");
                operation.impact("ACTION");
                operation.returnType("java.lang.String");
                operation.parameter(parameter -> {
                    parameter.name("valveType");
                    parameter.description("Type(classname) of the new valve to be added");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("addWatchedResource");
                operation.description(" Add a resource which will be watched for reloading by the host auto deployer.");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("name");
                    parameter.description("Path to the resource, either absolute or relative to docBase");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("addWelcomeFile");
                operation.description("Add a new welcome file to the set recognized by this Context.");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("name");
                    parameter.description("New welcome file name");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("addWrapperLifecycle");
                operation.description("Add the classname of a LifecycleListener to be added to each Wrapper appended to this Context.");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("listener");
                    parameter.description("Java class name of a LifecycleListener class");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("addWrapperListener");
                operation.description("Add the classname of a ContainerListener to be added to each Wrapper appended to this Context.");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("listener");
                    parameter.description("Java class name of a ContainerListener class");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("destroy");
                operation.description("Destroy the context");
                operation.impact("ACTION");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("findApplicationListeners");
                operation.description("Return the set of application listener class names configured for this application.");
                operation.impact("INFO");
                operation.returnType("[Ljava.lang.String;");
            });
            managedBean.operation(operation -> {
                operation.name("findApplicationParameters");
                operation.description("Return the set of application parameters for this application.");
                operation.impact("INFO");
                operation.returnType("java.lang.String");
            });
            managedBean.operation(operation -> {
                operation.name("findConstraints");
                operation.description("Return the set of security constraints for this web application. If there are none, a zero-length array is returned.");
                operation.impact("INFO");
                operation.returnType("java.lang.String");
            });
            managedBean.operation(operation -> {
                operation.name("findContainerListenerNames");
                operation.description("Return the set of container listener class names configured for this application.");
                operation.impact("INFO");
                operation.returnType("[Ljava.lang.String;");
            });
            managedBean.operation(operation -> {
                operation.name("findErrorPage");
                operation.description("Return the error page entry for the specified HTTP error code, if any; otherwise return null");
                operation.impact("ACTION");
                operation.returnType("java.lang.String");
                operation.parameter(parameter -> {
                    parameter.name("errorCode");
                    parameter.description("Error code to look up");
                    parameter.type("int");
                });
            });
            managedBean.operation(operation -> {
                operation.name("findErrorPage");
                operation.description("Return the error page entry for the specified Java exception type, if any; otherwise return null.");
                operation.impact("ACTION");
                operation.returnType("java.lang.String");
                operation.parameter(parameter -> {
                    parameter.name("exceptionType");
                    parameter.description("Exception type to look up");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("findErrorPages");
                operation.description("Return the set of defined error pages for all specified error codes and exception types.");
                operation.impact("INFO");
                operation.returnType("[Ljava.lang.String;");
            });
            managedBean.operation(operation -> {
                operation.name("findFilterDef");
                operation.description("Return the filter definition for the specified filter name, if any; otherwise return null.");
                operation.impact("ACTION");
                operation.returnType("java.lang.String");
                operation.parameter(parameter -> {
                    parameter.name("exceptionType");
                    parameter.description("Exception type to look up");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("findFilterDefs");
                operation.description("Return the set of defined filters for this Context.");
                operation.impact("INFO");
                operation.returnType("[Ljava.lang.String;");
            });
            managedBean.operation(operation -> {
                operation.name("findFilterMaps");
                operation.description("Return the set of filter mappings for this Context.");
                operation.impact("INFO");
                operation.returnType("[Ljava.lang.String;");
            });
            managedBean.operation(operation -> {
                operation.name("findLifecycleListenerNames");
                operation.description("Return the set of lifecycle listener class names configured for this application.");
                operation.impact("INFO");
                operation.returnType("[Ljava.lang.String;");
            });
            managedBean.operation(operation -> {
                operation.name("findMimeMapping");
                operation.description("Return the MIME type to which the specified extension is mapped, if any; otherwise return null.");
                operation.impact("ACTION");
                operation.returnType("java.lang.String");
                operation.parameter(parameter -> {
                    parameter.name("extension");
                    parameter.description("Extension to map to a MIME type");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("findMimeMappings");
                operation.description("Return the extensions for which MIME mappings are defined.");
                operation.impact("ACTION");
                operation.returnType("[Ljava.lang.String;");
            });
            managedBean.operation(operation -> {
                operation.name("findParameter");
                operation.description("Return the value for the specified context initialization parameter name, if any; otherwise return null.");
                operation.impact("ACTION");
                operation.returnType("java.lang.String");
                operation.parameter(parameter -> {
                    parameter.name("name");
                    parameter.description("Name of the parameter to return");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("findParameters");
                operation.description("Return the names of all defined context initialization parameters for this Context.");
                operation.impact("ACTION");
                operation.returnType("[Ljava.lang.String;");
            });
            managedBean.operation(operation -> {
                operation.name("findRoleMapping");
                operation.description("For the given security role (as used by an application), return the corresponding role name (as defined by the underlying Realm) if there is one. Otherwise, return the specified role unchanged.");
                operation.impact("ACTION");
                operation.returnType("java.lang.String");
                operation.parameter(parameter -> {
                    parameter.name("role");
                    parameter.description("Security role to map");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("findSecurityRole");
                operation.description("Return 'true' if the specified security role is defined for this application; otherwise return 'false'.");
                operation.impact("ACTION");
                operation.returnType("boolean");
                operation.parameter(parameter -> {
                    parameter.name("role");
                    parameter.description("Security role to verify");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("findSecurityRoles");
                operation.description("Return the security roles defined for this application.");
                operation.impact("ACTION");
                operation.returnType("[Ljava.lang.String;");
            });
            managedBean.operation(operation -> {
                operation.name("findServletMapping");
                operation.description("Return the servlet name mapped by the specified pattern..");
                operation.impact("ACTION");
                operation.returnType("java.lang.String");
                operation.parameter(parameter -> {
                    parameter.name("pattern");
                    parameter.description("Pattern for which a mapping is requested");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("findServletMappings");
                operation.description("Return the patterns of all defined servlet mappings for this Context.");
                operation.impact("ACTION");
                operation.returnType("[Ljava.lang.String;");
            });
            managedBean.operation(operation -> {
                operation.name("findStatusPage");
                operation.description("Return the context-relative URI of the error page for the specified HTTP status code.");
                operation.impact("ACTION");
                operation.returnType("java.lang.String");
                operation.parameter(parameter -> {
                    parameter.name("status");
                    parameter.description("HTTP status code to look up");
                    parameter.type("int");
                });
            });
            managedBean.operation(operation -> {
                operation.name("findStatusPages");
                operation.description("Return the set of HTTP status codes for which error pages have been specified.");
                operation.impact("ACTION");
                operation.returnType("[Lint");
            });
            managedBean.operation(operation -> {
                operation.name("findWatchedResources");
                operation.description("Return the set of watched resources for this Context.");
                operation.impact("ACTION");
                operation.returnType("[Ljava.lang.String;");
            });
            managedBean.operation(operation -> {
                operation.name("findWelcomeFile");
                operation.description("Return 'true' if the specified welcome file is defined for this Context; otherwise return 'false'.");
                operation.impact("ACTION");
                operation.returnType("boolean");
                operation.parameter(parameter -> {
                    parameter.name("name");
                    parameter.description("Welcome file to verify");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("findWelcomeFiles");
                operation.description("Return the set of welcome files defined for this Context.");
                operation.impact("ACTION");
                operation.returnType("[Ljava.lang.String;");
            });
            managedBean.operation(operation -> {
                operation.name("findWrapperLifecycles");
                operation.description("Return the set of LifecycleListener classes that will be added to newly created Wrappers automatically.");
                operation.impact("ACTION");
                operation.returnType("[Ljava.lang.String;");
            });
            managedBean.operation(operation -> {
                operation.name("findWrapperListeners");
                operation.description("Return the set of ContainerListener classes that will be added to newly created Wrappers automatically.");
                operation.impact("ACTION");
                operation.returnType("[Ljava.lang.String;");
            });
            managedBean.operation(operation -> {
                operation.name("init");
                operation.description("Register the context into the running server");
                operation.impact("ACTION");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("start");
                operation.description("Start the context");
                operation.impact("ACTION");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("stop");
                operation.description("Stop the context");
                operation.impact("ACTION");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("reload");
                operation.description("Reload the web application");
                operation.impact("ACTION");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("removeApplicationListener");
                operation.description("Remove the specified application listener class from the set of listeners for this application.");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("listener");
                    parameter.description("Java class name of the listener to be removed");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("removeApplicationParameter");
                operation.description("Remove the application parameter with the specified name from the set for this application.");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("name");
                    parameter.description("Name of the application parameter to remove");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("removeChild");
                operation.description("Remove a child from this Context");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("name");
                    parameter.description("Name of the existing child Container to be removed");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("removeLifecycleListeners");
                operation.description("Removes lifecycle listeners of given class type from this Context");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("listener");
                    parameter.description("Type(classname) of the lifecycle listeners to be removed");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("removeMimeMapping");
                operation.description("Remove the MIME mapping for the specified extension, if it exists; otherwise, no action is taken..");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("extension");
                    parameter.description("Extension to remove the mapping for");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("removeParameter");
                operation.description("Remove the context initialization parameter with the specified name, if it exists; otherwise, no action is taken.");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("name");
                    parameter.description("Name of the parameter to remove");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("removeRoleMapping");
                operation.description("Remove any security role reference for the specified name");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("role");
                    parameter.description("Security role (as used in the application) to remove");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("removeSecurityRole");
                operation.description("Remove any security role with the specified name.");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("role");
                    parameter.description("Security role to remove");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("removeServletMapping");
                operation.description("Remove any servlet mapping for the specified pattern, if it exists; otherwise, no action is taken.");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("pattern");
                    parameter.description("URL pattern of the mapping to remove");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("removeValve");
                operation.description("Remove a valve from this Context");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("valveName");
                    parameter.description("Objectname of the valve to be removed");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("removeWatchedResource");
                operation.description("Remove the specified watched resource name from the list associated with this Context.");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("name");
                    parameter.description("Name of the watched resource to be removed");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("removeWelcomeFile");
                operation.description("Remove the specified welcome file name from the list recognized by this Context.");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("name");
                    parameter.description("Name of the welcome file to be removed");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("removeWrapperLifecycle");
                operation.description("Remove a class name from the set of LifecycleListener classes that will be added to newly created Wrappers.");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("listener");
                    parameter.description("Class name of a LifecycleListener class to be removed");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("removeWrapperListener");
                operation.description("Remove a class name from the set of ContainerListener classes that will be added to newly created Wrappers.");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("listener");
                    parameter.description("Class name of a ContainerListener class to be removed");
                    parameter.type("java.lang.String");
                });
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
        });
        registry.add(managedBean -> {
            managedBean.name("StandardContextValve");
            managedBean.description("Valve that implements the default basic behavior for the StandardContext container implementation");
            managedBean.domain("Catalina");
            managedBean.group("Valve");
            managedBean.type("org.apache.catalina.core.StandardContextValve");
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
                attribute.name("stateName");
                attribute.description("The name of the LifecycleState that this component is currently in");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
        });
        registry.add(managedBean -> {
            managedBean.name("StandardEngine");
            managedBean.className("org.apache.catalina.mbeans.ContainerMBean");
            managedBean.description("Standard Engine Component");
            managedBean.domain("Catalina");
            managedBean.group("Engine");
            managedBean.type("org.apache.catalina.core.StandardEngine");
            managedBean.attribute(attribute -> {
                attribute.name("backgroundProcessorDelay");
                attribute.description("The processor delay for this component.");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("catalinaBase");
                attribute.description("Base (instance) directory for this Engine, typically same as catalina.base system property");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("defaultHost");
                attribute.description("Name of the default Host for this Engine");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("jvmRoute");
                attribute.description("Route used for load balancing");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("managedResource");
                attribute.description("The managed resource this MBean is associated with");
                attribute.type("java.lang.Object");
            });
            managedBean.attribute(attribute -> {
                attribute.name("name");
                attribute.description("Unique name of this Engine");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("realm");
                attribute.description("Associated realm.");
                attribute.type("org.apache.catalina.Realm");
            });
            managedBean.attribute(attribute -> {
                attribute.name("startChildren");
                attribute.description("Will children be started automatically when they are added.");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("startStopThreads");
                attribute.description("The number of threads to use when starting and stopping child Hosts");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("stateName");
                attribute.description("The name of the LifecycleState that this component is currently in");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.operation(operation -> {
                operation.name("addChild");
                operation.description("Add a virtual host");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("type");
                    parameter.description("Type(classname) of the new child to be added");
                    parameter.type("java.lang.String");
                });
                operation.parameter(parameter -> {
                    parameter.name("name");
                    parameter.description("Name of the child to be added");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("addLifecycleListener");
                operation.description("Add a lifecycle listener to this Engine");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("type");
                    parameter.description("Type(classname) of the new lifecycle listener to be added");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("addValve");
                operation.description("Add a valve to this Engine");
                operation.impact("ACTION");
                operation.returnType("java.lang.String");
                operation.parameter(parameter -> {
                    parameter.name("valveType");
                    parameter.description("Type(classname) of the new valve to be added");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("destroy");
                operation.description("Destroy");
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
                operation.name("removeChild");
                operation.description("Remove a child(Host) from this Engine");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("name");
                    parameter.description("Name of the existing child Container to be removed");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("removeLifecycleListeners");
                operation.description("Removes lifecycle listeners of given class type from this Engine");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("listener");
                    parameter.description("Type(classname) of the lifecycle listeners to be removed");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("removeValve");
                operation.description("Remove a valve from this Engine");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("valveName");
                    parameter.description("Objectname of the valve to be removed");
                    parameter.type("java.lang.String");
                });
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
        });
        registry.add(managedBean -> {
            managedBean.name("StandardEngineValve");
            managedBean.description("Valve that implements the default basic behavior for the StandardEngine container implementation");
            managedBean.domain("Catalina");
            managedBean.group("Valve");
            managedBean.type("org.apache.catalina.core.StandardEngineValve");
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
                attribute.name("stateName");
                attribute.description("The name of the LifecycleState that this component is currently in");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
        });
        registry.add(managedBean -> {
            managedBean.name("StandardHost");
            managedBean.className("org.apache.catalina.mbeans.ContainerMBean");
            managedBean.description("Standard Host Component");
            managedBean.domain("Catalina");
            managedBean.group("Host");
            managedBean.type("org.apache.catalina.core.StandardHost");
            managedBean.attribute(attribute -> {
                attribute.name("aliases");
                attribute.description("Host aliases");
                attribute.type("[Ljava.lang.String;");
            });
            managedBean.attribute(attribute -> {
                attribute.name("appBase");
                attribute.description("The application root for this Host");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("autoDeploy");
                attribute.description("The auto deploy flag for this Host");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("backgroundProcessorDelay");
                attribute.description("The processor delay for this component.");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("children");
                attribute.description("Object names of all children");
                attribute.type("[Ljavax.management.ObjectName;");
            });
            managedBean.attribute(attribute -> {
                attribute.name("configClass");
                attribute.description("The configuration class for contexts");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("contextClass");
                attribute.description("The Java class name of the default Context implementation class for deployed web applications.");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("copyXML");
                attribute.description("Should XML files be copied to $CATALINA_BASE/conf/{engine}/{host} by default when a web application is deployed?");
                attribute.type("boolean");
                attribute.is(true);
            });
            managedBean.attribute(attribute -> {
                attribute.name("createDirs");
                attribute.description("Should we create directories upon startup for appBase and xmlBase? ");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("deployIgnore");
                attribute.description("Paths within appBase ignored for automatic deployment");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("deployOnStartup");
                attribute.description("The deploy on startup flag for this Host");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("deployXML");
                attribute.description("deploy Context XML config files property");
                attribute.type("boolean");
                attribute.is(true);
            });
            managedBean.attribute(attribute -> {
                attribute.name("errorReportValveClass");
                attribute.description("The Java class name of the default error reporter implementation class for deployed web applications.");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("managedResource");
                attribute.description("The managed resource this MBean is associated with");
                attribute.type("java.lang.Object");
            });
            managedBean.attribute(attribute -> {
                attribute.name("name");
                attribute.description("Unique name of this Host");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("realm");
                attribute.description("Associated realm.");
                attribute.type("org.apache.catalina.Realm");
            });
            managedBean.attribute(attribute -> {
                attribute.name("startChildren");
                attribute.description("Will children be started automatically when they are added?");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("startStopThreads");
                attribute.description("The number of threads to use when starting, stopping and deploying child Contexts");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("stateName");
                attribute.description("The name of the LifecycleState that this component is currently in");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("undeployOldVersions");
                attribute.description("Determines if old versions of applications deployed using parallel deployment are automatically undeployed when no longer used. Requires autoDeploy to be enabled.");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("unpackWARs");
                attribute.description("Unpack WARs property");
                attribute.type("boolean");
                attribute.is(true);
            });
            managedBean.attribute(attribute -> {
                attribute.name("valveNames");
                attribute.description("Return the MBean Names of the Valves associated with this Host");
                attribute.type("[Ljava.lang.String;");
            });
            managedBean.attribute(attribute -> {
                attribute.name("workDir");
                attribute.description("Work Directory base for applications");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("xmlBase");
                attribute.description("The XML root for this Host.");
                attribute.type("java.lang.String");
            });
            managedBean.operation(operation -> {
                operation.name("addAlias");
                operation.description("Add an alias name that should be mapped to this Host");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("alias");
                    parameter.description("The alias to be added");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("addChild");
                operation.description("Add a child(Context) to this Host");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("type");
                    parameter.description("Type(classname) of the new child to be added");
                    parameter.type("java.lang.String");
                });
                operation.parameter(parameter -> {
                    parameter.name("name");
                    parameter.description("Name of the child to be added");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("addLifecycleListener");
                operation.description("Add a lifecycle listener to this Host");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("type");
                    parameter.description("Type(classname) of the new lifecycle listener to be added");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("addValve");
                operation.description("Add a valve to this Host");
                operation.impact("ACTION");
                operation.returnType("java.lang.String");
                operation.parameter(parameter -> {
                    parameter.name("valveType");
                    parameter.description("Type(classname) of the new valve to be added");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("destroy");
                operation.description("Destroy");
                operation.impact("ACTION");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("findAliases");
                operation.description("Return the set of alias names for this Host");
                operation.impact("INFO");
                operation.returnType("[Ljava.lang.String;");
            });
            managedBean.operation(operation -> {
                operation.name("findReloadedContextMemoryLeaks");
                operation.description("Provide a list of contexts that have leaked memory on reload. This will attempt to force a full garbage collection. Use with extreme caution on production systems.");
                operation.impact("ACTION");
                operation.returnType("[Ljava.lang.String;");
            });
            managedBean.operation(operation -> {
                operation.name("init");
                operation.description("Init");
                operation.impact("ACTION");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("removeAlias");
                operation.description("Remove the specified alias name from the aliases for this Host");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("alias");
                    parameter.description("Alias name to be removed");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("removeChild");
                operation.description("Remove a child(Context) from this Host");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("name");
                    parameter.description("Name of the existing child Container to be removed");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("removeLifecycleListeners");
                operation.description("Removes lifecycle listeners of given class type from this Host");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("listener");
                    parameter.description("Type(classname) of the lifecycle listeners to be removed");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("removeValve");
                operation.description("Remove a valve from this Host");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("valveName");
                    parameter.description("Objectname of the valve to be removed");
                    parameter.type("java.lang.String");
                });
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
        });
        registry.add(managedBean -> {
            managedBean.name("StandardHostValve");
            managedBean.description("Valve that implements the default basic behavior for the StandardHost container implementation");
            managedBean.domain("Catalina");
            managedBean.group("Valve");
            managedBean.type("org.apache.catalina.core.StandardHostValve");
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
                attribute.name("stateName");
                attribute.description("The name of the LifecycleState that this component is currently in");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
        });
        registry.add(managedBean -> {
            managedBean.name("StandardServer");
            managedBean.description("Standard Server Component");
            managedBean.domain("Catalina");
            managedBean.group("Server");
            managedBean.type("org.apache.catalina.core.StandardServer");
            managedBean.attribute(attribute -> {
                attribute.name("address");
                attribute.description("The address on which we wait for shutdown commands.");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("managedResource");
                attribute.description("The managed resource this MBean is associated with");
                attribute.type("java.lang.Object");
            });
            managedBean.attribute(attribute -> {
                attribute.name("port");
                attribute.description("TCP port (excluding any offset) for shutdown messages");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("portOffset");
                attribute.description("The offset applied to port and to the port attributes of any nested connectors");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("portWithOffset");
                attribute.description("Actual TCP port (including any offset) for shutdown messages");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("serverInfo");
                attribute.description("Tomcat server release identifier");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("serverBuilt");
                attribute.description("Tomcat server built timestamp");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("serverNumber");
                attribute.description("Tomcat server's version number");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("serviceNames");
                attribute.description("Object names of all services we know about");
                attribute.type("[Ljavax.management.ObjectName;");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("shutdown");
                attribute.description("Shutdown password");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("stateName");
                attribute.description("The name of the LifecycleState that this component is currently in");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.operation(operation -> {
                operation.name("await");
                operation.description("Wait for the shutdown message");
                operation.impact("ACTION");
                operation.returnType("void");
            });
            managedBean.operation(operation -> {
                operation.name("storeConfig");
                operation.description("Save current state to server.xml file");
                operation.impact("ACTION");
                operation.returnType("void");
            });
        });
        registry.add(managedBean -> {
            managedBean.name("StandardService");
            managedBean.className("org.apache.catalina.mbeans.ServiceMBean");
            managedBean.description("Standard Service Component");
            managedBean.domain("Catalina");
            managedBean.group("Service");
            managedBean.type("org.apache.catalina.core.StandardService");
            managedBean.attribute(attribute -> {
                attribute.name("connectorNames");
                attribute.description("ObjectNames of the connectors");
                attribute.type("[Ljavax.management.ObjectName;");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("managedResource");
                attribute.description("The managed resource this MBean is associated with");
                attribute.type("java.lang.Object");
            });
            managedBean.attribute(attribute -> {
                attribute.name("name");
                attribute.description("Unique name of this Service");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("stateName");
                attribute.description("The name of the LifecycleState that this component is currently in");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.operation(operation -> {
                operation.name("addConnector");
                operation.description("Add a new connector");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("address");
                    parameter.description("The IP address on which to bind");
                    parameter.type("java.lang.String");
                });
                operation.parameter(parameter -> {
                    parameter.name("port");
                    parameter.description("TCP port number to listen on");
                    parameter.type("int");
                });
                operation.parameter(parameter -> {
                    parameter.name("isAjp");
                    parameter.description("Create a AJP/1.3 Connector");
                    parameter.type("boolean");
                });
                operation.parameter(parameter -> {
                    parameter.name("isSSL");
                    parameter.description("Create a secure Connector");
                    parameter.type("boolean");
                });
            });
            managedBean.operation(operation -> {
                operation.name("addExecutor");
                operation.description("Adds a named executor to the service");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("type");
                    parameter.description("Classname of the Executor to be added");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("findConnectors");
                operation.description("Find and return the set of Connectors associated with this Service");
                operation.impact("ACTION");
                operation.returnType("[Ljava.lang.String;");
            });
            managedBean.operation(operation -> {
                operation.name("findExecutors");
                operation.description("Retrieves all executors");
                operation.impact("ACTION");
                operation.returnType("[Ljava.lang.String;");
            });
            managedBean.operation(operation -> {
                operation.name("getExecutor");
                operation.description("Retrieves executor by name");
                operation.impact("ACTION");
                operation.returnType("java.lang.String");
                operation.parameter(parameter -> {
                    parameter.name("name");
                    parameter.description("Name of the executor to be retrieved");
                    parameter.type("java.lang.String");
                });
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
        });
        registry.add(managedBean -> {
            managedBean.name("StandardThreadExecutor");
            managedBean.description("Standard implementation of a thread pool");
            managedBean.domain("Catalina");
            managedBean.group("Executor");
            managedBean.type("org.apache.catalina.core.StandardThreadExecutor");
            managedBean.attribute(attribute -> {
                attribute.name("activeCount");
                attribute.description("Number of threads currently processing a task");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("completedTaskCount");
                attribute.description("Number of tasks completed by the executor");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("corePoolSize");
                attribute.description("Core size of the thread pool");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("daemon");
                attribute.description("Run threads in daemon or non-daemon state?");
                attribute.type("boolean");
                attribute.is(true);
            });
            managedBean.attribute(attribute -> {
                attribute.name("largestPoolSize");
                attribute.description("Peak number of threads");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("maxIdleTime");
                attribute.description("Max number of milliseconds a thread can be idle before it can be shutdown");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("maxQueueSize");
                attribute.description("Maximum number of tasks for the pending task queue");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("maxThreads");
                attribute.description("Maximum number of allocated threads");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("minSpareThreads");
                attribute.description("Minimum number of allocated threads");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("name");
                attribute.description("Unique name of this Executor");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("namePrefix");
                attribute.description("Name prefix for thread names created by this executor");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("poolSize");
                attribute.description("Number of threads in the pool");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("prestartminSpareThreads");
                attribute.description("Prestart threads?");
                attribute.type("boolean");
                attribute.is(true);
            });
            managedBean.attribute(attribute -> {
                attribute.name("queueSize");
                attribute.description("Number of tasks waiting to be processed");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("stateName");
                attribute.description("The name of the LifecycleState that this component is currently in");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("threadPriority");
                attribute.description("The thread priority for threads in this thread pool");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("threadRenewalDelay");
                attribute.description("After a context is stopped, threads in the pool are renewed. To avoid renewing all threads at the same time, this delay is observed between 2 threads being renewed. Value is in ms, default value is 1000ms. If negative, threads are not renewed.");
                attribute.type("long");
            });
        });
        registry.add(managedBean -> {
            managedBean.name("StandardWrapper");
            managedBean.className("org.apache.catalina.mbeans.ContainerMBean");
            managedBean.description("Wrapper that represents an individual servlet definition");
            managedBean.domain("Catalina");
            managedBean.group("Wrapper");
            managedBean.type("org.apache.catalina.core.StandardWrapper");
            managedBean.attribute(attribute -> {
                attribute.name("asyncSupported");
                attribute.description("Async support");
                attribute.type("boolean");
                attribute.is(true);
            });
            managedBean.attribute(attribute -> {
                attribute.name("available");
                attribute.description("The date and time at which this servlet will become available (in milliseconds since the epoch), or zero if the servlet is available. If this value equals Long.MAX_VALUE, the unavailability of this servlet is considered permanent.");
                attribute.type("long");
            });
            managedBean.attribute(attribute -> {
                attribute.name("backgroundProcessorDelay");
                attribute.description("The processor delay for this component.");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("classLoadTime");
                attribute.description("Time taken to load the Servlet class");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("countAllocated");
                attribute.description("The count of allocations that are currently active (even if they are for the same instance, as will be true on a non-STM servlet).");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("errorCount");
                attribute.description("Error count");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("loadOnStartup");
                attribute.description("The load-on-startup order value (negative value means load on first call) for this servlet.");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("loadTime");
                attribute.description("Time taken to load and initialise the Servlet");
                attribute.type("long");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("maxTime");
                attribute.description("Maximum processing time of a request");
                attribute.type("long");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("maxInstances");
                attribute.description("Maximum number of STM instances.");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("minTime");
                attribute.description("Minimum processing time of a request");
                attribute.type("long");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("objectName");
                attribute.description("Name of the object");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("processingTime");
                attribute.description("Total execution time of the servlet's service method");
                attribute.type("long");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("requestCount");
                attribute.description("Number of requests processed by this wrapper");
                attribute.type("int");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("runAs");
                attribute.description("The run-as identity for this servlet.");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("servletClass");
                attribute.description("The run-as identity for this servlet.");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("singleThreadModel");
                attribute.description("Does this servlet implement the SingleThreadModel interface?");
                attribute.type("java.lang.Boolean");
                attribute.is(true);
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("stateName");
                attribute.description("The name of the LifecycleState that this component is currently in");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.operation(operation -> {
                operation.name("addInitParameter");
                operation.description("Add a valve to this Wrapper");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("name");
                    parameter.description("Name of this initialization parameter to add");
                    parameter.type("java.lang.String");
                });
                operation.parameter(parameter -> {
                    parameter.name("value");
                    parameter.description("Value of this initialization parameter to add");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("addLifecycleListener");
                operation.description("Add a lifecycle listener to this Wrapper");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("type");
                    parameter.description("Type(classname) of the new lifecycle listener to be added");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("addMapping");
                operation.description("Add a mapping associated with the Wrapper.");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("mapping");
                    parameter.description("The new wrapper mapping");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("addSecurityReference");
                operation.description("Add a new security role reference record to the set of records for this servlet.");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("name");
                    parameter.description("Role name used within this servlet");
                    parameter.type("java.lang.String");
                });
                operation.parameter(parameter -> {
                    parameter.name("link");
                    parameter.description("Role name used within the web application");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("addValve");
                operation.description("Add a valve to this Wrapper");
                operation.impact("ACTION");
                operation.returnType("java.lang.String");
                operation.parameter(parameter -> {
                    parameter.name("valveType");
                    parameter.description("Type(classname) of the new valve to be added");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("findInitParameter");
                operation.description("Return the value of an initialization parameter");
                operation.impact("ACTION");
                operation.returnType("java.lang.String");
                operation.parameter(parameter -> {
                    parameter.name("name");
                    parameter.description("The name of the initialization parameter");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("findInitParameters");
                operation.description("Return the names of all defined initialization parameters for this servlet.");
                operation.impact("INFO");
                operation.returnType("[Ljava.lang.String;");
            });
            managedBean.operation(operation -> {
                operation.name("findMappings");
                operation.description("Return the mappings associated with this wrapper");
                operation.impact("INFO");
                operation.returnType("[Ljava.lang.String;");
            });
            managedBean.operation(operation -> {
                operation.name("findMappingObject");
                operation.description("Return an object which may be utilized for mapping to this component");
                operation.impact("INFO");
                operation.returnType("org.apache.catalina.Wrapper");
            });
            managedBean.operation(operation -> {
                operation.name("findSecurityReference");
                operation.description("Return the security role link for the specified security role reference name.");
                operation.impact("ACTION");
                operation.returnType("java.lang.String");
                operation.parameter(parameter -> {
                    parameter.name("name");
                    parameter.description("Security role reference used within this servlet");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("findSecurityReferences");
                operation.description("Return the set of security role reference names associated with this servlet");
                operation.impact("INFO");
                operation.returnType("[Ljava.lang.String;");
            });
            managedBean.operation(operation -> {
                operation.name("removeInitParameter");
                operation.description("Remove the specified initialization parameter from this servlet.");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("name");
                    parameter.description("Name of the initialization parameter to remove");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("removeLifecycleListeners");
                operation.description("Removes lifecycle listeners of given class type from this Wrapper");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("listener");
                    parameter.description("Type(classname) of the lifecycle listeners to be removed");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("removeMapping");
                operation.description("Remove a mapping associated with the wrapper.");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("mapping");
                    parameter.description("The pattern to remove");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("removeSecurityReference");
                operation.description("Remove any security role reference for the specified role name.");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("name");
                    parameter.description("Security role used within this servlet to be removed");
                    parameter.type("java.lang.String");
                });
            });
            managedBean.operation(operation -> {
                operation.name("removeValve");
                operation.description("Remove a valve from this Wrapper");
                operation.impact("ACTION");
                operation.returnType("void");
                operation.parameter(parameter -> {
                    parameter.name("valveName");
                    parameter.description("Objectname of the valve to be removed");
                    parameter.type("java.lang.String");
                });
            });
        });
        registry.add(managedBean -> {
            managedBean.name("StandardWrapperValve");
            managedBean.description("Valve that implements the default basic behavior for the StandardWrapper container implementation");
            managedBean.domain("Catalina");
            managedBean.group("Valve");
            managedBean.type("org.apache.catalina.core.StandardWrapperValve");
            managedBean.attribute(attribute -> {
                attribute.name("asyncSupported");
                attribute.description("Does this valve support async reporting?");
                attribute.type("boolean");
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
        });
    }
}
