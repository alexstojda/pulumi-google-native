// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1alpha1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetProviderNoteIamPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProviderNoteIamPolicyPlainArgs Empty = new GetProviderNoteIamPolicyPlainArgs();

    @Import(name="noteId", required=true)
    private String noteId;

    public String noteId() {
        return this.noteId;
    }

    @Import(name="providerId", required=true)
    private String providerId;

    public String providerId() {
        return this.providerId;
    }

    private GetProviderNoteIamPolicyPlainArgs() {}

    private GetProviderNoteIamPolicyPlainArgs(GetProviderNoteIamPolicyPlainArgs $) {
        this.noteId = $.noteId;
        this.providerId = $.providerId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProviderNoteIamPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProviderNoteIamPolicyPlainArgs $;

        public Builder() {
            $ = new GetProviderNoteIamPolicyPlainArgs();
        }

        public Builder(GetProviderNoteIamPolicyPlainArgs defaults) {
            $ = new GetProviderNoteIamPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder noteId(String noteId) {
            $.noteId = noteId;
            return this;
        }

        public Builder providerId(String providerId) {
            $.providerId = providerId;
            return this;
        }

        public GetProviderNoteIamPolicyPlainArgs build() {
            $.noteId = Objects.requireNonNull($.noteId, "expected parameter 'noteId' to be non-null");
            $.providerId = Objects.requireNonNull($.providerId, "expected parameter 'providerId' to be non-null");
            return $;
        }
    }

}