// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSslCertificateArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSslCertificateArgs Empty = new GetSslCertificateArgs();

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="sslCertificate", required=true)
    private Output<String> sslCertificate;

    public Output<String> sslCertificate() {
        return this.sslCertificate;
    }

    private GetSslCertificateArgs() {}

    private GetSslCertificateArgs(GetSslCertificateArgs $) {
        this.project = $.project;
        this.sslCertificate = $.sslCertificate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSslCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSslCertificateArgs $;

        public Builder() {
            $ = new GetSslCertificateArgs();
        }

        public Builder(GetSslCertificateArgs defaults) {
            $ = new GetSslCertificateArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder sslCertificate(Output<String> sslCertificate) {
            $.sslCertificate = sslCertificate;
            return this;
        }

        public Builder sslCertificate(String sslCertificate) {
            return sslCertificate(Output.of(sslCertificate));
        }

        public GetSslCertificateArgs build() {
            $.sslCertificate = Objects.requireNonNull($.sslCertificate, "expected parameter 'sslCertificate' to be non-null");
            return $;
        }
    }

}