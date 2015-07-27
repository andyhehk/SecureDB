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

package edu.hku.sdb.utility;

import edu.hku.sdb.catalog.PrimitiveType;
import edu.hku.sdb.catalog.ScalarType;
import edu.hku.sdb.catalog.Type;

import java.util.HashMap;
import java.util.Map;

public class TypeNameCast {

  public static Map<String, PrimitiveType> primitiveTypeMap = new HashMap<>();
  static {
    for (PrimitiveType dir : PrimitiveType.values()) {
      primitiveTypeMap.put(dir.toString(), dir);
    }
  }

  /**
   * @return the Type
   */
  public static Type castString2Type(String typeName) {
    String pirmitiveType1 = "[A-Z]+(?!\\()"; // INT, BIGINT ...
    String primitiveType2 = "[A-Z]+\\(\\d+\\)"; // CHAR(), VARCHAR()
    String primitiveType3 = "[A-Z]+\\(\\d+,\\d+\\)"; // DECIMAL(,)

    if(typeName.matches(pirmitiveType1)) {
      return new ScalarType(primitiveTypeMap.get(typeName));
    }
    else if(typeName.matches(primitiveType2)) {
      String [] fields = typeName.split("\\(|,|\\)");
      if(fields[0].equals(PrimitiveType.CHAR.toString()))
        return  ScalarType.createCharType(Integer.valueOf(fields[1]));
      else
        return ScalarType.createVarcharType(Integer.valueOf(fields[1]));
    }
    else if(typeName.matches(primitiveType3)) {
      String [] fields = typeName.split("\\(|,|\\)");
      return ScalarType.createDecimalType(Integer.valueOf(fields[1]),
              Integer.valueOf(fields[2]));
    }
    else
      return null;
  }
}
