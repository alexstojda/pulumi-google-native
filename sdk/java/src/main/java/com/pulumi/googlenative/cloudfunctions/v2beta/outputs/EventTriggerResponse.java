// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudfunctions.v2beta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.cloudfunctions.v2beta.outputs.EventFilterResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class EventTriggerResponse {
    /**
     * @return Optional. The name of the channel associated with the trigger in `projects/{project}/locations/{location}/channels/{channel}` format. You must provide a channel to receive events from Eventarc SaaS partners.
     * 
     */
    private String channel;
    /**
     * @return Criteria used to filter events.
     * 
     */
    private List<EventFilterResponse> eventFilters;
    /**
     * @return The type of event to observe. For example: `google.cloud.audit.log.v1.written` or `google.cloud.pubsub.topic.v1.messagePublished`.
     * 
     */
    private String eventType;
    /**
     * @return Optional. The name of a Pub/Sub topic in the same project that will be used as the transport topic for the event delivery. Format: `projects/{project}/topics/{topic}`. This is only valid for events of type `google.cloud.pubsub.topic.v1.messagePublished`. The topic provided here will not be deleted at function deletion.
     * 
     */
    private String pubsubTopic;
    /**
     * @return Optional. If unset, then defaults to ignoring failures (i.e. not retrying them).
     * 
     */
    private String retryPolicy;
    /**
     * @return Optional. The email of the trigger&#39;s service account. The service account must have permission to invoke Cloud Run services, the permission is `run.routes.invoke`. If empty, defaults to the Compute Engine default service account: `{project_number}-compute@developer.gserviceaccount.com`.
     * 
     */
    private String serviceAccountEmail;
    /**
     * @return The resource name of the Eventarc trigger. The format of this field is `projects/{project}/locations/{region}/triggers/{trigger}`.
     * 
     */
    private String trigger;
    /**
     * @return The region that the trigger will be in. The trigger will only receive events originating in this region. It can be the same region as the function, a different region or multi-region, or the global region. If not provided, defaults to the same region as the function.
     * 
     */
    private String triggerRegion;

    private EventTriggerResponse() {}
    /**
     * @return Optional. The name of the channel associated with the trigger in `projects/{project}/locations/{location}/channels/{channel}` format. You must provide a channel to receive events from Eventarc SaaS partners.
     * 
     */
    public String channel() {
        return this.channel;
    }
    /**
     * @return Criteria used to filter events.
     * 
     */
    public List<EventFilterResponse> eventFilters() {
        return this.eventFilters;
    }
    /**
     * @return The type of event to observe. For example: `google.cloud.audit.log.v1.written` or `google.cloud.pubsub.topic.v1.messagePublished`.
     * 
     */
    public String eventType() {
        return this.eventType;
    }
    /**
     * @return Optional. The name of a Pub/Sub topic in the same project that will be used as the transport topic for the event delivery. Format: `projects/{project}/topics/{topic}`. This is only valid for events of type `google.cloud.pubsub.topic.v1.messagePublished`. The topic provided here will not be deleted at function deletion.
     * 
     */
    public String pubsubTopic() {
        return this.pubsubTopic;
    }
    /**
     * @return Optional. If unset, then defaults to ignoring failures (i.e. not retrying them).
     * 
     */
    public String retryPolicy() {
        return this.retryPolicy;
    }
    /**
     * @return Optional. The email of the trigger&#39;s service account. The service account must have permission to invoke Cloud Run services, the permission is `run.routes.invoke`. If empty, defaults to the Compute Engine default service account: `{project_number}-compute@developer.gserviceaccount.com`.
     * 
     */
    public String serviceAccountEmail() {
        return this.serviceAccountEmail;
    }
    /**
     * @return The resource name of the Eventarc trigger. The format of this field is `projects/{project}/locations/{region}/triggers/{trigger}`.
     * 
     */
    public String trigger() {
        return this.trigger;
    }
    /**
     * @return The region that the trigger will be in. The trigger will only receive events originating in this region. It can be the same region as the function, a different region or multi-region, or the global region. If not provided, defaults to the same region as the function.
     * 
     */
    public String triggerRegion() {
        return this.triggerRegion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventTriggerResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String channel;
        private List<EventFilterResponse> eventFilters;
        private String eventType;
        private String pubsubTopic;
        private String retryPolicy;
        private String serviceAccountEmail;
        private String trigger;
        private String triggerRegion;
        public Builder() {}
        public Builder(EventTriggerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channel = defaults.channel;
    	      this.eventFilters = defaults.eventFilters;
    	      this.eventType = defaults.eventType;
    	      this.pubsubTopic = defaults.pubsubTopic;
    	      this.retryPolicy = defaults.retryPolicy;
    	      this.serviceAccountEmail = defaults.serviceAccountEmail;
    	      this.trigger = defaults.trigger;
    	      this.triggerRegion = defaults.triggerRegion;
        }

        @CustomType.Setter
        public Builder channel(String channel) {
            this.channel = Objects.requireNonNull(channel);
            return this;
        }
        @CustomType.Setter
        public Builder eventFilters(List<EventFilterResponse> eventFilters) {
            this.eventFilters = Objects.requireNonNull(eventFilters);
            return this;
        }
        public Builder eventFilters(EventFilterResponse... eventFilters) {
            return eventFilters(List.of(eventFilters));
        }
        @CustomType.Setter
        public Builder eventType(String eventType) {
            this.eventType = Objects.requireNonNull(eventType);
            return this;
        }
        @CustomType.Setter
        public Builder pubsubTopic(String pubsubTopic) {
            this.pubsubTopic = Objects.requireNonNull(pubsubTopic);
            return this;
        }
        @CustomType.Setter
        public Builder retryPolicy(String retryPolicy) {
            this.retryPolicy = Objects.requireNonNull(retryPolicy);
            return this;
        }
        @CustomType.Setter
        public Builder serviceAccountEmail(String serviceAccountEmail) {
            this.serviceAccountEmail = Objects.requireNonNull(serviceAccountEmail);
            return this;
        }
        @CustomType.Setter
        public Builder trigger(String trigger) {
            this.trigger = Objects.requireNonNull(trigger);
            return this;
        }
        @CustomType.Setter
        public Builder triggerRegion(String triggerRegion) {
            this.triggerRegion = Objects.requireNonNull(triggerRegion);
            return this;
        }
        public EventTriggerResponse build() {
            final var o = new EventTriggerResponse();
            o.channel = channel;
            o.eventFilters = eventFilters;
            o.eventType = eventType;
            o.pubsubTopic = pubsubTopic;
            o.retryPolicy = retryPolicy;
            o.serviceAccountEmail = serviceAccountEmail;
            o.trigger = trigger;
            o.triggerRegion = triggerRegion;
            return o;
        }
    }
}