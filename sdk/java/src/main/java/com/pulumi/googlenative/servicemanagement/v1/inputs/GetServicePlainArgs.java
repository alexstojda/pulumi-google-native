// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement.v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetServicePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServicePlainArgs Empty = new GetServicePlainArgs();

    @Import(name="serviceName", required=true)
    private String serviceName;

    public String serviceName() {
        return this.serviceName;
    }

    private GetServicePlainArgs() {}

    private GetServicePlainArgs(GetServicePlainArgs $) {
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServicePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServicePlainArgs $;

        public Builder() {
            $ = new GetServicePlainArgs();
        }

        public Builder(GetServicePlainArgs defaults) {
            $ = new GetServicePlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder serviceName(String serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        public GetServicePlainArgs build() {
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}