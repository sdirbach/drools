/*
 * Copyright 2015 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

package org.drools.workbench.models.guided.dtable.backend;

import org.drools.compiler.kie.builder.impl.FormatConverter;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuidedDecisionTableConverterTest {

    @Test
    public void testZeroParameterConstructor() {
        //A zero parameter is essential for programmatic instantiation from FormatsManager
        final FormatConverter converter = new GuidedDecisionTableConverter();
        assertNotNull( converter );
    }

}
