// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datalabeling.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFeedbackMessageArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFeedbackMessageArgs Empty = new GetFeedbackMessageArgs();

    @Import(name="annotatedDatasetId", required=true)
    private Output<String> annotatedDatasetId;

    public Output<String> annotatedDatasetId() {
        return this.annotatedDatasetId;
    }

    @Import(name="datasetId", required=true)
    private Output<String> datasetId;

    public Output<String> datasetId() {
        return this.datasetId;
    }

    @Import(name="feedbackMessageId", required=true)
    private Output<String> feedbackMessageId;

    public Output<String> feedbackMessageId() {
        return this.feedbackMessageId;
    }

    @Import(name="feedbackThreadId", required=true)
    private Output<String> feedbackThreadId;

    public Output<String> feedbackThreadId() {
        return this.feedbackThreadId;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetFeedbackMessageArgs() {}

    private GetFeedbackMessageArgs(GetFeedbackMessageArgs $) {
        this.annotatedDatasetId = $.annotatedDatasetId;
        this.datasetId = $.datasetId;
        this.feedbackMessageId = $.feedbackMessageId;
        this.feedbackThreadId = $.feedbackThreadId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFeedbackMessageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFeedbackMessageArgs $;

        public Builder() {
            $ = new GetFeedbackMessageArgs();
        }

        public Builder(GetFeedbackMessageArgs defaults) {
            $ = new GetFeedbackMessageArgs(Objects.requireNonNull(defaults));
        }

        public Builder annotatedDatasetId(Output<String> annotatedDatasetId) {
            $.annotatedDatasetId = annotatedDatasetId;
            return this;
        }

        public Builder annotatedDatasetId(String annotatedDatasetId) {
            return annotatedDatasetId(Output.of(annotatedDatasetId));
        }

        public Builder datasetId(Output<String> datasetId) {
            $.datasetId = datasetId;
            return this;
        }

        public Builder datasetId(String datasetId) {
            return datasetId(Output.of(datasetId));
        }

        public Builder feedbackMessageId(Output<String> feedbackMessageId) {
            $.feedbackMessageId = feedbackMessageId;
            return this;
        }

        public Builder feedbackMessageId(String feedbackMessageId) {
            return feedbackMessageId(Output.of(feedbackMessageId));
        }

        public Builder feedbackThreadId(Output<String> feedbackThreadId) {
            $.feedbackThreadId = feedbackThreadId;
            return this;
        }

        public Builder feedbackThreadId(String feedbackThreadId) {
            return feedbackThreadId(Output.of(feedbackThreadId));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetFeedbackMessageArgs build() {
            $.annotatedDatasetId = Objects.requireNonNull($.annotatedDatasetId, "expected parameter 'annotatedDatasetId' to be non-null");
            $.datasetId = Objects.requireNonNull($.datasetId, "expected parameter 'datasetId' to be non-null");
            $.feedbackMessageId = Objects.requireNonNull($.feedbackMessageId, "expected parameter 'feedbackMessageId' to be non-null");
            $.feedbackThreadId = Objects.requireNonNull($.feedbackThreadId, "expected parameter 'feedbackThreadId' to be non-null");
            return $;
        }
    }

}