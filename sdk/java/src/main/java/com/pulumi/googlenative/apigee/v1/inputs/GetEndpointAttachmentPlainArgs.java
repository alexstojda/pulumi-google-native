// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee.v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetEndpointAttachmentPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEndpointAttachmentPlainArgs Empty = new GetEndpointAttachmentPlainArgs();

    @Import(name="endpointAttachmentId", required=true)
    private String endpointAttachmentId;

    public String endpointAttachmentId() {
        return this.endpointAttachmentId;
    }

    @Import(name="organizationId", required=true)
    private String organizationId;

    public String organizationId() {
        return this.organizationId;
    }

    private GetEndpointAttachmentPlainArgs() {}

    private GetEndpointAttachmentPlainArgs(GetEndpointAttachmentPlainArgs $) {
        this.endpointAttachmentId = $.endpointAttachmentId;
        this.organizationId = $.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEndpointAttachmentPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEndpointAttachmentPlainArgs $;

        public Builder() {
            $ = new GetEndpointAttachmentPlainArgs();
        }

        public Builder(GetEndpointAttachmentPlainArgs defaults) {
            $ = new GetEndpointAttachmentPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder endpointAttachmentId(String endpointAttachmentId) {
            $.endpointAttachmentId = endpointAttachmentId;
            return this;
        }

        public Builder organizationId(String organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public GetEndpointAttachmentPlainArgs build() {
            $.endpointAttachmentId = Objects.requireNonNull($.endpointAttachmentId, "expected parameter 'endpointAttachmentId' to be non-null");
            $.organizationId = Objects.requireNonNull($.organizationId, "expected parameter 'organizationId' to be non-null");
            return $;
        }
    }

}