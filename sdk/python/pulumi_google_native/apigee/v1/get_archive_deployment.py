# coding=utf-8
# *** WARNING: this file was generated by the Pulumi SDK Generator. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from ... import _utilities

__all__ = [
    'GetArchiveDeploymentResult',
    'AwaitableGetArchiveDeploymentResult',
    'get_archive_deployment',
    'get_archive_deployment_output',
]

@pulumi.output_type
class GetArchiveDeploymentResult:
    def __init__(__self__, created_at=None, gcs_uri=None, labels=None, name=None, operation=None, updated_at=None):
        if created_at and not isinstance(created_at, str):
            raise TypeError("Expected argument 'created_at' to be a str")
        pulumi.set(__self__, "created_at", created_at)
        if gcs_uri and not isinstance(gcs_uri, str):
            raise TypeError("Expected argument 'gcs_uri' to be a str")
        pulumi.set(__self__, "gcs_uri", gcs_uri)
        if labels and not isinstance(labels, dict):
            raise TypeError("Expected argument 'labels' to be a dict")
        pulumi.set(__self__, "labels", labels)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if operation and not isinstance(operation, str):
            raise TypeError("Expected argument 'operation' to be a str")
        pulumi.set(__self__, "operation", operation)
        if updated_at and not isinstance(updated_at, str):
            raise TypeError("Expected argument 'updated_at' to be a str")
        pulumi.set(__self__, "updated_at", updated_at)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> str:
        """
        The time at which the Archive Deployment was created in milliseconds since the epoch.
        """
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter(name="gcsUri")
    def gcs_uri(self) -> str:
        """
        Input only. The Google Cloud Storage signed URL returned from GenerateUploadUrl and used to upload the Archive zip file.
        """
        return pulumi.get(self, "gcs_uri")

    @property
    @pulumi.getter
    def labels(self) -> Mapping[str, str]:
        """
        User-supplied key-value pairs used to organize ArchiveDeployments. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62} Label values must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63} No more than 64 labels can be associated with a given store.
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Name of the Archive Deployment in the following format: `organizations/{org}/environments/{env}/archiveDeployments/{id}`.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def operation(self) -> str:
        """
        A reference to the LRO that created this Archive Deployment in the following format: `organizations/{org}/operations/{id}`
        """
        return pulumi.get(self, "operation")

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> str:
        """
        The time at which the Archive Deployment was updated in milliseconds since the epoch.
        """
        return pulumi.get(self, "updated_at")


class AwaitableGetArchiveDeploymentResult(GetArchiveDeploymentResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetArchiveDeploymentResult(
            created_at=self.created_at,
            gcs_uri=self.gcs_uri,
            labels=self.labels,
            name=self.name,
            operation=self.operation,
            updated_at=self.updated_at)


def get_archive_deployment(archive_deployment_id: Optional[str] = None,
                           environment_id: Optional[str] = None,
                           organization_id: Optional[str] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetArchiveDeploymentResult:
    """
    Gets the specified ArchiveDeployment.
    """
    __args__ = dict()
    __args__['archiveDeploymentId'] = archive_deployment_id
    __args__['environmentId'] = environment_id
    __args__['organizationId'] = organization_id
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('google-native:apigee/v1:getArchiveDeployment', __args__, opts=opts, typ=GetArchiveDeploymentResult).value

    return AwaitableGetArchiveDeploymentResult(
        created_at=__ret__.created_at,
        gcs_uri=__ret__.gcs_uri,
        labels=__ret__.labels,
        name=__ret__.name,
        operation=__ret__.operation,
        updated_at=__ret__.updated_at)


@_utilities.lift_output_func(get_archive_deployment)
def get_archive_deployment_output(archive_deployment_id: Optional[pulumi.Input[str]] = None,
                                  environment_id: Optional[pulumi.Input[str]] = None,
                                  organization_id: Optional[pulumi.Input[str]] = None,
                                  opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetArchiveDeploymentResult]:
    """
    Gets the specified ArchiveDeployment.
    """
    ...