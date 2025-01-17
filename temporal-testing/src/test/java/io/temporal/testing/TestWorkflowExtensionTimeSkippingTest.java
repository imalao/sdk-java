/*
 *  Copyright (C) 2020 Temporal Technologies, Inc. All Rights Reserved.
 *
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

package io.temporal.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestWorkflowExtensionTimeSkippingTest {
  @Test
  public void testCheckNoTimeSkipping() {
    TestWorkflowExtension testWorkflow =
        TestWorkflowExtension.newBuilder().setUseTimeskipping(false).build();

    assertFalse(
        testWorkflow.createTestEnvOptions(System.currentTimeMillis()).isUseTimeskipping(),
        "We disabled the time skipping on the extension, so the TestEnvironmentOptions should have it off too");
  }
}
