// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRatePlanArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRatePlanArgs Empty = new GetRatePlanArgs();

    @Import(name="apiproductId", required=true)
    private Output<String> apiproductId;

    public Output<String> apiproductId() {
        return this.apiproductId;
    }

    @Import(name="organizationId", required=true)
    private Output<String> organizationId;

    public Output<String> organizationId() {
        return this.organizationId;
    }

    @Import(name="rateplanId", required=true)
    private Output<String> rateplanId;

    public Output<String> rateplanId() {
        return this.rateplanId;
    }

    private GetRatePlanArgs() {}

    private GetRatePlanArgs(GetRatePlanArgs $) {
        this.apiproductId = $.apiproductId;
        this.organizationId = $.organizationId;
        this.rateplanId = $.rateplanId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRatePlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRatePlanArgs $;

        public Builder() {
            $ = new GetRatePlanArgs();
        }

        public Builder(GetRatePlanArgs defaults) {
            $ = new GetRatePlanArgs(Objects.requireNonNull(defaults));
        }

        public Builder apiproductId(Output<String> apiproductId) {
            $.apiproductId = apiproductId;
            return this;
        }

        public Builder apiproductId(String apiproductId) {
            return apiproductId(Output.of(apiproductId));
        }

        public Builder organizationId(Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        public Builder rateplanId(Output<String> rateplanId) {
            $.rateplanId = rateplanId;
            return this;
        }

        public Builder rateplanId(String rateplanId) {
            return rateplanId(Output.of(rateplanId));
        }

        public GetRatePlanArgs build() {
            $.apiproductId = Objects.requireNonNull($.apiproductId, "expected parameter 'apiproductId' to be non-null");
            $.organizationId = Objects.requireNonNull($.organizationId, "expected parameter 'organizationId' to be non-null");
            $.rateplanId = Objects.requireNonNull($.rateplanId, "expected parameter 'rateplanId' to be non-null");
            return $;
        }
    }

}