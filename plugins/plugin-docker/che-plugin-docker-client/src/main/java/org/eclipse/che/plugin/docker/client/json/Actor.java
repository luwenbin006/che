/*******************************************************************************
 * Copyright (c) 2012-2016 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - initial API and implementation
 *******************************************************************************/
package org.eclipse.che.plugin.docker.client.json;

import java.util.Map;

/**
 * Represents Actor field of {@link Event}.<br/>
 * Json example:
 * <pre>  {
 *    "ID": "1234567890abcdef",
 *    "Attributes": {
 *       "com.example.some-label": "some-label-value",
 *       "image": "some-image",
 *       "name": "some-container"
 *    }
 * }
 * </pre>
 *
 * @author Mykola Morhun
 */
public class Actor {
    private String             id;
    private Map<String,String> attributes;

    public String getId() {
        return id;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public Actor withId(String id) {
        this.id = id;
        return this;
    }

    public Actor withAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }

    @Override
    public String toString() {
        return "Actor{" +
               "id='" + id + '\'' +
               ", attributes=" + attributes +
               '}';
    }

}
