// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sourcerepo.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MirrorConfigResponse {
    /**
     * @return ID of the SSH deploy key at the other hosting service. Removing this key from the other service would deauthorize Google Cloud Source Repositories from mirroring.
     * 
     */
    private String deployKeyId;
    /**
     * @return URL of the main repository at the other hosting service.
     * 
     */
    private String url;
    /**
     * @return ID of the webhook listening to updates to trigger mirroring. Removing this webhook from the other hosting service will stop Google Cloud Source Repositories from receiving notifications, and thereby disabling mirroring.
     * 
     */
    private String webhookId;

    private MirrorConfigResponse() {}
    /**
     * @return ID of the SSH deploy key at the other hosting service. Removing this key from the other service would deauthorize Google Cloud Source Repositories from mirroring.
     * 
     */
    public String deployKeyId() {
        return this.deployKeyId;
    }
    /**
     * @return URL of the main repository at the other hosting service.
     * 
     */
    public String url() {
        return this.url;
    }
    /**
     * @return ID of the webhook listening to updates to trigger mirroring. Removing this webhook from the other hosting service will stop Google Cloud Source Repositories from receiving notifications, and thereby disabling mirroring.
     * 
     */
    public String webhookId() {
        return this.webhookId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MirrorConfigResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String deployKeyId;
        private String url;
        private String webhookId;
        public Builder() {}
        public Builder(MirrorConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deployKeyId = defaults.deployKeyId;
    	      this.url = defaults.url;
    	      this.webhookId = defaults.webhookId;
        }

        @CustomType.Setter
        public Builder deployKeyId(String deployKeyId) {
            this.deployKeyId = Objects.requireNonNull(deployKeyId);
            return this;
        }
        @CustomType.Setter
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        @CustomType.Setter
        public Builder webhookId(String webhookId) {
            this.webhookId = Objects.requireNonNull(webhookId);
            return this;
        }
        public MirrorConfigResponse build() {
            final var o = new MirrorConfigResponse();
            o.deployKeyId = deployKeyId;
            o.url = url;
            o.webhookId = webhookId;
            return o;
        }
    }
}