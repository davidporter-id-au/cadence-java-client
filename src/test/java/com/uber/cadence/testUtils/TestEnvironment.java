/**
 *  Copyright 2012-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 *  Modifications copyright (C) 2017 Uber Technologies, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"). You may not
 *  use this file except in compliance with the License. A copy of the License is
 *  located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 *  or in the "license" file accompanying this file. This file is distributed on
 *  an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 *  express or implied. See the License for the specific language governing
 *  permissions and limitations under the License.
 */
package com.uber.cadence.testUtils;

public final class TestEnvironment {
  public static final String DOMAIN = "UnitTest";
  public static final String DOMAIN2 = "UnitTest2";
  /**
   * When set to true increases test, activity and workflow timeouts to large values to support
   * stepping through code in a debugger without timing out.
   */
  private static final boolean DEBUGGER_TIMEOUTS = false;

  private static final boolean USE_DOCKER_SERVICE =
      Boolean.parseBoolean(System.getenv("USE_DOCKER_SERVICE"));

  private TestEnvironment() {}

  public static boolean isDebuggerTimeouts() {
    return DEBUGGER_TIMEOUTS;
  }

  public static boolean isUseDockerService() {
    return USE_DOCKER_SERVICE;
  }
}
