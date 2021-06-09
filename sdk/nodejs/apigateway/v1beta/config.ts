// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../../types";
import * as utilities from "../../utilities";

/**
 * Creates a new ApiConfig in a given project and location.
 */
export class Config extends pulumi.CustomResource {
    /**
     * Get an existing Config resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, opts?: pulumi.CustomResourceOptions): Config {
        return new Config(name, undefined as any, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'google-native:apigateway/v1beta:Config';

    /**
     * Returns true if the given object is an instance of Config.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Config {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Config.__pulumiType;
    }

    /**
     * Created time.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * Optional. Display name.
     */
    public readonly displayName!: pulumi.Output<string>;
    /**
     * Immutable. Gateway specific configuration.
     */
    public readonly gatewayConfig!: pulumi.Output<outputs.apigateway.v1beta.ApigatewayGatewayConfigResponse>;
    /**
     * Immutable. The Google Cloud IAM Service Account that Gateways serving this config should use to authenticate to other services. This may either be the Service Account's email (`{ACCOUNT_ID}@{PROJECT}.iam.gserviceaccount.com`) or its full resource name (`projects/{PROJECT}/accounts/{UNIQUE_ID}`). This is most often used when the service is a GCP resource such as a Cloud Run Service or an IAP-secured service.
     */
    public readonly gatewayServiceAccount!: pulumi.Output<string>;
    /**
     * Optional. gRPC service definition files. If specified, openapi_documents must not be included.
     */
    public readonly grpcServices!: pulumi.Output<outputs.apigateway.v1beta.ApigatewayApiConfigGrpcServiceDefinitionResponse[]>;
    /**
     * Optional. Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for more details. https://cloud.google.com/compute/docs/labeling-resources
     */
    public readonly labels!: pulumi.Output<{[key: string]: string}>;
    /**
     * Optional. Service Configuration files. At least one must be included when using gRPC service definitions. See https://cloud.google.com/endpoints/docs/grpc/grpc-service-config#service_configuration_overview for the expected file contents. If multiple files are specified, the files are merged with the following rules: * All singular scalar fields are merged using "last one wins" semantics in the order of the files uploaded. * Repeated fields are concatenated. * Singular embedded messages are merged using these rules for nested fields.
     */
    public readonly managedServiceConfigs!: pulumi.Output<outputs.apigateway.v1beta.ApigatewayApiConfigFileResponse[]>;
    /**
     * Resource name of the API Config. Format: projects/{project}/locations/global/apis/{api}/configs/{api_config}
     */
    public /*out*/ readonly name!: pulumi.Output<string>;
    /**
     * Optional. OpenAPI specification documents. If specified, grpc_services and managed_service_configs must not be included.
     */
    public readonly openapiDocuments!: pulumi.Output<outputs.apigateway.v1beta.ApigatewayApiConfigOpenApiDocumentResponse[]>;
    /**
     * The ID of the associated Service Config ( https://cloud.google.com/service-infrastructure/docs/glossary#config).
     */
    public /*out*/ readonly serviceConfigId!: pulumi.Output<string>;
    /**
     * State of the API Config.
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * Updated time.
     */
    public /*out*/ readonly updateTime!: pulumi.Output<string>;

    /**
     * Create a Config resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ConfigArgs, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (!opts.id) {
            if ((!args || args.apiConfigId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'apiConfigId'");
            }
            if ((!args || args.apiId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'apiId'");
            }
            if ((!args || args.location === undefined) && !opts.urn) {
                throw new Error("Missing required property 'location'");
            }
            if ((!args || args.project === undefined) && !opts.urn) {
                throw new Error("Missing required property 'project'");
            }
            inputs["apiConfigId"] = args ? args.apiConfigId : undefined;
            inputs["apiId"] = args ? args.apiId : undefined;
            inputs["displayName"] = args ? args.displayName : undefined;
            inputs["gatewayConfig"] = args ? args.gatewayConfig : undefined;
            inputs["gatewayServiceAccount"] = args ? args.gatewayServiceAccount : undefined;
            inputs["grpcServices"] = args ? args.grpcServices : undefined;
            inputs["labels"] = args ? args.labels : undefined;
            inputs["location"] = args ? args.location : undefined;
            inputs["managedServiceConfigs"] = args ? args.managedServiceConfigs : undefined;
            inputs["openapiDocuments"] = args ? args.openapiDocuments : undefined;
            inputs["project"] = args ? args.project : undefined;
            inputs["createTime"] = undefined /*out*/;
            inputs["name"] = undefined /*out*/;
            inputs["serviceConfigId"] = undefined /*out*/;
            inputs["state"] = undefined /*out*/;
            inputs["updateTime"] = undefined /*out*/;
        } else {
            inputs["createTime"] = undefined /*out*/;
            inputs["displayName"] = undefined /*out*/;
            inputs["gatewayConfig"] = undefined /*out*/;
            inputs["gatewayServiceAccount"] = undefined /*out*/;
            inputs["grpcServices"] = undefined /*out*/;
            inputs["labels"] = undefined /*out*/;
            inputs["managedServiceConfigs"] = undefined /*out*/;
            inputs["name"] = undefined /*out*/;
            inputs["openapiDocuments"] = undefined /*out*/;
            inputs["serviceConfigId"] = undefined /*out*/;
            inputs["state"] = undefined /*out*/;
            inputs["updateTime"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(Config.__pulumiType, name, inputs, opts);
    }
}

/**
 * The set of arguments for constructing a Config resource.
 */
export interface ConfigArgs {
    readonly apiConfigId: pulumi.Input<string>;
    readonly apiId: pulumi.Input<string>;
    /**
     * Optional. Display name.
     */
    readonly displayName?: pulumi.Input<string>;
    /**
     * Immutable. Gateway specific configuration.
     */
    readonly gatewayConfig?: pulumi.Input<inputs.apigateway.v1beta.ApigatewayGatewayConfigArgs>;
    /**
     * Immutable. The Google Cloud IAM Service Account that Gateways serving this config should use to authenticate to other services. This may either be the Service Account's email (`{ACCOUNT_ID}@{PROJECT}.iam.gserviceaccount.com`) or its full resource name (`projects/{PROJECT}/accounts/{UNIQUE_ID}`). This is most often used when the service is a GCP resource such as a Cloud Run Service or an IAP-secured service.
     */
    readonly gatewayServiceAccount?: pulumi.Input<string>;
    /**
     * Optional. gRPC service definition files. If specified, openapi_documents must not be included.
     */
    readonly grpcServices?: pulumi.Input<pulumi.Input<inputs.apigateway.v1beta.ApigatewayApiConfigGrpcServiceDefinitionArgs>[]>;
    /**
     * Optional. Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for more details. https://cloud.google.com/compute/docs/labeling-resources
     */
    readonly labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    readonly location: pulumi.Input<string>;
    /**
     * Optional. Service Configuration files. At least one must be included when using gRPC service definitions. See https://cloud.google.com/endpoints/docs/grpc/grpc-service-config#service_configuration_overview for the expected file contents. If multiple files are specified, the files are merged with the following rules: * All singular scalar fields are merged using "last one wins" semantics in the order of the files uploaded. * Repeated fields are concatenated. * Singular embedded messages are merged using these rules for nested fields.
     */
    readonly managedServiceConfigs?: pulumi.Input<pulumi.Input<inputs.apigateway.v1beta.ApigatewayApiConfigFileArgs>[]>;
    /**
     * Optional. OpenAPI specification documents. If specified, grpc_services and managed_service_configs must not be included.
     */
    readonly openapiDocuments?: pulumi.Input<pulumi.Input<inputs.apigateway.v1beta.ApigatewayApiConfigOpenApiDocumentArgs>[]>;
    readonly project: pulumi.Input<string>;
}