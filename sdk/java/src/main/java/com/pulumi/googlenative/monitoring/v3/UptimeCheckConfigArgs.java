// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring.v3;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.monitoring.v3.enums.UptimeCheckConfigCheckerType;
import com.pulumi.googlenative.monitoring.v3.enums.UptimeCheckConfigSelectedRegionsItem;
import com.pulumi.googlenative.monitoring.v3.inputs.ContentMatcherArgs;
import com.pulumi.googlenative.monitoring.v3.inputs.HttpCheckArgs;
import com.pulumi.googlenative.monitoring.v3.inputs.InternalCheckerArgs;
import com.pulumi.googlenative.monitoring.v3.inputs.MonitoredResourceArgs;
import com.pulumi.googlenative.monitoring.v3.inputs.ResourceGroupArgs;
import com.pulumi.googlenative.monitoring.v3.inputs.TcpCheckArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UptimeCheckConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final UptimeCheckConfigArgs Empty = new UptimeCheckConfigArgs();

    /**
     * The type of checkers to use to execute the Uptime check.
     * 
     */
    @Import(name="checkerType")
    private @Nullable Output<UptimeCheckConfigCheckerType> checkerType;

    /**
     * @return The type of checkers to use to execute the Uptime check.
     * 
     */
    public Optional<Output<UptimeCheckConfigCheckerType>> checkerType() {
        return Optional.ofNullable(this.checkerType);
    }

    /**
     * The content that is expected to appear in the data returned by the target server against which the check is run. Currently, only the first entry in the content_matchers list is supported, and additional entries will be ignored. This field is optional and should only be specified if a content match is required as part of the/ Uptime check.
     * 
     */
    @Import(name="contentMatchers")
    private @Nullable Output<List<ContentMatcherArgs>> contentMatchers;

    /**
     * @return The content that is expected to appear in the data returned by the target server against which the check is run. Currently, only the first entry in the content_matchers list is supported, and additional entries will be ignored. This field is optional and should only be specified if a content match is required as part of the/ Uptime check.
     * 
     */
    public Optional<Output<List<ContentMatcherArgs>>> contentMatchers() {
        return Optional.ofNullable(this.contentMatchers);
    }

    /**
     * A human-friendly name for the Uptime check configuration. The display name should be unique within a Cloud Monitoring Workspace in order to make it easier to identify; however, uniqueness is not enforced. Required.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return A human-friendly name for the Uptime check configuration. The display name should be unique within a Cloud Monitoring Workspace in order to make it easier to identify; however, uniqueness is not enforced. Required.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Contains information needed to make an HTTP or HTTPS check.
     * 
     */
    @Import(name="httpCheck")
    private @Nullable Output<HttpCheckArgs> httpCheck;

    /**
     * @return Contains information needed to make an HTTP or HTTPS check.
     * 
     */
    public Optional<Output<HttpCheckArgs>> httpCheck() {
        return Optional.ofNullable(this.httpCheck);
    }

    /**
     * The internal checkers that this check will egress from. If is_internal is true and this list is empty, the check will egress from all the InternalCheckers configured for the project that owns this UptimeCheckConfig.
     * 
     */
    @Import(name="internalCheckers")
    private @Nullable Output<List<InternalCheckerArgs>> internalCheckers;

    /**
     * @return The internal checkers that this check will egress from. If is_internal is true and this list is empty, the check will egress from all the InternalCheckers configured for the project that owns this UptimeCheckConfig.
     * 
     */
    public Optional<Output<List<InternalCheckerArgs>>> internalCheckers() {
        return Optional.ofNullable(this.internalCheckers);
    }

    /**
     * If this is true, then checks are made only from the &#39;internal_checkers&#39;. If it is false, then checks are made only from the &#39;selected_regions&#39;. It is an error to provide &#39;selected_regions&#39; when is_internal is true, or to provide &#39;internal_checkers&#39; when is_internal is false.
     * 
     */
    @Import(name="isInternal")
    private @Nullable Output<Boolean> isInternal;

    /**
     * @return If this is true, then checks are made only from the &#39;internal_checkers&#39;. If it is false, then checks are made only from the &#39;selected_regions&#39;. It is an error to provide &#39;selected_regions&#39; when is_internal is true, or to provide &#39;internal_checkers&#39; when is_internal is false.
     * 
     */
    public Optional<Output<Boolean>> isInternal() {
        return Optional.ofNullable(this.isInternal);
    }

    /**
     * The monitored resource (https://cloud.google.com/monitoring/api/resources) associated with the configuration. The following monitored resource types are valid for this field: uptime_url, gce_instance, gae_app, aws_ec2_instance, aws_elb_load_balancer k8s_service servicedirectory_service
     * 
     */
    @Import(name="monitoredResource")
    private @Nullable Output<MonitoredResourceArgs> monitoredResource;

    /**
     * @return The monitored resource (https://cloud.google.com/monitoring/api/resources) associated with the configuration. The following monitored resource types are valid for this field: uptime_url, gce_instance, gae_app, aws_ec2_instance, aws_elb_load_balancer k8s_service servicedirectory_service
     * 
     */
    public Optional<Output<MonitoredResourceArgs>> monitoredResource() {
        return Optional.ofNullable(this.monitoredResource);
    }

    /**
     * A unique resource name for this Uptime check configuration. The format is: projects/[PROJECT_ID_OR_NUMBER]/uptimeCheckConfigs/[UPTIME_CHECK_ID] [PROJECT_ID_OR_NUMBER] is the Workspace host project associated with the Uptime check.This field should be omitted when creating the Uptime check configuration; on create, the resource name is assigned by the server and included in the response.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A unique resource name for this Uptime check configuration. The format is: projects/[PROJECT_ID_OR_NUMBER]/uptimeCheckConfigs/[UPTIME_CHECK_ID] [PROJECT_ID_OR_NUMBER] is the Workspace host project associated with the Uptime check.This field should be omitted when creating the Uptime check configuration; on create, the resource name is assigned by the server and included in the response.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * How often, in seconds, the Uptime check is performed. Currently, the only supported values are 60s (1 minute), 300s (5 minutes), 600s (10 minutes), and 900s (15 minutes). Optional, defaults to 60s.
     * 
     */
    @Import(name="period")
    private @Nullable Output<String> period;

    /**
     * @return How often, in seconds, the Uptime check is performed. Currently, the only supported values are 60s (1 minute), 300s (5 minutes), 600s (10 minutes), and 900s (15 minutes). Optional, defaults to 60s.
     * 
     */
    public Optional<Output<String>> period() {
        return Optional.ofNullable(this.period);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The group resource associated with the configuration.
     * 
     */
    @Import(name="resourceGroup")
    private @Nullable Output<ResourceGroupArgs> resourceGroup;

    /**
     * @return The group resource associated with the configuration.
     * 
     */
    public Optional<Output<ResourceGroupArgs>> resourceGroup() {
        return Optional.ofNullable(this.resourceGroup);
    }

    /**
     * The list of regions from which the check will be run. Some regions contain one location, and others contain more than one. If this field is specified, enough regions must be provided to include a minimum of 3 locations. Not specifying this field will result in Uptime checks running from all available regions.
     * 
     */
    @Import(name="selectedRegions")
    private @Nullable Output<List<UptimeCheckConfigSelectedRegionsItem>> selectedRegions;

    /**
     * @return The list of regions from which the check will be run. Some regions contain one location, and others contain more than one. If this field is specified, enough regions must be provided to include a minimum of 3 locations. Not specifying this field will result in Uptime checks running from all available regions.
     * 
     */
    public Optional<Output<List<UptimeCheckConfigSelectedRegionsItem>>> selectedRegions() {
        return Optional.ofNullable(this.selectedRegions);
    }

    /**
     * Contains information needed to make a TCP check.
     * 
     */
    @Import(name="tcpCheck")
    private @Nullable Output<TcpCheckArgs> tcpCheck;

    /**
     * @return Contains information needed to make a TCP check.
     * 
     */
    public Optional<Output<TcpCheckArgs>> tcpCheck() {
        return Optional.ofNullable(this.tcpCheck);
    }

    /**
     * The maximum amount of time to wait for the request to complete (must be between 1 and 60 seconds). Required.
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<String> timeout;

    /**
     * @return The maximum amount of time to wait for the request to complete (must be between 1 and 60 seconds). Required.
     * 
     */
    public Optional<Output<String>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    private UptimeCheckConfigArgs() {}

    private UptimeCheckConfigArgs(UptimeCheckConfigArgs $) {
        this.checkerType = $.checkerType;
        this.contentMatchers = $.contentMatchers;
        this.displayName = $.displayName;
        this.httpCheck = $.httpCheck;
        this.internalCheckers = $.internalCheckers;
        this.isInternal = $.isInternal;
        this.monitoredResource = $.monitoredResource;
        this.name = $.name;
        this.period = $.period;
        this.project = $.project;
        this.resourceGroup = $.resourceGroup;
        this.selectedRegions = $.selectedRegions;
        this.tcpCheck = $.tcpCheck;
        this.timeout = $.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UptimeCheckConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UptimeCheckConfigArgs $;

        public Builder() {
            $ = new UptimeCheckConfigArgs();
        }

        public Builder(UptimeCheckConfigArgs defaults) {
            $ = new UptimeCheckConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param checkerType The type of checkers to use to execute the Uptime check.
         * 
         * @return builder
         * 
         */
        public Builder checkerType(@Nullable Output<UptimeCheckConfigCheckerType> checkerType) {
            $.checkerType = checkerType;
            return this;
        }

        /**
         * @param checkerType The type of checkers to use to execute the Uptime check.
         * 
         * @return builder
         * 
         */
        public Builder checkerType(UptimeCheckConfigCheckerType checkerType) {
            return checkerType(Output.of(checkerType));
        }

        /**
         * @param contentMatchers The content that is expected to appear in the data returned by the target server against which the check is run. Currently, only the first entry in the content_matchers list is supported, and additional entries will be ignored. This field is optional and should only be specified if a content match is required as part of the/ Uptime check.
         * 
         * @return builder
         * 
         */
        public Builder contentMatchers(@Nullable Output<List<ContentMatcherArgs>> contentMatchers) {
            $.contentMatchers = contentMatchers;
            return this;
        }

        /**
         * @param contentMatchers The content that is expected to appear in the data returned by the target server against which the check is run. Currently, only the first entry in the content_matchers list is supported, and additional entries will be ignored. This field is optional and should only be specified if a content match is required as part of the/ Uptime check.
         * 
         * @return builder
         * 
         */
        public Builder contentMatchers(List<ContentMatcherArgs> contentMatchers) {
            return contentMatchers(Output.of(contentMatchers));
        }

        /**
         * @param contentMatchers The content that is expected to appear in the data returned by the target server against which the check is run. Currently, only the first entry in the content_matchers list is supported, and additional entries will be ignored. This field is optional and should only be specified if a content match is required as part of the/ Uptime check.
         * 
         * @return builder
         * 
         */
        public Builder contentMatchers(ContentMatcherArgs... contentMatchers) {
            return contentMatchers(List.of(contentMatchers));
        }

        /**
         * @param displayName A human-friendly name for the Uptime check configuration. The display name should be unique within a Cloud Monitoring Workspace in order to make it easier to identify; however, uniqueness is not enforced. Required.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName A human-friendly name for the Uptime check configuration. The display name should be unique within a Cloud Monitoring Workspace in order to make it easier to identify; however, uniqueness is not enforced. Required.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param httpCheck Contains information needed to make an HTTP or HTTPS check.
         * 
         * @return builder
         * 
         */
        public Builder httpCheck(@Nullable Output<HttpCheckArgs> httpCheck) {
            $.httpCheck = httpCheck;
            return this;
        }

        /**
         * @param httpCheck Contains information needed to make an HTTP or HTTPS check.
         * 
         * @return builder
         * 
         */
        public Builder httpCheck(HttpCheckArgs httpCheck) {
            return httpCheck(Output.of(httpCheck));
        }

        /**
         * @param internalCheckers The internal checkers that this check will egress from. If is_internal is true and this list is empty, the check will egress from all the InternalCheckers configured for the project that owns this UptimeCheckConfig.
         * 
         * @return builder
         * 
         */
        public Builder internalCheckers(@Nullable Output<List<InternalCheckerArgs>> internalCheckers) {
            $.internalCheckers = internalCheckers;
            return this;
        }

        /**
         * @param internalCheckers The internal checkers that this check will egress from. If is_internal is true and this list is empty, the check will egress from all the InternalCheckers configured for the project that owns this UptimeCheckConfig.
         * 
         * @return builder
         * 
         */
        public Builder internalCheckers(List<InternalCheckerArgs> internalCheckers) {
            return internalCheckers(Output.of(internalCheckers));
        }

        /**
         * @param internalCheckers The internal checkers that this check will egress from. If is_internal is true and this list is empty, the check will egress from all the InternalCheckers configured for the project that owns this UptimeCheckConfig.
         * 
         * @return builder
         * 
         */
        public Builder internalCheckers(InternalCheckerArgs... internalCheckers) {
            return internalCheckers(List.of(internalCheckers));
        }

        /**
         * @param isInternal If this is true, then checks are made only from the &#39;internal_checkers&#39;. If it is false, then checks are made only from the &#39;selected_regions&#39;. It is an error to provide &#39;selected_regions&#39; when is_internal is true, or to provide &#39;internal_checkers&#39; when is_internal is false.
         * 
         * @return builder
         * 
         */
        public Builder isInternal(@Nullable Output<Boolean> isInternal) {
            $.isInternal = isInternal;
            return this;
        }

        /**
         * @param isInternal If this is true, then checks are made only from the &#39;internal_checkers&#39;. If it is false, then checks are made only from the &#39;selected_regions&#39;. It is an error to provide &#39;selected_regions&#39; when is_internal is true, or to provide &#39;internal_checkers&#39; when is_internal is false.
         * 
         * @return builder
         * 
         */
        public Builder isInternal(Boolean isInternal) {
            return isInternal(Output.of(isInternal));
        }

        /**
         * @param monitoredResource The monitored resource (https://cloud.google.com/monitoring/api/resources) associated with the configuration. The following monitored resource types are valid for this field: uptime_url, gce_instance, gae_app, aws_ec2_instance, aws_elb_load_balancer k8s_service servicedirectory_service
         * 
         * @return builder
         * 
         */
        public Builder monitoredResource(@Nullable Output<MonitoredResourceArgs> monitoredResource) {
            $.monitoredResource = monitoredResource;
            return this;
        }

        /**
         * @param monitoredResource The monitored resource (https://cloud.google.com/monitoring/api/resources) associated with the configuration. The following monitored resource types are valid for this field: uptime_url, gce_instance, gae_app, aws_ec2_instance, aws_elb_load_balancer k8s_service servicedirectory_service
         * 
         * @return builder
         * 
         */
        public Builder monitoredResource(MonitoredResourceArgs monitoredResource) {
            return monitoredResource(Output.of(monitoredResource));
        }

        /**
         * @param name A unique resource name for this Uptime check configuration. The format is: projects/[PROJECT_ID_OR_NUMBER]/uptimeCheckConfigs/[UPTIME_CHECK_ID] [PROJECT_ID_OR_NUMBER] is the Workspace host project associated with the Uptime check.This field should be omitted when creating the Uptime check configuration; on create, the resource name is assigned by the server and included in the response.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A unique resource name for this Uptime check configuration. The format is: projects/[PROJECT_ID_OR_NUMBER]/uptimeCheckConfigs/[UPTIME_CHECK_ID] [PROJECT_ID_OR_NUMBER] is the Workspace host project associated with the Uptime check.This field should be omitted when creating the Uptime check configuration; on create, the resource name is assigned by the server and included in the response.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param period How often, in seconds, the Uptime check is performed. Currently, the only supported values are 60s (1 minute), 300s (5 minutes), 600s (10 minutes), and 900s (15 minutes). Optional, defaults to 60s.
         * 
         * @return builder
         * 
         */
        public Builder period(@Nullable Output<String> period) {
            $.period = period;
            return this;
        }

        /**
         * @param period How often, in seconds, the Uptime check is performed. Currently, the only supported values are 60s (1 minute), 300s (5 minutes), 600s (10 minutes), and 900s (15 minutes). Optional, defaults to 60s.
         * 
         * @return builder
         * 
         */
        public Builder period(String period) {
            return period(Output.of(period));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param resourceGroup The group resource associated with the configuration.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroup(@Nullable Output<ResourceGroupArgs> resourceGroup) {
            $.resourceGroup = resourceGroup;
            return this;
        }

        /**
         * @param resourceGroup The group resource associated with the configuration.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroup(ResourceGroupArgs resourceGroup) {
            return resourceGroup(Output.of(resourceGroup));
        }

        /**
         * @param selectedRegions The list of regions from which the check will be run. Some regions contain one location, and others contain more than one. If this field is specified, enough regions must be provided to include a minimum of 3 locations. Not specifying this field will result in Uptime checks running from all available regions.
         * 
         * @return builder
         * 
         */
        public Builder selectedRegions(@Nullable Output<List<UptimeCheckConfigSelectedRegionsItem>> selectedRegions) {
            $.selectedRegions = selectedRegions;
            return this;
        }

        /**
         * @param selectedRegions The list of regions from which the check will be run. Some regions contain one location, and others contain more than one. If this field is specified, enough regions must be provided to include a minimum of 3 locations. Not specifying this field will result in Uptime checks running from all available regions.
         * 
         * @return builder
         * 
         */
        public Builder selectedRegions(List<UptimeCheckConfigSelectedRegionsItem> selectedRegions) {
            return selectedRegions(Output.of(selectedRegions));
        }

        /**
         * @param selectedRegions The list of regions from which the check will be run. Some regions contain one location, and others contain more than one. If this field is specified, enough regions must be provided to include a minimum of 3 locations. Not specifying this field will result in Uptime checks running from all available regions.
         * 
         * @return builder
         * 
         */
        public Builder selectedRegions(UptimeCheckConfigSelectedRegionsItem... selectedRegions) {
            return selectedRegions(List.of(selectedRegions));
        }

        /**
         * @param tcpCheck Contains information needed to make a TCP check.
         * 
         * @return builder
         * 
         */
        public Builder tcpCheck(@Nullable Output<TcpCheckArgs> tcpCheck) {
            $.tcpCheck = tcpCheck;
            return this;
        }

        /**
         * @param tcpCheck Contains information needed to make a TCP check.
         * 
         * @return builder
         * 
         */
        public Builder tcpCheck(TcpCheckArgs tcpCheck) {
            return tcpCheck(Output.of(tcpCheck));
        }

        /**
         * @param timeout The maximum amount of time to wait for the request to complete (must be between 1 and 60 seconds). Required.
         * 
         * @return builder
         * 
         */
        public Builder timeout(@Nullable Output<String> timeout) {
            $.timeout = timeout;
            return this;
        }

        /**
         * @param timeout The maximum amount of time to wait for the request to complete (must be between 1 and 60 seconds). Required.
         * 
         * @return builder
         * 
         */
        public Builder timeout(String timeout) {
            return timeout(Output.of(timeout));
        }

        public UptimeCheckConfigArgs build() {
            return $;
        }
    }

}