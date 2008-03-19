/*
 * Copyright 2005-2007 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.security.ui.portlet;

import org.springframework.security.ui.preauth.PreAuthenticatedProcessingFilterEntryPoint;

/**
 * <p>In the case of relying on Portlet authentication to access Servlet resources
 * (such as embedded images or AJAX calls), the authentication should already
 * be in place by the time the security enforcement takes place.
 * So, if this class is ever called, then portlet-based authentication has
 * already failed.  Therefore the <code>commence</code> method in this case will
 * always return <code>HttpServletResponse.SC_FORBIDDEN</code> (HTTP 403 error).
 *
 * @see org.springframework.security.ui.ExceptionTranslationFilter
 * @author John A. Lewis
 * @since 2.0
 * @version $Id$
 */
public class PortletProcessingFilterEntryPoint extends PreAuthenticatedProcessingFilterEntryPoint {

}
