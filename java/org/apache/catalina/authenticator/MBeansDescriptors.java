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
package org.apache.catalina.authenticator;

import org.apache.tomcat.util.modeler.ManagedBeanRegistrar;
import org.apache.tomcat.util.modeler.ManagedBeanRegistry;

public class MBeansDescriptors implements ManagedBeanRegistrar {

    @Override
    public void registerManagedBeans(ManagedBeanRegistry registry) {
        registry.add(managedBean -> {
            managedBean.name("BasicAuthenticator");
            managedBean.description("An Authenticator and Valve implementation of HTTP BASIC Authentication");
            managedBean.domain("Catalina");
            managedBean.group("Valve");
            managedBean.type("org.apache.catalina.authenticator.BasicAuthenticator");
            managedBean.attribute(attribute -> {
                attribute.name("alwaysUseSession");
                attribute.description("Should a session always be used once a user is authenticated?");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("cache");
                attribute.description("Should we cache authenticated Principals if the request is part of an HTTP session?");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("changeSessionIdOnAuthentication");
                attribute.description("Controls if the session ID is changed if a session exists at the point where users are authenticated");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("className");
                attribute.description("Fully qualified class name of the managed object");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("disableProxyCaching");
                attribute.description("Controls the caching of pages that are protected by security constraints");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("securePagesWithPragma");
                attribute.description("Controls the caching of pages that are protected by security constraints");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("secureRandomAlgorithm");
                attribute.description("The name of the algorithm to use for SSO session ID generation");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("secureRandomClass");
                attribute.description("The name of the class to use for SSO session ID generation");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("secureRandomProvider");
                attribute.description("The name of the provider to use for SSO session ID generation");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("stateName");
                attribute.description("The name of the LifecycleState that this component is currently in");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("trimCredentials");
                attribute.description("Controls whether leading and/or trailing whitespace is removed from the parsed credentials");
                attribute.type("boolean");
            });
        });
        registry.add(managedBean -> {
            managedBean.name("DigestAuthenticator");
            managedBean.description("An Authenticator and Valve implementation of HTTP DIGEST Authentication");
            managedBean.domain("Catalina");
            managedBean.group("Valve");
            managedBean.type("org.apache.catalina.authenticator.DigestAuthenticator");
            managedBean.attribute(attribute -> {
                attribute.name("alwaysUseSession");
                attribute.description("Should a session always be used once a user is authenticated?");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("cache");
                attribute.description("Should we cache authenticated Principals if the request is part of an HTTP session?");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("changeSessionIdOnAuthentication");
                attribute.description("Controls if the session ID is changed if a session exists at the point where users are authenticated");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("className");
                attribute.description("Fully qualified class name of the managed object");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("cnonceCacheSize");
                attribute.description("The size of the cnonce cache used to prevent replay attacks");
                attribute.type("int");
            });
            managedBean.attribute(attribute -> {
                attribute.name("disableProxyCaching");
                attribute.description("Controls the caching of pages that are protected by security constraints");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("key");
                attribute.description("The secret key used by digest authentication");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("nonceValidity");
                attribute.description("The time, in milliseconds, for which a server issued nonce will be valid");
                attribute.type("long");
            });
            managedBean.attribute(attribute -> {
                attribute.name("opaque");
                attribute.description("The opaque server string used by digest authentication");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("securePagesWithPragma");
                attribute.description("Controls the caching of pages that are protected by security constraints");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("secureRandomAlgorithm");
                attribute.description("The name of the algorithm to use for SSO session ID generation");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("secureRandomClass");
                attribute.description("The name of the class to use for SSO session ID generation");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("secureRandomProvider");
                attribute.description("The name of the provider to use for SSO session ID generation");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("stateName");
                attribute.description("The name of the LifecycleState that this component is currently in");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("validateUri");
                attribute.description("Should the uri be validated as required by RFC2617?");
                attribute.type("boolean");
            });
        });
        registry.add(managedBean -> {
            managedBean.name("FormAuthenticator");
            managedBean.description("An Authenticator and Valve implementation of FORM BASED Authentication");
            managedBean.domain("Catalina");
            managedBean.group("Valve");
            managedBean.type("org.apache.catalina.authenticator.FormAuthenticator");
            managedBean.attribute(attribute -> {
                attribute.name("changeSessionIdOnAuthentication");
                attribute.description("Controls if the session ID is changed if a session exists at the point where users are authenticated");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("characterEncoding");
                attribute.description("Character encoding to use to read the username and password parameters from the request");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("className");
                attribute.description("Fully qualified class name of the managed object");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("disableProxyCaching");
                attribute.description("Controls the caching of pages that are protected by security constraints");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("landingPage");
                attribute.description("Controls the behavior of the FORM authentication process if the process is misused, for example by directly requesting the login page or delaying logging in for so long that the session expires");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("securePagesWithPragma");
                attribute.description("Controls the caching of pages that are protected by security constraints");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("secureRandomAlgorithm");
                attribute.description("The name of the algorithm to use for SSO session ID generation");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("secureRandomClass");
                attribute.description("The name of the class to use for SSO session ID generation");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("secureRandomProvider");
                attribute.description("The name of the provider to use for SSO session ID generation");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("stateName");
                attribute.description("The name of the LifecycleState that this component is currently in");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
        });
        registry.add(managedBean -> {
            managedBean.name("NonLoginAuthenticator");
            managedBean.description("An Authenticator and Valve implementation that checks only security constraints not involving user authentication");
            managedBean.domain("Catalina");
            managedBean.group("Valve");
            managedBean.type("org.apache.catalina.authenticator.NonLoginAuthenticator");
            managedBean.attribute(attribute -> {
                attribute.name("cache");
                attribute.description("Should we cache authenticated Principals if the request is part of an HTTP session?");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("changeSessionIdOnAuthentication");
                attribute.description("Controls if the session ID is changed if a session exists at the point where users are authenticated");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("className");
                attribute.description("Fully qualified class name of the managed object");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("disableProxyCaching");
                attribute.description("Controls the caching of pages that are protected by security constraints");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("securePagesWithPragma");
                attribute.description("Controls the caching of pages that are protected by security constraints");
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
            managedBean.name("SingleSignOn");
            managedBean.description("A Valve that supports a 'single signon' user experience");
            managedBean.domain("Catalina");
            managedBean.group("Valve");
            managedBean.type("org.apache.catalina.authenticator.SingleSignOn");
            managedBean.attribute(attribute -> {
                attribute.name("className");
                attribute.description("Fully qualified class name of the managed object");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("requireReauthentication");
                attribute.description("Should we attempt to reauthenticate each request against the security Realm?");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("cookieDomain");
                attribute.description("(Optional) Domain to be used by sso cookies");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("stateName");
                attribute.description("The name of the LifecycleState that this component is currently in");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
        });
        registry.add(managedBean -> {
            managedBean.name("SSLAuthenticator");
            managedBean.description("An Authenticator and Valve implementation of authentication that utilizes SSL certificates to identify client users");
            managedBean.domain("Catalina");
            managedBean.group("Valve");
            managedBean.type("org.apache.catalina.authenticator.SSLAuthenticator");
            managedBean.attribute(attribute -> {
                attribute.name("cache");
                attribute.description("Should we cache authenticated Principals if the request is part of an HTTP session?");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("changeSessionIdOnAuthentication");
                attribute.description("Controls if the session ID is changed if a session exists at the point where users are authenticated");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("className");
                attribute.description("Fully qualified class name of the managed object");
                attribute.type("java.lang.String");
                attribute.writeable(false);
            });
            managedBean.attribute(attribute -> {
                attribute.name("disableProxyCaching");
                attribute.description("Controls the caching of pages that are protected by security constraints");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("securePagesWithPragma");
                attribute.description("Controls the caching of pages that are protected by security constraints");
                attribute.type("boolean");
            });
            managedBean.attribute(attribute -> {
                attribute.name("secureRandomAlgorithm");
                attribute.description("The name of the algorithm to use for SSO session ID generation");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("secureRandomClass");
                attribute.description("The name of the class to use for SSO session ID generation");
                attribute.type("java.lang.String");
            });
            managedBean.attribute(attribute -> {
                attribute.name("secureRandomProvider");
                attribute.description("The name of the provider to use for SSO session ID generation");
                attribute.type("java.lang.String");
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
