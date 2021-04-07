# coding=utf-8
# *** WARNING: this file was generated by the Pulumi SDK Generator. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from ... import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['AppServiceVersion']


class AppServiceVersion(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_config: Optional[pulumi.Input[pulumi.InputType['ApiConfigHandlerArgs']]] = None,
                 app_engine_apis: Optional[pulumi.Input[bool]] = None,
                 apps_id: Optional[pulumi.Input[str]] = None,
                 automatic_scaling: Optional[pulumi.Input[pulumi.InputType['AutomaticScalingArgs']]] = None,
                 basic_scaling: Optional[pulumi.Input[pulumi.InputType['BasicScalingArgs']]] = None,
                 beta_settings: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 build_env_variables: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 create_time: Optional[pulumi.Input[str]] = None,
                 created_by: Optional[pulumi.Input[str]] = None,
                 default_expiration: Optional[pulumi.Input[str]] = None,
                 deployment: Optional[pulumi.Input[pulumi.InputType['DeploymentArgs']]] = None,
                 disk_usage_bytes: Optional[pulumi.Input[str]] = None,
                 endpoints_api_service: Optional[pulumi.Input[pulumi.InputType['EndpointsApiServiceArgs']]] = None,
                 entrypoint: Optional[pulumi.Input[pulumi.InputType['EntrypointArgs']]] = None,
                 env: Optional[pulumi.Input[str]] = None,
                 env_variables: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 error_handlers: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ErrorHandlerArgs']]]]] = None,
                 handlers: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['UrlMapArgs']]]]] = None,
                 health_check: Optional[pulumi.Input[pulumi.InputType['HealthCheckArgs']]] = None,
                 id: Optional[pulumi.Input[str]] = None,
                 inbound_services: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 instance_class: Optional[pulumi.Input[str]] = None,
                 libraries: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['LibraryArgs']]]]] = None,
                 liveness_check: Optional[pulumi.Input[pulumi.InputType['LivenessCheckArgs']]] = None,
                 manual_scaling: Optional[pulumi.Input[pulumi.InputType['ManualScalingArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 network: Optional[pulumi.Input[pulumi.InputType['NetworkArgs']]] = None,
                 nobuild_files_regex: Optional[pulumi.Input[str]] = None,
                 readiness_check: Optional[pulumi.Input[pulumi.InputType['ReadinessCheckArgs']]] = None,
                 resources: Optional[pulumi.Input[pulumi.InputType['ResourcesArgs']]] = None,
                 runtime: Optional[pulumi.Input[str]] = None,
                 runtime_api_version: Optional[pulumi.Input[str]] = None,
                 runtime_channel: Optional[pulumi.Input[str]] = None,
                 runtime_main_executable_path: Optional[pulumi.Input[str]] = None,
                 service_account: Optional[pulumi.Input[str]] = None,
                 services_id: Optional[pulumi.Input[str]] = None,
                 serving_status: Optional[pulumi.Input[str]] = None,
                 threadsafe: Optional[pulumi.Input[bool]] = None,
                 version_url: Optional[pulumi.Input[str]] = None,
                 versions_id: Optional[pulumi.Input[str]] = None,
                 vm: Optional[pulumi.Input[bool]] = None,
                 vpc_access_connector: Optional[pulumi.Input[pulumi.InputType['VpcAccessConnectorArgs']]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Deploys code and resource files to a new version.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['ApiConfigHandlerArgs']] api_config: Serving configuration for Google Cloud Endpoints (https://cloud.google.com/appengine/docs/python/endpoints/).Only returned in GET requests if view=FULL is set.
        :param pulumi.Input[bool] app_engine_apis: app_engine_apis allows second generation runtimes to access the App Engine APIs.
        :param pulumi.Input[pulumi.InputType['AutomaticScalingArgs']] automatic_scaling: Automatic scaling is based on request rate, response latencies, and other application metrics. Instances are dynamically created and destroyed as needed in order to handle traffic.
        :param pulumi.Input[pulumi.InputType['BasicScalingArgs']] basic_scaling: A service with basic scaling will create an instance when the application receives a request. The instance will be turned down when the app becomes idle. Basic scaling is ideal for work that is intermittent or driven by user activity.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] beta_settings: Metadata settings that are supplied to this version to enable beta runtime features.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] build_env_variables: Environment variables available to the build environment.Only returned in GET requests if view=FULL is set.
        :param pulumi.Input[str] create_time: Time that this version was created.@OutputOnly
        :param pulumi.Input[str] created_by: Email address of the user who created this version.@OutputOnly
        :param pulumi.Input[str] default_expiration: Duration that static files should be cached by web proxies and browsers. Only applicable if the corresponding StaticFilesHandler (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1beta/apps.services.versions#StaticFilesHandler) does not specify its own expiration time.Only returned in GET requests if view=FULL is set.
        :param pulumi.Input[pulumi.InputType['DeploymentArgs']] deployment: Code and application artifacts that make up this version.Only returned in GET requests if view=FULL is set.
        :param pulumi.Input[str] disk_usage_bytes: Total size in bytes of all the files that are included in this version and currently hosted on the App Engine disk.@OutputOnly
        :param pulumi.Input[pulumi.InputType['EndpointsApiServiceArgs']] endpoints_api_service: Cloud Endpoints configuration.If endpoints_api_service is set, the Cloud Endpoints Extensible Service Proxy will be provided to serve the API implemented by the app.
        :param pulumi.Input[pulumi.InputType['EntrypointArgs']] entrypoint: The entrypoint for the application.
        :param pulumi.Input[str] env: App Engine execution environment for this version.Defaults to standard.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] env_variables: Environment variables available to the application.Only returned in GET requests if view=FULL is set.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ErrorHandlerArgs']]]] error_handlers: Custom static error pages. Limited to 10KB per page.Only returned in GET requests if view=FULL is set.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['UrlMapArgs']]]] handlers: An ordered list of URL-matching patterns that should be applied to incoming requests. The first matching URL handles the request and other request handlers are not attempted.Only returned in GET requests if view=FULL is set.
        :param pulumi.Input[pulumi.InputType['HealthCheckArgs']] health_check: Configures health checking for instances. Unhealthy instances are stopped and replaced with new instances. Only applicable in the App Engine flexible environment.Only returned in GET requests if view=FULL is set.
        :param pulumi.Input[str] id: Relative name of the version within the service. Example: v1. Version names can contain only lowercase letters, numbers, or hyphens. Reserved names: "default", "latest", and any name with the prefix "ah-".
        :param pulumi.Input[Sequence[pulumi.Input[str]]] inbound_services: Before an application can receive email or XMPP messages, the application must be configured to enable the service.
        :param pulumi.Input[str] instance_class: Instance class that is used to run this version. Valid values are: AutomaticScaling: F1, F2, F4, F4_1G ManualScaling or BasicScaling: B1, B2, B4, B8, B4_1GDefaults to F1 for AutomaticScaling and B1 for ManualScaling or BasicScaling.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['LibraryArgs']]]] libraries: Configuration for third-party Python runtime libraries that are required by the application.Only returned in GET requests if view=FULL is set.
        :param pulumi.Input[pulumi.InputType['LivenessCheckArgs']] liveness_check: Configures liveness health checking for instances. Unhealthy instances are stopped and replaced with new instancesOnly returned in GET requests if view=FULL is set.
        :param pulumi.Input[pulumi.InputType['ManualScalingArgs']] manual_scaling: A service with manual scaling runs continuously, allowing you to perform complex initialization and rely on the state of its memory over time. Manually scaled versions are sometimes referred to as "backends".
        :param pulumi.Input[str] name: Full path to the Version resource in the API. Example: apps/myapp/services/default/versions/v1.@OutputOnly
        :param pulumi.Input[pulumi.InputType['NetworkArgs']] network: Extra network settings. Only applicable in the App Engine flexible environment.
        :param pulumi.Input[str] nobuild_files_regex: Files that match this pattern will not be built into this version. Only applicable for Go runtimes.Only returned in GET requests if view=FULL is set.
        :param pulumi.Input[pulumi.InputType['ReadinessCheckArgs']] readiness_check: Configures readiness health checking for instances. Unhealthy instances are not put into the backend traffic rotation.Only returned in GET requests if view=FULL is set.
        :param pulumi.Input[pulumi.InputType['ResourcesArgs']] resources: Machine resources for this version. Only applicable in the App Engine flexible environment.
        :param pulumi.Input[str] runtime: Desired runtime. Example: python27.
        :param pulumi.Input[str] runtime_api_version: The version of the API in the given runtime environment. Please see the app.yaml reference for valid values at https://cloud.google.com/appengine/docs/standard//config/appref
        :param pulumi.Input[str] runtime_channel: The channel of the runtime to use. Only available for some runtimes. Defaults to the default channel.
        :param pulumi.Input[str] runtime_main_executable_path: The path or name of the app's main executable.
        :param pulumi.Input[str] service_account: The identity that the deployed version will run as. Admin API will use the App Engine Appspot service account as default if this field is neither provided in app.yaml file nor through CLI flag.
        :param pulumi.Input[str] serving_status: Current serving status of this version. Only the versions with a SERVING status create instances and can be billed.SERVING_STATUS_UNSPECIFIED is an invalid value. Defaults to SERVING.
        :param pulumi.Input[bool] threadsafe: Whether multiple requests can be dispatched to this version at once.
        :param pulumi.Input[str] version_url: Serving URL for this version. Example: "https://myversion-dot-myservice-dot-myapp.appspot.com"@OutputOnly
        :param pulumi.Input[bool] vm: Whether to deploy this version in a container on a virtual machine.
        :param pulumi.Input[pulumi.InputType['VpcAccessConnectorArgs']] vpc_access_connector: Enables VPC connectivity for standard apps.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['api_config'] = api_config
            __props__['app_engine_apis'] = app_engine_apis
            if apps_id is None and not opts.urn:
                raise TypeError("Missing required property 'apps_id'")
            __props__['apps_id'] = apps_id
            __props__['automatic_scaling'] = automatic_scaling
            __props__['basic_scaling'] = basic_scaling
            __props__['beta_settings'] = beta_settings
            __props__['build_env_variables'] = build_env_variables
            __props__['create_time'] = create_time
            __props__['created_by'] = created_by
            __props__['default_expiration'] = default_expiration
            __props__['deployment'] = deployment
            __props__['disk_usage_bytes'] = disk_usage_bytes
            __props__['endpoints_api_service'] = endpoints_api_service
            __props__['entrypoint'] = entrypoint
            __props__['env'] = env
            __props__['env_variables'] = env_variables
            __props__['error_handlers'] = error_handlers
            __props__['handlers'] = handlers
            __props__['health_check'] = health_check
            __props__['id'] = id
            __props__['inbound_services'] = inbound_services
            __props__['instance_class'] = instance_class
            __props__['libraries'] = libraries
            __props__['liveness_check'] = liveness_check
            __props__['manual_scaling'] = manual_scaling
            __props__['name'] = name
            __props__['network'] = network
            __props__['nobuild_files_regex'] = nobuild_files_regex
            __props__['readiness_check'] = readiness_check
            __props__['resources'] = resources
            __props__['runtime'] = runtime
            __props__['runtime_api_version'] = runtime_api_version
            __props__['runtime_channel'] = runtime_channel
            __props__['runtime_main_executable_path'] = runtime_main_executable_path
            __props__['service_account'] = service_account
            if services_id is None and not opts.urn:
                raise TypeError("Missing required property 'services_id'")
            __props__['services_id'] = services_id
            __props__['serving_status'] = serving_status
            __props__['threadsafe'] = threadsafe
            __props__['version_url'] = version_url
            if versions_id is None and not opts.urn:
                raise TypeError("Missing required property 'versions_id'")
            __props__['versions_id'] = versions_id
            __props__['vm'] = vm
            __props__['vpc_access_connector'] = vpc_access_connector
        super(AppServiceVersion, __self__).__init__(
            'gcp-native:appengine/v1beta:AppServiceVersion',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None) -> 'AppServiceVersion':
        """
        Get an existing AppServiceVersion resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["api_config"] = None
        __props__["app_engine_apis"] = None
        __props__["automatic_scaling"] = None
        __props__["basic_scaling"] = None
        __props__["beta_settings"] = None
        __props__["build_env_variables"] = None
        __props__["create_time"] = None
        __props__["created_by"] = None
        __props__["default_expiration"] = None
        __props__["deployment"] = None
        __props__["disk_usage_bytes"] = None
        __props__["endpoints_api_service"] = None
        __props__["entrypoint"] = None
        __props__["env"] = None
        __props__["env_variables"] = None
        __props__["error_handlers"] = None
        __props__["handlers"] = None
        __props__["health_check"] = None
        __props__["inbound_services"] = None
        __props__["instance_class"] = None
        __props__["libraries"] = None
        __props__["liveness_check"] = None
        __props__["manual_scaling"] = None
        __props__["name"] = None
        __props__["network"] = None
        __props__["nobuild_files_regex"] = None
        __props__["readiness_check"] = None
        __props__["resources"] = None
        __props__["runtime"] = None
        __props__["runtime_api_version"] = None
        __props__["runtime_channel"] = None
        __props__["runtime_main_executable_path"] = None
        __props__["service_account"] = None
        __props__["serving_status"] = None
        __props__["threadsafe"] = None
        __props__["version_url"] = None
        __props__["vm"] = None
        __props__["vpc_access_connector"] = None
        return AppServiceVersion(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="apiConfig")
    def api_config(self) -> pulumi.Output['outputs.ApiConfigHandlerResponse']:
        """
        Serving configuration for Google Cloud Endpoints (https://cloud.google.com/appengine/docs/python/endpoints/).Only returned in GET requests if view=FULL is set.
        """
        return pulumi.get(self, "api_config")

    @property
    @pulumi.getter(name="appEngineApis")
    def app_engine_apis(self) -> pulumi.Output[bool]:
        """
        app_engine_apis allows second generation runtimes to access the App Engine APIs.
        """
        return pulumi.get(self, "app_engine_apis")

    @property
    @pulumi.getter(name="automaticScaling")
    def automatic_scaling(self) -> pulumi.Output['outputs.AutomaticScalingResponse']:
        """
        Automatic scaling is based on request rate, response latencies, and other application metrics. Instances are dynamically created and destroyed as needed in order to handle traffic.
        """
        return pulumi.get(self, "automatic_scaling")

    @property
    @pulumi.getter(name="basicScaling")
    def basic_scaling(self) -> pulumi.Output['outputs.BasicScalingResponse']:
        """
        A service with basic scaling will create an instance when the application receives a request. The instance will be turned down when the app becomes idle. Basic scaling is ideal for work that is intermittent or driven by user activity.
        """
        return pulumi.get(self, "basic_scaling")

    @property
    @pulumi.getter(name="betaSettings")
    def beta_settings(self) -> pulumi.Output[Mapping[str, str]]:
        """
        Metadata settings that are supplied to this version to enable beta runtime features.
        """
        return pulumi.get(self, "beta_settings")

    @property
    @pulumi.getter(name="buildEnvVariables")
    def build_env_variables(self) -> pulumi.Output[Mapping[str, str]]:
        """
        Environment variables available to the build environment.Only returned in GET requests if view=FULL is set.
        """
        return pulumi.get(self, "build_env_variables")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[str]:
        """
        Time that this version was created.@OutputOnly
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter(name="createdBy")
    def created_by(self) -> pulumi.Output[str]:
        """
        Email address of the user who created this version.@OutputOnly
        """
        return pulumi.get(self, "created_by")

    @property
    @pulumi.getter(name="defaultExpiration")
    def default_expiration(self) -> pulumi.Output[str]:
        """
        Duration that static files should be cached by web proxies and browsers. Only applicable if the corresponding StaticFilesHandler (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1beta/apps.services.versions#StaticFilesHandler) does not specify its own expiration time.Only returned in GET requests if view=FULL is set.
        """
        return pulumi.get(self, "default_expiration")

    @property
    @pulumi.getter
    def deployment(self) -> pulumi.Output['outputs.DeploymentResponse']:
        """
        Code and application artifacts that make up this version.Only returned in GET requests if view=FULL is set.
        """
        return pulumi.get(self, "deployment")

    @property
    @pulumi.getter(name="diskUsageBytes")
    def disk_usage_bytes(self) -> pulumi.Output[str]:
        """
        Total size in bytes of all the files that are included in this version and currently hosted on the App Engine disk.@OutputOnly
        """
        return pulumi.get(self, "disk_usage_bytes")

    @property
    @pulumi.getter(name="endpointsApiService")
    def endpoints_api_service(self) -> pulumi.Output['outputs.EndpointsApiServiceResponse']:
        """
        Cloud Endpoints configuration.If endpoints_api_service is set, the Cloud Endpoints Extensible Service Proxy will be provided to serve the API implemented by the app.
        """
        return pulumi.get(self, "endpoints_api_service")

    @property
    @pulumi.getter
    def entrypoint(self) -> pulumi.Output['outputs.EntrypointResponse']:
        """
        The entrypoint for the application.
        """
        return pulumi.get(self, "entrypoint")

    @property
    @pulumi.getter
    def env(self) -> pulumi.Output[str]:
        """
        App Engine execution environment for this version.Defaults to standard.
        """
        return pulumi.get(self, "env")

    @property
    @pulumi.getter(name="envVariables")
    def env_variables(self) -> pulumi.Output[Mapping[str, str]]:
        """
        Environment variables available to the application.Only returned in GET requests if view=FULL is set.
        """
        return pulumi.get(self, "env_variables")

    @property
    @pulumi.getter(name="errorHandlers")
    def error_handlers(self) -> pulumi.Output[Sequence['outputs.ErrorHandlerResponse']]:
        """
        Custom static error pages. Limited to 10KB per page.Only returned in GET requests if view=FULL is set.
        """
        return pulumi.get(self, "error_handlers")

    @property
    @pulumi.getter
    def handlers(self) -> pulumi.Output[Sequence['outputs.UrlMapResponse']]:
        """
        An ordered list of URL-matching patterns that should be applied to incoming requests. The first matching URL handles the request and other request handlers are not attempted.Only returned in GET requests if view=FULL is set.
        """
        return pulumi.get(self, "handlers")

    @property
    @pulumi.getter(name="healthCheck")
    def health_check(self) -> pulumi.Output['outputs.HealthCheckResponse']:
        """
        Configures health checking for instances. Unhealthy instances are stopped and replaced with new instances. Only applicable in the App Engine flexible environment.Only returned in GET requests if view=FULL is set.
        """
        return pulumi.get(self, "health_check")

    @property
    @pulumi.getter(name="inboundServices")
    def inbound_services(self) -> pulumi.Output[Sequence[str]]:
        """
        Before an application can receive email or XMPP messages, the application must be configured to enable the service.
        """
        return pulumi.get(self, "inbound_services")

    @property
    @pulumi.getter(name="instanceClass")
    def instance_class(self) -> pulumi.Output[str]:
        """
        Instance class that is used to run this version. Valid values are: AutomaticScaling: F1, F2, F4, F4_1G ManualScaling or BasicScaling: B1, B2, B4, B8, B4_1GDefaults to F1 for AutomaticScaling and B1 for ManualScaling or BasicScaling.
        """
        return pulumi.get(self, "instance_class")

    @property
    @pulumi.getter
    def libraries(self) -> pulumi.Output[Sequence['outputs.LibraryResponse']]:
        """
        Configuration for third-party Python runtime libraries that are required by the application.Only returned in GET requests if view=FULL is set.
        """
        return pulumi.get(self, "libraries")

    @property
    @pulumi.getter(name="livenessCheck")
    def liveness_check(self) -> pulumi.Output['outputs.LivenessCheckResponse']:
        """
        Configures liveness health checking for instances. Unhealthy instances are stopped and replaced with new instancesOnly returned in GET requests if view=FULL is set.
        """
        return pulumi.get(self, "liveness_check")

    @property
    @pulumi.getter(name="manualScaling")
    def manual_scaling(self) -> pulumi.Output['outputs.ManualScalingResponse']:
        """
        A service with manual scaling runs continuously, allowing you to perform complex initialization and rely on the state of its memory over time. Manually scaled versions are sometimes referred to as "backends".
        """
        return pulumi.get(self, "manual_scaling")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Full path to the Version resource in the API. Example: apps/myapp/services/default/versions/v1.@OutputOnly
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def network(self) -> pulumi.Output['outputs.NetworkResponse']:
        """
        Extra network settings. Only applicable in the App Engine flexible environment.
        """
        return pulumi.get(self, "network")

    @property
    @pulumi.getter(name="nobuildFilesRegex")
    def nobuild_files_regex(self) -> pulumi.Output[str]:
        """
        Files that match this pattern will not be built into this version. Only applicable for Go runtimes.Only returned in GET requests if view=FULL is set.
        """
        return pulumi.get(self, "nobuild_files_regex")

    @property
    @pulumi.getter(name="readinessCheck")
    def readiness_check(self) -> pulumi.Output['outputs.ReadinessCheckResponse']:
        """
        Configures readiness health checking for instances. Unhealthy instances are not put into the backend traffic rotation.Only returned in GET requests if view=FULL is set.
        """
        return pulumi.get(self, "readiness_check")

    @property
    @pulumi.getter
    def resources(self) -> pulumi.Output['outputs.ResourcesResponse']:
        """
        Machine resources for this version. Only applicable in the App Engine flexible environment.
        """
        return pulumi.get(self, "resources")

    @property
    @pulumi.getter
    def runtime(self) -> pulumi.Output[str]:
        """
        Desired runtime. Example: python27.
        """
        return pulumi.get(self, "runtime")

    @property
    @pulumi.getter(name="runtimeApiVersion")
    def runtime_api_version(self) -> pulumi.Output[str]:
        """
        The version of the API in the given runtime environment. Please see the app.yaml reference for valid values at https://cloud.google.com/appengine/docs/standard//config/appref
        """
        return pulumi.get(self, "runtime_api_version")

    @property
    @pulumi.getter(name="runtimeChannel")
    def runtime_channel(self) -> pulumi.Output[str]:
        """
        The channel of the runtime to use. Only available for some runtimes. Defaults to the default channel.
        """
        return pulumi.get(self, "runtime_channel")

    @property
    @pulumi.getter(name="runtimeMainExecutablePath")
    def runtime_main_executable_path(self) -> pulumi.Output[str]:
        """
        The path or name of the app's main executable.
        """
        return pulumi.get(self, "runtime_main_executable_path")

    @property
    @pulumi.getter(name="serviceAccount")
    def service_account(self) -> pulumi.Output[str]:
        """
        The identity that the deployed version will run as. Admin API will use the App Engine Appspot service account as default if this field is neither provided in app.yaml file nor through CLI flag.
        """
        return pulumi.get(self, "service_account")

    @property
    @pulumi.getter(name="servingStatus")
    def serving_status(self) -> pulumi.Output[str]:
        """
        Current serving status of this version. Only the versions with a SERVING status create instances and can be billed.SERVING_STATUS_UNSPECIFIED is an invalid value. Defaults to SERVING.
        """
        return pulumi.get(self, "serving_status")

    @property
    @pulumi.getter
    def threadsafe(self) -> pulumi.Output[bool]:
        """
        Whether multiple requests can be dispatched to this version at once.
        """
        return pulumi.get(self, "threadsafe")

    @property
    @pulumi.getter(name="versionUrl")
    def version_url(self) -> pulumi.Output[str]:
        """
        Serving URL for this version. Example: "https://myversion-dot-myservice-dot-myapp.appspot.com"@OutputOnly
        """
        return pulumi.get(self, "version_url")

    @property
    @pulumi.getter
    def vm(self) -> pulumi.Output[bool]:
        """
        Whether to deploy this version in a container on a virtual machine.
        """
        return pulumi.get(self, "vm")

    @property
    @pulumi.getter(name="vpcAccessConnector")
    def vpc_access_connector(self) -> pulumi.Output['outputs.VpcAccessConnectorResponse']:
        """
        Enables VPC connectivity for standard apps.
        """
        return pulumi.get(self, "vpc_access_connector")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop
