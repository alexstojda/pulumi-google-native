// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudiot.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.cloudiot.v1.DeviceArgs;
import com.pulumi.googlenative.cloudiot.v1.outputs.DeviceConfigResponse;
import com.pulumi.googlenative.cloudiot.v1.outputs.DeviceCredentialResponse;
import com.pulumi.googlenative.cloudiot.v1.outputs.DeviceStateResponse;
import com.pulumi.googlenative.cloudiot.v1.outputs.GatewayConfigResponse;
import com.pulumi.googlenative.cloudiot.v1.outputs.StatusResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a device in a device registry.
 * 
 */
@ResourceType(type="google-native:cloudiot/v1:Device")
public class Device extends com.pulumi.resources.CustomResource {
    /**
     * If a device is blocked, connections or requests from this device will fail. Can be used to temporarily prevent the device from connecting if, for example, the sensor is generating bad data and needs maintenance.
     * 
     */
    @Export(name="blocked", type=Boolean.class, parameters={})
    private Output<Boolean> blocked;

    /**
     * @return If a device is blocked, connections or requests from this device will fail. Can be used to temporarily prevent the device from connecting if, for example, the sensor is generating bad data and needs maintenance.
     * 
     */
    public Output<Boolean> blocked() {
        return this.blocked;
    }
    /**
     * The most recent device configuration, which is eventually sent from Cloud IoT Core to the device. If not present on creation, the configuration will be initialized with an empty payload and version value of `1`. To update this field after creation, use the `DeviceManager.ModifyCloudToDeviceConfig` method.
     * 
     */
    @Export(name="config", type=DeviceConfigResponse.class, parameters={})
    private Output<DeviceConfigResponse> config;

    /**
     * @return The most recent device configuration, which is eventually sent from Cloud IoT Core to the device. If not present on creation, the configuration will be initialized with an empty payload and version value of `1`. To update this field after creation, use the `DeviceManager.ModifyCloudToDeviceConfig` method.
     * 
     */
    public Output<DeviceConfigResponse> config() {
        return this.config;
    }
    /**
     * The credentials used to authenticate this device. To allow credential rotation without interruption, multiple device credentials can be bound to this device. No more than 3 credentials can be bound to a single device at a time. When new credentials are added to a device, they are verified against the registry credentials. For details, see the description of the `DeviceRegistry.credentials` field.
     * 
     */
    @Export(name="credentials", type=List.class, parameters={DeviceCredentialResponse.class})
    private Output<List<DeviceCredentialResponse>> credentials;

    /**
     * @return The credentials used to authenticate this device. To allow credential rotation without interruption, multiple device credentials can be bound to this device. No more than 3 credentials can be bound to a single device at a time. When new credentials are added to a device, they are verified against the registry credentials. For details, see the description of the `DeviceRegistry.credentials` field.
     * 
     */
    public Output<List<DeviceCredentialResponse>> credentials() {
        return this.credentials;
    }
    /**
     * Gateway-related configuration and state.
     * 
     */
    @Export(name="gatewayConfig", type=GatewayConfigResponse.class, parameters={})
    private Output<GatewayConfigResponse> gatewayConfig;

    /**
     * @return Gateway-related configuration and state.
     * 
     */
    public Output<GatewayConfigResponse> gatewayConfig() {
        return this.gatewayConfig;
    }
    /**
     * [Output only] The last time a cloud-to-device config version acknowledgment was received from the device. This field is only for configurations sent through MQTT.
     * 
     */
    @Export(name="lastConfigAckTime", type=String.class, parameters={})
    private Output<String> lastConfigAckTime;

    /**
     * @return [Output only] The last time a cloud-to-device config version acknowledgment was received from the device. This field is only for configurations sent through MQTT.
     * 
     */
    public Output<String> lastConfigAckTime() {
        return this.lastConfigAckTime;
    }
    /**
     * [Output only] The last time a cloud-to-device config version was sent to the device.
     * 
     */
    @Export(name="lastConfigSendTime", type=String.class, parameters={})
    private Output<String> lastConfigSendTime;

    /**
     * @return [Output only] The last time a cloud-to-device config version was sent to the device.
     * 
     */
    public Output<String> lastConfigSendTime() {
        return this.lastConfigSendTime;
    }
    /**
     * [Output only] The error message of the most recent error, such as a failure to publish to Cloud Pub/Sub. &#39;last_error_time&#39; is the timestamp of this field. If no errors have occurred, this field has an empty message and the status code 0 == OK. Otherwise, this field is expected to have a status code other than OK.
     * 
     */
    @Export(name="lastErrorStatus", type=StatusResponse.class, parameters={})
    private Output<StatusResponse> lastErrorStatus;

    /**
     * @return [Output only] The error message of the most recent error, such as a failure to publish to Cloud Pub/Sub. &#39;last_error_time&#39; is the timestamp of this field. If no errors have occurred, this field has an empty message and the status code 0 == OK. Otherwise, this field is expected to have a status code other than OK.
     * 
     */
    public Output<StatusResponse> lastErrorStatus() {
        return this.lastErrorStatus;
    }
    /**
     * [Output only] The time the most recent error occurred, such as a failure to publish to Cloud Pub/Sub. This field is the timestamp of &#39;last_error_status&#39;.
     * 
     */
    @Export(name="lastErrorTime", type=String.class, parameters={})
    private Output<String> lastErrorTime;

    /**
     * @return [Output only] The time the most recent error occurred, such as a failure to publish to Cloud Pub/Sub. This field is the timestamp of &#39;last_error_status&#39;.
     * 
     */
    public Output<String> lastErrorTime() {
        return this.lastErrorTime;
    }
    /**
     * [Output only] The last time a telemetry event was received. Timestamps are periodically collected and written to storage; they may be stale by a few minutes.
     * 
     */
    @Export(name="lastEventTime", type=String.class, parameters={})
    private Output<String> lastEventTime;

    /**
     * @return [Output only] The last time a telemetry event was received. Timestamps are periodically collected and written to storage; they may be stale by a few minutes.
     * 
     */
    public Output<String> lastEventTime() {
        return this.lastEventTime;
    }
    /**
     * [Output only] The last time an MQTT `PINGREQ` was received. This field applies only to devices connecting through MQTT. MQTT clients usually only send `PINGREQ` messages if the connection is idle, and no other messages have been sent. Timestamps are periodically collected and written to storage; they may be stale by a few minutes.
     * 
     */
    @Export(name="lastHeartbeatTime", type=String.class, parameters={})
    private Output<String> lastHeartbeatTime;

    /**
     * @return [Output only] The last time an MQTT `PINGREQ` was received. This field applies only to devices connecting through MQTT. MQTT clients usually only send `PINGREQ` messages if the connection is idle, and no other messages have been sent. Timestamps are periodically collected and written to storage; they may be stale by a few minutes.
     * 
     */
    public Output<String> lastHeartbeatTime() {
        return this.lastHeartbeatTime;
    }
    /**
     * [Output only] The last time a state event was received. Timestamps are periodically collected and written to storage; they may be stale by a few minutes.
     * 
     */
    @Export(name="lastStateTime", type=String.class, parameters={})
    private Output<String> lastStateTime;

    /**
     * @return [Output only] The last time a state event was received. Timestamps are periodically collected and written to storage; they may be stale by a few minutes.
     * 
     */
    public Output<String> lastStateTime() {
        return this.lastStateTime;
    }
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }
    /**
     * **Beta Feature** The logging verbosity for device activity. If unspecified, DeviceRegistry.log_level will be used.
     * 
     */
    @Export(name="logLevel", type=String.class, parameters={})
    private Output<String> logLevel;

    /**
     * @return **Beta Feature** The logging verbosity for device activity. If unspecified, DeviceRegistry.log_level will be used.
     * 
     */
    public Output<String> logLevel() {
        return this.logLevel;
    }
    /**
     * The metadata key-value pairs assigned to the device. This metadata is not interpreted or indexed by Cloud IoT Core. It can be used to add contextual information for the device. Keys must conform to the regular expression a-zA-Z+ and be less than 128 bytes in length. Values are free-form strings. Each value must be less than or equal to 32 KB in size. The total size of all keys and values must be less than 256 KB, and the maximum number of key-value pairs is 500.
     * 
     */
    @Export(name="metadata", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> metadata;

    /**
     * @return The metadata key-value pairs assigned to the device. This metadata is not interpreted or indexed by Cloud IoT Core. It can be used to add contextual information for the device. Keys must conform to the regular expression a-zA-Z+ and be less than 128 bytes in length. Values are free-form strings. Each value must be less than or equal to 32 KB in size. The total size of all keys and values must be less than 256 KB, and the maximum number of key-value pairs is 500.
     * 
     */
    public Output<Map<String,String>> metadata() {
        return this.metadata;
    }
    /**
     * The resource path name. For example, `projects/p1/locations/us-central1/registries/registry0/devices/dev0` or `projects/p1/locations/us-central1/registries/registry0/devices/{num_id}`. When `name` is populated as a response from the service, it always ends in the device numeric ID.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource path name. For example, `projects/p1/locations/us-central1/registries/registry0/devices/dev0` or `projects/p1/locations/us-central1/registries/registry0/devices/{num_id}`. When `name` is populated as a response from the service, it always ends in the device numeric ID.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * [Output only] A server-defined unique numeric ID for the device. This is a more compact way to identify devices, and it is globally unique.
     * 
     */
    @Export(name="numId", type=String.class, parameters={})
    private Output<String> numId;

    /**
     * @return [Output only] A server-defined unique numeric ID for the device. This is a more compact way to identify devices, and it is globally unique.
     * 
     */
    public Output<String> numId() {
        return this.numId;
    }
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> project() {
        return this.project;
    }
    @Export(name="registryId", type=String.class, parameters={})
    private Output<String> registryId;

    public Output<String> registryId() {
        return this.registryId;
    }
    /**
     * [Output only] The state most recently received from the device. If no state has been reported, this field is not present.
     * 
     */
    @Export(name="state", type=DeviceStateResponse.class, parameters={})
    private Output<DeviceStateResponse> state;

    /**
     * @return [Output only] The state most recently received from the device. If no state has been reported, this field is not present.
     * 
     */
    public Output<DeviceStateResponse> state() {
        return this.state;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Device(String name) {
        this(name, DeviceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Device(String name, DeviceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Device(String name, DeviceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudiot/v1:Device", name, args == null ? DeviceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Device(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudiot/v1:Device", name, null, makeResourceOptions(options, id));
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
    public static Device get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Device(name, id, options);
    }
}