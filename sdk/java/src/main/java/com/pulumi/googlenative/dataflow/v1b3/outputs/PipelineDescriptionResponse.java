// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataflow.v1b3.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dataflow.v1b3.outputs.DisplayDataResponse;
import com.pulumi.googlenative.dataflow.v1b3.outputs.ExecutionStageSummaryResponse;
import com.pulumi.googlenative.dataflow.v1b3.outputs.TransformSummaryResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class PipelineDescriptionResponse {
    /**
     * @return Pipeline level display data.
     * 
     */
    private List<DisplayDataResponse> displayData;
    /**
     * @return Description of each stage of execution of the pipeline.
     * 
     */
    private List<ExecutionStageSummaryResponse> executionPipelineStage;
    /**
     * @return Description of each transform in the pipeline and collections between them.
     * 
     */
    private List<TransformSummaryResponse> originalPipelineTransform;

    private PipelineDescriptionResponse() {}
    /**
     * @return Pipeline level display data.
     * 
     */
    public List<DisplayDataResponse> displayData() {
        return this.displayData;
    }
    /**
     * @return Description of each stage of execution of the pipeline.
     * 
     */
    public List<ExecutionStageSummaryResponse> executionPipelineStage() {
        return this.executionPipelineStage;
    }
    /**
     * @return Description of each transform in the pipeline and collections between them.
     * 
     */
    public List<TransformSummaryResponse> originalPipelineTransform() {
        return this.originalPipelineTransform;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineDescriptionResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<DisplayDataResponse> displayData;
        private List<ExecutionStageSummaryResponse> executionPipelineStage;
        private List<TransformSummaryResponse> originalPipelineTransform;
        public Builder() {}
        public Builder(PipelineDescriptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayData = defaults.displayData;
    	      this.executionPipelineStage = defaults.executionPipelineStage;
    	      this.originalPipelineTransform = defaults.originalPipelineTransform;
        }

        @CustomType.Setter
        public Builder displayData(List<DisplayDataResponse> displayData) {
            this.displayData = Objects.requireNonNull(displayData);
            return this;
        }
        public Builder displayData(DisplayDataResponse... displayData) {
            return displayData(List.of(displayData));
        }
        @CustomType.Setter
        public Builder executionPipelineStage(List<ExecutionStageSummaryResponse> executionPipelineStage) {
            this.executionPipelineStage = Objects.requireNonNull(executionPipelineStage);
            return this;
        }
        public Builder executionPipelineStage(ExecutionStageSummaryResponse... executionPipelineStage) {
            return executionPipelineStage(List.of(executionPipelineStage));
        }
        @CustomType.Setter
        public Builder originalPipelineTransform(List<TransformSummaryResponse> originalPipelineTransform) {
            this.originalPipelineTransform = Objects.requireNonNull(originalPipelineTransform);
            return this;
        }
        public Builder originalPipelineTransform(TransformSummaryResponse... originalPipelineTransform) {
            return originalPipelineTransform(List.of(originalPipelineTransform));
        }
        public PipelineDescriptionResponse build() {
            final var o = new PipelineDescriptionResponse();
            o.displayData = displayData;
            o.executionPipelineStage = executionPipelineStage;
            o.originalPipelineTransform = originalPipelineTransform;
            return o;
        }
    }
}