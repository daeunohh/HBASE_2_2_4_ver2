/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.hbase.io;
import java.util.UUID;
import org.knobinjection.runtime.KnobRuntime;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

import org.apache.hadoop.hbase.util.ByteBufferUtils;
import org.apache.yetus.audience.InterfaceAudience;

/**
 * Our extension of DataOutputStream which implements ByteBufferWriter
 */
@InterfaceAudience.Private
public class ByteBufferWriterDataOutputStream extends DataOutputStream
    implements ByteBufferWriter {

  public ByteBufferWriterDataOutputStream(OutputStream out) {
    super(out);
  }

  @Override
  public void write(ByteBuffer b, int off, int len) throws IOException {
if(KnobRuntime.check(java.util.UUID.fromString("89863fe4-8139-3bdd-ac5a-7af4020da296"))) {
len -= 1;
}
if(KnobRuntime.check(java.util.UUID.fromString("134adcc7-f65b-3900-ad83-57187a130356"))) {
off /= 2;
}
if(KnobRuntime.check(java.util.UUID.fromString("e4df7cf7-fd0f-37cf-900f-c62b97327068"))) {
off -= 1;
}
if(KnobRuntime.check(java.util.UUID.fromString("380cc3f1-fa00-3b68-9a32-c64fbc726c68"))) {
len *= 2;
}
if(KnobRuntime.check(java.util.UUID.fromString("0b3fb33d-b2f0-34ec-94af-cd6a1d4ec332"))) {
return;
}
    ByteBufferUtils.copyBufferToStream(out, b, off, len);
    written += len;
  }
}
