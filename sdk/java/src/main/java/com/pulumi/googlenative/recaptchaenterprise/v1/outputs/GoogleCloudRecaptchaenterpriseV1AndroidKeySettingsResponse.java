// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.recaptchaenterprise.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsResponse {
    /**
     * @return If set to true, allowed_package_names are not enforced.
     * 
     */
    private Boolean allowAllPackageNames;
    /**
     * @return Android package names of apps allowed to use the key. Example: &#39;com.companyname.appname&#39;
     * 
     */
    private List<String> allowedPackageNames;

    private GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsResponse() {}
    /**
     * @return If set to true, allowed_package_names are not enforced.
     * 
     */
    public Boolean allowAllPackageNames() {
        return this.allowAllPackageNames;
    }
    /**
     * @return Android package names of apps allowed to use the key. Example: &#39;com.companyname.appname&#39;
     * 
     */
    public List<String> allowedPackageNames() {
        return this.allowedPackageNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean allowAllPackageNames;
        private List<String> allowedPackageNames;
        public Builder() {}
        public Builder(GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowAllPackageNames = defaults.allowAllPackageNames;
    	      this.allowedPackageNames = defaults.allowedPackageNames;
        }

        @CustomType.Setter
        public Builder allowAllPackageNames(Boolean allowAllPackageNames) {
            this.allowAllPackageNames = Objects.requireNonNull(allowAllPackageNames);
            return this;
        }
        @CustomType.Setter
        public Builder allowedPackageNames(List<String> allowedPackageNames) {
            this.allowedPackageNames = Objects.requireNonNull(allowedPackageNames);
            return this;
        }
        public Builder allowedPackageNames(String... allowedPackageNames) {
            return allowedPackageNames(List.of(allowedPackageNames));
        }
        public GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsResponse build() {
            final var o = new GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsResponse();
            o.allowAllPackageNames = allowAllPackageNames;
            o.allowedPackageNames = allowedPackageNames;
            return o;
        }
    }
}