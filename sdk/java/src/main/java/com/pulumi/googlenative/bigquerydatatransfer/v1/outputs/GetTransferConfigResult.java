// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquerydatatransfer.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.bigquerydatatransfer.v1.outputs.EmailPreferencesResponse;
import com.pulumi.googlenative.bigquerydatatransfer.v1.outputs.ScheduleOptionsResponse;
import com.pulumi.googlenative.bigquerydatatransfer.v1.outputs.UserInfoResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetTransferConfigResult {
    /**
     * @return The number of days to look back to automatically refresh the data. For example, if `data_refresh_window_days = 10`, then every day BigQuery reingests data for [today-10, today-1], rather than ingesting data for just [today-1]. Only valid if the data source supports the feature. Set the value to 0 to use the default value.
     * 
     */
    private Integer dataRefreshWindowDays;
    /**
     * @return Data source ID. This cannot be changed once data transfer is created. The full list of available data source IDs can be returned through an API call: https://cloud.google.com/bigquery-transfer/docs/reference/datatransfer/rest/v1/projects.locations.dataSources/list
     * 
     */
    private String dataSourceId;
    /**
     * @return Region in which BigQuery dataset is located.
     * 
     */
    private String datasetRegion;
    /**
     * @return The BigQuery target dataset id.
     * 
     */
    private String destinationDatasetId;
    /**
     * @return Is this config disabled. When set to true, no runs are scheduled for a given transfer.
     * 
     */
    private Boolean disabled;
    /**
     * @return User specified display name for the data transfer.
     * 
     */
    private String displayName;
    /**
     * @return Email notifications will be sent according to these preferences to the email address of the user who owns this transfer config.
     * 
     */
    private EmailPreferencesResponse emailPreferences;
    /**
     * @return The resource name of the transfer config. Transfer config names have the form `projects/{project_id}/locations/{region}/transferConfigs/{config_id}`. Where `config_id` is usually a uuid, even though it is not guaranteed or required. The name is ignored when creating a transfer config.
     * 
     */
    private String name;
    /**
     * @return Next time when data transfer will run.
     * 
     */
    private String nextRunTime;
    /**
     * @return Pub/Sub topic where notifications will be sent after transfer runs associated with this transfer config finish. The format for specifying a pubsub topic is: `projects/{project}/topics/{topic}`
     * 
     */
    private String notificationPubsubTopic;
    /**
     * @return Information about the user whose credentials are used to transfer data. Populated only for `transferConfigs.get` requests. In case the user information is not available, this field will not be populated.
     * 
     */
    private UserInfoResponse ownerInfo;
    /**
     * @return Parameters specific to each data source. For more information see the bq tab in the &#39;Setting up a data transfer&#39; section for each data source. For example the parameters for Cloud Storage transfers are listed here: https://cloud.google.com/bigquery-transfer/docs/cloud-storage-transfer#bq
     * 
     */
    private Map<String,String> params;
    /**
     * @return Data transfer schedule. If the data source does not support a custom schedule, this should be empty. If it is empty, the default value for the data source will be used. The specified times are in UTC. Examples of valid format: `1st,3rd monday of month 15:30`, `every wed,fri of jan,jun 13:15`, and `first sunday of quarter 00:00`. See more explanation about the format here: https://cloud.google.com/appengine/docs/flexible/python/scheduling-jobs-with-cron-yaml#the_schedule_format NOTE: The minimum interval time between recurring transfers depends on the data source; refer to the documentation for your data source.
     * 
     */
    private String schedule;
    /**
     * @return Options customizing the data transfer schedule.
     * 
     */
    private ScheduleOptionsResponse scheduleOptions;
    /**
     * @return State of the most recently updated transfer run.
     * 
     */
    private String state;
    /**
     * @return Data transfer modification time. Ignored by server on input.
     * 
     */
    private String updateTime;
    /**
     * @return Deprecated. Unique ID of the user on whose behalf transfer is done.
     * 
     * @deprecated
     * Deprecated. Unique ID of the user on whose behalf transfer is done.
     * 
     */
    @Deprecated /* Deprecated. Unique ID of the user on whose behalf transfer is done. */
    private String userId;

    private GetTransferConfigResult() {}
    /**
     * @return The number of days to look back to automatically refresh the data. For example, if `data_refresh_window_days = 10`, then every day BigQuery reingests data for [today-10, today-1], rather than ingesting data for just [today-1]. Only valid if the data source supports the feature. Set the value to 0 to use the default value.
     * 
     */
    public Integer dataRefreshWindowDays() {
        return this.dataRefreshWindowDays;
    }
    /**
     * @return Data source ID. This cannot be changed once data transfer is created. The full list of available data source IDs can be returned through an API call: https://cloud.google.com/bigquery-transfer/docs/reference/datatransfer/rest/v1/projects.locations.dataSources/list
     * 
     */
    public String dataSourceId() {
        return this.dataSourceId;
    }
    /**
     * @return Region in which BigQuery dataset is located.
     * 
     */
    public String datasetRegion() {
        return this.datasetRegion;
    }
    /**
     * @return The BigQuery target dataset id.
     * 
     */
    public String destinationDatasetId() {
        return this.destinationDatasetId;
    }
    /**
     * @return Is this config disabled. When set to true, no runs are scheduled for a given transfer.
     * 
     */
    public Boolean disabled() {
        return this.disabled;
    }
    /**
     * @return User specified display name for the data transfer.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return Email notifications will be sent according to these preferences to the email address of the user who owns this transfer config.
     * 
     */
    public EmailPreferencesResponse emailPreferences() {
        return this.emailPreferences;
    }
    /**
     * @return The resource name of the transfer config. Transfer config names have the form `projects/{project_id}/locations/{region}/transferConfigs/{config_id}`. Where `config_id` is usually a uuid, even though it is not guaranteed or required. The name is ignored when creating a transfer config.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Next time when data transfer will run.
     * 
     */
    public String nextRunTime() {
        return this.nextRunTime;
    }
    /**
     * @return Pub/Sub topic where notifications will be sent after transfer runs associated with this transfer config finish. The format for specifying a pubsub topic is: `projects/{project}/topics/{topic}`
     * 
     */
    public String notificationPubsubTopic() {
        return this.notificationPubsubTopic;
    }
    /**
     * @return Information about the user whose credentials are used to transfer data. Populated only for `transferConfigs.get` requests. In case the user information is not available, this field will not be populated.
     * 
     */
    public UserInfoResponse ownerInfo() {
        return this.ownerInfo;
    }
    /**
     * @return Parameters specific to each data source. For more information see the bq tab in the &#39;Setting up a data transfer&#39; section for each data source. For example the parameters for Cloud Storage transfers are listed here: https://cloud.google.com/bigquery-transfer/docs/cloud-storage-transfer#bq
     * 
     */
    public Map<String,String> params() {
        return this.params;
    }
    /**
     * @return Data transfer schedule. If the data source does not support a custom schedule, this should be empty. If it is empty, the default value for the data source will be used. The specified times are in UTC. Examples of valid format: `1st,3rd monday of month 15:30`, `every wed,fri of jan,jun 13:15`, and `first sunday of quarter 00:00`. See more explanation about the format here: https://cloud.google.com/appengine/docs/flexible/python/scheduling-jobs-with-cron-yaml#the_schedule_format NOTE: The minimum interval time between recurring transfers depends on the data source; refer to the documentation for your data source.
     * 
     */
    public String schedule() {
        return this.schedule;
    }
    /**
     * @return Options customizing the data transfer schedule.
     * 
     */
    public ScheduleOptionsResponse scheduleOptions() {
        return this.scheduleOptions;
    }
    /**
     * @return State of the most recently updated transfer run.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Data transfer modification time. Ignored by server on input.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }
    /**
     * @return Deprecated. Unique ID of the user on whose behalf transfer is done.
     * 
     * @deprecated
     * Deprecated. Unique ID of the user on whose behalf transfer is done.
     * 
     */
    @Deprecated /* Deprecated. Unique ID of the user on whose behalf transfer is done. */
    public String userId() {
        return this.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTransferConfigResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer dataRefreshWindowDays;
        private String dataSourceId;
        private String datasetRegion;
        private String destinationDatasetId;
        private Boolean disabled;
        private String displayName;
        private EmailPreferencesResponse emailPreferences;
        private String name;
        private String nextRunTime;
        private String notificationPubsubTopic;
        private UserInfoResponse ownerInfo;
        private Map<String,String> params;
        private String schedule;
        private ScheduleOptionsResponse scheduleOptions;
        private String state;
        private String updateTime;
        private String userId;
        public Builder() {}
        public Builder(GetTransferConfigResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataRefreshWindowDays = defaults.dataRefreshWindowDays;
    	      this.dataSourceId = defaults.dataSourceId;
    	      this.datasetRegion = defaults.datasetRegion;
    	      this.destinationDatasetId = defaults.destinationDatasetId;
    	      this.disabled = defaults.disabled;
    	      this.displayName = defaults.displayName;
    	      this.emailPreferences = defaults.emailPreferences;
    	      this.name = defaults.name;
    	      this.nextRunTime = defaults.nextRunTime;
    	      this.notificationPubsubTopic = defaults.notificationPubsubTopic;
    	      this.ownerInfo = defaults.ownerInfo;
    	      this.params = defaults.params;
    	      this.schedule = defaults.schedule;
    	      this.scheduleOptions = defaults.scheduleOptions;
    	      this.state = defaults.state;
    	      this.updateTime = defaults.updateTime;
    	      this.userId = defaults.userId;
        }

        @CustomType.Setter
        public Builder dataRefreshWindowDays(Integer dataRefreshWindowDays) {
            this.dataRefreshWindowDays = Objects.requireNonNull(dataRefreshWindowDays);
            return this;
        }
        @CustomType.Setter
        public Builder dataSourceId(String dataSourceId) {
            this.dataSourceId = Objects.requireNonNull(dataSourceId);
            return this;
        }
        @CustomType.Setter
        public Builder datasetRegion(String datasetRegion) {
            this.datasetRegion = Objects.requireNonNull(datasetRegion);
            return this;
        }
        @CustomType.Setter
        public Builder destinationDatasetId(String destinationDatasetId) {
            this.destinationDatasetId = Objects.requireNonNull(destinationDatasetId);
            return this;
        }
        @CustomType.Setter
        public Builder disabled(Boolean disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }
        @CustomType.Setter
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        @CustomType.Setter
        public Builder emailPreferences(EmailPreferencesResponse emailPreferences) {
            this.emailPreferences = Objects.requireNonNull(emailPreferences);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder nextRunTime(String nextRunTime) {
            this.nextRunTime = Objects.requireNonNull(nextRunTime);
            return this;
        }
        @CustomType.Setter
        public Builder notificationPubsubTopic(String notificationPubsubTopic) {
            this.notificationPubsubTopic = Objects.requireNonNull(notificationPubsubTopic);
            return this;
        }
        @CustomType.Setter
        public Builder ownerInfo(UserInfoResponse ownerInfo) {
            this.ownerInfo = Objects.requireNonNull(ownerInfo);
            return this;
        }
        @CustomType.Setter
        public Builder params(Map<String,String> params) {
            this.params = Objects.requireNonNull(params);
            return this;
        }
        @CustomType.Setter
        public Builder schedule(String schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }
        @CustomType.Setter
        public Builder scheduleOptions(ScheduleOptionsResponse scheduleOptions) {
            this.scheduleOptions = Objects.requireNonNull(scheduleOptions);
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        @CustomType.Setter
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        @CustomType.Setter
        public Builder userId(String userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }
        public GetTransferConfigResult build() {
            final var o = new GetTransferConfigResult();
            o.dataRefreshWindowDays = dataRefreshWindowDays;
            o.dataSourceId = dataSourceId;
            o.datasetRegion = datasetRegion;
            o.destinationDatasetId = destinationDatasetId;
            o.disabled = disabled;
            o.displayName = displayName;
            o.emailPreferences = emailPreferences;
            o.name = name;
            o.nextRunTime = nextRunTime;
            o.notificationPubsubTopic = notificationPubsubTopic;
            o.ownerInfo = ownerInfo;
            o.params = params;
            o.schedule = schedule;
            o.scheduleOptions = scheduleOptions;
            o.state = state;
            o.updateTime = updateTime;
            o.userId = userId;
            return o;
        }
    }
}