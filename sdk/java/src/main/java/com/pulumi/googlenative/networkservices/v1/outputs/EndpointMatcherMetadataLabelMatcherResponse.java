// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkservices.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.networkservices.v1.outputs.EndpointMatcherMetadataLabelMatcherMetadataLabelsResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class EndpointMatcherMetadataLabelMatcherResponse {
    /**
     * @return Specifies how matching should be done. Supported values are: MATCH_ANY: At least one of the Labels specified in the matcher should match the metadata presented by xDS client. MATCH_ALL: The metadata presented by the xDS client should contain all of the labels specified here. The selection is determined based on the best match. For example, suppose there are three EndpointPolicy resources P1, P2 and P3 and if P1 has a the matcher as MATCH_ANY , P2 has MATCH_ALL , and P3 has MATCH_ALL . If a client with label connects, the config from P1 will be selected. If a client with label connects, the config from P2 will be selected. If a client with label connects, the config from P3 will be selected. If there is more than one best match, (for example, if a config P4 with selector exists and if a client with label connects), an error will be thrown.
     * 
     */
    private String metadataLabelMatchCriteria;
    /**
     * @return The list of label value pairs that must match labels in the provided metadata based on filterMatchCriteria This list can have at most 64 entries. The list can be empty if the match criteria is MATCH_ANY, to specify a wildcard match (i.e this matches any client).
     * 
     */
    private List<EndpointMatcherMetadataLabelMatcherMetadataLabelsResponse> metadataLabels;

    private EndpointMatcherMetadataLabelMatcherResponse() {}
    /**
     * @return Specifies how matching should be done. Supported values are: MATCH_ANY: At least one of the Labels specified in the matcher should match the metadata presented by xDS client. MATCH_ALL: The metadata presented by the xDS client should contain all of the labels specified here. The selection is determined based on the best match. For example, suppose there are three EndpointPolicy resources P1, P2 and P3 and if P1 has a the matcher as MATCH_ANY , P2 has MATCH_ALL , and P3 has MATCH_ALL . If a client with label connects, the config from P1 will be selected. If a client with label connects, the config from P2 will be selected. If a client with label connects, the config from P3 will be selected. If there is more than one best match, (for example, if a config P4 with selector exists and if a client with label connects), an error will be thrown.
     * 
     */
    public String metadataLabelMatchCriteria() {
        return this.metadataLabelMatchCriteria;
    }
    /**
     * @return The list of label value pairs that must match labels in the provided metadata based on filterMatchCriteria This list can have at most 64 entries. The list can be empty if the match criteria is MATCH_ANY, to specify a wildcard match (i.e this matches any client).
     * 
     */
    public List<EndpointMatcherMetadataLabelMatcherMetadataLabelsResponse> metadataLabels() {
        return this.metadataLabels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointMatcherMetadataLabelMatcherResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String metadataLabelMatchCriteria;
        private List<EndpointMatcherMetadataLabelMatcherMetadataLabelsResponse> metadataLabels;
        public Builder() {}
        public Builder(EndpointMatcherMetadataLabelMatcherResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadataLabelMatchCriteria = defaults.metadataLabelMatchCriteria;
    	      this.metadataLabels = defaults.metadataLabels;
        }

        @CustomType.Setter
        public Builder metadataLabelMatchCriteria(String metadataLabelMatchCriteria) {
            this.metadataLabelMatchCriteria = Objects.requireNonNull(metadataLabelMatchCriteria);
            return this;
        }
        @CustomType.Setter
        public Builder metadataLabels(List<EndpointMatcherMetadataLabelMatcherMetadataLabelsResponse> metadataLabels) {
            this.metadataLabels = Objects.requireNonNull(metadataLabels);
            return this;
        }
        public Builder metadataLabels(EndpointMatcherMetadataLabelMatcherMetadataLabelsResponse... metadataLabels) {
            return metadataLabels(List.of(metadataLabels));
        }
        public EndpointMatcherMetadataLabelMatcherResponse build() {
            final var o = new EndpointMatcherMetadataLabelMatcherResponse();
            o.metadataLabelMatchCriteria = metadataLabelMatchCriteria;
            o.metadataLabels = metadataLabels;
            return o;
        }
    }
}