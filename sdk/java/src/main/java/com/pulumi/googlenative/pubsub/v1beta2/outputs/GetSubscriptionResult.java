// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.pubsub.v1beta2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.pubsub.v1beta2.outputs.PushConfigResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSubscriptionResult {
    /**
     * @return This value is the maximum time after a subscriber receives a message before the subscriber should acknowledge the message. After message delivery but before the ack deadline expires and before the message is acknowledged, it is an outstanding message and will not be delivered again during that time (on a best-effort basis). For pull subscriptions, this value is used as the initial value for the ack deadline. To override this value for a given message, call `ModifyAckDeadline` with the corresponding `ack_id` if using pull. The maximum custom deadline you can specify is 600 seconds (10 minutes). For push delivery, this value is also used to set the request timeout for the call to the push endpoint. If the subscriber never acknowledges the message, the Pub/Sub system will eventually redeliver the message. If this parameter is 0, a default value of 10 seconds is used.
     * 
     */
    private Integer ackDeadlineSeconds;
    /**
     * @return The name of the subscription. It must have the format `&#34;projects/{project}/subscriptions/{subscription}&#34;`. `{subscription}` must start with a letter, and contain only letters (`[A-Za-z]`), numbers (`[0-9]`), dashes (`-`), underscores (`_`), periods (`.`), tildes (`~`), plus (`+`) or percent signs (`%`). It must be between 3 and 255 characters in length, and it must not start with `&#34;goog&#34;`.
     * 
     */
    private String name;
    /**
     * @return If push delivery is used with this subscription, this field is used to configure it. An empty `pushConfig` signifies that the subscriber will pull and ack messages using API methods.
     * 
     */
    private PushConfigResponse pushConfig;
    /**
     * @return The name of the topic from which this subscription is receiving messages. The value of this field will be `_deleted-topic_` if the topic has been deleted.
     * 
     */
    private String topic;

    private GetSubscriptionResult() {}
    /**
     * @return This value is the maximum time after a subscriber receives a message before the subscriber should acknowledge the message. After message delivery but before the ack deadline expires and before the message is acknowledged, it is an outstanding message and will not be delivered again during that time (on a best-effort basis). For pull subscriptions, this value is used as the initial value for the ack deadline. To override this value for a given message, call `ModifyAckDeadline` with the corresponding `ack_id` if using pull. The maximum custom deadline you can specify is 600 seconds (10 minutes). For push delivery, this value is also used to set the request timeout for the call to the push endpoint. If the subscriber never acknowledges the message, the Pub/Sub system will eventually redeliver the message. If this parameter is 0, a default value of 10 seconds is used.
     * 
     */
    public Integer ackDeadlineSeconds() {
        return this.ackDeadlineSeconds;
    }
    /**
     * @return The name of the subscription. It must have the format `&#34;projects/{project}/subscriptions/{subscription}&#34;`. `{subscription}` must start with a letter, and contain only letters (`[A-Za-z]`), numbers (`[0-9]`), dashes (`-`), underscores (`_`), periods (`.`), tildes (`~`), plus (`+`) or percent signs (`%`). It must be between 3 and 255 characters in length, and it must not start with `&#34;goog&#34;`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return If push delivery is used with this subscription, this field is used to configure it. An empty `pushConfig` signifies that the subscriber will pull and ack messages using API methods.
     * 
     */
    public PushConfigResponse pushConfig() {
        return this.pushConfig;
    }
    /**
     * @return The name of the topic from which this subscription is receiving messages. The value of this field will be `_deleted-topic_` if the topic has been deleted.
     * 
     */
    public String topic() {
        return this.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubscriptionResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer ackDeadlineSeconds;
        private String name;
        private PushConfigResponse pushConfig;
        private String topic;
        public Builder() {}
        public Builder(GetSubscriptionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ackDeadlineSeconds = defaults.ackDeadlineSeconds;
    	      this.name = defaults.name;
    	      this.pushConfig = defaults.pushConfig;
    	      this.topic = defaults.topic;
        }

        @CustomType.Setter
        public Builder ackDeadlineSeconds(Integer ackDeadlineSeconds) {
            this.ackDeadlineSeconds = Objects.requireNonNull(ackDeadlineSeconds);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder pushConfig(PushConfigResponse pushConfig) {
            this.pushConfig = Objects.requireNonNull(pushConfig);
            return this;
        }
        @CustomType.Setter
        public Builder topic(String topic) {
            this.topic = Objects.requireNonNull(topic);
            return this;
        }
        public GetSubscriptionResult build() {
            final var o = new GetSubscriptionResult();
            o.ackDeadlineSeconds = ackDeadlineSeconds;
            o.name = name;
            o.pushConfig = pushConfig;
            o.topic = topic;
            return o;
        }
    }
}