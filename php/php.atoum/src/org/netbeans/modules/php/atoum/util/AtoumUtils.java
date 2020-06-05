/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.netbeans.modules.php.atoum.util;

import org.netbeans.api.annotations.common.CheckForNull;
import org.netbeans.modules.php.api.executable.PhpExecutableValidator;
import org.openide.util.NbBundle;

public final class AtoumUtils {

    private AtoumUtils() {
    }

    @NbBundle.Messages("AtoumUtils.atoum.label=atoum file")
    @CheckForNull
    public static String validateAtoumPath(String atoumPath) {
        return PhpExecutableValidator.validateCommand(atoumPath, Bundle.AtoumUtils_atoum_label());
    }

}
