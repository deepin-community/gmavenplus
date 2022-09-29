/*
 * Copyright (C) 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.codehaus.gmavenplus.model;


/**
 * Scope access modifiers supported by Java.
 *
 * @author Keegan Witt
 * @since 1.0-beta-1
 */
public enum Scopes {

    /**
     * The public scope.
     */
    PUBLIC,

    /**
     * The protected scope.
     */
    PROTECTED,

    /**
     * The package scope.
     */
    PACKAGE,

    /**
     * The private scope.
     */
    PRIVATE

}
