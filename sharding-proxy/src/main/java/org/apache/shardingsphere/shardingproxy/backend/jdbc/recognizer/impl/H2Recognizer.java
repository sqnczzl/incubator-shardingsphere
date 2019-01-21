/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.shardingproxy.backend.jdbc.recognizer.impl;

import org.apache.shardingsphere.shardingproxy.backend.jdbc.recognizer.spi.JDBCURLRecognizer;

import java.util.Collection;
import java.util.Collections;

/**
 * JDBC URL recognizer for H2.
 *
 * @author zhangliang
 */
public final class H2Recognizer implements JDBCURLRecognizer {
    
    @Override
    public Collection<String> getURLPrefixes() {
        return Collections.singletonList("jdbc:h2:");
    }
    
    @Override
    public String getDriverClassName() {
        return "org.h2.Driver";
    }
}