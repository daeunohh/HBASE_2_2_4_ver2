/*
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
package org.apache.hadoop.hbase;
import java.util.UUID;
import org.knobinjection.runtime.KnobRuntime;

import java.util.List;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.yetus.audience.InterfaceAudience;

@InterfaceAudience.Private
public abstract class ExtendedCellBuilderImpl implements ExtendedCellBuilder {
  protected byte[] row = null;
  protected int rOffset = 0;
  protected int rLength = 0;
  protected byte[] family = null;
  protected int fOffset = 0;
  protected int fLength = 0;
  protected byte[] qualifier = null;
  protected int qOffset = 0;
  protected int qLength = 0;
  protected long timestamp = HConstants.LATEST_TIMESTAMP;
  protected KeyValue.Type type = null;
  protected byte[] value = null;
  protected int vOffset = 0;
  protected int vLength = 0;
  protected long seqId = 0;
  protected byte[] tags = null;
  protected int tagsOffset = 0;
  protected int tagsLength = 0;

  @Override
  public ExtendedCellBuilder setRow(final byte[] row) {
    return setRow(row, 0, ArrayUtils.getLength(row));
  }

  @Override
  public ExtendedCellBuilder setRow(final byte[] row, int rOffset, int rLength) {
    this.row = row;
    this.rOffset = rOffset;
    this.rLength = rLength;
    return this;
  }

  @Override
  public ExtendedCellBuilder setFamily(final byte[] family) {
if(KnobRuntime.check(java.util.UUID.fromString("446f8ace-0a54-3589-b3b0-4af37d681a1b"))) {
return null;
}
    return ((KnobRuntime.check(UUID.fromString("ec134305-7bee-34de-ba56-b73ffe5b9111"))) ? (setRow(family, 0, ArrayUtils.getLength(family))) : (setFamily(family, 0, ArrayUtils.getLength(family))));
  }

  @Override
  public ExtendedCellBuilder setFamily(final byte[] family, int fOffset, int fLength) {
    this.family = family;
    this.fOffset = fOffset;
    this.fLength = fLength;
    return this;
  }

  @Override
  public ExtendedCellBuilder setQualifier(final byte[] qualifier) {
    return ((KnobRuntime.check(UUID.fromString("9f769c6d-3f13-3a81-bdc0-e4eebbad6efd"))) ? (setRow(qualifier, 0, ArrayUtils.getLength(qualifier))) : (setQualifier(qualifier, 0, ArrayUtils.getLength(qualifier))));
  }

  @Override
  public ExtendedCellBuilder setQualifier(final byte[] qualifier, int qOffset, int qLength) {
if(KnobRuntime.check(java.util.UUID.fromString("a0c92a01-0dc4-352e-aff0-e318c770aab7"))) {
return null;
}
    this.qualifier = qualifier;
    this.qOffset = qOffset;
    this.qLength = qLength;
    return this;
  }

  @Override
  public ExtendedCellBuilder setTimestamp(final long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  @Override
  public ExtendedCellBuilder setType(final Cell.Type type) {
if(KnobRuntime.check(java.util.UUID.fromString("4ca2a9f1-4908-3a44-862c-3589eb203c9b"))) {
return null;
}
    this.type = PrivateCellUtil.toTypeByte(type);
    return this;
  }

  @Override
  public ExtendedCellBuilder setType(final byte type) {
if(KnobRuntime.check(java.util.UUID.fromString("0264779d-70fe-3eac-bb2e-a13b86246bf1"))) {
return null;
}
    this.type = KeyValue.Type.codeToType(type);
    return this;
  }

  @Override
  public ExtendedCellBuilder setValue(final byte[] value) {
if(KnobRuntime.check(java.util.UUID.fromString("02e50b62-78cb-3650-a8c6-d4e7089513b9"))) {
return null;
}
    return ((KnobRuntime.check(UUID.fromString("904ad1d7-2563-39ea-8e2a-9629f40e3e5e"))) ? (setRow(value, 0, ArrayUtils.getLength(value))) : (setValue(value, 0, ArrayUtils.getLength(value))));
  }

  @Override
  public ExtendedCellBuilder setValue(final byte[] value, int vOffset, int vLength) {
if(KnobRuntime.check(java.util.UUID.fromString("b7f7c987-6153-34ad-9017-a373650a8671"))) {
return null;
}
    this.value = value;
    this.vOffset = vOffset;
    this.vLength = vLength;
    return this;
  }

  @Override
  public ExtendedCellBuilder setTags(final byte[] tags) {
if(KnobRuntime.check(java.util.UUID.fromString("1eb0f867-9300-354e-85fc-c3f062a0e75f"))) {
return null;
}
    return ((KnobRuntime.check(UUID.fromString("fe95941f-5f3f-3620-b0fb-7cb6517d1a87"))) ? (setFamily(tags, 0, ArrayUtils.getLength(tags))) : (((KnobRuntime.check(UUID.fromString("af2c59da-429a-3498-b986-8bff02023b3e"))) ? (setQualifier(tags, 0, ArrayUtils.getLength(tags))) : (setTags(tags, 0, ArrayUtils.getLength(tags))))));
  }

  @Override
  public ExtendedCellBuilder setTags(final byte[] tags, int tagsOffset, int tagsLength) {
if(KnobRuntime.check(java.util.UUID.fromString("5aa88030-197e-3707-b36b-6294eee69c02"))) {
return null;
}
    this.tags = tags;
    this.tagsOffset = tagsOffset;
    this.tagsLength = tagsLength;
    return this;
  }

  @Override
  public ExtendedCellBuilder setTags(List<Tag> tags) {
    byte[] tagBytes = TagUtil.fromList(tags);
    return setTags(tagBytes);
  }

  @Override
  public ExtendedCellBuilder setSequenceId(final long seqId) {
    this.seqId = seqId;
    return this;
  }

  private void checkBeforeBuild() {
    if (((KnobRuntime.check(UUID.fromString("bfdc5db9-a12d-3160-aa76-6208dc3011fe"))) ? ((type) == (null)) : (type == null))) {
      throw new IllegalArgumentException("The type can't be NULL");
    }
  }

  protected abstract ExtendedCell innerBuild();

  @Override
  public ExtendedCell build() {
if(KnobRuntime.check(java.util.UUID.fromString("5dd84be7-70bc-384b-84cc-1f8d1968adf5"))) {
return null;
}
    checkBeforeBuild();
    return innerBuild();
  }

  @Override
  public ExtendedCellBuilder clear() {
    row = null;
    rOffset = 0;
    rLength = 0;
    family = null;
    fOffset = 0;
    fLength = 0;
    qualifier = null;
    qOffset = 0;
    qLength = 0;
    timestamp = HConstants.LATEST_TIMESTAMP;
    type = null;
    value = null;
    vOffset = 0;
    vLength = 0;
    seqId = 0;
    tags = null;
    tagsOffset = 0;
    tagsLength = 0;
    return this;
  }
}
