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
 * Represents Actor field of {@link Event}.
 *
 * @author Mykola Morhun
 */
public class Actor {
    private String ID;
    Map<String,String> Attributes;

    public String getID() {
        return ID;
    }

    public Map<String, String> getAttributes() {
        return Attributes;
    }

    public Actor withID(String id) {
        this.ID = id;
        return this;
    }

    public Actor withAttributes(Map<String, String> attributes) {
        this.Attributes = attributes;
        return this;
    }

    @Override
    public String toString() {
        return "Actor{" +
               "ID='" + ID + '\'' +
               ", Attributes=" + Attributes +
               '}';
    }

}
