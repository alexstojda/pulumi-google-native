// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../../utilities";

// Export members:
export * from "./dataset";
export * from "./job";
export * from "./routine";
export * from "./rowAccessPolicyIamPolicy";
export * from "./table";
export * from "./tableIamPolicy";

// Import resources to register:
import { Dataset } from "./dataset";
import { Job } from "./job";
import { Routine } from "./routine";
import { RowAccessPolicyIamPolicy } from "./rowAccessPolicyIamPolicy";
import { Table } from "./table";
import { TableIamPolicy } from "./tableIamPolicy";

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "gcp-native:bigquery/v2:Dataset":
                return new Dataset(name, <any>undefined, { urn })
            case "gcp-native:bigquery/v2:Job":
                return new Job(name, <any>undefined, { urn })
            case "gcp-native:bigquery/v2:Routine":
                return new Routine(name, <any>undefined, { urn })
            case "gcp-native:bigquery/v2:RowAccessPolicyIamPolicy":
                return new RowAccessPolicyIamPolicy(name, <any>undefined, { urn })
            case "gcp-native:bigquery/v2:Table":
                return new Table(name, <any>undefined, { urn })
            case "gcp-native:bigquery/v2:TableIamPolicy":
                return new TableIamPolicy(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("gcp-native", "bigquery/v2", _module)