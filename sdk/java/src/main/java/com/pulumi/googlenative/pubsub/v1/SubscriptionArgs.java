// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.pubsub.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.pubsub.v1.inputs.BigQueryConfigArgs;
import com.pulumi.googlenative.pubsub.v1.inputs.DeadLetterPolicyArgs;
import com.pulumi.googlenative.pubsub.v1.inputs.ExpirationPolicyArgs;
import com.pulumi.googlenative.pubsub.v1.inputs.PushConfigArgs;
import com.pulumi.googlenative.pubsub.v1.inputs.RetryPolicyArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SubscriptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final SubscriptionArgs Empty = new SubscriptionArgs();

    /**
     * The approximate amount of time (on a best-effort basis) Pub/Sub waits for the subscriber to acknowledge receipt before resending the message. In the interval after the message is delivered and before it is acknowledged, it is considered to be *outstanding*. During that time period, the message will not be redelivered (on a best-effort basis). For pull subscriptions, this value is used as the initial value for the ack deadline. To override this value for a given message, call `ModifyAckDeadline` with the corresponding `ack_id` if using non-streaming pull or send the `ack_id` in a `StreamingModifyAckDeadlineRequest` if using streaming pull. The minimum custom deadline you can specify is 10 seconds. The maximum custom deadline you can specify is 600 seconds (10 minutes). If this parameter is 0, a default value of 10 seconds is used. For push delivery, this value is also used to set the request timeout for the call to the push endpoint. If the subscriber never acknowledges the message, the Pub/Sub system will eventually redeliver the message.
     * 
     */
    @Import(name="ackDeadlineSeconds")
    private @Nullable Output<Integer> ackDeadlineSeconds;

    /**
     * @return The approximate amount of time (on a best-effort basis) Pub/Sub waits for the subscriber to acknowledge receipt before resending the message. In the interval after the message is delivered and before it is acknowledged, it is considered to be *outstanding*. During that time period, the message will not be redelivered (on a best-effort basis). For pull subscriptions, this value is used as the initial value for the ack deadline. To override this value for a given message, call `ModifyAckDeadline` with the corresponding `ack_id` if using non-streaming pull or send the `ack_id` in a `StreamingModifyAckDeadlineRequest` if using streaming pull. The minimum custom deadline you can specify is 10 seconds. The maximum custom deadline you can specify is 600 seconds (10 minutes). If this parameter is 0, a default value of 10 seconds is used. For push delivery, this value is also used to set the request timeout for the call to the push endpoint. If the subscriber never acknowledges the message, the Pub/Sub system will eventually redeliver the message.
     * 
     */
    public Optional<Output<Integer>> ackDeadlineSeconds() {
        return Optional.ofNullable(this.ackDeadlineSeconds);
    }

    /**
     * If delivery to BigQuery is used with this subscription, this field is used to configure it. Either `pushConfig` or `bigQueryConfig` can be set, but not both. If both are empty, then the subscriber will pull and ack messages using API methods.
     * 
     */
    @Import(name="bigqueryConfig")
    private @Nullable Output<BigQueryConfigArgs> bigqueryConfig;

    /**
     * @return If delivery to BigQuery is used with this subscription, this field is used to configure it. Either `pushConfig` or `bigQueryConfig` can be set, but not both. If both are empty, then the subscriber will pull and ack messages using API methods.
     * 
     */
    public Optional<Output<BigQueryConfigArgs>> bigqueryConfig() {
        return Optional.ofNullable(this.bigqueryConfig);
    }

    /**
     * A policy that specifies the conditions for dead lettering messages in this subscription. If dead_letter_policy is not set, dead lettering is disabled. The Cloud Pub/Sub service account associated with this subscriptions&#39;s parent project (i.e., service-{project_number}@gcp-sa-pubsub.iam.gserviceaccount.com) must have permission to Acknowledge() messages on this subscription.
     * 
     */
    @Import(name="deadLetterPolicy")
    private @Nullable Output<DeadLetterPolicyArgs> deadLetterPolicy;

    /**
     * @return A policy that specifies the conditions for dead lettering messages in this subscription. If dead_letter_policy is not set, dead lettering is disabled. The Cloud Pub/Sub service account associated with this subscriptions&#39;s parent project (i.e., service-{project_number}@gcp-sa-pubsub.iam.gserviceaccount.com) must have permission to Acknowledge() messages on this subscription.
     * 
     */
    public Optional<Output<DeadLetterPolicyArgs>> deadLetterPolicy() {
        return Optional.ofNullable(this.deadLetterPolicy);
    }

    /**
     * Indicates whether the subscription is detached from its topic. Detached subscriptions don&#39;t receive messages from their topic and don&#39;t retain any backlog. `Pull` and `StreamingPull` requests will return FAILED_PRECONDITION. If the subscription is a push subscription, pushes to the endpoint will not be made.
     * 
     */
    @Import(name="detached")
    private @Nullable Output<Boolean> detached;

    /**
     * @return Indicates whether the subscription is detached from its topic. Detached subscriptions don&#39;t receive messages from their topic and don&#39;t retain any backlog. `Pull` and `StreamingPull` requests will return FAILED_PRECONDITION. If the subscription is a push subscription, pushes to the endpoint will not be made.
     * 
     */
    public Optional<Output<Boolean>> detached() {
        return Optional.ofNullable(this.detached);
    }

    /**
     * If true, Pub/Sub provides the following guarantees for the delivery of a message with a given value of `message_id` on this subscription: * The message sent to a subscriber is guaranteed not to be resent before the message&#39;s acknowledgement deadline expires. * An acknowledged message will not be resent to a subscriber. Note that subscribers may still receive multiple copies of a message when `enable_exactly_once_delivery` is true if the message was published multiple times by a publisher client. These copies are considered distinct by Pub/Sub and have distinct `message_id` values.
     * 
     */
    @Import(name="enableExactlyOnceDelivery")
    private @Nullable Output<Boolean> enableExactlyOnceDelivery;

    /**
     * @return If true, Pub/Sub provides the following guarantees for the delivery of a message with a given value of `message_id` on this subscription: * The message sent to a subscriber is guaranteed not to be resent before the message&#39;s acknowledgement deadline expires. * An acknowledged message will not be resent to a subscriber. Note that subscribers may still receive multiple copies of a message when `enable_exactly_once_delivery` is true if the message was published multiple times by a publisher client. These copies are considered distinct by Pub/Sub and have distinct `message_id` values.
     * 
     */
    public Optional<Output<Boolean>> enableExactlyOnceDelivery() {
        return Optional.ofNullable(this.enableExactlyOnceDelivery);
    }

    /**
     * If true, messages published with the same `ordering_key` in `PubsubMessage` will be delivered to the subscribers in the order in which they are received by the Pub/Sub system. Otherwise, they may be delivered in any order.
     * 
     */
    @Import(name="enableMessageOrdering")
    private @Nullable Output<Boolean> enableMessageOrdering;

    /**
     * @return If true, messages published with the same `ordering_key` in `PubsubMessage` will be delivered to the subscribers in the order in which they are received by the Pub/Sub system. Otherwise, they may be delivered in any order.
     * 
     */
    public Optional<Output<Boolean>> enableMessageOrdering() {
        return Optional.ofNullable(this.enableMessageOrdering);
    }

    /**
     * A policy that specifies the conditions for this subscription&#39;s expiration. A subscription is considered active as long as any connected subscriber is successfully consuming messages from the subscription or is issuing operations on the subscription. If `expiration_policy` is not set, a *default policy* with `ttl` of 31 days will be used. The minimum allowed value for `expiration_policy.ttl` is 1 day. If `expiration_policy` is set, but `expiration_policy.ttl` is not set, the subscription never expires.
     * 
     */
    @Import(name="expirationPolicy")
    private @Nullable Output<ExpirationPolicyArgs> expirationPolicy;

    /**
     * @return A policy that specifies the conditions for this subscription&#39;s expiration. A subscription is considered active as long as any connected subscriber is successfully consuming messages from the subscription or is issuing operations on the subscription. If `expiration_policy` is not set, a *default policy* with `ttl` of 31 days will be used. The minimum allowed value for `expiration_policy.ttl` is 1 day. If `expiration_policy` is set, but `expiration_policy.ttl` is not set, the subscription never expires.
     * 
     */
    public Optional<Output<ExpirationPolicyArgs>> expirationPolicy() {
        return Optional.ofNullable(this.expirationPolicy);
    }

    /**
     * An expression written in the Pub/Sub [filter language](https://cloud.google.com/pubsub/docs/filtering). If non-empty, then only `PubsubMessage`s whose `attributes` field matches the filter are delivered on this subscription. If empty, then no messages are filtered out.
     * 
     */
    @Import(name="filter")
    private @Nullable Output<String> filter;

    /**
     * @return An expression written in the Pub/Sub [filter language](https://cloud.google.com/pubsub/docs/filtering). If non-empty, then only `PubsubMessage`s whose `attributes` field matches the filter are delivered on this subscription. If empty, then no messages are filtered out.
     * 
     */
    public Optional<Output<String>> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * See Creating and managing labels.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return See Creating and managing labels.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * How long to retain unacknowledged messages in the subscription&#39;s backlog, from the moment a message is published. If `retain_acked_messages` is true, then this also configures the retention of acknowledged messages, and thus configures how far back in time a `Seek` can be done. Defaults to 7 days. Cannot be more than 7 days or less than 10 minutes.
     * 
     */
    @Import(name="messageRetentionDuration")
    private @Nullable Output<String> messageRetentionDuration;

    /**
     * @return How long to retain unacknowledged messages in the subscription&#39;s backlog, from the moment a message is published. If `retain_acked_messages` is true, then this also configures the retention of acknowledged messages, and thus configures how far back in time a `Seek` can be done. Defaults to 7 days. Cannot be more than 7 days or less than 10 minutes.
     * 
     */
    public Optional<Output<String>> messageRetentionDuration() {
        return Optional.ofNullable(this.messageRetentionDuration);
    }

    /**
     * The name of the subscription. It must have the format `&#34;projects/{project}/subscriptions/{subscription}&#34;`. `{subscription}` must start with a letter, and contain only letters (`[A-Za-z]`), numbers (`[0-9]`), dashes (`-`), underscores (`_`), periods (`.`), tildes (`~`), plus (`+`) or percent signs (`%`). It must be between 3 and 255 characters in length, and it must not start with `&#34;goog&#34;`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the subscription. It must have the format `&#34;projects/{project}/subscriptions/{subscription}&#34;`. `{subscription}` must start with a letter, and contain only letters (`[A-Za-z]`), numbers (`[0-9]`), dashes (`-`), underscores (`_`), periods (`.`), tildes (`~`), plus (`+`) or percent signs (`%`). It must be between 3 and 255 characters in length, and it must not start with `&#34;goog&#34;`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * If push delivery is used with this subscription, this field is used to configure it. Either `pushConfig` or `bigQueryConfig` can be set, but not both. If both are empty, then the subscriber will pull and ack messages using API methods.
     * 
     */
    @Import(name="pushConfig")
    private @Nullable Output<PushConfigArgs> pushConfig;

    /**
     * @return If push delivery is used with this subscription, this field is used to configure it. Either `pushConfig` or `bigQueryConfig` can be set, but not both. If both are empty, then the subscriber will pull and ack messages using API methods.
     * 
     */
    public Optional<Output<PushConfigArgs>> pushConfig() {
        return Optional.ofNullable(this.pushConfig);
    }

    /**
     * Indicates whether to retain acknowledged messages. If true, then messages are not expunged from the subscription&#39;s backlog, even if they are acknowledged, until they fall out of the `message_retention_duration` window. This must be true if you would like to [`Seek` to a timestamp] (https://cloud.google.com/pubsub/docs/replay-overview#seek_to_a_time) in the past to replay previously-acknowledged messages.
     * 
     */
    @Import(name="retainAckedMessages")
    private @Nullable Output<Boolean> retainAckedMessages;

    /**
     * @return Indicates whether to retain acknowledged messages. If true, then messages are not expunged from the subscription&#39;s backlog, even if they are acknowledged, until they fall out of the `message_retention_duration` window. This must be true if you would like to [`Seek` to a timestamp] (https://cloud.google.com/pubsub/docs/replay-overview#seek_to_a_time) in the past to replay previously-acknowledged messages.
     * 
     */
    public Optional<Output<Boolean>> retainAckedMessages() {
        return Optional.ofNullable(this.retainAckedMessages);
    }

    /**
     * A policy that specifies how Pub/Sub retries message delivery for this subscription. If not set, the default retry policy is applied. This generally implies that messages will be retried as soon as possible for healthy subscribers. RetryPolicy will be triggered on NACKs or acknowledgement deadline exceeded events for a given message.
     * 
     */
    @Import(name="retryPolicy")
    private @Nullable Output<RetryPolicyArgs> retryPolicy;

    /**
     * @return A policy that specifies how Pub/Sub retries message delivery for this subscription. If not set, the default retry policy is applied. This generally implies that messages will be retried as soon as possible for healthy subscribers. RetryPolicy will be triggered on NACKs or acknowledgement deadline exceeded events for a given message.
     * 
     */
    public Optional<Output<RetryPolicyArgs>> retryPolicy() {
        return Optional.ofNullable(this.retryPolicy);
    }

    @Import(name="subscriptionId", required=true)
    private Output<String> subscriptionId;

    public Output<String> subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * The name of the topic from which this subscription is receiving messages. Format is `projects/{project}/topics/{topic}`. The value of this field will be `_deleted-topic_` if the topic has been deleted.
     * 
     */
    @Import(name="topic", required=true)
    private Output<String> topic;

    /**
     * @return The name of the topic from which this subscription is receiving messages. Format is `projects/{project}/topics/{topic}`. The value of this field will be `_deleted-topic_` if the topic has been deleted.
     * 
     */
    public Output<String> topic() {
        return this.topic;
    }

    private SubscriptionArgs() {}

    private SubscriptionArgs(SubscriptionArgs $) {
        this.ackDeadlineSeconds = $.ackDeadlineSeconds;
        this.bigqueryConfig = $.bigqueryConfig;
        this.deadLetterPolicy = $.deadLetterPolicy;
        this.detached = $.detached;
        this.enableExactlyOnceDelivery = $.enableExactlyOnceDelivery;
        this.enableMessageOrdering = $.enableMessageOrdering;
        this.expirationPolicy = $.expirationPolicy;
        this.filter = $.filter;
        this.labels = $.labels;
        this.messageRetentionDuration = $.messageRetentionDuration;
        this.name = $.name;
        this.project = $.project;
        this.pushConfig = $.pushConfig;
        this.retainAckedMessages = $.retainAckedMessages;
        this.retryPolicy = $.retryPolicy;
        this.subscriptionId = $.subscriptionId;
        this.topic = $.topic;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubscriptionArgs $;

        public Builder() {
            $ = new SubscriptionArgs();
        }

        public Builder(SubscriptionArgs defaults) {
            $ = new SubscriptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ackDeadlineSeconds The approximate amount of time (on a best-effort basis) Pub/Sub waits for the subscriber to acknowledge receipt before resending the message. In the interval after the message is delivered and before it is acknowledged, it is considered to be *outstanding*. During that time period, the message will not be redelivered (on a best-effort basis). For pull subscriptions, this value is used as the initial value for the ack deadline. To override this value for a given message, call `ModifyAckDeadline` with the corresponding `ack_id` if using non-streaming pull or send the `ack_id` in a `StreamingModifyAckDeadlineRequest` if using streaming pull. The minimum custom deadline you can specify is 10 seconds. The maximum custom deadline you can specify is 600 seconds (10 minutes). If this parameter is 0, a default value of 10 seconds is used. For push delivery, this value is also used to set the request timeout for the call to the push endpoint. If the subscriber never acknowledges the message, the Pub/Sub system will eventually redeliver the message.
         * 
         * @return builder
         * 
         */
        public Builder ackDeadlineSeconds(@Nullable Output<Integer> ackDeadlineSeconds) {
            $.ackDeadlineSeconds = ackDeadlineSeconds;
            return this;
        }

        /**
         * @param ackDeadlineSeconds The approximate amount of time (on a best-effort basis) Pub/Sub waits for the subscriber to acknowledge receipt before resending the message. In the interval after the message is delivered and before it is acknowledged, it is considered to be *outstanding*. During that time period, the message will not be redelivered (on a best-effort basis). For pull subscriptions, this value is used as the initial value for the ack deadline. To override this value for a given message, call `ModifyAckDeadline` with the corresponding `ack_id` if using non-streaming pull or send the `ack_id` in a `StreamingModifyAckDeadlineRequest` if using streaming pull. The minimum custom deadline you can specify is 10 seconds. The maximum custom deadline you can specify is 600 seconds (10 minutes). If this parameter is 0, a default value of 10 seconds is used. For push delivery, this value is also used to set the request timeout for the call to the push endpoint. If the subscriber never acknowledges the message, the Pub/Sub system will eventually redeliver the message.
         * 
         * @return builder
         * 
         */
        public Builder ackDeadlineSeconds(Integer ackDeadlineSeconds) {
            return ackDeadlineSeconds(Output.of(ackDeadlineSeconds));
        }

        /**
         * @param bigqueryConfig If delivery to BigQuery is used with this subscription, this field is used to configure it. Either `pushConfig` or `bigQueryConfig` can be set, but not both. If both are empty, then the subscriber will pull and ack messages using API methods.
         * 
         * @return builder
         * 
         */
        public Builder bigqueryConfig(@Nullable Output<BigQueryConfigArgs> bigqueryConfig) {
            $.bigqueryConfig = bigqueryConfig;
            return this;
        }

        /**
         * @param bigqueryConfig If delivery to BigQuery is used with this subscription, this field is used to configure it. Either `pushConfig` or `bigQueryConfig` can be set, but not both. If both are empty, then the subscriber will pull and ack messages using API methods.
         * 
         * @return builder
         * 
         */
        public Builder bigqueryConfig(BigQueryConfigArgs bigqueryConfig) {
            return bigqueryConfig(Output.of(bigqueryConfig));
        }

        /**
         * @param deadLetterPolicy A policy that specifies the conditions for dead lettering messages in this subscription. If dead_letter_policy is not set, dead lettering is disabled. The Cloud Pub/Sub service account associated with this subscriptions&#39;s parent project (i.e., service-{project_number}@gcp-sa-pubsub.iam.gserviceaccount.com) must have permission to Acknowledge() messages on this subscription.
         * 
         * @return builder
         * 
         */
        public Builder deadLetterPolicy(@Nullable Output<DeadLetterPolicyArgs> deadLetterPolicy) {
            $.deadLetterPolicy = deadLetterPolicy;
            return this;
        }

        /**
         * @param deadLetterPolicy A policy that specifies the conditions for dead lettering messages in this subscription. If dead_letter_policy is not set, dead lettering is disabled. The Cloud Pub/Sub service account associated with this subscriptions&#39;s parent project (i.e., service-{project_number}@gcp-sa-pubsub.iam.gserviceaccount.com) must have permission to Acknowledge() messages on this subscription.
         * 
         * @return builder
         * 
         */
        public Builder deadLetterPolicy(DeadLetterPolicyArgs deadLetterPolicy) {
            return deadLetterPolicy(Output.of(deadLetterPolicy));
        }

        /**
         * @param detached Indicates whether the subscription is detached from its topic. Detached subscriptions don&#39;t receive messages from their topic and don&#39;t retain any backlog. `Pull` and `StreamingPull` requests will return FAILED_PRECONDITION. If the subscription is a push subscription, pushes to the endpoint will not be made.
         * 
         * @return builder
         * 
         */
        public Builder detached(@Nullable Output<Boolean> detached) {
            $.detached = detached;
            return this;
        }

        /**
         * @param detached Indicates whether the subscription is detached from its topic. Detached subscriptions don&#39;t receive messages from their topic and don&#39;t retain any backlog. `Pull` and `StreamingPull` requests will return FAILED_PRECONDITION. If the subscription is a push subscription, pushes to the endpoint will not be made.
         * 
         * @return builder
         * 
         */
        public Builder detached(Boolean detached) {
            return detached(Output.of(detached));
        }

        /**
         * @param enableExactlyOnceDelivery If true, Pub/Sub provides the following guarantees for the delivery of a message with a given value of `message_id` on this subscription: * The message sent to a subscriber is guaranteed not to be resent before the message&#39;s acknowledgement deadline expires. * An acknowledged message will not be resent to a subscriber. Note that subscribers may still receive multiple copies of a message when `enable_exactly_once_delivery` is true if the message was published multiple times by a publisher client. These copies are considered distinct by Pub/Sub and have distinct `message_id` values.
         * 
         * @return builder
         * 
         */
        public Builder enableExactlyOnceDelivery(@Nullable Output<Boolean> enableExactlyOnceDelivery) {
            $.enableExactlyOnceDelivery = enableExactlyOnceDelivery;
            return this;
        }

        /**
         * @param enableExactlyOnceDelivery If true, Pub/Sub provides the following guarantees for the delivery of a message with a given value of `message_id` on this subscription: * The message sent to a subscriber is guaranteed not to be resent before the message&#39;s acknowledgement deadline expires. * An acknowledged message will not be resent to a subscriber. Note that subscribers may still receive multiple copies of a message when `enable_exactly_once_delivery` is true if the message was published multiple times by a publisher client. These copies are considered distinct by Pub/Sub and have distinct `message_id` values.
         * 
         * @return builder
         * 
         */
        public Builder enableExactlyOnceDelivery(Boolean enableExactlyOnceDelivery) {
            return enableExactlyOnceDelivery(Output.of(enableExactlyOnceDelivery));
        }

        /**
         * @param enableMessageOrdering If true, messages published with the same `ordering_key` in `PubsubMessage` will be delivered to the subscribers in the order in which they are received by the Pub/Sub system. Otherwise, they may be delivered in any order.
         * 
         * @return builder
         * 
         */
        public Builder enableMessageOrdering(@Nullable Output<Boolean> enableMessageOrdering) {
            $.enableMessageOrdering = enableMessageOrdering;
            return this;
        }

        /**
         * @param enableMessageOrdering If true, messages published with the same `ordering_key` in `PubsubMessage` will be delivered to the subscribers in the order in which they are received by the Pub/Sub system. Otherwise, they may be delivered in any order.
         * 
         * @return builder
         * 
         */
        public Builder enableMessageOrdering(Boolean enableMessageOrdering) {
            return enableMessageOrdering(Output.of(enableMessageOrdering));
        }

        /**
         * @param expirationPolicy A policy that specifies the conditions for this subscription&#39;s expiration. A subscription is considered active as long as any connected subscriber is successfully consuming messages from the subscription or is issuing operations on the subscription. If `expiration_policy` is not set, a *default policy* with `ttl` of 31 days will be used. The minimum allowed value for `expiration_policy.ttl` is 1 day. If `expiration_policy` is set, but `expiration_policy.ttl` is not set, the subscription never expires.
         * 
         * @return builder
         * 
         */
        public Builder expirationPolicy(@Nullable Output<ExpirationPolicyArgs> expirationPolicy) {
            $.expirationPolicy = expirationPolicy;
            return this;
        }

        /**
         * @param expirationPolicy A policy that specifies the conditions for this subscription&#39;s expiration. A subscription is considered active as long as any connected subscriber is successfully consuming messages from the subscription or is issuing operations on the subscription. If `expiration_policy` is not set, a *default policy* with `ttl` of 31 days will be used. The minimum allowed value for `expiration_policy.ttl` is 1 day. If `expiration_policy` is set, but `expiration_policy.ttl` is not set, the subscription never expires.
         * 
         * @return builder
         * 
         */
        public Builder expirationPolicy(ExpirationPolicyArgs expirationPolicy) {
            return expirationPolicy(Output.of(expirationPolicy));
        }

        /**
         * @param filter An expression written in the Pub/Sub [filter language](https://cloud.google.com/pubsub/docs/filtering). If non-empty, then only `PubsubMessage`s whose `attributes` field matches the filter are delivered on this subscription. If empty, then no messages are filtered out.
         * 
         * @return builder
         * 
         */
        public Builder filter(@Nullable Output<String> filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param filter An expression written in the Pub/Sub [filter language](https://cloud.google.com/pubsub/docs/filtering). If non-empty, then only `PubsubMessage`s whose `attributes` field matches the filter are delivered on this subscription. If empty, then no messages are filtered out.
         * 
         * @return builder
         * 
         */
        public Builder filter(String filter) {
            return filter(Output.of(filter));
        }

        /**
         * @param labels See Creating and managing labels.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels See Creating and managing labels.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param messageRetentionDuration How long to retain unacknowledged messages in the subscription&#39;s backlog, from the moment a message is published. If `retain_acked_messages` is true, then this also configures the retention of acknowledged messages, and thus configures how far back in time a `Seek` can be done. Defaults to 7 days. Cannot be more than 7 days or less than 10 minutes.
         * 
         * @return builder
         * 
         */
        public Builder messageRetentionDuration(@Nullable Output<String> messageRetentionDuration) {
            $.messageRetentionDuration = messageRetentionDuration;
            return this;
        }

        /**
         * @param messageRetentionDuration How long to retain unacknowledged messages in the subscription&#39;s backlog, from the moment a message is published. If `retain_acked_messages` is true, then this also configures the retention of acknowledged messages, and thus configures how far back in time a `Seek` can be done. Defaults to 7 days. Cannot be more than 7 days or less than 10 minutes.
         * 
         * @return builder
         * 
         */
        public Builder messageRetentionDuration(String messageRetentionDuration) {
            return messageRetentionDuration(Output.of(messageRetentionDuration));
        }

        /**
         * @param name The name of the subscription. It must have the format `&#34;projects/{project}/subscriptions/{subscription}&#34;`. `{subscription}` must start with a letter, and contain only letters (`[A-Za-z]`), numbers (`[0-9]`), dashes (`-`), underscores (`_`), periods (`.`), tildes (`~`), plus (`+`) or percent signs (`%`). It must be between 3 and 255 characters in length, and it must not start with `&#34;goog&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the subscription. It must have the format `&#34;projects/{project}/subscriptions/{subscription}&#34;`. `{subscription}` must start with a letter, and contain only letters (`[A-Za-z]`), numbers (`[0-9]`), dashes (`-`), underscores (`_`), periods (`.`), tildes (`~`), plus (`+`) or percent signs (`%`). It must be between 3 and 255 characters in length, and it must not start with `&#34;goog&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param pushConfig If push delivery is used with this subscription, this field is used to configure it. Either `pushConfig` or `bigQueryConfig` can be set, but not both. If both are empty, then the subscriber will pull and ack messages using API methods.
         * 
         * @return builder
         * 
         */
        public Builder pushConfig(@Nullable Output<PushConfigArgs> pushConfig) {
            $.pushConfig = pushConfig;
            return this;
        }

        /**
         * @param pushConfig If push delivery is used with this subscription, this field is used to configure it. Either `pushConfig` or `bigQueryConfig` can be set, but not both. If both are empty, then the subscriber will pull and ack messages using API methods.
         * 
         * @return builder
         * 
         */
        public Builder pushConfig(PushConfigArgs pushConfig) {
            return pushConfig(Output.of(pushConfig));
        }

        /**
         * @param retainAckedMessages Indicates whether to retain acknowledged messages. If true, then messages are not expunged from the subscription&#39;s backlog, even if they are acknowledged, until they fall out of the `message_retention_duration` window. This must be true if you would like to [`Seek` to a timestamp] (https://cloud.google.com/pubsub/docs/replay-overview#seek_to_a_time) in the past to replay previously-acknowledged messages.
         * 
         * @return builder
         * 
         */
        public Builder retainAckedMessages(@Nullable Output<Boolean> retainAckedMessages) {
            $.retainAckedMessages = retainAckedMessages;
            return this;
        }

        /**
         * @param retainAckedMessages Indicates whether to retain acknowledged messages. If true, then messages are not expunged from the subscription&#39;s backlog, even if they are acknowledged, until they fall out of the `message_retention_duration` window. This must be true if you would like to [`Seek` to a timestamp] (https://cloud.google.com/pubsub/docs/replay-overview#seek_to_a_time) in the past to replay previously-acknowledged messages.
         * 
         * @return builder
         * 
         */
        public Builder retainAckedMessages(Boolean retainAckedMessages) {
            return retainAckedMessages(Output.of(retainAckedMessages));
        }

        /**
         * @param retryPolicy A policy that specifies how Pub/Sub retries message delivery for this subscription. If not set, the default retry policy is applied. This generally implies that messages will be retried as soon as possible for healthy subscribers. RetryPolicy will be triggered on NACKs or acknowledgement deadline exceeded events for a given message.
         * 
         * @return builder
         * 
         */
        public Builder retryPolicy(@Nullable Output<RetryPolicyArgs> retryPolicy) {
            $.retryPolicy = retryPolicy;
            return this;
        }

        /**
         * @param retryPolicy A policy that specifies how Pub/Sub retries message delivery for this subscription. If not set, the default retry policy is applied. This generally implies that messages will be retried as soon as possible for healthy subscribers. RetryPolicy will be triggered on NACKs or acknowledgement deadline exceeded events for a given message.
         * 
         * @return builder
         * 
         */
        public Builder retryPolicy(RetryPolicyArgs retryPolicy) {
            return retryPolicy(Output.of(retryPolicy));
        }

        public Builder subscriptionId(Output<String> subscriptionId) {
            $.subscriptionId = subscriptionId;
            return this;
        }

        public Builder subscriptionId(String subscriptionId) {
            return subscriptionId(Output.of(subscriptionId));
        }

        /**
         * @param topic The name of the topic from which this subscription is receiving messages. Format is `projects/{project}/topics/{topic}`. The value of this field will be `_deleted-topic_` if the topic has been deleted.
         * 
         * @return builder
         * 
         */
        public Builder topic(Output<String> topic) {
            $.topic = topic;
            return this;
        }

        /**
         * @param topic The name of the topic from which this subscription is receiving messages. Format is `projects/{project}/topics/{topic}`. The value of this field will be `_deleted-topic_` if the topic has been deleted.
         * 
         * @return builder
         * 
         */
        public Builder topic(String topic) {
            return topic(Output.of(topic));
        }

        public SubscriptionArgs build() {
            $.subscriptionId = Objects.requireNonNull($.subscriptionId, "expected parameter 'subscriptionId' to be non-null");
            $.topic = Objects.requireNonNull($.topic, "expected parameter 'topic' to be non-null");
            return $;
        }
    }

}