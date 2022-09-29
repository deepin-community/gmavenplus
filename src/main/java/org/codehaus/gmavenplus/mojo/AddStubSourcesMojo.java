/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may not use this file except in compliance with the License.
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

package org.codehaus.gmavenplus.mojo;

import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.io.File;


/**
 * Adds Groovy stubs directory back to Maven's list of source directories. Normally, you won't need to use this mojo.
 *
 * @author Keegan Witt
 * @since 1.1
 */
@Mojo(name = "addStubSources", threadSafe = true)
public class AddStubSourcesMojo extends AbstractGroovyStubSourcesMojo {

    /**
     * The location for the compiled classes.
     */
    @Parameter(defaultValue = "${project.build.directory}/generated-sources/groovy-stubs/main")
    protected File stubsOutputDirectory;

    /**
     * Executes this mojo.
     */
    @Override
    public void execute() {
        getLog().debug("Added stub directory " + stubsOutputDirectory.getAbsolutePath() + " to project sources.");
        project.addCompileSourceRoot(stubsOutputDirectory.getAbsolutePath());
    }

}
