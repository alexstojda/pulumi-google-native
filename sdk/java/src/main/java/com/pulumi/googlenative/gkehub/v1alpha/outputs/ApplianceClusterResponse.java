// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub.v1alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ApplianceClusterResponse {
    /**
     * @return Immutable. Self-link of the GCP resource for the Appliance Cluster. For example: //transferappliance.googleapis.com/projects/my-project/locations/us-west1-a/appliances/my-appliance
     * 
     */
    private String resourceLink;

    private ApplianceClusterResponse() {}
    /**
     * @return Immutable. Self-link of the GCP resource for the Appliance Cluster. For example: //transferappliance.googleapis.com/projects/my-project/locations/us-west1-a/appliances/my-appliance
     * 
     */
    public String resourceLink() {
        return this.resourceLink;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplianceClusterResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String resourceLink;
        public Builder() {}
        public Builder(ApplianceClusterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceLink = defaults.resourceLink;
        }

        @CustomType.Setter
        public Builder resourceLink(String resourceLink) {
            this.resourceLink = Objects.requireNonNull(resourceLink);
            return this;
        }
        public ApplianceClusterResponse build() {
            final var o = new ApplianceClusterResponse();
            o.resourceLink = resourceLink;
            return o;
        }
    }
}