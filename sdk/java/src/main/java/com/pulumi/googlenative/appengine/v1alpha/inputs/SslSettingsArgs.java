// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine.v1alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * SSL configuration for a DomainMapping resource.
 * 
 */
public final class SslSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final SslSettingsArgs Empty = new SslSettingsArgs();

    /**
     * ID of the AuthorizedCertificate resource configuring SSL for the application. Clearing this field will remove SSL support.By default, a managed certificate is automatically created for every domain mapping. To omit SSL support or to configure SSL manually, specify no_managed_certificate on a CREATE or UPDATE request. You must be authorized to administer the AuthorizedCertificate resource to manually map it to a DomainMapping resource. Example: 12345.
     * 
     */
    @Import(name="certificateId")
    private @Nullable Output<String> certificateId;

    /**
     * @return ID of the AuthorizedCertificate resource configuring SSL for the application. Clearing this field will remove SSL support.By default, a managed certificate is automatically created for every domain mapping. To omit SSL support or to configure SSL manually, specify no_managed_certificate on a CREATE or UPDATE request. You must be authorized to administer the AuthorizedCertificate resource to manually map it to a DomainMapping resource. Example: 12345.
     * 
     */
    public Optional<Output<String>> certificateId() {
        return Optional.ofNullable(this.certificateId);
    }

    private SslSettingsArgs() {}

    private SslSettingsArgs(SslSettingsArgs $) {
        this.certificateId = $.certificateId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SslSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SslSettingsArgs $;

        public Builder() {
            $ = new SslSettingsArgs();
        }

        public Builder(SslSettingsArgs defaults) {
            $ = new SslSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificateId ID of the AuthorizedCertificate resource configuring SSL for the application. Clearing this field will remove SSL support.By default, a managed certificate is automatically created for every domain mapping. To omit SSL support or to configure SSL manually, specify no_managed_certificate on a CREATE or UPDATE request. You must be authorized to administer the AuthorizedCertificate resource to manually map it to a DomainMapping resource. Example: 12345.
         * 
         * @return builder
         * 
         */
        public Builder certificateId(@Nullable Output<String> certificateId) {
            $.certificateId = certificateId;
            return this;
        }

        /**
         * @param certificateId ID of the AuthorizedCertificate resource configuring SSL for the application. Clearing this field will remove SSL support.By default, a managed certificate is automatically created for every domain mapping. To omit SSL support or to configure SSL manually, specify no_managed_certificate on a CREATE or UPDATE request. You must be authorized to administer the AuthorizedCertificate resource to manually map it to a DomainMapping resource. Example: 12345.
         * 
         * @return builder
         * 
         */
        public Builder certificateId(String certificateId) {
            return certificateId(Output.of(certificateId));
        }

        public SslSettingsArgs build() {
            return $;
        }
    }

}