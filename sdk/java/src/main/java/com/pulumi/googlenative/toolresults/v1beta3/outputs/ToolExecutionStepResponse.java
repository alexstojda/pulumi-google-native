// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.toolresults.v1beta3.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.toolresults.v1beta3.outputs.ToolExecutionResponse;
import java.util.Objects;

@CustomType
public final class ToolExecutionStepResponse {
    /**
     * @return A Tool execution. - In response: present if set by create/update request - In create/update request: optional
     * 
     */
    private ToolExecutionResponse toolExecution;

    private ToolExecutionStepResponse() {}
    /**
     * @return A Tool execution. - In response: present if set by create/update request - In create/update request: optional
     * 
     */
    public ToolExecutionResponse toolExecution() {
        return this.toolExecution;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ToolExecutionStepResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private ToolExecutionResponse toolExecution;
        public Builder() {}
        public Builder(ToolExecutionStepResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.toolExecution = defaults.toolExecution;
        }

        @CustomType.Setter
        public Builder toolExecution(ToolExecutionResponse toolExecution) {
            this.toolExecution = Objects.requireNonNull(toolExecution);
            return this;
        }
        public ToolExecutionStepResponse build() {
            final var o = new ToolExecutionStepResponse();
            o.toolExecution = toolExecution;
            return o;
        }
    }
}