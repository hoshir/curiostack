/*
 * MIT License
 *
 * Copyright (c) 2018 Choko (choko@curioswitch.org)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.curioswitch.curiostack.gcloud.core.auth;

import java.util.List;
import org.immutables.value.Value.Immutable;
import org.immutables.value.Value.Modifiable;
import org.immutables.value.Value.Style;
import org.immutables.value.Value.Style.BuilderVisibility;

/** Configuration for the Google Cloud auth client. */
@Immutable
@Modifiable
@Style(
  create = "new",
  get = {"get*", "is*"},
  beanFriendlyModifiables = true,
  isInitialized = "initialized",
  builderVisibility = BuilderVisibility.PACKAGE,
  defaultAsDefault = true
)
public interface GcloudAuthConfig {

  /**
   * Base64-encoded Google service account JSON file. If empty, application default credentials will
   * be used.
   */
  String getServiceAccountBase64();

  /** Scopes that should be applied to the service account credential. */
  List<String> getCredentialScopes();
}
