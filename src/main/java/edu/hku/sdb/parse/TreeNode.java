/*******************************************************************************
 *    Licensed to the Apache Software Foundation (ASF) under one or more 
 *    contributor license agreements.  See the NOTICE file distributed with 
 *    this work for additional information regarding copyright ownership.
 *    The ASF licenses this file to You under the Apache License, Version 2.0
 *    (the "License"); you may not use this file except in compliance with 
 *    the License.  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *
 *******************************************************************************/

package edu.hku.sdb.parse;

import java.util.ArrayList;
import java.util.List;

public abstract class TreeNode<T extends TreeNode<T>> {

  protected ArrayList<T> children;

  protected TreeNode() {
    this.setChildren(new ArrayList<T>());
  }

  public T getChild(int i) {
    return hasChild(i) ? getChildren().get(i) : null;
  }

  public boolean hasChild(int i) {
    return getChildren().size() > i;
  }

  public void addChild(T node) {
    getChildren().add(node);
  }

  public void addChildren(List<? extends T> l) {
    getChildren().addAll(l);
  }

  public void setChild(int i, T node) {
    getChildren().set(i, node);
  }

  /**
   * @return the children
   */
  public ArrayList<T> getChildren() {
    return children;
  }

  /**
   * @param children
   *          the children to set
   */
  public void setChildren(ArrayList<T> children) {
    this.children = children;
  }
}
