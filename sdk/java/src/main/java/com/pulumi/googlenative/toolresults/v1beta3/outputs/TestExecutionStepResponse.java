// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.toolresults.v1beta3.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.toolresults.v1beta3.outputs.TestIssueResponse;
import com.pulumi.googlenative.toolresults.v1beta3.outputs.TestSuiteOverviewResponse;
import com.pulumi.googlenative.toolresults.v1beta3.outputs.TestTimingResponse;
import com.pulumi.googlenative.toolresults.v1beta3.outputs.ToolExecutionResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class TestExecutionStepResponse {
    /**
     * @return Issues observed during the test execution. For example, if the mobile app under test crashed during the test, the error message and the stack trace content can be recorded here to assist debugging. - In response: present if set by create or update - In create/update request: optional
     * 
     */
    private List<TestIssueResponse> testIssues;
    /**
     * @return List of test suite overview contents. This could be parsed from xUnit XML log by server, or uploaded directly by user. This references should only be called when test suites are fully parsed or uploaded. The maximum allowed number of test suite overviews per step is 1000. - In response: always set - In create request: optional - In update request: never (use publishXunitXmlFiles custom method instead)
     * 
     */
    private List<TestSuiteOverviewResponse> testSuiteOverviews;
    /**
     * @return The timing break down of the test execution. - In response: present if set by create or update - In create/update request: optional
     * 
     */
    private TestTimingResponse testTiming;
    /**
     * @return Represents the execution of the test runner. The exit code of this tool will be used to determine if the test passed. - In response: always set - In create/update request: optional
     * 
     */
    private ToolExecutionResponse toolExecution;

    private TestExecutionStepResponse() {}
    /**
     * @return Issues observed during the test execution. For example, if the mobile app under test crashed during the test, the error message and the stack trace content can be recorded here to assist debugging. - In response: present if set by create or update - In create/update request: optional
     * 
     */
    public List<TestIssueResponse> testIssues() {
        return this.testIssues;
    }
    /**
     * @return List of test suite overview contents. This could be parsed from xUnit XML log by server, or uploaded directly by user. This references should only be called when test suites are fully parsed or uploaded. The maximum allowed number of test suite overviews per step is 1000. - In response: always set - In create request: optional - In update request: never (use publishXunitXmlFiles custom method instead)
     * 
     */
    public List<TestSuiteOverviewResponse> testSuiteOverviews() {
        return this.testSuiteOverviews;
    }
    /**
     * @return The timing break down of the test execution. - In response: present if set by create or update - In create/update request: optional
     * 
     */
    public TestTimingResponse testTiming() {
        return this.testTiming;
    }
    /**
     * @return Represents the execution of the test runner. The exit code of this tool will be used to determine if the test passed. - In response: always set - In create/update request: optional
     * 
     */
    public ToolExecutionResponse toolExecution() {
        return this.toolExecution;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TestExecutionStepResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<TestIssueResponse> testIssues;
        private List<TestSuiteOverviewResponse> testSuiteOverviews;
        private TestTimingResponse testTiming;
        private ToolExecutionResponse toolExecution;
        public Builder() {}
        public Builder(TestExecutionStepResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.testIssues = defaults.testIssues;
    	      this.testSuiteOverviews = defaults.testSuiteOverviews;
    	      this.testTiming = defaults.testTiming;
    	      this.toolExecution = defaults.toolExecution;
        }

        @CustomType.Setter
        public Builder testIssues(List<TestIssueResponse> testIssues) {
            this.testIssues = Objects.requireNonNull(testIssues);
            return this;
        }
        public Builder testIssues(TestIssueResponse... testIssues) {
            return testIssues(List.of(testIssues));
        }
        @CustomType.Setter
        public Builder testSuiteOverviews(List<TestSuiteOverviewResponse> testSuiteOverviews) {
            this.testSuiteOverviews = Objects.requireNonNull(testSuiteOverviews);
            return this;
        }
        public Builder testSuiteOverviews(TestSuiteOverviewResponse... testSuiteOverviews) {
            return testSuiteOverviews(List.of(testSuiteOverviews));
        }
        @CustomType.Setter
        public Builder testTiming(TestTimingResponse testTiming) {
            this.testTiming = Objects.requireNonNull(testTiming);
            return this;
        }
        @CustomType.Setter
        public Builder toolExecution(ToolExecutionResponse toolExecution) {
            this.toolExecution = Objects.requireNonNull(toolExecution);
            return this;
        }
        public TestExecutionStepResponse build() {
            final var o = new TestExecutionStepResponse();
            o.testIssues = testIssues;
            o.testSuiteOverviews = testSuiteOverviews;
            o.testTiming = testTiming;
            o.toolExecution = toolExecution;
            return o;
        }
    }
}