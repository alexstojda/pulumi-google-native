// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.toolresults.v1beta3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.toolresults.v1beta3.inputs.TestIssueArgs;
import com.pulumi.googlenative.toolresults.v1beta3.inputs.TestSuiteOverviewArgs;
import com.pulumi.googlenative.toolresults.v1beta3.inputs.TestTimingArgs;
import com.pulumi.googlenative.toolresults.v1beta3.inputs.ToolExecutionArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A step that represents running tests. It accepts ant-junit xml files which will be parsed into structured test results by the service. Xml file paths are updated in order to append more files, however they can&#39;t be deleted. Users can also add test results manually by using the test_result field.
 * 
 */
public final class TestExecutionStepArgs extends com.pulumi.resources.ResourceArgs {

    public static final TestExecutionStepArgs Empty = new TestExecutionStepArgs();

    /**
     * Issues observed during the test execution. For example, if the mobile app under test crashed during the test, the error message and the stack trace content can be recorded here to assist debugging. - In response: present if set by create or update - In create/update request: optional
     * 
     */
    @Import(name="testIssues")
    private @Nullable Output<List<TestIssueArgs>> testIssues;

    /**
     * @return Issues observed during the test execution. For example, if the mobile app under test crashed during the test, the error message and the stack trace content can be recorded here to assist debugging. - In response: present if set by create or update - In create/update request: optional
     * 
     */
    public Optional<Output<List<TestIssueArgs>>> testIssues() {
        return Optional.ofNullable(this.testIssues);
    }

    /**
     * List of test suite overview contents. This could be parsed from xUnit XML log by server, or uploaded directly by user. This references should only be called when test suites are fully parsed or uploaded. The maximum allowed number of test suite overviews per step is 1000. - In response: always set - In create request: optional - In update request: never (use publishXunitXmlFiles custom method instead)
     * 
     */
    @Import(name="testSuiteOverviews")
    private @Nullable Output<List<TestSuiteOverviewArgs>> testSuiteOverviews;

    /**
     * @return List of test suite overview contents. This could be parsed from xUnit XML log by server, or uploaded directly by user. This references should only be called when test suites are fully parsed or uploaded. The maximum allowed number of test suite overviews per step is 1000. - In response: always set - In create request: optional - In update request: never (use publishXunitXmlFiles custom method instead)
     * 
     */
    public Optional<Output<List<TestSuiteOverviewArgs>>> testSuiteOverviews() {
        return Optional.ofNullable(this.testSuiteOverviews);
    }

    /**
     * The timing break down of the test execution. - In response: present if set by create or update - In create/update request: optional
     * 
     */
    @Import(name="testTiming")
    private @Nullable Output<TestTimingArgs> testTiming;

    /**
     * @return The timing break down of the test execution. - In response: present if set by create or update - In create/update request: optional
     * 
     */
    public Optional<Output<TestTimingArgs>> testTiming() {
        return Optional.ofNullable(this.testTiming);
    }

    /**
     * Represents the execution of the test runner. The exit code of this tool will be used to determine if the test passed. - In response: always set - In create/update request: optional
     * 
     */
    @Import(name="toolExecution")
    private @Nullable Output<ToolExecutionArgs> toolExecution;

    /**
     * @return Represents the execution of the test runner. The exit code of this tool will be used to determine if the test passed. - In response: always set - In create/update request: optional
     * 
     */
    public Optional<Output<ToolExecutionArgs>> toolExecution() {
        return Optional.ofNullable(this.toolExecution);
    }

    private TestExecutionStepArgs() {}

    private TestExecutionStepArgs(TestExecutionStepArgs $) {
        this.testIssues = $.testIssues;
        this.testSuiteOverviews = $.testSuiteOverviews;
        this.testTiming = $.testTiming;
        this.toolExecution = $.toolExecution;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TestExecutionStepArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TestExecutionStepArgs $;

        public Builder() {
            $ = new TestExecutionStepArgs();
        }

        public Builder(TestExecutionStepArgs defaults) {
            $ = new TestExecutionStepArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param testIssues Issues observed during the test execution. For example, if the mobile app under test crashed during the test, the error message and the stack trace content can be recorded here to assist debugging. - In response: present if set by create or update - In create/update request: optional
         * 
         * @return builder
         * 
         */
        public Builder testIssues(@Nullable Output<List<TestIssueArgs>> testIssues) {
            $.testIssues = testIssues;
            return this;
        }

        /**
         * @param testIssues Issues observed during the test execution. For example, if the mobile app under test crashed during the test, the error message and the stack trace content can be recorded here to assist debugging. - In response: present if set by create or update - In create/update request: optional
         * 
         * @return builder
         * 
         */
        public Builder testIssues(List<TestIssueArgs> testIssues) {
            return testIssues(Output.of(testIssues));
        }

        /**
         * @param testIssues Issues observed during the test execution. For example, if the mobile app under test crashed during the test, the error message and the stack trace content can be recorded here to assist debugging. - In response: present if set by create or update - In create/update request: optional
         * 
         * @return builder
         * 
         */
        public Builder testIssues(TestIssueArgs... testIssues) {
            return testIssues(List.of(testIssues));
        }

        /**
         * @param testSuiteOverviews List of test suite overview contents. This could be parsed from xUnit XML log by server, or uploaded directly by user. This references should only be called when test suites are fully parsed or uploaded. The maximum allowed number of test suite overviews per step is 1000. - In response: always set - In create request: optional - In update request: never (use publishXunitXmlFiles custom method instead)
         * 
         * @return builder
         * 
         */
        public Builder testSuiteOverviews(@Nullable Output<List<TestSuiteOverviewArgs>> testSuiteOverviews) {
            $.testSuiteOverviews = testSuiteOverviews;
            return this;
        }

        /**
         * @param testSuiteOverviews List of test suite overview contents. This could be parsed from xUnit XML log by server, or uploaded directly by user. This references should only be called when test suites are fully parsed or uploaded. The maximum allowed number of test suite overviews per step is 1000. - In response: always set - In create request: optional - In update request: never (use publishXunitXmlFiles custom method instead)
         * 
         * @return builder
         * 
         */
        public Builder testSuiteOverviews(List<TestSuiteOverviewArgs> testSuiteOverviews) {
            return testSuiteOverviews(Output.of(testSuiteOverviews));
        }

        /**
         * @param testSuiteOverviews List of test suite overview contents. This could be parsed from xUnit XML log by server, or uploaded directly by user. This references should only be called when test suites are fully parsed or uploaded. The maximum allowed number of test suite overviews per step is 1000. - In response: always set - In create request: optional - In update request: never (use publishXunitXmlFiles custom method instead)
         * 
         * @return builder
         * 
         */
        public Builder testSuiteOverviews(TestSuiteOverviewArgs... testSuiteOverviews) {
            return testSuiteOverviews(List.of(testSuiteOverviews));
        }

        /**
         * @param testTiming The timing break down of the test execution. - In response: present if set by create or update - In create/update request: optional
         * 
         * @return builder
         * 
         */
        public Builder testTiming(@Nullable Output<TestTimingArgs> testTiming) {
            $.testTiming = testTiming;
            return this;
        }

        /**
         * @param testTiming The timing break down of the test execution. - In response: present if set by create or update - In create/update request: optional
         * 
         * @return builder
         * 
         */
        public Builder testTiming(TestTimingArgs testTiming) {
            return testTiming(Output.of(testTiming));
        }

        /**
         * @param toolExecution Represents the execution of the test runner. The exit code of this tool will be used to determine if the test passed. - In response: always set - In create/update request: optional
         * 
         * @return builder
         * 
         */
        public Builder toolExecution(@Nullable Output<ToolExecutionArgs> toolExecution) {
            $.toolExecution = toolExecution;
            return this;
        }

        /**
         * @param toolExecution Represents the execution of the test runner. The exit code of this tool will be used to determine if the test passed. - In response: always set - In create/update request: optional
         * 
         * @return builder
         * 
         */
        public Builder toolExecution(ToolExecutionArgs toolExecution) {
            return toolExecution(Output.of(toolExecution));
        }

        public TestExecutionStepArgs build() {
            return $;
        }
    }

}