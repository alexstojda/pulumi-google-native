// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine.v1beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BuildInfoResponse {
    /**
     * @return The Google Cloud Build id. Example: &#34;f966068f-08b2-42c8-bdfe-74137dff2bf9&#34;
     * 
     */
    private String cloudBuildId;

    private BuildInfoResponse() {}
    /**
     * @return The Google Cloud Build id. Example: &#34;f966068f-08b2-42c8-bdfe-74137dff2bf9&#34;
     * 
     */
    public String cloudBuildId() {
        return this.cloudBuildId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BuildInfoResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cloudBuildId;
        public Builder() {}
        public Builder(BuildInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudBuildId = defaults.cloudBuildId;
        }

        @CustomType.Setter
        public Builder cloudBuildId(String cloudBuildId) {
            this.cloudBuildId = Objects.requireNonNull(cloudBuildId);
            return this;
        }
        public BuildInfoResponse build() {
            final var o = new BuildInfoResponse();
            o.cloudBuildId = cloudBuildId;
            return o;
        }
    }
}