/*
 * Licensed to the University Corporation for Advanced Internet Development, 
 * Inc. (UCAID) under one or more contributor license agreements. See the 
 * NOTICE file distributed with this work for additional information regarding
 * copyright ownership. The UCAID licenses this file to You under the Apache 
 * License, Version 2.0 (the "License"); you may not use this file except in 
 * compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.shibboleth.idp.oidc.endpoints;

/**
 * Represents the initial login endpoint for openid connect.
 * This point, this class is very much silent as the endpoint
 * handling is done by Spring Security.
 */
public final class AuthorizeEndpoint {
    /** URL endpoint for authorization used to map requests. */
    public static final String URL = "/oidc/authorize";

    /**
     * Instantiates a new authZ endpoint.
     */
    private AuthorizeEndpoint() {}
}


