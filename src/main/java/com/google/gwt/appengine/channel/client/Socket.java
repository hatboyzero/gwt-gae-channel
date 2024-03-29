/*
 * Copyright (C) 2011 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.gwt.appengine.channel.client;

import com.google.gwt.core.client.JavaScriptObject;

/** Returned by calls to {@link Channel#open(SocketListener)}. */
public class Socket extends JavaScriptObject {
  protected Socket() {
  }

  /**
   * Closes this socket to incoming messages from the server. The socket cannot
   * be used again after calling close; the server must create a new socket.
   */
  public final native void close() /*-{
    this.close();
  }-*/;
}
