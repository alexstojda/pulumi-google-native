# coding=utf-8
# *** WARNING: this file was generated by the Pulumi SDK Generator. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from ... import _utilities
from . import outputs
from ._enums import *

__all__ = [
    'NetworkResponse',
    'WorkerConfigResponse',
]

@pulumi.output_type
class NetworkResponse(dict):
    """
    Network describes the GCP network used to create workers in.
    """
    def __init__(__self__, *,
                 network: str,
                 project: str,
                 subnetwork: str):
        """
        Network describes the GCP network used to create workers in.
        :param str network: Network on which the workers are created. "default" network is used if empty.
        :param str project: Project id containing the defined network and subnetwork. For a peered VPC, this will be the same as the project_id in which the workers are created. For a shared VPC, this will be the project sharing the network with the project_id project in which workers will be created. For custom workers with no VPC, this will be the same as project_id.
        :param str subnetwork: Subnetwork on which the workers are created. "default" subnetwork is used if empty.
        """
        pulumi.set(__self__, "network", network)
        pulumi.set(__self__, "project", project)
        pulumi.set(__self__, "subnetwork", subnetwork)

    @property
    @pulumi.getter
    def network(self) -> str:
        """
        Network on which the workers are created. "default" network is used if empty.
        """
        return pulumi.get(self, "network")

    @property
    @pulumi.getter
    def project(self) -> str:
        """
        Project id containing the defined network and subnetwork. For a peered VPC, this will be the same as the project_id in which the workers are created. For a shared VPC, this will be the project sharing the network with the project_id project in which workers will be created. For custom workers with no VPC, this will be the same as project_id.
        """
        return pulumi.get(self, "project")

    @property
    @pulumi.getter
    def subnetwork(self) -> str:
        """
        Subnetwork on which the workers are created. "default" subnetwork is used if empty.
        """
        return pulumi.get(self, "subnetwork")


@pulumi.output_type
class WorkerConfigResponse(dict):
    """
    WorkerConfig defines the configuration to be used for a creating workers in the pool.
    """
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "diskSizeGb":
            suggest = "disk_size_gb"
        elif key == "machineType":
            suggest = "machine_type"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in WorkerConfigResponse. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        WorkerConfigResponse.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        WorkerConfigResponse.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 disk_size_gb: str,
                 machine_type: str,
                 network: 'outputs.NetworkResponse',
                 tag: str):
        """
        WorkerConfig defines the configuration to be used for a creating workers in the pool.
        :param str disk_size_gb: Size of the disk attached to the worker, in GB. See https://cloud.google.com/compute/docs/disks/ If `0` is specified, Cloud Build will use a standard disk size. `disk_size` is overridden if you specify a different disk size in `build_options`. In this case, a VM with a disk size specified in the `build_options` will be created on demand at build time. For more information see https://cloud.google.com/cloud-build/docs/api/reference/rest/v1/projects.builds#buildoptions
        :param str machine_type: Machine Type of the worker, such as n1-standard-1. See https://cloud.google.com/compute/docs/machine-types. If left blank, Cloud Build will use a standard unspecified machine to create the worker pool. `machine_type` is overridden if you specify a different machine type in `build_options`. In this case, the VM specified in the `build_options` will be created on demand at build time. For more information see https://cloud.google.com/cloud-build/docs/speeding-up-builds#using_custom_virtual_machine_sizes
        :param 'NetworkResponse' network: The network definition used to create the worker. If this section is left empty, the workers will be created in WorkerPool.project_id on the default network.
        :param str tag: The tag applied to the worker, and the same tag used by the firewall rule. It is used to identify the Cloud Build workers among other VMs. The default value for tag is `worker`.
        """
        pulumi.set(__self__, "disk_size_gb", disk_size_gb)
        pulumi.set(__self__, "machine_type", machine_type)
        pulumi.set(__self__, "network", network)
        pulumi.set(__self__, "tag", tag)

    @property
    @pulumi.getter(name="diskSizeGb")
    def disk_size_gb(self) -> str:
        """
        Size of the disk attached to the worker, in GB. See https://cloud.google.com/compute/docs/disks/ If `0` is specified, Cloud Build will use a standard disk size. `disk_size` is overridden if you specify a different disk size in `build_options`. In this case, a VM with a disk size specified in the `build_options` will be created on demand at build time. For more information see https://cloud.google.com/cloud-build/docs/api/reference/rest/v1/projects.builds#buildoptions
        """
        return pulumi.get(self, "disk_size_gb")

    @property
    @pulumi.getter(name="machineType")
    def machine_type(self) -> str:
        """
        Machine Type of the worker, such as n1-standard-1. See https://cloud.google.com/compute/docs/machine-types. If left blank, Cloud Build will use a standard unspecified machine to create the worker pool. `machine_type` is overridden if you specify a different machine type in `build_options`. In this case, the VM specified in the `build_options` will be created on demand at build time. For more information see https://cloud.google.com/cloud-build/docs/speeding-up-builds#using_custom_virtual_machine_sizes
        """
        return pulumi.get(self, "machine_type")

    @property
    @pulumi.getter
    def network(self) -> 'outputs.NetworkResponse':
        """
        The network definition used to create the worker. If this section is left empty, the workers will be created in WorkerPool.project_id on the default network.
        """
        return pulumi.get(self, "network")

    @property
    @pulumi.getter
    def tag(self) -> str:
        """
        The tag applied to the worker, and the same tag used by the firewall rule. It is used to identify the Cloud Build workers among other VMs. The default value for tag is `worker`.
        """
        return pulumi.get(self, "tag")


