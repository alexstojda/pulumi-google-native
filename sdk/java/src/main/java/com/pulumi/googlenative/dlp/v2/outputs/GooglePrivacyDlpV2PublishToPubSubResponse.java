// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp.v2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2PublishToPubSubResponse {
    /**
     * @return Cloud Pub/Sub topic to send notifications to. The topic must have given publishing access rights to the DLP API service account executing the long running DlpJob sending the notifications. Format is projects/{project}/topics/{topic}.
     * 
     */
    private String topic;

    private GooglePrivacyDlpV2PublishToPubSubResponse() {}
    /**
     * @return Cloud Pub/Sub topic to send notifications to. The topic must have given publishing access rights to the DLP API service account executing the long running DlpJob sending the notifications. Format is projects/{project}/topics/{topic}.
     * 
     */
    public String topic() {
        return this.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2PublishToPubSubResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String topic;
        public Builder() {}
        public Builder(GooglePrivacyDlpV2PublishToPubSubResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.topic = defaults.topic;
        }

        @CustomType.Setter
        public Builder topic(String topic) {
            this.topic = Objects.requireNonNull(topic);
            return this;
        }
        public GooglePrivacyDlpV2PublishToPubSubResponse build() {
            final var o = new GooglePrivacyDlpV2PublishToPubSubResponse();
            o.topic = topic;
            return o;
        }
    }
}