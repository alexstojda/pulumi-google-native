// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../../utilities";

// Export members:
export { CaseArgs } from "./case";
export type Case = import("./case").Case;
export const Case: typeof import("./case").Case = null as any;
utilities.lazyLoad(exports, ["Case"], () => require("./case"));

export { GetCaseArgs, GetCaseResult, GetCaseOutputArgs } from "./getCase";
export const getCase: typeof import("./getCase").getCase = null as any;
export const getCaseOutput: typeof import("./getCase").getCaseOutput = null as any;
utilities.lazyLoad(exports, ["getCase","getCaseOutput"], () => require("./getCase"));


// Export enums:
export * from "../../types/enums/cloudsupport/v2beta";

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "google-native:cloudsupport/v2beta:Case":
                return new Case(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("google-native", "cloudsupport/v2beta", _module)
