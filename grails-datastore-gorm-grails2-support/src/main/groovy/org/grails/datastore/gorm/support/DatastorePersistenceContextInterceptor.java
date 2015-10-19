/*
 * Copyright 2015 original authors
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
package org.grails.datastore.gorm.support;

import org.codehaus.groovy.grails.support.PersistenceContextInterceptor;
import org.grails.datastore.mapping.core.Datastore;

/**
 * Datastore persistence context interceptor for Grails 2.x
 *
 * @author Graeme Rocher
 * @since 5.0
 */

public class DatastorePersistenceContextInterceptor extends AbstractDatastorePersistenceContextInterceptor implements PersistenceContextInterceptor {
    public DatastorePersistenceContextInterceptor(Datastore datastore) {
        super(datastore);
    }
}
