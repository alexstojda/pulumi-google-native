// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datamigration.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VpcPeeringConnectivityResponse {
    /**
     * @return The name of the VPC network to peer with the Cloud SQL private network.
     * 
     */
    private String vpc;

    private VpcPeeringConnectivityResponse() {}
    /**
     * @return The name of the VPC network to peer with the Cloud SQL private network.
     * 
     */
    public String vpc() {
        return this.vpc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcPeeringConnectivityResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String vpc;
        public Builder() {}
        public Builder(VpcPeeringConnectivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.vpc = defaults.vpc;
        }

        @CustomType.Setter
        public Builder vpc(String vpc) {
            this.vpc = Objects.requireNonNull(vpc);
            return this;
        }
        public VpcPeeringConnectivityResponse build() {
            final var o = new VpcPeeringConnectivityResponse();
            o.vpc = vpc;
            return o;
        }
    }
}