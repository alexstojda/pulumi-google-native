// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../../utilities";

// Export members:
export * from "./endpointPolicy";
export * from "./endpointPolicyIamPolicy";
export * from "./gateway";
export * from "./gatewayIamPolicy";
export * from "./getEndpointPolicy";
export * from "./getEndpointPolicyIamPolicy";
export * from "./getGateway";
export * from "./getGatewayIamPolicy";
export * from "./getGrpcRoute";
export * from "./getHttpRoute";
export * from "./getMesh";
export * from "./getMeshIamPolicy";
export * from "./getServiceBinding";
export * from "./getServiceBindingIamPolicy";
export * from "./getTcpRoute";
export * from "./getTlsRoute";
export * from "./grpcRoute";
export * from "./httpRoute";
export * from "./mesh";
export * from "./meshIamPolicy";
export * from "./serviceBinding";
export * from "./serviceBindingIamPolicy";
export * from "./tcpRoute";
export * from "./tlsRoute";

// Export enums:
export * from "../../types/enums/networkservices/v1beta1";

// Import resources to register:
import { EndpointPolicy } from "./endpointPolicy";
import { EndpointPolicyIamPolicy } from "./endpointPolicyIamPolicy";
import { Gateway } from "./gateway";
import { GatewayIamPolicy } from "./gatewayIamPolicy";
import { GrpcRoute } from "./grpcRoute";
import { HttpRoute } from "./httpRoute";
import { Mesh } from "./mesh";
import { MeshIamPolicy } from "./meshIamPolicy";
import { ServiceBinding } from "./serviceBinding";
import { ServiceBindingIamPolicy } from "./serviceBindingIamPolicy";
import { TcpRoute } from "./tcpRoute";
import { TlsRoute } from "./tlsRoute";

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "google-native:networkservices/v1beta1:EndpointPolicy":
                return new EndpointPolicy(name, <any>undefined, { urn })
            case "google-native:networkservices/v1beta1:EndpointPolicyIamPolicy":
                return new EndpointPolicyIamPolicy(name, <any>undefined, { urn })
            case "google-native:networkservices/v1beta1:Gateway":
                return new Gateway(name, <any>undefined, { urn })
            case "google-native:networkservices/v1beta1:GatewayIamPolicy":
                return new GatewayIamPolicy(name, <any>undefined, { urn })
            case "google-native:networkservices/v1beta1:GrpcRoute":
                return new GrpcRoute(name, <any>undefined, { urn })
            case "google-native:networkservices/v1beta1:HttpRoute":
                return new HttpRoute(name, <any>undefined, { urn })
            case "google-native:networkservices/v1beta1:Mesh":
                return new Mesh(name, <any>undefined, { urn })
            case "google-native:networkservices/v1beta1:MeshIamPolicy":
                return new MeshIamPolicy(name, <any>undefined, { urn })
            case "google-native:networkservices/v1beta1:ServiceBinding":
                return new ServiceBinding(name, <any>undefined, { urn })
            case "google-native:networkservices/v1beta1:ServiceBindingIamPolicy":
                return new ServiceBindingIamPolicy(name, <any>undefined, { urn })
            case "google-native:networkservices/v1beta1:TcpRoute":
                return new TcpRoute(name, <any>undefined, { urn })
            case "google-native:networkservices/v1beta1:TlsRoute":
                return new TlsRoute(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("google-native", "networkservices/v1beta1", _module)