// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement.v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetServiceConsumerIamPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceConsumerIamPolicyPlainArgs Empty = new GetServiceConsumerIamPolicyPlainArgs();

    @Import(name="consumerId", required=true)
    private String consumerId;

    public String consumerId() {
        return this.consumerId;
    }

    @Import(name="serviceId", required=true)
    private String serviceId;

    public String serviceId() {
        return this.serviceId;
    }

    private GetServiceConsumerIamPolicyPlainArgs() {}

    private GetServiceConsumerIamPolicyPlainArgs(GetServiceConsumerIamPolicyPlainArgs $) {
        this.consumerId = $.consumerId;
        this.serviceId = $.serviceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceConsumerIamPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceConsumerIamPolicyPlainArgs $;

        public Builder() {
            $ = new GetServiceConsumerIamPolicyPlainArgs();
        }

        public Builder(GetServiceConsumerIamPolicyPlainArgs defaults) {
            $ = new GetServiceConsumerIamPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder consumerId(String consumerId) {
            $.consumerId = consumerId;
            return this;
        }

        public Builder serviceId(String serviceId) {
            $.serviceId = serviceId;
            return this;
        }

        public GetServiceConsumerIamPolicyPlainArgs build() {
            $.consumerId = Objects.requireNonNull($.consumerId, "expected parameter 'consumerId' to be non-null");
            $.serviceId = Objects.requireNonNull($.serviceId, "expected parameter 'serviceId' to be non-null");
            return $;
        }
    }

}