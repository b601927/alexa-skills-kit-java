/*
 * Copyright 2016-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use
 * this file except in compliance with the License. A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0/
 *
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazon.speech.speechlet.services.householdlist.client;

import java.util.List;

public class AlexaListMetadata {

    private String listId;
    private String name;
    private ListState state;
    private long version;
    private List<Status> statusMap;

    public String getListId() {
        return listId;
    }

    public void setListId(String listId) {
        this.listId = listId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListState getState() {
        return state;
    }

    public void setState(ListState state) {
        this.state = state;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public void setStatusMap(List<Status> statusMap) {
        this.statusMap = statusMap;
    }

    public List<Status> getStatusMap() {
        return statusMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AlexaListMetadata that = (AlexaListMetadata) o;

        if (version != that.version) return false;
        if (listId != null ? !listId.equals(that.listId) : that.listId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (state != that.state) return false;
        return statusMap != null ? statusMap.equals(that.statusMap) : that.statusMap == null;
    }

    @Override
    public int hashCode() {
        int result = listId != null ? listId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (int) (version ^ (version >>> 32));
        result = 31 * result + (statusMap != null ? statusMap.hashCode() : 0);
        return result;
    }

}
