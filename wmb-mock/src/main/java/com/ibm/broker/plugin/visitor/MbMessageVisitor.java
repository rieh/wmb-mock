/**
 * Copyright 2012 Bob Browning
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ibm.broker.plugin.visitor;

import com.ibm.broker.plugin.PseudoNativeMbElement;
import com.ibm.broker.plugin.PseudoNativeMbMessage;

/**
 * @author Bob Browning <bob.browning@pressassociation.com>
 */
public interface MbMessageVisitor {
    void visit(PseudoNativeMbMessage message);

    void visit(PseudoNativeMbElement element);
}