// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudresourcemanager.v3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTagKeyIamPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTagKeyIamPolicyPlainArgs Empty = new GetTagKeyIamPolicyPlainArgs();

    @Import(name="tagKeyId", required=true)
    private String tagKeyId;

    public String tagKeyId() {
        return this.tagKeyId;
    }

    private GetTagKeyIamPolicyPlainArgs() {}

    private GetTagKeyIamPolicyPlainArgs(GetTagKeyIamPolicyPlainArgs $) {
        this.tagKeyId = $.tagKeyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTagKeyIamPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTagKeyIamPolicyPlainArgs $;

        public Builder() {
            $ = new GetTagKeyIamPolicyPlainArgs();
        }

        public Builder(GetTagKeyIamPolicyPlainArgs defaults) {
            $ = new GetTagKeyIamPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder tagKeyId(String tagKeyId) {
            $.tagKeyId = tagKeyId;
            return this;
        }

        public GetTagKeyIamPolicyPlainArgs build() {
            $.tagKeyId = Objects.requireNonNull($.tagKeyId, "expected parameter 'tagKeyId' to be non-null");
            return $;
        }
    }

}