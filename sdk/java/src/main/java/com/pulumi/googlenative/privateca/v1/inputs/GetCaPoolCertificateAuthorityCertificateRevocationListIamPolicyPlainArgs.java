// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca.v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCaPoolCertificateAuthorityCertificateRevocationListIamPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCaPoolCertificateAuthorityCertificateRevocationListIamPolicyPlainArgs Empty = new GetCaPoolCertificateAuthorityCertificateRevocationListIamPolicyPlainArgs();

    @Import(name="caPoolId", required=true)
    private String caPoolId;

    public String caPoolId() {
        return this.caPoolId;
    }

    @Import(name="certificateAuthorityId", required=true)
    private String certificateAuthorityId;

    public String certificateAuthorityId() {
        return this.certificateAuthorityId;
    }

    @Import(name="certificateRevocationListId", required=true)
    private String certificateRevocationListId;

    public String certificateRevocationListId() {
        return this.certificateRevocationListId;
    }

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="optionsRequestedPolicyVersion")
    private @Nullable String optionsRequestedPolicyVersion;

    public Optional<String> optionsRequestedPolicyVersion() {
        return Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetCaPoolCertificateAuthorityCertificateRevocationListIamPolicyPlainArgs() {}

    private GetCaPoolCertificateAuthorityCertificateRevocationListIamPolicyPlainArgs(GetCaPoolCertificateAuthorityCertificateRevocationListIamPolicyPlainArgs $) {
        this.caPoolId = $.caPoolId;
        this.certificateAuthorityId = $.certificateAuthorityId;
        this.certificateRevocationListId = $.certificateRevocationListId;
        this.location = $.location;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCaPoolCertificateAuthorityCertificateRevocationListIamPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCaPoolCertificateAuthorityCertificateRevocationListIamPolicyPlainArgs $;

        public Builder() {
            $ = new GetCaPoolCertificateAuthorityCertificateRevocationListIamPolicyPlainArgs();
        }

        public Builder(GetCaPoolCertificateAuthorityCertificateRevocationListIamPolicyPlainArgs defaults) {
            $ = new GetCaPoolCertificateAuthorityCertificateRevocationListIamPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder caPoolId(String caPoolId) {
            $.caPoolId = caPoolId;
            return this;
        }

        public Builder certificateAuthorityId(String certificateAuthorityId) {
            $.certificateAuthorityId = certificateAuthorityId;
            return this;
        }

        public Builder certificateRevocationListId(String certificateRevocationListId) {
            $.certificateRevocationListId = certificateRevocationListId;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder optionsRequestedPolicyVersion(@Nullable String optionsRequestedPolicyVersion) {
            $.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetCaPoolCertificateAuthorityCertificateRevocationListIamPolicyPlainArgs build() {
            $.caPoolId = Objects.requireNonNull($.caPoolId, "expected parameter 'caPoolId' to be non-null");
            $.certificateAuthorityId = Objects.requireNonNull($.certificateAuthorityId, "expected parameter 'certificateAuthorityId' to be non-null");
            $.certificateRevocationListId = Objects.requireNonNull($.certificateRevocationListId, "expected parameter 'certificateRevocationListId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}