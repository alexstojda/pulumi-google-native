// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.pubsub.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.pubsub.v1.TopicArgs;
import com.pulumi.googlenative.pubsub.v1.outputs.MessageStoragePolicyResponse;
import com.pulumi.googlenative.pubsub.v1.outputs.SchemaSettingsResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates the given topic with the given name. See the [resource name rules] (https://cloud.google.com/pubsub/docs/admin#resource_names).
 * 
 */
@ResourceType(type="google-native:pubsub/v1:Topic")
public class Topic extends com.pulumi.resources.CustomResource {
    /**
     * The resource name of the Cloud KMS CryptoKey to be used to protect access to messages published on this topic. The expected format is `projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}cryptoKeys/*`.
     * 
     */
    @Export(name="kmsKeyName", type=String.class, parameters={})
    private Output<String> kmsKeyName;

    /**
     * @return The resource name of the Cloud KMS CryptoKey to be used to protect access to messages published on this topic. The expected format is `projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}cryptoKeys/*`.
     * 
     */
    public Output<String> kmsKeyName() {
        return this.kmsKeyName;
    }
    /**
     * See [Creating and managing labels] (https://cloud.google.com/pubsub/docs/labels).
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return See [Creating and managing labels] (https://cloud.google.com/pubsub/docs/labels).
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * Indicates the minimum duration to retain a message after it is published to the topic. If this field is set, messages published to the topic in the last `message_retention_duration` are always available to subscribers. For instance, it allows any attached subscription to [seek to a timestamp](https://cloud.google.com/pubsub/docs/replay-overview#seek_to_a_time) that is up to `message_retention_duration` in the past. If this field is not set, message retention is controlled by settings on individual subscriptions. Cannot be more than 31 days or less than 10 minutes.
     * 
     */
    @Export(name="messageRetentionDuration", type=String.class, parameters={})
    private Output<String> messageRetentionDuration;

    /**
     * @return Indicates the minimum duration to retain a message after it is published to the topic. If this field is set, messages published to the topic in the last `message_retention_duration` are always available to subscribers. For instance, it allows any attached subscription to [seek to a timestamp](https://cloud.google.com/pubsub/docs/replay-overview#seek_to_a_time) that is up to `message_retention_duration` in the past. If this field is not set, message retention is controlled by settings on individual subscriptions. Cannot be more than 31 days or less than 10 minutes.
     * 
     */
    public Output<String> messageRetentionDuration() {
        return this.messageRetentionDuration;
    }
    /**
     * Policy constraining the set of Google Cloud Platform regions where messages published to the topic may be stored. If not present, then no constraints are in effect.
     * 
     */
    @Export(name="messageStoragePolicy", type=MessageStoragePolicyResponse.class, parameters={})
    private Output<MessageStoragePolicyResponse> messageStoragePolicy;

    /**
     * @return Policy constraining the set of Google Cloud Platform regions where messages published to the topic may be stored. If not present, then no constraints are in effect.
     * 
     */
    public Output<MessageStoragePolicyResponse> messageStoragePolicy() {
        return this.messageStoragePolicy;
    }
    /**
     * The name of the topic. It must have the format `&#34;projects/{project}/topics/{topic}&#34;`. `{topic}` must start with a letter, and contain only letters (`[A-Za-z]`), numbers (`[0-9]`), dashes (`-`), underscores (`_`), periods (`.`), tildes (`~`), plus (`+`) or percent signs (`%`). It must be between 3 and 255 characters in length, and it must not start with `&#34;goog&#34;`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the topic. It must have the format `&#34;projects/{project}/topics/{topic}&#34;`. `{topic}` must start with a letter, and contain only letters (`[A-Za-z]`), numbers (`[0-9]`), dashes (`-`), underscores (`_`), periods (`.`), tildes (`~`), plus (`+`) or percent signs (`%`). It must be between 3 and 255 characters in length, and it must not start with `&#34;goog&#34;`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> project() {
        return this.project;
    }
    /**
     * Reserved for future use. This field is set only in responses from the server; it is ignored if it is set in any requests.
     * 
     */
    @Export(name="satisfiesPzs", type=Boolean.class, parameters={})
    private Output<Boolean> satisfiesPzs;

    /**
     * @return Reserved for future use. This field is set only in responses from the server; it is ignored if it is set in any requests.
     * 
     */
    public Output<Boolean> satisfiesPzs() {
        return this.satisfiesPzs;
    }
    /**
     * Settings for validating messages published against a schema.
     * 
     */
    @Export(name="schemaSettings", type=SchemaSettingsResponse.class, parameters={})
    private Output<SchemaSettingsResponse> schemaSettings;

    /**
     * @return Settings for validating messages published against a schema.
     * 
     */
    public Output<SchemaSettingsResponse> schemaSettings() {
        return this.schemaSettings;
    }
    @Export(name="topicId", type=String.class, parameters={})
    private Output<String> topicId;

    public Output<String> topicId() {
        return this.topicId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Topic(String name) {
        this(name, TopicArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Topic(String name, TopicArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Topic(String name, TopicArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:pubsub/v1:Topic", name, args == null ? TopicArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Topic(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:pubsub/v1:Topic", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Topic get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Topic(name, id, options);
    }
}