// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../../utilities";

// Export members:
export * from "./attestor";
export * from "./attestorIamPolicy";
export * from "./getAttestor";
export * from "./getAttestorIamPolicy";
export * from "./getPolicyIamPolicy";
export * from "./policyIamPolicy";

// Export enums:
export * from "../../types/enums/binaryauthorization/v1";

// Import resources to register:
import { Attestor } from "./attestor";
import { AttestorIamPolicy } from "./attestorIamPolicy";
import { PolicyIamPolicy } from "./policyIamPolicy";

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "google-native:binaryauthorization/v1:Attestor":
                return new Attestor(name, <any>undefined, { urn })
            case "google-native:binaryauthorization/v1:AttestorIamPolicy":
                return new AttestorIamPolicy(name, <any>undefined, { urn })
            case "google-native:binaryauthorization/v1:PolicyIamPolicy":
                return new PolicyIamPolicy(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("google-native", "binaryauthorization/v1", _module)