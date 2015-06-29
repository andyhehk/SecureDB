/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package edu.hku.sdb.parse;

import static com.google.common.base.Preconditions.checkNotNull;

public class FunctionName {

  private String name;

  public FunctionName(String name) {
    this.name = checkNotNull(name.toLowerCase(), "The function name is null");
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof FunctionName))
      return false;

    FunctionName nameObj = (FunctionName) obj;

    if(!name.equals(nameObj.getName()))
      return false;

    return true;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = checkNotNull(name.toLowerCase(), "The function name is null");
  }

  @Override
  public String toString() {
    return "Function name: "  + name;
  }
}
