// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contains the configuration for FHIR notifications.
 * 
 */
public final class FhirNotificationConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final FhirNotificationConfigArgs Empty = new FhirNotificationConfigArgs();

    /**
     * The [Pub/Sub](https://cloud.google.com/pubsub/docs/) topic that notifications of changes are published on. Supplied by the client. The notification is a `PubsubMessage` with the following fields: * `PubsubMessage.Data` contains the resource name. * `PubsubMessage.MessageId` is the ID of this notification. It is guaranteed to be unique within the topic. * `PubsubMessage.PublishTime` is the time when the message was published. Note that notifications are only sent if the topic is non-empty. [Topic names](https://cloud.google.com/pubsub/docs/overview#names) must be scoped to a project. The Cloud Healthcare API service account, service-@gcp-sa-healthcare.iam.gserviceaccount.com, must have publisher permissions on the given Pub/Sub topic. Not having adequate permissions causes the calls that send notifications to fail. If a notification can&#39;t be published to Pub/Sub, errors are logged to Cloud Logging. For more information, see [Viewing error logs in Cloud Logging](https://cloud.google.com/healthcare-api/docs/how-tos/logging).
     * 
     */
    @Import(name="pubsubTopic")
    private @Nullable Output<String> pubsubTopic;

    /**
     * @return The [Pub/Sub](https://cloud.google.com/pubsub/docs/) topic that notifications of changes are published on. Supplied by the client. The notification is a `PubsubMessage` with the following fields: * `PubsubMessage.Data` contains the resource name. * `PubsubMessage.MessageId` is the ID of this notification. It is guaranteed to be unique within the topic. * `PubsubMessage.PublishTime` is the time when the message was published. Note that notifications are only sent if the topic is non-empty. [Topic names](https://cloud.google.com/pubsub/docs/overview#names) must be scoped to a project. The Cloud Healthcare API service account, service-@gcp-sa-healthcare.iam.gserviceaccount.com, must have publisher permissions on the given Pub/Sub topic. Not having adequate permissions causes the calls that send notifications to fail. If a notification can&#39;t be published to Pub/Sub, errors are logged to Cloud Logging. For more information, see [Viewing error logs in Cloud Logging](https://cloud.google.com/healthcare-api/docs/how-tos/logging).
     * 
     */
    public Optional<Output<String>> pubsubTopic() {
        return Optional.ofNullable(this.pubsubTopic);
    }

    /**
     * Whether to send full FHIR resource to this Pub/Sub topic for Create and Update operation. Note that setting this to true does not guarantee that all resources will be sent in the format of full FHIR resource. When a resource change is too large or during heavy traffic, only the resource name will be sent. Clients should always check the &#34;payloadType&#34; label from a Pub/Sub message to determine whether it needs to fetch the full resource as a separate operation.
     * 
     */
    @Import(name="sendFullResource")
    private @Nullable Output<Boolean> sendFullResource;

    /**
     * @return Whether to send full FHIR resource to this Pub/Sub topic for Create and Update operation. Note that setting this to true does not guarantee that all resources will be sent in the format of full FHIR resource. When a resource change is too large or during heavy traffic, only the resource name will be sent. Clients should always check the &#34;payloadType&#34; label from a Pub/Sub message to determine whether it needs to fetch the full resource as a separate operation.
     * 
     */
    public Optional<Output<Boolean>> sendFullResource() {
        return Optional.ofNullable(this.sendFullResource);
    }

    private FhirNotificationConfigArgs() {}

    private FhirNotificationConfigArgs(FhirNotificationConfigArgs $) {
        this.pubsubTopic = $.pubsubTopic;
        this.sendFullResource = $.sendFullResource;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FhirNotificationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FhirNotificationConfigArgs $;

        public Builder() {
            $ = new FhirNotificationConfigArgs();
        }

        public Builder(FhirNotificationConfigArgs defaults) {
            $ = new FhirNotificationConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param pubsubTopic The [Pub/Sub](https://cloud.google.com/pubsub/docs/) topic that notifications of changes are published on. Supplied by the client. The notification is a `PubsubMessage` with the following fields: * `PubsubMessage.Data` contains the resource name. * `PubsubMessage.MessageId` is the ID of this notification. It is guaranteed to be unique within the topic. * `PubsubMessage.PublishTime` is the time when the message was published. Note that notifications are only sent if the topic is non-empty. [Topic names](https://cloud.google.com/pubsub/docs/overview#names) must be scoped to a project. The Cloud Healthcare API service account, service-@gcp-sa-healthcare.iam.gserviceaccount.com, must have publisher permissions on the given Pub/Sub topic. Not having adequate permissions causes the calls that send notifications to fail. If a notification can&#39;t be published to Pub/Sub, errors are logged to Cloud Logging. For more information, see [Viewing error logs in Cloud Logging](https://cloud.google.com/healthcare-api/docs/how-tos/logging).
         * 
         * @return builder
         * 
         */
        public Builder pubsubTopic(@Nullable Output<String> pubsubTopic) {
            $.pubsubTopic = pubsubTopic;
            return this;
        }

        /**
         * @param pubsubTopic The [Pub/Sub](https://cloud.google.com/pubsub/docs/) topic that notifications of changes are published on. Supplied by the client. The notification is a `PubsubMessage` with the following fields: * `PubsubMessage.Data` contains the resource name. * `PubsubMessage.MessageId` is the ID of this notification. It is guaranteed to be unique within the topic. * `PubsubMessage.PublishTime` is the time when the message was published. Note that notifications are only sent if the topic is non-empty. [Topic names](https://cloud.google.com/pubsub/docs/overview#names) must be scoped to a project. The Cloud Healthcare API service account, service-@gcp-sa-healthcare.iam.gserviceaccount.com, must have publisher permissions on the given Pub/Sub topic. Not having adequate permissions causes the calls that send notifications to fail. If a notification can&#39;t be published to Pub/Sub, errors are logged to Cloud Logging. For more information, see [Viewing error logs in Cloud Logging](https://cloud.google.com/healthcare-api/docs/how-tos/logging).
         * 
         * @return builder
         * 
         */
        public Builder pubsubTopic(String pubsubTopic) {
            return pubsubTopic(Output.of(pubsubTopic));
        }

        /**
         * @param sendFullResource Whether to send full FHIR resource to this Pub/Sub topic for Create and Update operation. Note that setting this to true does not guarantee that all resources will be sent in the format of full FHIR resource. When a resource change is too large or during heavy traffic, only the resource name will be sent. Clients should always check the &#34;payloadType&#34; label from a Pub/Sub message to determine whether it needs to fetch the full resource as a separate operation.
         * 
         * @return builder
         * 
         */
        public Builder sendFullResource(@Nullable Output<Boolean> sendFullResource) {
            $.sendFullResource = sendFullResource;
            return this;
        }

        /**
         * @param sendFullResource Whether to send full FHIR resource to this Pub/Sub topic for Create and Update operation. Note that setting this to true does not guarantee that all resources will be sent in the format of full FHIR resource. When a resource change is too large or during heavy traffic, only the resource name will be sent. Clients should always check the &#34;payloadType&#34; label from a Pub/Sub message to determine whether it needs to fetch the full resource as a separate operation.
         * 
         * @return builder
         * 
         */
        public Builder sendFullResource(Boolean sendFullResource) {
            return sendFullResource(Output.of(sendFullResource));
        }

        public FhirNotificationConfigArgs build() {
            return $;
        }
    }

}