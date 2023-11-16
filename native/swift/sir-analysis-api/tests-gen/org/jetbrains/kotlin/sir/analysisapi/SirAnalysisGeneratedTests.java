/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.sir.analysisapi;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.native.swift.sir.analysis.api.GenerateSirAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("native/swift/sir-analysis-api/testData")
@TestDataPath("$PROJECT_ROOT")
public class SirAnalysisGeneratedTests extends AbstractKotlinSirContextTest {
    @Test
    public void testAllFilesPresentInTestData() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("native/swift/sir-analysis-api/testData"), Pattern.compile("^([^_](.+)).kt$"), null, false);
    }

    @Test
    @TestMetadata("functions_overload.kt")
    public void testFunctions_overload() throws Exception {
        runTest("native/swift/sir-analysis-api/testData/functions_overload.kt");
    }

    @Test
    @TestMetadata("namespaced_functions.kt")
    public void testNamespaced_functions() throws Exception {
        runTest("native/swift/sir-analysis-api/testData/namespaced_functions.kt");
    }

    @Test
    @TestMetadata("should_ignore_not_public_functions.kt")
    public void testShould_ignore_not_public_functions() throws Exception {
        runTest("native/swift/sir-analysis-api/testData/should_ignore_not_public_functions.kt");
    }

    @Test
    @TestMetadata("simple_function.kt")
    public void testSimple_function() throws Exception {
        runTest("native/swift/sir-analysis-api/testData/simple_function.kt");
    }
}
