// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute.alpha.outputs.InterconnectAttachmentConfigurationConstraintsBgpPeerASNRangeResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class InterconnectAttachmentConfigurationConstraintsResponse {
    /**
     * @return Whether the attachment&#39;s BGP session requires/allows/disallows BGP MD5 authentication. This can take one of the following values: MD5_OPTIONAL, MD5_REQUIRED, MD5_UNSUPPORTED. For example, a Cross-Cloud Interconnect connection to a remote cloud provider that requires BGP MD5 authentication has the interconnectRemoteLocation attachment_configuration_constraints.bgp_md5 field set to MD5_REQUIRED, and that property is propagated to the attachment. Similarly, if BGP MD5 is MD5_UNSUPPORTED, an error is returned if MD5 is requested.
     * 
     */
    private String bgpMd5;
    /**
     * @return List of ASN ranges that the remote location is known to support. Formatted as an array of inclusive ranges {min: min-value, max: max-value}. For example, [{min: 123, max: 123}, {min: 64512, max: 65534}] allows the peer ASN to be 123 or anything in the range 64512-65534. This field is only advisory. Although the API accepts other ranges, these are the ranges that we recommend.
     * 
     */
    private List<InterconnectAttachmentConfigurationConstraintsBgpPeerASNRangeResponse> bgpPeerAsnRanges;
    /**
     * @return Network Connectivity Center constraints, which can take one of the following values: NCC_UNCONSTRAINED, NCC_SPOKE_REQUIRED
     * 
     */
    private String networkConnectivityCenter;

    private InterconnectAttachmentConfigurationConstraintsResponse() {}
    /**
     * @return Whether the attachment&#39;s BGP session requires/allows/disallows BGP MD5 authentication. This can take one of the following values: MD5_OPTIONAL, MD5_REQUIRED, MD5_UNSUPPORTED. For example, a Cross-Cloud Interconnect connection to a remote cloud provider that requires BGP MD5 authentication has the interconnectRemoteLocation attachment_configuration_constraints.bgp_md5 field set to MD5_REQUIRED, and that property is propagated to the attachment. Similarly, if BGP MD5 is MD5_UNSUPPORTED, an error is returned if MD5 is requested.
     * 
     */
    public String bgpMd5() {
        return this.bgpMd5;
    }
    /**
     * @return List of ASN ranges that the remote location is known to support. Formatted as an array of inclusive ranges {min: min-value, max: max-value}. For example, [{min: 123, max: 123}, {min: 64512, max: 65534}] allows the peer ASN to be 123 or anything in the range 64512-65534. This field is only advisory. Although the API accepts other ranges, these are the ranges that we recommend.
     * 
     */
    public List<InterconnectAttachmentConfigurationConstraintsBgpPeerASNRangeResponse> bgpPeerAsnRanges() {
        return this.bgpPeerAsnRanges;
    }
    /**
     * @return Network Connectivity Center constraints, which can take one of the following values: NCC_UNCONSTRAINED, NCC_SPOKE_REQUIRED
     * 
     */
    public String networkConnectivityCenter() {
        return this.networkConnectivityCenter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InterconnectAttachmentConfigurationConstraintsResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String bgpMd5;
        private List<InterconnectAttachmentConfigurationConstraintsBgpPeerASNRangeResponse> bgpPeerAsnRanges;
        private String networkConnectivityCenter;
        public Builder() {}
        public Builder(InterconnectAttachmentConfigurationConstraintsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bgpMd5 = defaults.bgpMd5;
    	      this.bgpPeerAsnRanges = defaults.bgpPeerAsnRanges;
    	      this.networkConnectivityCenter = defaults.networkConnectivityCenter;
        }

        @CustomType.Setter
        public Builder bgpMd5(String bgpMd5) {
            this.bgpMd5 = Objects.requireNonNull(bgpMd5);
            return this;
        }
        @CustomType.Setter
        public Builder bgpPeerAsnRanges(List<InterconnectAttachmentConfigurationConstraintsBgpPeerASNRangeResponse> bgpPeerAsnRanges) {
            this.bgpPeerAsnRanges = Objects.requireNonNull(bgpPeerAsnRanges);
            return this;
        }
        public Builder bgpPeerAsnRanges(InterconnectAttachmentConfigurationConstraintsBgpPeerASNRangeResponse... bgpPeerAsnRanges) {
            return bgpPeerAsnRanges(List.of(bgpPeerAsnRanges));
        }
        @CustomType.Setter
        public Builder networkConnectivityCenter(String networkConnectivityCenter) {
            this.networkConnectivityCenter = Objects.requireNonNull(networkConnectivityCenter);
            return this;
        }
        public InterconnectAttachmentConfigurationConstraintsResponse build() {
            final var o = new InterconnectAttachmentConfigurationConstraintsResponse();
            o.bgpMd5 = bgpMd5;
            o.bgpPeerAsnRanges = bgpPeerAsnRanges;
            o.networkConnectivityCenter = networkConnectivityCenter;
            return o;
        }
    }
}