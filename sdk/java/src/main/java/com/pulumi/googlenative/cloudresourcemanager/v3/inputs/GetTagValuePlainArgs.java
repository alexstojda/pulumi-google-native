// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudresourcemanager.v3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTagValuePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTagValuePlainArgs Empty = new GetTagValuePlainArgs();

    @Import(name="tagValueId", required=true)
    private String tagValueId;

    public String tagValueId() {
        return this.tagValueId;
    }

    private GetTagValuePlainArgs() {}

    private GetTagValuePlainArgs(GetTagValuePlainArgs $) {
        this.tagValueId = $.tagValueId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTagValuePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTagValuePlainArgs $;

        public Builder() {
            $ = new GetTagValuePlainArgs();
        }

        public Builder(GetTagValuePlainArgs defaults) {
            $ = new GetTagValuePlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder tagValueId(String tagValueId) {
            $.tagValueId = tagValueId;
            return this;
        }

        public GetTagValuePlainArgs build() {
            $.tagValueId = Objects.requireNonNull($.tagValueId, "expected parameter 'tagValueId' to be non-null");
            return $;
        }
    }

}