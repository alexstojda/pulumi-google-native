// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.recaptchaenterprise.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.recaptchaenterprise.v1.enums.GoogleCloudRecaptchaenterpriseV1WafSettingsWafFeature;
import com.pulumi.googlenative.recaptchaenterprise.v1.enums.GoogleCloudRecaptchaenterpriseV1WafSettingsWafService;
import java.util.Objects;


/**
 * Settings specific to keys that can be used for WAF (Web Application Firewall).
 * 
 */
public final class GoogleCloudRecaptchaenterpriseV1WafSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRecaptchaenterpriseV1WafSettingsArgs Empty = new GoogleCloudRecaptchaenterpriseV1WafSettingsArgs();

    /**
     * The WAF feature for which this key is enabled.
     * 
     */
    @Import(name="wafFeature", required=true)
    private Output<GoogleCloudRecaptchaenterpriseV1WafSettingsWafFeature> wafFeature;

    /**
     * @return The WAF feature for which this key is enabled.
     * 
     */
    public Output<GoogleCloudRecaptchaenterpriseV1WafSettingsWafFeature> wafFeature() {
        return this.wafFeature;
    }

    /**
     * The WAF service that uses this key.
     * 
     */
    @Import(name="wafService", required=true)
    private Output<GoogleCloudRecaptchaenterpriseV1WafSettingsWafService> wafService;

    /**
     * @return The WAF service that uses this key.
     * 
     */
    public Output<GoogleCloudRecaptchaenterpriseV1WafSettingsWafService> wafService() {
        return this.wafService;
    }

    private GoogleCloudRecaptchaenterpriseV1WafSettingsArgs() {}

    private GoogleCloudRecaptchaenterpriseV1WafSettingsArgs(GoogleCloudRecaptchaenterpriseV1WafSettingsArgs $) {
        this.wafFeature = $.wafFeature;
        this.wafService = $.wafService;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudRecaptchaenterpriseV1WafSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRecaptchaenterpriseV1WafSettingsArgs $;

        public Builder() {
            $ = new GoogleCloudRecaptchaenterpriseV1WafSettingsArgs();
        }

        public Builder(GoogleCloudRecaptchaenterpriseV1WafSettingsArgs defaults) {
            $ = new GoogleCloudRecaptchaenterpriseV1WafSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param wafFeature The WAF feature for which this key is enabled.
         * 
         * @return builder
         * 
         */
        public Builder wafFeature(Output<GoogleCloudRecaptchaenterpriseV1WafSettingsWafFeature> wafFeature) {
            $.wafFeature = wafFeature;
            return this;
        }

        /**
         * @param wafFeature The WAF feature for which this key is enabled.
         * 
         * @return builder
         * 
         */
        public Builder wafFeature(GoogleCloudRecaptchaenterpriseV1WafSettingsWafFeature wafFeature) {
            return wafFeature(Output.of(wafFeature));
        }

        /**
         * @param wafService The WAF service that uses this key.
         * 
         * @return builder
         * 
         */
        public Builder wafService(Output<GoogleCloudRecaptchaenterpriseV1WafSettingsWafService> wafService) {
            $.wafService = wafService;
            return this;
        }

        /**
         * @param wafService The WAF service that uses this key.
         * 
         * @return builder
         * 
         */
        public Builder wafService(GoogleCloudRecaptchaenterpriseV1WafSettingsWafService wafService) {
            return wafService(Output.of(wafService));
        }

        public GoogleCloudRecaptchaenterpriseV1WafSettingsArgs build() {
            $.wafFeature = Objects.requireNonNull($.wafFeature, "expected parameter 'wafFeature' to be non-null");
            $.wafService = Objects.requireNonNull($.wafService, "expected parameter 'wafService' to be non-null");
            return $;
        }
    }

}