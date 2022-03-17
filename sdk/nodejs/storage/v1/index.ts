// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../../utilities";

// Export members:
export * from "./bucket";
export * from "./bucketAccessControl";
export * from "./bucketIamPolicy";
export * from "./bucketObject";
export * from "./defaultObjectAccessControl";
export * from "./getBucket";
export * from "./getBucketAccessControl";
export * from "./getBucketIamPolicy";
export * from "./getBucketObject";
export * from "./getDefaultObjectAccessControl";
export * from "./getHmacKey";
export * from "./getNotification";
export * from "./getObjectAccessControl";
export * from "./getObjectIamPolicy";
export * from "./hmacKey";
export * from "./notification";
export * from "./objectAccessControl";
export * from "./objectIamPolicy";

// Import resources to register:
import { Bucket } from "./bucket";
import { BucketAccessControl } from "./bucketAccessControl";
import { BucketIamPolicy } from "./bucketIamPolicy";
import { BucketObject } from "./bucketObject";
import { DefaultObjectAccessControl } from "./defaultObjectAccessControl";
import { HmacKey } from "./hmacKey";
import { Notification } from "./notification";
import { ObjectAccessControl } from "./objectAccessControl";
import { ObjectIamPolicy } from "./objectIamPolicy";

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "google-native:storage/v1:Bucket":
                return new Bucket(name, <any>undefined, { urn })
            case "google-native:storage/v1:BucketAccessControl":
                return new BucketAccessControl(name, <any>undefined, { urn })
            case "google-native:storage/v1:BucketIamPolicy":
                return new BucketIamPolicy(name, <any>undefined, { urn })
            case "google-native:storage/v1:BucketObject":
                return new BucketObject(name, <any>undefined, { urn })
            case "google-native:storage/v1:DefaultObjectAccessControl":
                return new DefaultObjectAccessControl(name, <any>undefined, { urn })
            case "google-native:storage/v1:HmacKey":
                return new HmacKey(name, <any>undefined, { urn })
            case "google-native:storage/v1:Notification":
                return new Notification(name, <any>undefined, { urn })
            case "google-native:storage/v1:ObjectAccessControl":
                return new ObjectAccessControl(name, <any>undefined, { urn })
            case "google-native:storage/v1:ObjectIamPolicy":
                return new ObjectIamPolicy(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("google-native", "storage/v1", _module)