/**
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
package org.netbeans.modules.maven.model.settings;

import javax.xml.namespace.QName;
import org.netbeans.modules.xml.xam.dom.Attribute;

/**
 *
 * @author mkleint
 */
@Deprecated
public enum SettingsAttribute implements Attribute {
        NS("xmlns"),            // NOI18N // TMP
        ;
    
    private String name;
    private Class type;
    private Class subtype;
    
    /**
     * Creates a new instance of POMAttribute
     */
    SettingsAttribute(String name) {
        this(name, String.class);
    }
    
    SettingsAttribute(String name, Class type) {
        this(name, type, null);
    }
    
    SettingsAttribute(String name, Class type, Class subtype) {
        this.name = name;
        this.type = type;
        this.subtype = subtype;
    }
    
    @Override
    public String toString() { 
        return name; 
    }

    @Override
    public Class getType() {
        return type;
    }

    @Override
    public String getName() { 
        return name; 
    }

    @Override
    public Class getMemberType() { 
        return subtype; 
    }
    
    public QName getQName() {
        return new QName(SettingsQName.NS_URI, name);
    }
}
