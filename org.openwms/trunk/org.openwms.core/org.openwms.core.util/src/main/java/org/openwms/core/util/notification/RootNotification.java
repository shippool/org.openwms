/*
 * openwms.org, the Open Warehouse Management System.
 *
 * This file is part of openwms.org.
 *
 * openwms.org is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as 
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * openwms.org is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software. If not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.openwms.core.util.notification;

import java.io.Serializable;

/**
 * A RootNotification.
 * 
 * @author <a href="mailto:scherrer@openwms.org">Heiko Scherrer</a>
 * @version $Revision: $
 * @since 0.2
 */
public class RootNotification implements Serializable {

    private static final long serialVersionUID = -4057475097538283865L;
    protected Serializable data;

    /**
     * Constructs a RootNotification.
     * 
     * @param data
     *            Any serializable object to be transfered
     */
    public RootNotification(Serializable data) {
        this.data = data;
    }

    /**
     * The data that is transfered between notification sender and receiver.
     * 
     * @return The transfered, serializable data object
     */
    public Serializable getData() {
        return data;
    }

    /**
     * Returns a String representation of this RootNotification.
     * 
     * @return A a String representation of this RootNotification
     */
    @Override
    public String toString() {
        return getClass().getName() + "[data=" + data + "]";
    }
}