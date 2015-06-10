#!/usr/bin/env bash

#
# Licensed to the Apache Software Foundation (ASF) under one or more
# contributor license agreements.  See the NOTICE file distributed with
# this work for additional information regarding copyright ownership.
# The ASF licenses this file to You under the Apache License, Version 2.0
# (the "License"); you may not use this file except in compliance with
# the License.  You may obtain a copy of the License at
#
#    http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#

# Starts a SDB proxy.
#
# Environment Variables
#
#   SDB_CONF_DIR  Alternate conf dir. Default is ${SDB_PREFIX}/conf.
#   SDB_LOG_DIR   Where log files are stored.  PWD by default.
##

usage="Usage: start-proxy.sh [--config <conf-dir>]"

# if no args specified, show usage
# if [ $# -le 1 ]; then
#   echo $usage
#   exit 1
# fi

bin=`dirname "$0"`
bin=`cd "$bin"; pwd`

. "$bin/sdb-config.sh"

CLASSPATH=$SDB_CONF_DIR

for jar in ${SDB_LIB}/*.jar; do
    if [[ "$jar" != sdb-udfs-*.jar ]]; then
        CLASSPATH+=:$jar;
    fi
done

CLASSPATH+=$SDB_HIVE_JDBC_JAR

SDB_OPTS="${SDB_OPTS} start --sdbconf ${SDB_CONF_DIR}"

java -cp "$CLASSPATH" edu.hku.sdb.driver.SdbDriver $SDB_OPTS "$@"


