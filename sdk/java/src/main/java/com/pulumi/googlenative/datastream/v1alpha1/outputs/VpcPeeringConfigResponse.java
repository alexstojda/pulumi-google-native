// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream.v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VpcPeeringConfigResponse {
    /**
     * @return A free subnet for peering. (CIDR of /29)
     * 
     */
    private String subnet;
    /**
     * @return fully qualified name of the VPC Datastream will peer to.
     * 
     */
    private String vpcName;

    private VpcPeeringConfigResponse() {}
    /**
     * @return A free subnet for peering. (CIDR of /29)
     * 
     */
    public String subnet() {
        return this.subnet;
    }
    /**
     * @return fully qualified name of the VPC Datastream will peer to.
     * 
     */
    public String vpcName() {
        return this.vpcName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcPeeringConfigResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String subnet;
        private String vpcName;
        public Builder() {}
        public Builder(VpcPeeringConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subnet = defaults.subnet;
    	      this.vpcName = defaults.vpcName;
        }

        @CustomType.Setter
        public Builder subnet(String subnet) {
            this.subnet = Objects.requireNonNull(subnet);
            return this;
        }
        @CustomType.Setter
        public Builder vpcName(String vpcName) {
            this.vpcName = Objects.requireNonNull(vpcName);
            return this;
        }
        public VpcPeeringConfigResponse build() {
            final var o = new VpcPeeringConfigResponse();
            o.subnet = subnet;
            o.vpcName = vpcName;
            return o;
        }
    }
}