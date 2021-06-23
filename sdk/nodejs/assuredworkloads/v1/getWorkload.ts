// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs, enums } from "../../types";
import * as utilities from "../../utilities";

/**
 * Gets Assured Workload associated with a CRM Node
 */
export function getWorkload(args: GetWorkloadArgs, opts?: pulumi.InvokeOptions): Promise<GetWorkloadResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("google-native:assuredworkloads/v1:getWorkload", {
        "location": args.location,
        "organizationId": args.organizationId,
        "workloadId": args.workloadId,
    }, opts);
}

export interface GetWorkloadArgs {
    location: string;
    organizationId: string;
    workloadId: string;
}

export interface GetWorkloadResult {
    /**
     * Required. Input only. The billing account used for the resources which are direct children of workload. This billing account is initially associated with the resources created as part of Workload creation. After the initial creation of these resources, the customer can change the assigned billing account. The resource name has the form `billingAccounts/{billing_account_id}`. For example, `billingAccounts/012345-567890-ABCDEF`.
     */
    readonly billingAccount: string;
    /**
     * Required. Immutable. Compliance Regime associated with this workload.
     */
    readonly complianceRegime: string;
    /**
     * Immutable. The Workload creation timestamp.
     */
    readonly createTime: string;
    /**
     * Required. The user-assigned display name of the Workload. When present it must be between 4 to 30 characters. Allowed characters are: lowercase and uppercase letters, numbers, hyphen, and spaces. Example: My Workload
     */
    readonly displayName: string;
    /**
     * Optional. ETag of the workload, it is calculated on the basis of the Workload contents. It will be used in Update & Delete operations.
     */
    readonly etag: string;
    /**
     * Input only. Settings used to create a CMEK crypto key. When set a project with a KMS CMEK key is provisioned. This field is mandatory for a subset of Compliance Regimes.
     */
    readonly kmsSettings: outputs.assuredworkloads.v1.GoogleCloudAssuredworkloadsV1WorkloadKMSSettingsResponse;
    /**
     * Optional. Labels applied to the workload.
     */
    readonly labels: {[key: string]: string};
    /**
     * Optional. The resource name of the workload. Format: organizations/{organization}/locations/{location}/workloads/{workload} Read-only.
     */
    readonly name: string;
    /**
     * Input only. The parent resource for the resources managed by this Assured Workload. May be either an organization or a folder. Must be the same or a child of the Workload parent. If not specified all resources are created under the Workload parent. Formats: folders/{folder_id} organizations/{organization_id}
     */
    readonly provisionedResourcesParent: string;
    /**
     * Input only. Resource properties that are used to customize workload resources. These properties (such as custom project id) will be used to create workload resources if possible. This field is optional.
     */
    readonly resourceSettings: outputs.assuredworkloads.v1.GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsResponse[];
    /**
     * The resources associated with this workload. These resources will be created when creating the workload. If any of the projects already exist, the workload creation will fail. Always read only.
     */
    readonly resources: outputs.assuredworkloads.v1.GoogleCloudAssuredworkloadsV1WorkloadResourceInfoResponse[];
}