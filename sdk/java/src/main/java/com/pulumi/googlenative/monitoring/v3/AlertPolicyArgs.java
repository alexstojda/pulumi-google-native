// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring.v3;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.monitoring.v3.enums.AlertPolicyCombiner;
import com.pulumi.googlenative.monitoring.v3.inputs.AlertStrategyArgs;
import com.pulumi.googlenative.monitoring.v3.inputs.ConditionArgs;
import com.pulumi.googlenative.monitoring.v3.inputs.DocumentationArgs;
import com.pulumi.googlenative.monitoring.v3.inputs.MutationRecordArgs;
import com.pulumi.googlenative.monitoring.v3.inputs.StatusArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlertPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlertPolicyArgs Empty = new AlertPolicyArgs();

    /**
     * Control over how this alert policy&#39;s notification channels are notified.
     * 
     */
    @Import(name="alertStrategy")
    private @Nullable Output<AlertStrategyArgs> alertStrategy;

    /**
     * @return Control over how this alert policy&#39;s notification channels are notified.
     * 
     */
    public Optional<Output<AlertStrategyArgs>> alertStrategy() {
        return Optional.ofNullable(this.alertStrategy);
    }

    /**
     * How to combine the results of multiple conditions to determine if an incident should be opened. If condition_time_series_query_language is present, this must be COMBINE_UNSPECIFIED.
     * 
     */
    @Import(name="combiner")
    private @Nullable Output<AlertPolicyCombiner> combiner;

    /**
     * @return How to combine the results of multiple conditions to determine if an incident should be opened. If condition_time_series_query_language is present, this must be COMBINE_UNSPECIFIED.
     * 
     */
    public Optional<Output<AlertPolicyCombiner>> combiner() {
        return Optional.ofNullable(this.combiner);
    }

    /**
     * A list of conditions for the policy. The conditions are combined by AND or OR according to the combiner field. If the combined conditions evaluate to true, then an incident is created. A policy can have from one to six conditions. If condition_time_series_query_language is present, it must be the only condition.
     * 
     */
    @Import(name="conditions")
    private @Nullable Output<List<ConditionArgs>> conditions;

    /**
     * @return A list of conditions for the policy. The conditions are combined by AND or OR according to the combiner field. If the combined conditions evaluate to true, then an incident is created. A policy can have from one to six conditions. If condition_time_series_query_language is present, it must be the only condition.
     * 
     */
    public Optional<Output<List<ConditionArgs>>> conditions() {
        return Optional.ofNullable(this.conditions);
    }

    /**
     * A read-only record of the creation of the alerting policy. If provided in a call to create or update, this field will be ignored.
     * 
     */
    @Import(name="creationRecord")
    private @Nullable Output<MutationRecordArgs> creationRecord;

    /**
     * @return A read-only record of the creation of the alerting policy. If provided in a call to create or update, this field will be ignored.
     * 
     */
    public Optional<Output<MutationRecordArgs>> creationRecord() {
        return Optional.ofNullable(this.creationRecord);
    }

    /**
     * A short name or phrase used to identify the policy in dashboards, notifications, and incidents. To avoid confusion, don&#39;t use the same display name for multiple policies in the same project. The name is limited to 512 Unicode characters.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return A short name or phrase used to identify the policy in dashboards, notifications, and incidents. To avoid confusion, don&#39;t use the same display name for multiple policies in the same project. The name is limited to 512 Unicode characters.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Documentation that is included with notifications and incidents related to this policy. Best practice is for the documentation to include information to help responders understand, mitigate, escalate, and correct the underlying problems detected by the alerting policy. Notification channels that have limited capacity might not show this documentation.
     * 
     */
    @Import(name="documentation")
    private @Nullable Output<DocumentationArgs> documentation;

    /**
     * @return Documentation that is included with notifications and incidents related to this policy. Best practice is for the documentation to include information to help responders understand, mitigate, escalate, and correct the underlying problems detected by the alerting policy. Notification channels that have limited capacity might not show this documentation.
     * 
     */
    public Optional<Output<DocumentationArgs>> documentation() {
        return Optional.ofNullable(this.documentation);
    }

    /**
     * Whether or not the policy is enabled. On write, the default interpretation if unset is that the policy is enabled. On read, clients should not make any assumption about the state if it has not been populated. The field should always be populated on List and Get operations, unless a field projection has been specified that strips it out.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether or not the policy is enabled. On write, the default interpretation if unset is that the policy is enabled. On read, clients should not make any assumption about the state if it has not been populated. The field should always be populated on List and Get operations, unless a field projection has been specified that strips it out.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * A read-only record of the most recent change to the alerting policy. If provided in a call to create or update, this field will be ignored.
     * 
     */
    @Import(name="mutationRecord")
    private @Nullable Output<MutationRecordArgs> mutationRecord;

    /**
     * @return A read-only record of the most recent change to the alerting policy. If provided in a call to create or update, this field will be ignored.
     * 
     */
    public Optional<Output<MutationRecordArgs>> mutationRecord() {
        return Optional.ofNullable(this.mutationRecord);
    }

    /**
     * Required if the policy exists. The resource name for this policy. The format is: projects/[PROJECT_ID_OR_NUMBER]/alertPolicies/[ALERT_POLICY_ID] [ALERT_POLICY_ID] is assigned by Cloud Monitoring when the policy is created. When calling the alertPolicies.create method, do not include the name field in the alerting policy passed as part of the request.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Required if the policy exists. The resource name for this policy. The format is: projects/[PROJECT_ID_OR_NUMBER]/alertPolicies/[ALERT_POLICY_ID] [ALERT_POLICY_ID] is assigned by Cloud Monitoring when the policy is created. When calling the alertPolicies.create method, do not include the name field in the alerting policy passed as part of the request.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Identifies the notification channels to which notifications should be sent when incidents are opened or closed or when new violations occur on an already opened incident. Each element of this array corresponds to the name field in each of the NotificationChannel objects that are returned from the ListNotificationChannels method. The format of the entries in this field is: projects/[PROJECT_ID_OR_NUMBER]/notificationChannels/[CHANNEL_ID]
     * 
     */
    @Import(name="notificationChannels")
    private @Nullable Output<List<String>> notificationChannels;

    /**
     * @return Identifies the notification channels to which notifications should be sent when incidents are opened or closed or when new violations occur on an already opened incident. Each element of this array corresponds to the name field in each of the NotificationChannel objects that are returned from the ListNotificationChannels method. The format of the entries in this field is: projects/[PROJECT_ID_OR_NUMBER]/notificationChannels/[CHANNEL_ID]
     * 
     */
    public Optional<Output<List<String>>> notificationChannels() {
        return Optional.ofNullable(this.notificationChannels);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * User-supplied key/value data to be used for organizing and identifying the AlertPolicy objects.The field can contain up to 64 entries. Each key and value is limited to 63 Unicode characters or 128 bytes, whichever is smaller. Labels and values can contain only lowercase letters, numerals, underscores, and dashes. Keys must begin with a letter.
     * 
     */
    @Import(name="userLabels")
    private @Nullable Output<Map<String,String>> userLabels;

    /**
     * @return User-supplied key/value data to be used for organizing and identifying the AlertPolicy objects.The field can contain up to 64 entries. Each key and value is limited to 63 Unicode characters or 128 bytes, whichever is smaller. Labels and values can contain only lowercase letters, numerals, underscores, and dashes. Keys must begin with a letter.
     * 
     */
    public Optional<Output<Map<String,String>>> userLabels() {
        return Optional.ofNullable(this.userLabels);
    }

    /**
     * Read-only description of how the alert policy is invalid. OK if the alert policy is valid. If not OK, the alert policy will not generate incidents.
     * 
     */
    @Import(name="validity")
    private @Nullable Output<StatusArgs> validity;

    /**
     * @return Read-only description of how the alert policy is invalid. OK if the alert policy is valid. If not OK, the alert policy will not generate incidents.
     * 
     */
    public Optional<Output<StatusArgs>> validity() {
        return Optional.ofNullable(this.validity);
    }

    private AlertPolicyArgs() {}

    private AlertPolicyArgs(AlertPolicyArgs $) {
        this.alertStrategy = $.alertStrategy;
        this.combiner = $.combiner;
        this.conditions = $.conditions;
        this.creationRecord = $.creationRecord;
        this.displayName = $.displayName;
        this.documentation = $.documentation;
        this.enabled = $.enabled;
        this.mutationRecord = $.mutationRecord;
        this.name = $.name;
        this.notificationChannels = $.notificationChannels;
        this.project = $.project;
        this.userLabels = $.userLabels;
        this.validity = $.validity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlertPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlertPolicyArgs $;

        public Builder() {
            $ = new AlertPolicyArgs();
        }

        public Builder(AlertPolicyArgs defaults) {
            $ = new AlertPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alertStrategy Control over how this alert policy&#39;s notification channels are notified.
         * 
         * @return builder
         * 
         */
        public Builder alertStrategy(@Nullable Output<AlertStrategyArgs> alertStrategy) {
            $.alertStrategy = alertStrategy;
            return this;
        }

        /**
         * @param alertStrategy Control over how this alert policy&#39;s notification channels are notified.
         * 
         * @return builder
         * 
         */
        public Builder alertStrategy(AlertStrategyArgs alertStrategy) {
            return alertStrategy(Output.of(alertStrategy));
        }

        /**
         * @param combiner How to combine the results of multiple conditions to determine if an incident should be opened. If condition_time_series_query_language is present, this must be COMBINE_UNSPECIFIED.
         * 
         * @return builder
         * 
         */
        public Builder combiner(@Nullable Output<AlertPolicyCombiner> combiner) {
            $.combiner = combiner;
            return this;
        }

        /**
         * @param combiner How to combine the results of multiple conditions to determine if an incident should be opened. If condition_time_series_query_language is present, this must be COMBINE_UNSPECIFIED.
         * 
         * @return builder
         * 
         */
        public Builder combiner(AlertPolicyCombiner combiner) {
            return combiner(Output.of(combiner));
        }

        /**
         * @param conditions A list of conditions for the policy. The conditions are combined by AND or OR according to the combiner field. If the combined conditions evaluate to true, then an incident is created. A policy can have from one to six conditions. If condition_time_series_query_language is present, it must be the only condition.
         * 
         * @return builder
         * 
         */
        public Builder conditions(@Nullable Output<List<ConditionArgs>> conditions) {
            $.conditions = conditions;
            return this;
        }

        /**
         * @param conditions A list of conditions for the policy. The conditions are combined by AND or OR according to the combiner field. If the combined conditions evaluate to true, then an incident is created. A policy can have from one to six conditions. If condition_time_series_query_language is present, it must be the only condition.
         * 
         * @return builder
         * 
         */
        public Builder conditions(List<ConditionArgs> conditions) {
            return conditions(Output.of(conditions));
        }

        /**
         * @param conditions A list of conditions for the policy. The conditions are combined by AND or OR according to the combiner field. If the combined conditions evaluate to true, then an incident is created. A policy can have from one to six conditions. If condition_time_series_query_language is present, it must be the only condition.
         * 
         * @return builder
         * 
         */
        public Builder conditions(ConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }

        /**
         * @param creationRecord A read-only record of the creation of the alerting policy. If provided in a call to create or update, this field will be ignored.
         * 
         * @return builder
         * 
         */
        public Builder creationRecord(@Nullable Output<MutationRecordArgs> creationRecord) {
            $.creationRecord = creationRecord;
            return this;
        }

        /**
         * @param creationRecord A read-only record of the creation of the alerting policy. If provided in a call to create or update, this field will be ignored.
         * 
         * @return builder
         * 
         */
        public Builder creationRecord(MutationRecordArgs creationRecord) {
            return creationRecord(Output.of(creationRecord));
        }

        /**
         * @param displayName A short name or phrase used to identify the policy in dashboards, notifications, and incidents. To avoid confusion, don&#39;t use the same display name for multiple policies in the same project. The name is limited to 512 Unicode characters.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName A short name or phrase used to identify the policy in dashboards, notifications, and incidents. To avoid confusion, don&#39;t use the same display name for multiple policies in the same project. The name is limited to 512 Unicode characters.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param documentation Documentation that is included with notifications and incidents related to this policy. Best practice is for the documentation to include information to help responders understand, mitigate, escalate, and correct the underlying problems detected by the alerting policy. Notification channels that have limited capacity might not show this documentation.
         * 
         * @return builder
         * 
         */
        public Builder documentation(@Nullable Output<DocumentationArgs> documentation) {
            $.documentation = documentation;
            return this;
        }

        /**
         * @param documentation Documentation that is included with notifications and incidents related to this policy. Best practice is for the documentation to include information to help responders understand, mitigate, escalate, and correct the underlying problems detected by the alerting policy. Notification channels that have limited capacity might not show this documentation.
         * 
         * @return builder
         * 
         */
        public Builder documentation(DocumentationArgs documentation) {
            return documentation(Output.of(documentation));
        }

        /**
         * @param enabled Whether or not the policy is enabled. On write, the default interpretation if unset is that the policy is enabled. On read, clients should not make any assumption about the state if it has not been populated. The field should always be populated on List and Get operations, unless a field projection has been specified that strips it out.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether or not the policy is enabled. On write, the default interpretation if unset is that the policy is enabled. On read, clients should not make any assumption about the state if it has not been populated. The field should always be populated on List and Get operations, unless a field projection has been specified that strips it out.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param mutationRecord A read-only record of the most recent change to the alerting policy. If provided in a call to create or update, this field will be ignored.
         * 
         * @return builder
         * 
         */
        public Builder mutationRecord(@Nullable Output<MutationRecordArgs> mutationRecord) {
            $.mutationRecord = mutationRecord;
            return this;
        }

        /**
         * @param mutationRecord A read-only record of the most recent change to the alerting policy. If provided in a call to create or update, this field will be ignored.
         * 
         * @return builder
         * 
         */
        public Builder mutationRecord(MutationRecordArgs mutationRecord) {
            return mutationRecord(Output.of(mutationRecord));
        }

        /**
         * @param name Required if the policy exists. The resource name for this policy. The format is: projects/[PROJECT_ID_OR_NUMBER]/alertPolicies/[ALERT_POLICY_ID] [ALERT_POLICY_ID] is assigned by Cloud Monitoring when the policy is created. When calling the alertPolicies.create method, do not include the name field in the alerting policy passed as part of the request.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Required if the policy exists. The resource name for this policy. The format is: projects/[PROJECT_ID_OR_NUMBER]/alertPolicies/[ALERT_POLICY_ID] [ALERT_POLICY_ID] is assigned by Cloud Monitoring when the policy is created. When calling the alertPolicies.create method, do not include the name field in the alerting policy passed as part of the request.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param notificationChannels Identifies the notification channels to which notifications should be sent when incidents are opened or closed or when new violations occur on an already opened incident. Each element of this array corresponds to the name field in each of the NotificationChannel objects that are returned from the ListNotificationChannels method. The format of the entries in this field is: projects/[PROJECT_ID_OR_NUMBER]/notificationChannels/[CHANNEL_ID]
         * 
         * @return builder
         * 
         */
        public Builder notificationChannels(@Nullable Output<List<String>> notificationChannels) {
            $.notificationChannels = notificationChannels;
            return this;
        }

        /**
         * @param notificationChannels Identifies the notification channels to which notifications should be sent when incidents are opened or closed or when new violations occur on an already opened incident. Each element of this array corresponds to the name field in each of the NotificationChannel objects that are returned from the ListNotificationChannels method. The format of the entries in this field is: projects/[PROJECT_ID_OR_NUMBER]/notificationChannels/[CHANNEL_ID]
         * 
         * @return builder
         * 
         */
        public Builder notificationChannels(List<String> notificationChannels) {
            return notificationChannels(Output.of(notificationChannels));
        }

        /**
         * @param notificationChannels Identifies the notification channels to which notifications should be sent when incidents are opened or closed or when new violations occur on an already opened incident. Each element of this array corresponds to the name field in each of the NotificationChannel objects that are returned from the ListNotificationChannels method. The format of the entries in this field is: projects/[PROJECT_ID_OR_NUMBER]/notificationChannels/[CHANNEL_ID]
         * 
         * @return builder
         * 
         */
        public Builder notificationChannels(String... notificationChannels) {
            return notificationChannels(List.of(notificationChannels));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param userLabels User-supplied key/value data to be used for organizing and identifying the AlertPolicy objects.The field can contain up to 64 entries. Each key and value is limited to 63 Unicode characters or 128 bytes, whichever is smaller. Labels and values can contain only lowercase letters, numerals, underscores, and dashes. Keys must begin with a letter.
         * 
         * @return builder
         * 
         */
        public Builder userLabels(@Nullable Output<Map<String,String>> userLabels) {
            $.userLabels = userLabels;
            return this;
        }

        /**
         * @param userLabels User-supplied key/value data to be used for organizing and identifying the AlertPolicy objects.The field can contain up to 64 entries. Each key and value is limited to 63 Unicode characters or 128 bytes, whichever is smaller. Labels and values can contain only lowercase letters, numerals, underscores, and dashes. Keys must begin with a letter.
         * 
         * @return builder
         * 
         */
        public Builder userLabels(Map<String,String> userLabels) {
            return userLabels(Output.of(userLabels));
        }

        /**
         * @param validity Read-only description of how the alert policy is invalid. OK if the alert policy is valid. If not OK, the alert policy will not generate incidents.
         * 
         * @return builder
         * 
         */
        public Builder validity(@Nullable Output<StatusArgs> validity) {
            $.validity = validity;
            return this;
        }

        /**
         * @param validity Read-only description of how the alert policy is invalid. OK if the alert policy is valid. If not OK, the alert policy will not generate incidents.
         * 
         * @return builder
         * 
         */
        public Builder validity(StatusArgs validity) {
            return validity(Output.of(validity));
        }

        public AlertPolicyArgs build() {
            return $;
        }
    }

}