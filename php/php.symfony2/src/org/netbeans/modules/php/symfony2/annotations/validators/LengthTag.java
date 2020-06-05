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
package org.netbeans.modules.php.symfony2.annotations.validators;

import org.netbeans.modules.csl.api.HtmlFormatter;
import org.netbeans.modules.php.spi.annotation.AnnotationCompletionTag;
import org.openide.util.NbBundle;

public class LengthTag extends AnnotationCompletionTag {

    public LengthTag() {
        super("Length", // NOI18N
                "@Length(min=${min}, max=${max}, charset=\"${charset}\", minMessage=\"${minMessage}\", maxMessage=\"${maxMessage}\", exactMessage=\"${exactMessage}\")", // NOI18N
                NbBundle.getMessage(LengthTag.class, "LengthTag.documentation"));
    }

    @Override
    public void formatParameters(HtmlFormatter formatter) {
        formatter.appendText("(min="); //NOI18N
        formatter.parameters(true);
        formatter.appendText("min"); //NOI18N
        formatter.parameters(false);
        formatter.appendText(", max="); //NOI18N
        formatter.parameters(true);
        formatter.appendText("max"); //NOI18N
        formatter.parameters(false);
        formatter.appendText(", charset="); //NOI18N
        formatter.parameters(true);
        formatter.appendText("\"charset\""); //NOI18N
        formatter.parameters(false);
        formatter.appendText(", minMessage="); //NOI18N
        formatter.parameters(true);
        formatter.appendText("\"minMessage\""); //NOI18N
        formatter.parameters(false);
        formatter.appendText(", maxMessage="); //NOI18N
        formatter.parameters(true);
        formatter.appendText("\"maxMessage\""); //NOI18N
        formatter.parameters(false);
        formatter.appendText(", meexactMessagessage="); //NOI18N
        formatter.parameters(true);
        formatter.appendText("\"exactMessage\""); //NOI18N
        formatter.parameters(false);
        formatter.appendText(")"); //NOI18N
    }

}
