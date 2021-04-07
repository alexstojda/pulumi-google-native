// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../../utilities";

// Export members:
export * from "./organizationNotificationConfig";
export * from "./organizationSource";
export * from "./organizationSourceFinding";
export * from "./organizationSourceIamPolicy";

// Import resources to register:
import { OrganizationNotificationConfig } from "./organizationNotificationConfig";
import { OrganizationSource } from "./organizationSource";
import { OrganizationSourceFinding } from "./organizationSourceFinding";
import { OrganizationSourceIamPolicy } from "./organizationSourceIamPolicy";

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "gcp-native:securitycenter/v1:OrganizationNotificationConfig":
                return new OrganizationNotificationConfig(name, <any>undefined, { urn })
            case "gcp-native:securitycenter/v1:OrganizationSource":
                return new OrganizationSource(name, <any>undefined, { urn })
            case "gcp-native:securitycenter/v1:OrganizationSourceFinding":
                return new OrganizationSourceFinding(name, <any>undefined, { urn })
            case "gcp-native:securitycenter/v1:OrganizationSourceIamPolicy":
                return new OrganizationSourceIamPolicy(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("gcp-native", "securitycenter/v1", _module)