// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.toolresults.v1beta3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.toolresults.v1beta3.enums.TestIssueCategory;
import com.pulumi.googlenative.toolresults.v1beta3.enums.TestIssueSeverity;
import com.pulumi.googlenative.toolresults.v1beta3.enums.TestIssueType;
import com.pulumi.googlenative.toolresults.v1beta3.inputs.AnyArgs;
import com.pulumi.googlenative.toolresults.v1beta3.inputs.StackTraceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An issue detected occurring during a test execution.
 * 
 */
public final class TestIssueArgs extends com.pulumi.resources.ResourceArgs {

    public static final TestIssueArgs Empty = new TestIssueArgs();

    /**
     * Category of issue. Required.
     * 
     */
    @Import(name="category")
    private @Nullable Output<TestIssueCategory> category;

    /**
     * @return Category of issue. Required.
     * 
     */
    public Optional<Output<TestIssueCategory>> category() {
        return Optional.ofNullable(this.category);
    }

    /**
     * A brief human-readable message describing the issue. Required.
     * 
     */
    @Import(name="errorMessage")
    private @Nullable Output<String> errorMessage;

    /**
     * @return A brief human-readable message describing the issue. Required.
     * 
     */
    public Optional<Output<String>> errorMessage() {
        return Optional.ofNullable(this.errorMessage);
    }

    /**
     * Severity of issue. Required.
     * 
     */
    @Import(name="severity")
    private @Nullable Output<TestIssueSeverity> severity;

    /**
     * @return Severity of issue. Required.
     * 
     */
    public Optional<Output<TestIssueSeverity>> severity() {
        return Optional.ofNullable(this.severity);
    }

    /**
     * Deprecated in favor of stack trace fields inside specific warnings.
     * 
     * @deprecated
     * Deprecated in favor of stack trace fields inside specific warnings.
     * 
     */
    @Deprecated /* Deprecated in favor of stack trace fields inside specific warnings. */
    @Import(name="stackTrace")
    private @Nullable Output<StackTraceArgs> stackTrace;

    /**
     * @return Deprecated in favor of stack trace fields inside specific warnings.
     * 
     * @deprecated
     * Deprecated in favor of stack trace fields inside specific warnings.
     * 
     */
    @Deprecated /* Deprecated in favor of stack trace fields inside specific warnings. */
    public Optional<Output<StackTraceArgs>> stackTrace() {
        return Optional.ofNullable(this.stackTrace);
    }

    /**
     * Type of issue. Required.
     * 
     */
    @Import(name="type")
    private @Nullable Output<TestIssueType> type;

    /**
     * @return Type of issue. Required.
     * 
     */
    public Optional<Output<TestIssueType>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Warning message with additional details of the issue. Should always be a message from com.google.devtools.toolresults.v1.warnings
     * 
     */
    @Import(name="warning")
    private @Nullable Output<AnyArgs> warning;

    /**
     * @return Warning message with additional details of the issue. Should always be a message from com.google.devtools.toolresults.v1.warnings
     * 
     */
    public Optional<Output<AnyArgs>> warning() {
        return Optional.ofNullable(this.warning);
    }

    private TestIssueArgs() {}

    private TestIssueArgs(TestIssueArgs $) {
        this.category = $.category;
        this.errorMessage = $.errorMessage;
        this.severity = $.severity;
        this.stackTrace = $.stackTrace;
        this.type = $.type;
        this.warning = $.warning;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TestIssueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TestIssueArgs $;

        public Builder() {
            $ = new TestIssueArgs();
        }

        public Builder(TestIssueArgs defaults) {
            $ = new TestIssueArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param category Category of issue. Required.
         * 
         * @return builder
         * 
         */
        public Builder category(@Nullable Output<TestIssueCategory> category) {
            $.category = category;
            return this;
        }

        /**
         * @param category Category of issue. Required.
         * 
         * @return builder
         * 
         */
        public Builder category(TestIssueCategory category) {
            return category(Output.of(category));
        }

        /**
         * @param errorMessage A brief human-readable message describing the issue. Required.
         * 
         * @return builder
         * 
         */
        public Builder errorMessage(@Nullable Output<String> errorMessage) {
            $.errorMessage = errorMessage;
            return this;
        }

        /**
         * @param errorMessage A brief human-readable message describing the issue. Required.
         * 
         * @return builder
         * 
         */
        public Builder errorMessage(String errorMessage) {
            return errorMessage(Output.of(errorMessage));
        }

        /**
         * @param severity Severity of issue. Required.
         * 
         * @return builder
         * 
         */
        public Builder severity(@Nullable Output<TestIssueSeverity> severity) {
            $.severity = severity;
            return this;
        }

        /**
         * @param severity Severity of issue. Required.
         * 
         * @return builder
         * 
         */
        public Builder severity(TestIssueSeverity severity) {
            return severity(Output.of(severity));
        }

        /**
         * @param stackTrace Deprecated in favor of stack trace fields inside specific warnings.
         * 
         * @return builder
         * 
         * @deprecated
         * Deprecated in favor of stack trace fields inside specific warnings.
         * 
         */
        @Deprecated /* Deprecated in favor of stack trace fields inside specific warnings. */
        public Builder stackTrace(@Nullable Output<StackTraceArgs> stackTrace) {
            $.stackTrace = stackTrace;
            return this;
        }

        /**
         * @param stackTrace Deprecated in favor of stack trace fields inside specific warnings.
         * 
         * @return builder
         * 
         * @deprecated
         * Deprecated in favor of stack trace fields inside specific warnings.
         * 
         */
        @Deprecated /* Deprecated in favor of stack trace fields inside specific warnings. */
        public Builder stackTrace(StackTraceArgs stackTrace) {
            return stackTrace(Output.of(stackTrace));
        }

        /**
         * @param type Type of issue. Required.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<TestIssueType> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of issue. Required.
         * 
         * @return builder
         * 
         */
        public Builder type(TestIssueType type) {
            return type(Output.of(type));
        }

        /**
         * @param warning Warning message with additional details of the issue. Should always be a message from com.google.devtools.toolresults.v1.warnings
         * 
         * @return builder
         * 
         */
        public Builder warning(@Nullable Output<AnyArgs> warning) {
            $.warning = warning;
            return this;
        }

        /**
         * @param warning Warning message with additional details of the issue. Should always be a message from com.google.devtools.toolresults.v1.warnings
         * 
         * @return builder
         * 
         */
        public Builder warning(AnyArgs warning) {
            return warning(Output.of(warning));
        }

        public TestIssueArgs build() {
            return $;
        }
    }

}