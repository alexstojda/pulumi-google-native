// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.CloudIoT.V1
{
    public static class GetDevice
    {
        /// <summary>
        /// Gets details about a device.
        /// </summary>
        public static Task<GetDeviceResult> InvokeAsync(GetDeviceArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDeviceResult>("google-native:cloudiot/v1:getDevice", args ?? new GetDeviceArgs(), options.WithDefaults());

        /// <summary>
        /// Gets details about a device.
        /// </summary>
        public static Output<GetDeviceResult> Invoke(GetDeviceInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDeviceResult>("google-native:cloudiot/v1:getDevice", args ?? new GetDeviceInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDeviceArgs : global::Pulumi.InvokeArgs
    {
        [Input("deviceId", required: true)]
        public string DeviceId { get; set; } = null!;

        [Input("fieldMask")]
        public string? FieldMask { get; set; }

        [Input("location", required: true)]
        public string Location { get; set; } = null!;

        [Input("project")]
        public string? Project { get; set; }

        [Input("registryId", required: true)]
        public string RegistryId { get; set; } = null!;

        public GetDeviceArgs()
        {
        }
        public static new GetDeviceArgs Empty => new GetDeviceArgs();
    }

    public sealed class GetDeviceInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("deviceId", required: true)]
        public Input<string> DeviceId { get; set; } = null!;

        [Input("fieldMask")]
        public Input<string>? FieldMask { get; set; }

        [Input("location", required: true)]
        public Input<string> Location { get; set; } = null!;

        [Input("project")]
        public Input<string>? Project { get; set; }

        [Input("registryId", required: true)]
        public Input<string> RegistryId { get; set; } = null!;

        public GetDeviceInvokeArgs()
        {
        }
        public static new GetDeviceInvokeArgs Empty => new GetDeviceInvokeArgs();
    }


    [OutputType]
    public sealed class GetDeviceResult
    {
        /// <summary>
        /// If a device is blocked, connections or requests from this device will fail. Can be used to temporarily prevent the device from connecting if, for example, the sensor is generating bad data and needs maintenance.
        /// </summary>
        public readonly bool Blocked;
        /// <summary>
        /// The most recent device configuration, which is eventually sent from Cloud IoT Core to the device. If not present on creation, the configuration will be initialized with an empty payload and version value of `1`. To update this field after creation, use the `DeviceManager.ModifyCloudToDeviceConfig` method.
        /// </summary>
        public readonly Outputs.DeviceConfigResponse Config;
        /// <summary>
        /// The credentials used to authenticate this device. To allow credential rotation without interruption, multiple device credentials can be bound to this device. No more than 3 credentials can be bound to a single device at a time. When new credentials are added to a device, they are verified against the registry credentials. For details, see the description of the `DeviceRegistry.credentials` field.
        /// </summary>
        public readonly ImmutableArray<Outputs.DeviceCredentialResponse> Credentials;
        /// <summary>
        /// Gateway-related configuration and state.
        /// </summary>
        public readonly Outputs.GatewayConfigResponse GatewayConfig;
        /// <summary>
        /// [Output only] The last time a cloud-to-device config version acknowledgment was received from the device. This field is only for configurations sent through MQTT.
        /// </summary>
        public readonly string LastConfigAckTime;
        /// <summary>
        /// [Output only] The last time a cloud-to-device config version was sent to the device.
        /// </summary>
        public readonly string LastConfigSendTime;
        /// <summary>
        /// [Output only] The error message of the most recent error, such as a failure to publish to Cloud Pub/Sub. 'last_error_time' is the timestamp of this field. If no errors have occurred, this field has an empty message and the status code 0 == OK. Otherwise, this field is expected to have a status code other than OK.
        /// </summary>
        public readonly Outputs.StatusResponse LastErrorStatus;
        /// <summary>
        /// [Output only] The time the most recent error occurred, such as a failure to publish to Cloud Pub/Sub. This field is the timestamp of 'last_error_status'.
        /// </summary>
        public readonly string LastErrorTime;
        /// <summary>
        /// [Output only] The last time a telemetry event was received. Timestamps are periodically collected and written to storage; they may be stale by a few minutes.
        /// </summary>
        public readonly string LastEventTime;
        /// <summary>
        /// [Output only] The last time an MQTT `PINGREQ` was received. This field applies only to devices connecting through MQTT. MQTT clients usually only send `PINGREQ` messages if the connection is idle, and no other messages have been sent. Timestamps are periodically collected and written to storage; they may be stale by a few minutes.
        /// </summary>
        public readonly string LastHeartbeatTime;
        /// <summary>
        /// [Output only] The last time a state event was received. Timestamps are periodically collected and written to storage; they may be stale by a few minutes.
        /// </summary>
        public readonly string LastStateTime;
        /// <summary>
        /// **Beta Feature** The logging verbosity for device activity. If unspecified, DeviceRegistry.log_level will be used.
        /// </summary>
        public readonly string LogLevel;
        /// <summary>
        /// The metadata key-value pairs assigned to the device. This metadata is not interpreted or indexed by Cloud IoT Core. It can be used to add contextual information for the device. Keys must conform to the regular expression a-zA-Z+ and be less than 128 bytes in length. Values are free-form strings. Each value must be less than or equal to 32 KB in size. The total size of all keys and values must be less than 256 KB, and the maximum number of key-value pairs is 500.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Metadata;
        /// <summary>
        /// The resource path name. For example, `projects/p1/locations/us-central1/registries/registry0/devices/dev0` or `projects/p1/locations/us-central1/registries/registry0/devices/{num_id}`. When `name` is populated as a response from the service, it always ends in the device numeric ID.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// [Output only] A server-defined unique numeric ID for the device. This is a more compact way to identify devices, and it is globally unique.
        /// </summary>
        public readonly string NumId;
        /// <summary>
        /// [Output only] The state most recently received from the device. If no state has been reported, this field is not present.
        /// </summary>
        public readonly Outputs.DeviceStateResponse State;

        [OutputConstructor]
        private GetDeviceResult(
            bool blocked,

            Outputs.DeviceConfigResponse config,

            ImmutableArray<Outputs.DeviceCredentialResponse> credentials,

            Outputs.GatewayConfigResponse gatewayConfig,

            string lastConfigAckTime,

            string lastConfigSendTime,

            Outputs.StatusResponse lastErrorStatus,

            string lastErrorTime,

            string lastEventTime,

            string lastHeartbeatTime,

            string lastStateTime,

            string logLevel,

            ImmutableDictionary<string, string> metadata,

            string name,

            string numId,

            Outputs.DeviceStateResponse state)
        {
            Blocked = blocked;
            Config = config;
            Credentials = credentials;
            GatewayConfig = gatewayConfig;
            LastConfigAckTime = lastConfigAckTime;
            LastConfigSendTime = lastConfigSendTime;
            LastErrorStatus = lastErrorStatus;
            LastErrorTime = lastErrorTime;
            LastEventTime = lastEventTime;
            LastHeartbeatTime = lastHeartbeatTime;
            LastStateTime = lastStateTime;
            LogLevel = logLevel;
            Metadata = metadata;
            Name = name;
            NumId = numId;
            State = state;
        }
    }
}
