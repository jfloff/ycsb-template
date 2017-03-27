/**
 * Copyright (c) 2013 - 2016 YCSB Contributors. All rights reserved.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you
 * may not use this file except in compliance with the License. You
 * may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License. See accompanying
 * LICENSE file.
 */

package com.yahoo.ycsb.db;

import com.yahoo.ycsb.*;
import java.util.*;

/**
 * Template YCSB Benchmarking client.<br />
 * <p></p>
 */
public class TemplateClient extends DB {
  @Override
  public void init() throws DBException {
  }

  @Override
  public Status read(String table, String key, Set<String> fields,
                     HashMap<String, ByteIterator> result) {
    return Status.OK;
  }

  @Override
  public Status scan(String table, String startkey, int recordcount,
                     Set<String> fields, Vector<HashMap<String, ByteIterator>> result) {
    return Status.ERROR;
  }

  @Override
  public Status update(String table, String key, HashMap<String, ByteIterator> values) {
    return Status.ERROR;
  }

  @Override
  public Status insert(String table, String key, HashMap<String, ByteIterator> values) {
    return Status.OK;
  }

  @Override
  public Status delete(String table, String key) {
    return Status.ERROR;
  }
}
