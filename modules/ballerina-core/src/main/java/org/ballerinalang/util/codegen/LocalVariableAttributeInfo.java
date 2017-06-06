/*
*  Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing,
*  software distributed under the License is distributed on an
*  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
*  KIND, either express or implied.  See the License for the
*  specific language governing permissions and limitations
*  under the License.
*/
package org.ballerinalang.util.codegen;

/**
 * {@code LocalVariableAttributeInfo} contains common metadata of parameters
 * of a Ballerina function/resource/action in the program file.
 *
 * @since 0.88
 */
public class LocalVariableAttributeInfo implements AttributeInfo {
    private LocalVariableInfo[] localVariables;
    private int indexCounter = 0;

    public LocalVariableAttributeInfo(int size) {
        localVariables = new LocalVariableInfo[size];
    }

    public LocalVariableInfo[] getLocalVariables() {
        return localVariables;
    }

    public void setLocalVariables(LocalVariableInfo[] localVariables) {
        this.localVariables = localVariables;
    }

    public void addLocaleVaraibleDetails(LocalVariableInfo localVariableDetails) {
        this.localVariables[indexCounter++] = localVariableDetails;
    }

    public LocalVariableInfo getLocalVariableDetails(int index) {
        return this.localVariables[index];
    }
}
