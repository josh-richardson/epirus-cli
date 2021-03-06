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
package io.epirus.console.project.java;

import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Optional;

import io.epirus.console.project.Project;
import io.epirus.console.project.ProjectCreatorConfig;
import io.epirus.console.project.ProjectRunner;

import static org.web3j.codegen.Console.exitError;

public abstract class JavaProjectRunner extends ProjectRunner {

    public JavaProjectRunner(final ProjectCreatorConfig projectCreatorConfig) {
        super(projectCreatorConfig);
    }

    public void generateJava(
            boolean withTests,
            Optional<File> solidityFile,
            boolean withFatJar,
            boolean withSampleCode,
            String command) {
        try {
            JavaBuilder javaBuilder =
                    new JavaBuilder()
                            .withProjectName(projectName)
                            .withRootDirectory(outputDir)
                            .withPackageName(packageName)
                            .withTests(withTests)
                            .withCommand(command)
                            .withSampleCode(withSampleCode)
                            .withFatJar(withFatJar);
            solidityFile.map(File::getAbsolutePath).ifPresent(javaBuilder::withSolidityFile);
            Project javaProject = javaBuilder.build();
            javaProject.createProject();
            onSuccess(javaProject, "java");
        } catch (final Exception e) {
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
            exitError("\nCould not generate project reason: \n" + sw.toString());
        }
    }
}
