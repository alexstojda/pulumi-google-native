// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.websecurityscanner.v1beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Describes authentication configuration when Web-Security-Scanner service account is added in Identity-Aware-Proxy (IAP) access policies.
 * 
 */
public final class IapTestServiceAccountInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final IapTestServiceAccountInfoArgs Empty = new IapTestServiceAccountInfoArgs();

    /**
     * Describes OAuth2 Client ID of resources protected by Identity-Aware-Proxy(IAP).
     * 
     */
    @Import(name="targetAudienceClientId", required=true)
    private Output<String> targetAudienceClientId;

    /**
     * @return Describes OAuth2 Client ID of resources protected by Identity-Aware-Proxy(IAP).
     * 
     */
    public Output<String> targetAudienceClientId() {
        return this.targetAudienceClientId;
    }

    private IapTestServiceAccountInfoArgs() {}

    private IapTestServiceAccountInfoArgs(IapTestServiceAccountInfoArgs $) {
        this.targetAudienceClientId = $.targetAudienceClientId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IapTestServiceAccountInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IapTestServiceAccountInfoArgs $;

        public Builder() {
            $ = new IapTestServiceAccountInfoArgs();
        }

        public Builder(IapTestServiceAccountInfoArgs defaults) {
            $ = new IapTestServiceAccountInfoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param targetAudienceClientId Describes OAuth2 Client ID of resources protected by Identity-Aware-Proxy(IAP).
         * 
         * @return builder
         * 
         */
        public Builder targetAudienceClientId(Output<String> targetAudienceClientId) {
            $.targetAudienceClientId = targetAudienceClientId;
            return this;
        }

        /**
         * @param targetAudienceClientId Describes OAuth2 Client ID of resources protected by Identity-Aware-Proxy(IAP).
         * 
         * @return builder
         * 
         */
        public Builder targetAudienceClientId(String targetAudienceClientId) {
            return targetAudienceClientId(Output.of(targetAudienceClientId));
        }

        public IapTestServiceAccountInfoArgs build() {
            $.targetAudienceClientId = Objects.requireNonNull($.targetAudienceClientId, "expected parameter 'targetAudienceClientId' to be non-null");
            return $;
        }
    }

}