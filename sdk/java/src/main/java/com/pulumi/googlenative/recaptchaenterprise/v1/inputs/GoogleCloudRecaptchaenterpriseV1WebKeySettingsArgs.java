// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.recaptchaenterprise.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.recaptchaenterprise.v1.enums.GoogleCloudRecaptchaenterpriseV1WebKeySettingsChallengeSecurityPreference;
import com.pulumi.googlenative.recaptchaenterprise.v1.enums.GoogleCloudRecaptchaenterpriseV1WebKeySettingsIntegrationType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Settings specific to keys that can be used by websites.
 * 
 */
public final class GoogleCloudRecaptchaenterpriseV1WebKeySettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRecaptchaenterpriseV1WebKeySettingsArgs Empty = new GoogleCloudRecaptchaenterpriseV1WebKeySettingsArgs();

    /**
     * If set to true, it means allowed_domains will not be enforced.
     * 
     */
    @Import(name="allowAllDomains")
    private @Nullable Output<Boolean> allowAllDomains;

    /**
     * @return If set to true, it means allowed_domains will not be enforced.
     * 
     */
    public Optional<Output<Boolean>> allowAllDomains() {
        return Optional.ofNullable(this.allowAllDomains);
    }

    /**
     * If set to true, the key can be used on AMP (Accelerated Mobile Pages) websites. This is supported only for the SCORE integration type.
     * 
     */
    @Import(name="allowAmpTraffic")
    private @Nullable Output<Boolean> allowAmpTraffic;

    /**
     * @return If set to true, the key can be used on AMP (Accelerated Mobile Pages) websites. This is supported only for the SCORE integration type.
     * 
     */
    public Optional<Output<Boolean>> allowAmpTraffic() {
        return Optional.ofNullable(this.allowAmpTraffic);
    }

    /**
     * Domains or subdomains of websites allowed to use the key. All subdomains of an allowed domain are automatically allowed. A valid domain requires a host and must not include any path, port, query or fragment. Examples: &#39;example.com&#39; or &#39;subdomain.example.com&#39;
     * 
     */
    @Import(name="allowedDomains")
    private @Nullable Output<List<String>> allowedDomains;

    /**
     * @return Domains or subdomains of websites allowed to use the key. All subdomains of an allowed domain are automatically allowed. A valid domain requires a host and must not include any path, port, query or fragment. Examples: &#39;example.com&#39; or &#39;subdomain.example.com&#39;
     * 
     */
    public Optional<Output<List<String>>> allowedDomains() {
        return Optional.ofNullable(this.allowedDomains);
    }

    /**
     * Settings for the frequency and difficulty at which this key triggers captcha challenges. This should only be specified for IntegrationTypes CHECKBOX and INVISIBLE.
     * 
     */
    @Import(name="challengeSecurityPreference")
    private @Nullable Output<GoogleCloudRecaptchaenterpriseV1WebKeySettingsChallengeSecurityPreference> challengeSecurityPreference;

    /**
     * @return Settings for the frequency and difficulty at which this key triggers captcha challenges. This should only be specified for IntegrationTypes CHECKBOX and INVISIBLE.
     * 
     */
    public Optional<Output<GoogleCloudRecaptchaenterpriseV1WebKeySettingsChallengeSecurityPreference>> challengeSecurityPreference() {
        return Optional.ofNullable(this.challengeSecurityPreference);
    }

    /**
     * Describes how this key is integrated with the website.
     * 
     */
    @Import(name="integrationType", required=true)
    private Output<GoogleCloudRecaptchaenterpriseV1WebKeySettingsIntegrationType> integrationType;

    /**
     * @return Describes how this key is integrated with the website.
     * 
     */
    public Output<GoogleCloudRecaptchaenterpriseV1WebKeySettingsIntegrationType> integrationType() {
        return this.integrationType;
    }

    private GoogleCloudRecaptchaenterpriseV1WebKeySettingsArgs() {}

    private GoogleCloudRecaptchaenterpriseV1WebKeySettingsArgs(GoogleCloudRecaptchaenterpriseV1WebKeySettingsArgs $) {
        this.allowAllDomains = $.allowAllDomains;
        this.allowAmpTraffic = $.allowAmpTraffic;
        this.allowedDomains = $.allowedDomains;
        this.challengeSecurityPreference = $.challengeSecurityPreference;
        this.integrationType = $.integrationType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudRecaptchaenterpriseV1WebKeySettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRecaptchaenterpriseV1WebKeySettingsArgs $;

        public Builder() {
            $ = new GoogleCloudRecaptchaenterpriseV1WebKeySettingsArgs();
        }

        public Builder(GoogleCloudRecaptchaenterpriseV1WebKeySettingsArgs defaults) {
            $ = new GoogleCloudRecaptchaenterpriseV1WebKeySettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowAllDomains If set to true, it means allowed_domains will not be enforced.
         * 
         * @return builder
         * 
         */
        public Builder allowAllDomains(@Nullable Output<Boolean> allowAllDomains) {
            $.allowAllDomains = allowAllDomains;
            return this;
        }

        /**
         * @param allowAllDomains If set to true, it means allowed_domains will not be enforced.
         * 
         * @return builder
         * 
         */
        public Builder allowAllDomains(Boolean allowAllDomains) {
            return allowAllDomains(Output.of(allowAllDomains));
        }

        /**
         * @param allowAmpTraffic If set to true, the key can be used on AMP (Accelerated Mobile Pages) websites. This is supported only for the SCORE integration type.
         * 
         * @return builder
         * 
         */
        public Builder allowAmpTraffic(@Nullable Output<Boolean> allowAmpTraffic) {
            $.allowAmpTraffic = allowAmpTraffic;
            return this;
        }

        /**
         * @param allowAmpTraffic If set to true, the key can be used on AMP (Accelerated Mobile Pages) websites. This is supported only for the SCORE integration type.
         * 
         * @return builder
         * 
         */
        public Builder allowAmpTraffic(Boolean allowAmpTraffic) {
            return allowAmpTraffic(Output.of(allowAmpTraffic));
        }

        /**
         * @param allowedDomains Domains or subdomains of websites allowed to use the key. All subdomains of an allowed domain are automatically allowed. A valid domain requires a host and must not include any path, port, query or fragment. Examples: &#39;example.com&#39; or &#39;subdomain.example.com&#39;
         * 
         * @return builder
         * 
         */
        public Builder allowedDomains(@Nullable Output<List<String>> allowedDomains) {
            $.allowedDomains = allowedDomains;
            return this;
        }

        /**
         * @param allowedDomains Domains or subdomains of websites allowed to use the key. All subdomains of an allowed domain are automatically allowed. A valid domain requires a host and must not include any path, port, query or fragment. Examples: &#39;example.com&#39; or &#39;subdomain.example.com&#39;
         * 
         * @return builder
         * 
         */
        public Builder allowedDomains(List<String> allowedDomains) {
            return allowedDomains(Output.of(allowedDomains));
        }

        /**
         * @param allowedDomains Domains or subdomains of websites allowed to use the key. All subdomains of an allowed domain are automatically allowed. A valid domain requires a host and must not include any path, port, query or fragment. Examples: &#39;example.com&#39; or &#39;subdomain.example.com&#39;
         * 
         * @return builder
         * 
         */
        public Builder allowedDomains(String... allowedDomains) {
            return allowedDomains(List.of(allowedDomains));
        }

        /**
         * @param challengeSecurityPreference Settings for the frequency and difficulty at which this key triggers captcha challenges. This should only be specified for IntegrationTypes CHECKBOX and INVISIBLE.
         * 
         * @return builder
         * 
         */
        public Builder challengeSecurityPreference(@Nullable Output<GoogleCloudRecaptchaenterpriseV1WebKeySettingsChallengeSecurityPreference> challengeSecurityPreference) {
            $.challengeSecurityPreference = challengeSecurityPreference;
            return this;
        }

        /**
         * @param challengeSecurityPreference Settings for the frequency and difficulty at which this key triggers captcha challenges. This should only be specified for IntegrationTypes CHECKBOX and INVISIBLE.
         * 
         * @return builder
         * 
         */
        public Builder challengeSecurityPreference(GoogleCloudRecaptchaenterpriseV1WebKeySettingsChallengeSecurityPreference challengeSecurityPreference) {
            return challengeSecurityPreference(Output.of(challengeSecurityPreference));
        }

        /**
         * @param integrationType Describes how this key is integrated with the website.
         * 
         * @return builder
         * 
         */
        public Builder integrationType(Output<GoogleCloudRecaptchaenterpriseV1WebKeySettingsIntegrationType> integrationType) {
            $.integrationType = integrationType;
            return this;
        }

        /**
         * @param integrationType Describes how this key is integrated with the website.
         * 
         * @return builder
         * 
         */
        public Builder integrationType(GoogleCloudRecaptchaenterpriseV1WebKeySettingsIntegrationType integrationType) {
            return integrationType(Output.of(integrationType));
        }

        public GoogleCloudRecaptchaenterpriseV1WebKeySettingsArgs build() {
            $.integrationType = Objects.requireNonNull($.integrationType, "expected parameter 'integrationType' to be non-null");
            return $;
        }
    }

}