/**
 * Copyright (C) 2008 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.businessworks.common.inject.spi;

import cn.businessworks.common.inject.Binding;
import cn.businessworks.common.inject.Key;

/**
 * A binding to a linked key. The other key's binding is used to resolve injections.
 *
 * @author jessewilson@google.com (Jesse Wilson)
 * @since 2.0
 */
public interface LinkedKeyBinding<T> extends Binding<T> {

  /**
   * Returns the linked key used to resolve injections. That binding can be retrieved from an
   * injector using {@link cn.businessworks.common.inject.Injector#getBinding(Key) Injector.getBinding(key)}.
   */
  Key<? extends T> getLinkedKey();

}