// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCertificateAuthorityIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCertificateAuthorityIamPolicyArgs Empty = new GetCertificateAuthorityIamPolicyArgs();

    @Import(name="certificateAuthorityId", required=true)
    private Output<String> certificateAuthorityId;

    public Output<String> certificateAuthorityId() {
        return this.certificateAuthorityId;
    }

    @Import(name="location", required=true)
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }

    @Import(name="optionsRequestedPolicyVersion")
    private @Nullable Output<String> optionsRequestedPolicyVersion;

    public Optional<Output<String>> optionsRequestedPolicyVersion() {
        return Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetCertificateAuthorityIamPolicyArgs() {}

    private GetCertificateAuthorityIamPolicyArgs(GetCertificateAuthorityIamPolicyArgs $) {
        this.certificateAuthorityId = $.certificateAuthorityId;
        this.location = $.location;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCertificateAuthorityIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCertificateAuthorityIamPolicyArgs $;

        public Builder() {
            $ = new GetCertificateAuthorityIamPolicyArgs();
        }

        public Builder(GetCertificateAuthorityIamPolicyArgs defaults) {
            $ = new GetCertificateAuthorityIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder certificateAuthorityId(Output<String> certificateAuthorityId) {
            $.certificateAuthorityId = certificateAuthorityId;
            return this;
        }

        public Builder certificateAuthorityId(String certificateAuthorityId) {
            return certificateAuthorityId(Output.of(certificateAuthorityId));
        }

        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder optionsRequestedPolicyVersion(@Nullable Output<String> optionsRequestedPolicyVersion) {
            $.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder optionsRequestedPolicyVersion(String optionsRequestedPolicyVersion) {
            return optionsRequestedPolicyVersion(Output.of(optionsRequestedPolicyVersion));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetCertificateAuthorityIamPolicyArgs build() {
            $.certificateAuthorityId = Objects.requireNonNull($.certificateAuthorityId, "expected parameter 'certificateAuthorityId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}