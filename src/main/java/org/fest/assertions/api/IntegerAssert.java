/*
 * Created on Oct 17, 2010
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright @2010 the original author or authors.
 */
package org.fest.assertions.api;

import org.fest.assertions.core.*;
import org.fest.assertions.description.Description;
import org.fest.assertions.internal.Objects;
import org.fest.util.VisibleForTesting;

/**
 * Assertion methods for integers. To create an instance of this class, use the factory methods
 * <code>{@link Assertions#assertThat(Integer)}</code> or <code>{@link Assertions#assertThat(int)}</code>.
 *
 * @author Yvonne Wang
 * @author David DIDIER
 * @author Ansgar Konermann
 * @author Alex Ruiz
 */
public class IntegerAssert implements ComparableAssert<Integer>, NumberAssert<Integer> {

  @VisibleForTesting Objects objects = Objects.instance();

  @VisibleForTesting final Integer actual;
  @VisibleForTesting final WritableAssertionInfo info;

  protected IntegerAssert(Integer actual) {
    this.actual = actual;
    info = new WritableAssertionInfo();
  }

  /** {@inheritDoc} */
  public IntegerAssert as(String description) {
    return describedAs(description);
  }

  /** {@inheritDoc} */
  public IntegerAssert as(Description description) {
    return describedAs(description);
  }

  /** {@inheritDoc} */
  public IntegerAssert describedAs(String description) {
    info.description(description);
    return this;
  }

  /** {@inheritDoc} */
  public IntegerAssert describedAs(Description description) {
    info.description(description);
    return this;
  }

  /** {@inheritDoc} */
  public void isNull() {
    objects.assertNull(info, actual);
  }

  /** {@inheritDoc} */
  public IntegerAssert isNotNull() {
    // TODO Auto-generated method stub
    return null;
  }

  /** {@inheritDoc} */
  public IntegerAssert isSameAs(Integer expected) {
    // TODO Auto-generated method stub
    return null;
  }

  /** {@inheritDoc} */
  public IntegerAssert isNotSameAs(Integer other) {
    // TODO Auto-generated method stub
    return null;
  }

  /** {@inheritDoc} */
  public IntegerAssert isZero() {
    // TODO Auto-generated method stub
    return null;
  }

  /** {@inheritDoc} */
  public IntegerAssert isPositive() {
    // TODO Auto-generated method stub
    return null;
  }

  /** {@inheritDoc} */
  public IntegerAssert isNegative() {
    // TODO Auto-generated method stub
    return null;
  }

  /** {@inheritDoc} */
  public IntegerAssert isEqualTo(Integer expected) {
    // TODO Auto-generated method stub
    return null;
  }

  /** {@inheritDoc} */
  public IntegerAssert isNotEqualTo(Integer other) {
    // TODO Auto-generated method stub
    return null;
  }

  /** {@inheritDoc} */
  public IntegerAssert isLessThan(Integer other) {
    // TODO Auto-generated method stub
    return null;
  }

  /** {@inheritDoc} */
  public IntegerAssert isLessThanOrEqualTo(Integer other) {
    // TODO Auto-generated method stub
    return null;
  }

  /** {@inheritDoc} */
  public IntegerAssert isGreaterThan(Integer other) {
    // TODO Auto-generated method stub
    return null;
  }

  /** {@inheritDoc} */
  public IntegerAssert isGreaterThanOrEqualTo(Integer other) {
    // TODO Auto-generated method stub
    return null;
  }

  /** {@inheritDoc} */
  public IntegerAssert satisfies(Condition<Integer> condition) {
    // TODO Auto-generated method stub
    return null;
  }

  /** {@inheritDoc} */
  public IntegerAssert doesNotSatisfy(Condition<Integer> condition) {
    // TODO Auto-generated method stub
    return null;
  }

  /** {@inheritDoc} */
  public IntegerAssert is(Condition<Integer> condition) {
    // TODO Auto-generated method stub
    return null;
  }

  /** {@inheritDoc} */
  public IntegerAssert isNot(Condition<Integer> condition) {
    // TODO Auto-generated method stub
    return null;
  }

  @VisibleForTesting final String descriptionText() {
    return info.descriptionText();
  }
}
