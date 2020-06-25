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

public class ProjectCreatorConfig {
    private final String projectName;
    private final String packageName;
    private final String outputDir;
    private final String walletPath;
    private final String walletPassword;

    public ProjectCreatorConfig(
            final String projectName,
            final String packageName,
            final String outputDir,
            final String walletPath,
            final String walletPassword) {

        this.projectName = projectName;
        this.packageName = packageName;
        this.outputDir = outputDir;
        this.walletPath = walletPath;
        this.walletPassword = walletPassword;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getPackageName() {
        return packageName;
    }

    public String getOutputDir() {
        return outputDir;
    }

    public String getWalletPath() {
        return walletPath;
    }

    public String getWalletPassword() {
        return walletPassword;
    }
}