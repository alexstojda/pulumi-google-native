// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ManagedGroupConfigResponse {
    /**
     * @return The name of the Instance Group Manager for this group.
     * 
     */
    private String instanceGroupManagerName;
    /**
     * @return The name of the Instance Template used for the Managed Instance Group.
     * 
     */
    private String instanceTemplateName;

    private ManagedGroupConfigResponse() {}
    /**
     * @return The name of the Instance Group Manager for this group.
     * 
     */
    public String instanceGroupManagerName() {
        return this.instanceGroupManagerName;
    }
    /**
     * @return The name of the Instance Template used for the Managed Instance Group.
     * 
     */
    public String instanceTemplateName() {
        return this.instanceTemplateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedGroupConfigResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String instanceGroupManagerName;
        private String instanceTemplateName;
        public Builder() {}
        public Builder(ManagedGroupConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceGroupManagerName = defaults.instanceGroupManagerName;
    	      this.instanceTemplateName = defaults.instanceTemplateName;
        }

        @CustomType.Setter
        public Builder instanceGroupManagerName(String instanceGroupManagerName) {
            this.instanceGroupManagerName = Objects.requireNonNull(instanceGroupManagerName);
            return this;
        }
        @CustomType.Setter
        public Builder instanceTemplateName(String instanceTemplateName) {
            this.instanceTemplateName = Objects.requireNonNull(instanceTemplateName);
            return this;
        }
        public ManagedGroupConfigResponse build() {
            final var o = new ManagedGroupConfigResponse();
            o.instanceGroupManagerName = instanceGroupManagerName;
            o.instanceTemplateName = instanceTemplateName;
            return o;
        }
    }
}