// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../../utilities";

// Export members:
export * from "./function";
export * from "./functionIamPolicy";
export * from "./getFunction";
export * from "./getFunctionIamPolicy";

// Export enums:
export * from "../../types/enums/cloudfunctions/v2beta";

// Import resources to register:
import { Function } from "./function";
import { FunctionIamPolicy } from "./functionIamPolicy";

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "google-native:cloudfunctions/v2beta:Function":
                return new Function(name, <any>undefined, { urn })
            case "google-native:cloudfunctions/v2beta:FunctionIamPolicy":
                return new FunctionIamPolicy(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("google-native", "cloudfunctions/v2beta", _module)