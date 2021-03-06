/*
 * Copyright 2020 Web3 Labs Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package io.epirus.console.project;

import picocli.CommandLine;

public class ProjectType {
    @CommandLine.Option(
            names = {"--java"},
            description = "Whether java code should be generated.",
            defaultValue = "true")
    public boolean isJava = true;

    @CommandLine.Option(
            names = {"--kotlin"},
            description = "Whether kotlin code should be generated.",
            defaultValue = "false")
    public boolean isKotlin = false;

    @CommandLine.Option(
            names = {"--openapi"},
            description = "Whether openapi code should be generated.",
            defaultValue = "false")
    public boolean isOpenApi = false;
}
