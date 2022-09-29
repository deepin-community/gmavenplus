/*
 * Copyright (C) 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.codehaus.gmavenplus;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;


public class TheTest {

    @Test
    public void test1() {
        File fileFromScript = new File("target/helloWorld.txt");
        Assert.assertTrue(fileFromScript.exists());
        Assert.assertTrue(fileFromScript.length() > 0);
    }

    @Test
    public void test2() {
        File fileFromScript = new File("target/helloWorld2.txt");
        Assert.assertTrue(fileFromScript.exists());
        Assert.assertTrue(fileFromScript.length() > 0);
    }

    @Test
    public void test3() {
        File fileFromScript = new File("target/javaVersion.txt");
        Assert.assertTrue(fileFromScript.exists());
        Assert.assertTrue(fileFromScript.length() > 0);
    }

}
